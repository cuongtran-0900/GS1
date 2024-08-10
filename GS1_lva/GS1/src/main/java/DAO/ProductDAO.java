package DAO;

import MODEL.Product;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private static final String URL = "jdbc:sqlserver://lvabm:1433;databaseName=QLCUAHANGTIENLOI;encrypt=false;trustServerCertificate=false;";
    private static final String USER = "sa";
    private static final String PASS = "12345678";

    private Connection getConnection() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            throw new SQLException("SQL Server JDBC Driver not found.", e);
        }
    }

    public List<Product> loadAllProducts() {
        List<Product> products = new ArrayList<>();
        String storedProc = "{call sp_LoadAllProducts}";
        
        try (Connection conn = getConnection();
             CallableStatement cstmt = conn.prepareCall(storedProc);
             ResultSet rs = cstmt.executeQuery()) {
            
            while (rs.next()) {
                Product product = new Product();
                product.setProductId(rs.getInt("ProductId"));
                product.setTypeId(rs.getInt("TypeId"));
                product.setProductName(rs.getString("ProductName"));
                product.setUnit(rs.getString("Unit"));
                product.setPrice(rs.getDouble("Price"));
                product.setImages(rs.getString("Images"));
                
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
      
        }
        
        return products;
    }
}
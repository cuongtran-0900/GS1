package DAO;

import MODEL.Product;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ProductDAO extends ConnectSQL{
    
   
    /**
     * Load all product data from the database.
     * @return a list of Product objects.
     */
    public List<Product> loadAllProductsData() {
        List<Product> productList = new ArrayList<>();

        try (
             CallableStatement cstmt = con.prepareCall("{call sp_LoadAllProducts}");
             ResultSet rs = cstmt.executeQuery()) {

            while (rs.next()) {
                Product product = new Product();
                product.setProductId(rs.getString("ProductId"));
                product.setTypeId(rs.getString("TypeId"));
                product.setProductName(rs.getString("ProductName"));
                product.setUnit(rs.getString("Unit"));
                product.setPrice(rs.getDouble("Price"));
                product.setImages(rs.getString("Images"));

                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productList;
    }

    /** 
     * Load product data into a table model.
     * @param tableModel the table model to populate.
     */
    public void loadProductDataToTable(DefaultTableModel tableModel) {
        List<Product> productList = loadAllProductsData();
        for (Product product : productList) {
            Object[] rowData = {
                product.getProductId(),
                product.getTypeId(),
                product.getProductName(),
                product.getUnit(),
                product.getPrice(),
                product.getImages()
            };  
            tableModel.addRow(rowData);
        }
    }
}

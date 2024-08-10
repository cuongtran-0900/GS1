package DAO;

import MODEL.Product;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


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

    // Phương thức kiểm tra xem mã sản phẩm có tồn tại trong cơ sở dữ liệu không
    public boolean isProductIdExist(String productId) {
        boolean exists = false;
        String query = "SELECT COUNT(*) FROM Product WHERE ProductId = ?";

        try (CallableStatement cstmt = con.prepareCall(query)) {
            cstmt.setString(1, productId);
            try (ResultSet rs = cstmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    exists = count > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return exists;
    }
    
    public boolean addProduct(Product product) {
        String sql = "INSERT INTO Product (ProductId, TypeId, ProductName, Unit, Price, Images) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, product.getProductId());
            pstmt.setString(2, product.getTypeId());
            pstmt.setString(3, product.getProductName());
            pstmt.setString(4, product.getUnit());
            pstmt.setDouble(5, product.getPrice());
            pstmt.setString(6, product.getImages());

            int rowsAffected = pstmt.executeUpdate(); // Trả về dương hoặc âm
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean deleteProduct(String productId) {
        String sql = "DELETE FROM Product WHERE ProductId = ?";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, productId);

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateProduct(Product product) {
        String sql = "UPDATE Product SET TypeId = ?, ProductName = ?, Unit = ?, Price = ?, Images = ? WHERE ProductId = ?";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, product.getTypeId());
            pstmt.setString(2, product.getProductName());
            pstmt.setString(3, product.getUnit());
            pstmt.setDouble(4, product.getPrice());
            pstmt.setString(5, product.getImages());
            pstmt.setString(6, product.getProductId());

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
   



package DAO;

import MODEL.ProductType;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductTypeDAO extends ConnectSQL {
    
    /**
     * Load all product type data from the database.
     * @return a list of ProductType objects.
     */
    public List<ProductType> loadAllProductTypesData() {
        List<ProductType> productTypeList = new ArrayList<>();

        try (
             CallableStatement cstmt = con.prepareCall("{call sp_LoadAllProductTypes}");
             ResultSet rs = cstmt.executeQuery()) {

            while (rs.next()) {
                ProductType productType = new ProductType();
                productType.setTypeId(rs.getString("TypeId"));
                productType.setTypeName(rs.getString("TypeName"));

                productTypeList.add(productType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productTypeList;
    }

    public void loadProductTypesDataToConsole() {
        List<ProductType> productTypeList = loadAllProductTypesData();
        for (ProductType productType : productTypeList) {
            System.out.println("Type ID: " + productType.getTypeId());
            System.out.println("Type Name: " + productType.getTypeName());
            System.out.println("--------------------------");
        }
    }
}

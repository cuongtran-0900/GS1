package DAO;

import MODEL.BillDetail;
import UI.Home_Panels.Home_BIll;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BillDetailDAO extends ConnectSQL {
List<BillDetail> BDList = new ArrayList<>();
    /**
     * Load all bill detail data from the database.
     * @return a list of BillDetail objects.
     */
    public List<BillDetail> filltoArrayList() {
        try {
            String sql = " select BD.ProductId, PD.ProductName, BD.Subtotal, BD.Quantity, PD.Price from BillDetail as BD inner join Product as PD on BD.ProductId = PD.ProductId;  ";
            try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
                BDList.clear();
                while (rs.next()) {
                    BillDetail BD = new BillDetail();
                    BD.setNameProduct(rs.getString("ProductName"));
                    BD.setProductId(rs.getString("ProductId"));
                    BD.setQuantity(rs.getInt("Quantity"));
                    BD.setSubtotal(rs.getInt("Subtotal"));   
                    BD.setPrice(rs.getInt("Price"));
                    BDList.add(BD);
                }
                rs.close();
                st.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Home_BIll.class.getName()).log(Level.SEVERE, null, ex);
        }
        return BDList;
    }
    public void loadBillDetailsDataToConsole() {
        List<BillDetail> billDetailList = filltoArrayList();
        for (BillDetail billDetail : billDetailList) {
//            System.out.println("Bill ID: " + billDetail.getBillId());
            System.out.println("Product ID: " + billDetail.getProductId());
            System.out.println("Product Name: " + billDetail.getNameProduct());
            System.out.println("Quantity: " + billDetail.getQuantity());
            System.out.println("Subtotal: " + billDetail.getSubtotal());
            System.out.println("--------------------------");
        }
    }
}

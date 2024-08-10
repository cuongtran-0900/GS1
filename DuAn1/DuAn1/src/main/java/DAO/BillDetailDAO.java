package DAO;

import MODEL.BillDetail;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BillDetailDAO extends ConnectSQL {

    /**
     * Load all bill detail data from the database.
     * @return a list of BillDetail objects.
     */
    public List<BillDetail> loadAllBillDetailsData() {
        List<BillDetail> billDetailList = new ArrayList<>();

        try (
             CallableStatement cstmt = con.prepareCall("{call sp_LoadAllBillDetails}");
             ResultSet rs = cstmt.executeQuery()) {

            while (rs.next()) {
                BillDetail billDetail = new BillDetail();
                billDetail.setBillId(rs.getString("BillId"));
                billDetail.setProductId(rs.getString("ProductId"));
                billDetail.setQuantity(rs.getInt("Quantity"));
                billDetail.setSubtotal(rs.getDouble("Subtotal"));

                billDetailList.add(billDetail);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return billDetailList;
    }
    
    public List<BillDetail> getBillDetailsByBillId(String billId) {
        List<BillDetail> billDetailList = new ArrayList<>();
        String sql = "SELECT BillId, ProductId, Quantity, Subtotal FROM BillDetail WHERE BillId = ?";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, billId);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    BillDetail billDetail = new BillDetail();
                    billDetail.setBillId(rs.getString("BillId"));
                    billDetail.setProductId(rs.getString("ProductId"));
                    billDetail.setQuantity(rs.getInt("Quantity"));
                    billDetail.setSubtotal(rs.getDouble("Subtotal"));

                    billDetailList.add(billDetail);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return billDetailList;
    }

    
    public void loadBillDetailsDataToConsole() {
        List<BillDetail> billDetailList = loadAllBillDetailsData();
        for (BillDetail billDetail : billDetailList) {
            System.out.println("Bill ID: " + billDetail.getBillId());
            System.out.println("Product ID: " + billDetail.getProductId());
            System.out.println("Quantity: " + billDetail.getQuantity());
            System.out.println("Subtotal: " + billDetail.getSubtotal());
            System.out.println("--------------------------");
        }
    }
}

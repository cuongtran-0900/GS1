package DAO;

import MODEL.Bill;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BillDAO extends ConnectSQL {

    /**
     * Load all bill data from the database.
     * @return a list of Bill objects.
     */
    public List<Bill> loadAllBillsData() {
        List<Bill> billList = new ArrayList<>();

        try (
             CallableStatement cstmt = con.prepareCall("{call sp_LoadAllBills}");
             ResultSet rs = cstmt.executeQuery()) {

            while (rs.next()) {
                Bill bill = new Bill();
                bill.setBillId(rs.getString("BillId"));
                bill.setAccountId(rs.getInt("AccountId"));
                bill.setCreatedDate(rs.getTimestamp("CreatedDate"));
                bill.setCustomerId(rs.getString("CustomerId"));
                bill.setTotalPrice(rs.getDouble("TotalPrice"));

                billList.add(bill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return billList;
    }
    
    public Bill getBillById(String billId) {
        Bill bill = null;
        String sql = "{call sp_GetBillById(?)}"; // Stored procedure để lấy hóa đơn theo ID

        try (CallableStatement cstmt = con.prepareCall(sql)) {
            cstmt.setString(1, billId);
            try (ResultSet rs = cstmt.executeQuery()) {

                if (rs.next()) {
                    bill = new Bill();
                    bill.setBillId(rs.getString("BillId"));
                    bill.setAccountId(rs.getInt("AccountId"));
                    bill.setCreatedDate(rs.getTimestamp("CreatedDate"));
                    bill.setCustomerId(rs.getString("CustomerId"));
                    bill.setTotalPrice(rs.getDouble("TotalPrice"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bill;
    }

    
    public void loadBillDataToConsole() {
        List<Bill> billList = loadAllBillsData();
        for (Bill bill : billList) {
            System.out.println("Bill ID: " + bill.getBillId());
            System.out.println("Account ID: " + bill.getAccountId());
            System.out.println("Created Date: " + bill.getCreatedDate());
            System.out.println("Customer ID: " + bill.getCustomerId());
            System.out.println("Total Price: " + bill.getTotalPrice());
            System.out.println("--------------------------");
        }
    }
}

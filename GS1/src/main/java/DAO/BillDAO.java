package DAO;

import MODEL.Bill;
import MODEL.BillDetail;
import MODEL.Customer;
import UI.Home_Panels.Home_History;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BillDAO extends ConnectSQL {

    List<Bill> billList = new ArrayList<>();
    Bill BillCurent = null;
    
    CustomerDAO customerDAO = new CustomerDAO();
    List<Customer> customersList = customerDAO.loadAllCustomersData();
    /**
     * Load all bill data from the database.
     *
     * @return a list of Bill objects.
     */
    public List<Bill> loadAllBillsData() {

        try {
            String sql = "select BD.ProductId, PD.ProductName, BD.Subtotal, BD.Quantity, PD.Price, B.BillId, B.AccountId, B.CreatedDate, B.CustomerId, B.TotalPrice  from BillDetail as BD inner join Product as PD on BD.ProductId = PD.ProductId INNER JOIN Bill AS B on B.BillId = BD.BillId  ";
            try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
                
                while (rs.next()) {

                    String BillId = rs.getString("BillID");

                    // Kiểm tra nếu hóa đơn mới
                    if (BillCurent == null || !BillCurent.getBillId().equals(BillId)) {
                        BillCurent = new Bill();
                        BillCurent.setBillId(rs.getString("BillId"));
                        BillCurent.setAccountId(rs.getInt("AccountId"));
                        BillCurent.setCreatedDate(rs.getDate("CreatedDate"));
                        BillCurent.setCustomerId(rs.getString("CustomerId"));
                        BillCurent.setTotalPrice(rs.getDouble("TotalPrice"));
                        billList.add(BillCurent);
                    }

                    // Thêm chi tiết hóa đơn vào danh sách của hóa đơn hiện tại
                    BillDetail DB = new BillDetail();
                    DB.setProductId(rs.getString("ProductId"));
                    DB.setNameProduct(rs.getString("ProductName"));
                    DB.setQuantity(rs.getInt("Quantity"));
                    DB.setSubtotal(rs.getInt("Subtotal"));
                    DB.setPrice(rs.getInt("Price"));
                    BillCurent.getBillDetailList().add(DB);

                }
            }

        } catch (SQLException e) {
            Logger.getLogger(Home_History.class.getName()).log(Level.SEVERE, null, e);
        }
        return billList;
    }

    public void loadBillDataToConsole() {
        for (Bill bill : billList) {
            System.out.println("Bill ID: " + bill.getBillId());
            System.out.println("Account ID: " + bill.getAccountId());
            System.out.println("Created Date: " + bill.getCreatedDate());
            System.out.println("Customer ID: " + bill.getCustomerId());
            for (BillDetail BD : BillCurent.getBillDetailList()) {
                System.out.println("Product ID: " + BD.getProductId());
                System.out.println("Product Name: " + BD.getNameProduct());
                System.out.println("Quantity : " + BD.getQuantity());
                System.out.println("Price: " + BD.getPrice());
                System.out.println("Subtotal : " + BD.getSubtotal());
            }
            System.out.println("Total Price: " + bill.getTotalPrice());
            System.out.println("--------------------------");
        }
    }
    
    public boolean check(String ma) {
        for (Bill b : billList) {
            if (ma.equals(b.getBillId())) {
                return false;
            }
        }
        return true;
    }
    
    public boolean checkCustomer (String CSID){
        for (Customer cs : customersList) {
            if (CSID.equals(cs.getCustomerId())) {
                return false;
            }
        }
        return true;
    }

    public String fillBillID() {
        String mps = null;
        try {
            String sql = "SELECT BillID FROM Bill WHERE BillID LIKE 'hd%' ORDER BY BillID DESC";
            try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {

                if (rs.next()) {
                    mps = rs.getString("BillID");
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Home_History.class.getName()).log(Level.SEVERE, null, ex);
        }

        int so = Integer.parseInt(mps.substring(3, 5));
        String manv = String.valueOf(so);
        return manv;
    }

    public String NewBIllID() {
        if (billList.size() <= 0) {
            return "hd001";
        } else {
            int ma = Integer.parseInt(fillBillID()) + 1;
            return String.format("hd%03d", ma);
        }
    }

    public int save(Bill B) {
        try {
            String sql1 = "INSERT INTO Bill (BillId, CustomerId, CreatedDate, AccountId, TotalPrice) VALUES(?,?,?,?,?)";
            PreparedStatement st1 = con.prepareStatement(sql1);
            st1.setString(1, B.getBillId());
            st1.setString(2, B.getCustomerId());
            java.util.Date utilDate = B.getCreatedDate();
            // Chuyển đổi java.util.Date thành java.sql.Date
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            st1.setDate(3, sqlDate);
            st1.setInt(4, B.getAccountId());
            st1.setDouble(5, B.getTotalPrice());
            
            String sql3 = "UPDATE  customer SET point where customerID like ";
            PreparedStatement st3 = con.prepareStatement(sql3);
            st3.setInt(0, 0);

            int row1 = st1.executeUpdate();

            for (BillDetail BD : B.getBillDetailList()) {
                String sql2 = "INSERT INTO BillDetail (BillId, ProductId, Quantity, Subtotal) VALUES(?,?,?,?)";
                PreparedStatement st2 = con.prepareStatement(sql2);
                st2.setString(1, B.getBillId());
                st2.setString(2, BD.getProductId());
                st2.setInt(3, BD.getQuantity());
                st2.setDouble(4, BD.getSubtotal());
                st2.executeUpdate();
            }

            if (row1 > 0) {
                JOptionPane.showMessageDialog(null, "Thêm thành công");
                return row1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home_History.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int update(Bill B) {
    try {
        // Câu lệnh SQL cho việc cập nhật Bill
        String sql1 = "UPDATE Bill SET AccountId = ?, CustomerId = ?, CreatedDate = ?, TotalPrice = ? WHERE BillID = ?";
        PreparedStatement st1 = con.prepareStatement(sql1);
        st1.setInt(1, B.getAccountId());
        st1.setString(2, B.getCustomerId());
        java.util.Date utilDate = B.getCreatedDate();
        // Chuyển đổi java.util.Date thành java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        st1.setDate(3, sqlDate);
        st1.setDouble(4, B.getTotalPrice());
        st1.setString(5, B.getBillId());

        int row1 = st1.executeUpdate();

        // Câu lệnh SQL kiểm tra sự tồn tại của bản ghi
        String sqlCheck = "SELECT COUNT(*) FROM BillDetail WHERE BillID = ? AND ProductID = ?";
        PreparedStatement stCheck = con.prepareStatement(sqlCheck);

        // Câu lệnh SQL cập nhật BillDetail
        String sqlUpdate = "UPDATE BillDetail SET Quantity = ?, Subtotal = ? WHERE BillID = ? AND ProductID = ?";
        PreparedStatement stUpdate = con.prepareStatement(sqlUpdate);

        // Câu lệnh SQL chèn mới BillDetail
        String sqlInsert = "INSERT INTO BillDetail (BillID, ProductID, Quantity, Subtotal) VALUES (?, ?, ?, ?)";
        PreparedStatement stInsert = con.prepareStatement(sqlInsert);

        List<BillDetail> BDList = B.getBillDetailList();

        for (BillDetail BD : BDList) {
            // Kiểm tra xem bản ghi đã tồn tại chưa
            stCheck.setString(1, B.getBillId());
            stCheck.setString(2, BD.getProductId());
            ResultSet rs = stCheck.executeQuery();
            if (rs.next()) {
                if (rs.getInt(1) > 0) {
                    // Nếu bản ghi tồn tại, thực hiện cập nhật
                    stUpdate.setInt(1, BD.getQuantity());
                    stUpdate.setDouble(2, BD.getSubtotal());
                    stUpdate.setString(3, B.getBillId());
                    stUpdate.setString(4, BD.getProductId());
                    stUpdate.addBatch();
                } else {
                    // Nếu bản ghi không tồn tại, thực hiện chèn mới
                    stInsert.setString(1, B.getBillId());
                    stInsert.setString(2, BD.getProductId());
                    stInsert.setInt(3, BD.getQuantity());
                    stInsert.setDouble(4, BD.getSubtotal());
                    stInsert.addBatch();
                }
            }
            rs.close(); // Đóng ResultSet sau khi sử dụng
        }

        int[] rowsUpdate = stUpdate.executeBatch(); // Thực thi batch cập nhật BillDetail
        int[] rowsInsert = stInsert.executeBatch(); // Thực thi batch chèn mới BillDetail

        // Kiểm tra kết quả cập nhật/chèn
        if (row1 > 0 && (rowsUpdate.length > 0 || rowsInsert.length > 0)) {
            return row1;
        }

        st1.close(); // Đóng PreparedStatement
        stCheck.close(); // Đóng PreparedStatement
        stUpdate.close(); // Đóng PreparedStatement
        stInsert.close(); // Đóng PreparedStatement

    } catch (SQLException ex) {
        Logger.getLogger(Home_History.class.getName()).log(Level.SEVERE, null, ex);
    }
    return -1;
}

}

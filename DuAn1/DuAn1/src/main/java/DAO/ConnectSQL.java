package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectSQL {

    protected Connection con = null;
    private static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl="jdbc:sqlserver://localhost:1433;databaseName=QLCUAHANGTIENLOI;encrypt=true;trustServerCertificate=true";
    private static String username="sa";
    private static String password="123456";
    public ConnectSQL(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try {
                 con = DriverManager.getConnection(dburl, username, password);
            } catch (SQLException ex) {
                Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    public List<Object[]> getRecent7DaysRevenue() {
        List<Object[]> data = new ArrayList<>();
        String sql = "{CALL GetRecent7DaysRevenue}";
        try (CallableStatement cs = con.prepareCall(sql);
             ResultSet rs = cs.executeQuery()) {
            while (rs.next()) {
                Object[] row = new Object[3]; // Cập nhật số cột là 3
                row[0] = rs.getDate("SaleDate");
                row[1] = rs.getInt("TotalProductsSold"); // Chỉnh sửa kiểu dữ liệu
                row[2] = rs.getDouble("TotalRevenue");
                data.add(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    public int getTotalGoods() {
        int totalGoods = 0;
        String sql = "{CALL GetTotalGoods}";
        try (CallableStatement cs = con.prepareCall(sql);
             ResultSet rs = cs.executeQuery()) {
            if (rs.next()) {
                totalGoods = rs.getInt("TotalGoods");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalGoods;
    }

    public int getTotalCustomers() {
        int totalCustomers = 0;
        String sql = "{CALL GetTotalCustomers}";
        try (CallableStatement cs = con.prepareCall(sql);
             ResultSet rs = cs.executeQuery()) {
            if (rs.next()) {
                totalCustomers = rs.getInt("TotalCustomers");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalCustomers;
    }

    public int getTotalStaff() {
        int totalStaff = 0;
        String sql = "{CALL GetTotalStaff}";
        try (CallableStatement cs = con.prepareCall(sql);
             ResultSet rs = cs.executeQuery()) {
            if (rs.next()) {
                totalStaff = rs.getInt("TotalStaff");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalStaff;
    }
    
    
    public List<Object[]> getRevenue() {
        List<Object[]> data = new ArrayList<>();
        String sql = "{CALL GetRevenue}";
        try (CallableStatement cs = con.prepareCall(sql);
             ResultSet rs = cs.executeQuery()) {
            while (rs.next()) {
                Object[] row = new Object[3]; // Cập nhật số cột là 3
                row[0] = rs.getDate("SaleDate");
                row[1] = rs.getInt("TotalProductsSold");
                row[2] = rs.getDouble("TotalRevenue");
                data.add(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
}

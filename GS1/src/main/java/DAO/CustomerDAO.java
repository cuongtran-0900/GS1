package DAO;

import MODEL.Customer;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO extends ConnectSQL {

    /**
     * Load all customer data from the database.
     * @return a list of Customer objects.
     */
    public List<Customer> loadAllCustomersData() {
        List<Customer> customerList = new ArrayList<>();

        try (
             CallableStatement cstmt = con.prepareCall("{call sp_LoadAllCustomers}");
             ResultSet rs = cstmt.executeQuery()) {

            while (rs.next()) {
                Customer customer = new Customer();
                customer.setCustomerId(rs.getString("CustomerId"));
                customer.setCustomerName(rs.getString("CustomerName"));
                customer.setCustomerAddress(rs.getString("CustomerAddress"));
                customer.setPhone(rs.getString("Phone"));
                customer.setPoint(rs.getInt("Point"));

                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customerList;
    }
    
    public void loadCustomersDataToConsole() {
        List<Customer> customerList = loadAllCustomersData();
        for (Customer customer : customerList) {
            System.out.println("Customer ID: " + customer.getCustomerId());
            System.out.println("Customer Name: " + customer.getCustomerName());
            System.out.println("Customer Address: " + customer.getCustomerAddress());
            System.out.println("Phone: " + customer.getPhone());
            System.out.println("Point: " + customer.getPoint());
            System.out.println("--------------------------");
        }
    }
    
    /**
     * Update customer's points by their phone number.
     * @param phone the customer's phone number.
     * @param newPoints the new points to be set.
     * @return true if the update was successful, false otherwise.
     */
    public boolean updateCustomerPointByPhone(String phone, int newPoints) {
        String sql = "UPDATE Customer SET Point = ? WHERE Phone = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, newPoints);
            pstmt.setString(2, phone);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}

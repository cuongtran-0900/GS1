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
    
    public void insertCustomerToDB(Customer customer) {
        String sql = "INSERT INTO Customer (customerId, customerName, customerAddress, phone, point) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, customer.getCustomerId());
            pstmt.setString(2, customer.getCustomerName());
            pstmt.setString(3, customer.getCustomerAddress());
            pstmt.setString(4, customer.getPhone());
            pstmt.setInt(5, customer.getPoint());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Customer checkCustomerByPhoneNumber(String customerPhone){
        List<Customer> customerList = loadAllCustomersData();
        for (Customer customer : customerList) {
            if(customer.getPhone().equalsIgnoreCase(customerPhone)){
                return customer;
            }
        }
        return null;
    }
    
    public void savePoint(Customer customer, int newPoint){
        customer.setPoint(newPoint);
        updateCustomerPointInDatabase(customer);
    }
    
    // Hàm cập nhật điểm khách hàng trong cơ sở dữ liệu
    public void updateCustomerPointInDatabase(Customer customer) {
        String updateSQL = "UPDATE customer SET point = ? WHERE phone = ?";
        
        try (PreparedStatement preparedStatement = con.prepareStatement(updateSQL)) {
            
            preparedStatement.setInt(1, customer.getPoint());
            preparedStatement.setString(2, customer.getPhone());
            
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Điểm của khách hàng đã được cập nhật thành công.");
            } else {
                System.out.println("Không tìm thấy khách hàng với số điện thoại này.");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Lỗi khi cập nhật điểm của khách hàng: " + e.getMessage());
        }
    }
}

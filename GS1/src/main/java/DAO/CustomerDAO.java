package DAO;

import MODEL.Customer;
import java.sql.CallableStatement;
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
}

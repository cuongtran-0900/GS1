package DAO;



import MODEL.Account;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO extends ConnectSQL {

    /**
     * Load all account data from the database.
     * @return a list of Account objects.
     */
    public List<Account> loadAllAccountsData() {
        List<Account> accountList = new ArrayList<>();

        try (
             CallableStatement cstmt = con.prepareCall("{call sp_LoadAllAccounts}");
             ResultSet rs = cstmt.executeQuery()) {

            while (rs.next()) {
                Account account = new Account();
                account.setAccountId(rs.getInt("AccountId"));
                account.setUsername(rs.getString("Username"));
                account.setPass(rs.getString("Pass"));
                account.setRoles(rs.getBoolean("Roles"));
                account.setFullname(rs.getString("Fullname"));
                account.setUserAddress(rs.getString("UserAddress"));
                account.setPhone(rs.getString("Phone"));
                account.setEmail(rs.getString("Email"));

                accountList.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountList;
    }
    public void loadAccountDataToConsole() {
        AccountDAO accountDAO = new AccountDAO();
        List<Account> accountList = accountDAO.loadAllAccountsData();
        for (Account account : accountList) {
            System.out.println("Account ID: " + account.getAccountId());
            System.out.println("Username: " + account.getUsername());
            System.out.println("Password: " + account.getPass());
            System.out.println("Roles: " + (account.isRoles() ? "Admin" : "User"));
            System.out.println("Fullname: " + account.getFullname());
            System.out.println("User Address: " + account.getUserAddress());
            System.out.println("Phone: " + account.getPhone());
            System.out.println("Email: " + account.getEmail());
            System.out.println("--------------------------");
        }
    }                                                       
}

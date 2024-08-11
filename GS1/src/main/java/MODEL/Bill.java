package MODEL;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Bill {

    private String billId;
    private int accountId;
    private Date createdDate;
    private String customerId;
    private double totalPrice;
    private List<BillDetail> BillDetailList;

    public Bill() {
        this.BillDetailList = new ArrayList<>();
    }

    public Bill(String billId, int accountId, Date createdDate, String customerId, double totalPrice, List<BillDetail> BillDetailList) {
        this.billId = billId;
        this.accountId = accountId;
        this.createdDate = createdDate;
        this.customerId = customerId;
        this.totalPrice = totalPrice;
        this.BillDetailList = BillDetailList;
    }


    // Getters and Setters
        
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<BillDetail> getBillDetailList() {
        return BillDetailList;
    }

    public void setBillDetailList(List<BillDetail> BillDetailList) {
        this.BillDetailList = BillDetailList;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}

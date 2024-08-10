package UI.Home_Panels;

import DAO.*;
import MODEL.Bill;
import MODEL.BillDetail;
import MODEL.Customer;
import UI.*;
import MODEL.Product;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public final class Home_Sale extends javax.swing.JPanel {
    

    public LeVanAn levanan = new LeVanAn();

    public ProductDAO productDAO = new ProductDAO();
    private List<Product> productList = productDAO.loadAllProductsData();
    
    public BillDAO billDAO = new BillDAO();
    private List<Bill> billList = billDAO.loadAllBillsData();
    
    public AccountDAO accountDAO = new AccountDAO();
    
    public CustomerDAO customerDAO = new CustomerDAO();
    private List<Customer> CustomerList = customerDAO.loadAllCustomersData();
    
    public ProductTypeDAO productTypeDAO = new ProductTypeDAO();
    public BillDetailDAO billDetailDAO = new BillDetailDAO();
    List<Product> productList = productDAO.loadAllProductsData();

    String customerID = "";
    double totalAmount = 0;
    

    public Home_Sale() {
        initComponents();
        rad_Cash.setSelected(true);
        loadProductsToPanel(jPanel1, jScrollPane3, (DefaultTableModel) tbl_BuyProduct.getModel());
        tableEVT();
    }
    
    private void tableEVT(){
        txt_CustomerName.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String phoneNumber = txt_CustomerName.getText().trim();
        Customer foundCustomer = CustomerList.stream()
                .filter(customer -> customer.getPhone().equals(phoneNumber))
                .findFirst()
                .orElse(null);

        if (foundCustomer != null) {
            // Lấy CustomersID từ khách hàng được tìm thấy
            customerID = foundCustomer.getCustomerId();
            // Làm gì đó với customerID, ví dụ:
            JOptionPane.showMessageDialog(null, "CustomersID: " + customerID);
        } else {
            JOptionPane.showMessageDialog(null, "Không tìm thấy khách hàng với số điện thoại " + phoneNumber);
        }
    }
});
       
        
    }
    
    private void TotalAmount(){
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        rad_PaymentGroup = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        PaymentForm = new javax.swing.JPanel();
        CustomerForm = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_CustomerPoint = new javax.swing.JTextField();
        sp_CustomerUsePoint = new javax.swing.JSpinner();
        txt_CustomerDiscount = new javax.swing.JTextField();
        txt_CustomerName = new javax.swing.JTextField();
        rad_Point = new javax.swing.JRadioButton();
        rad_Apply = new javax.swing.JRadioButton();
        ShowTotal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_CustomerPayment = new javax.swing.JTextField();
        txt_GiveBack = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_TotalAmount = new javax.swing.JTextField();
        txt_Discount = new javax.swing.JTextField();
        txt_GrandTotal = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        rad_Cash = new javax.swing.JRadioButton();
        rad_Bank = new javax.swing.JRadioButton();
        txt_Point = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_Complete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ProductForm = new javax.swing.JPanel();
        BuyList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_BuyProduct = new javax.swing.JTable();
        ProductSearch = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbx_List = new javax.swing.JComboBox<>();
        txt_Search = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        QRCode = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        qrCode = new javax.swing.JLabel();
        btn_Transferred = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout(0, 10));

        PaymentForm.setBackground(new java.awt.Color(254, 254, 252));
        PaymentForm.setLayout(new java.awt.GridBagLayout());

        CustomerForm.setBackground(new java.awt.Color(8, 131, 149));
        CustomerForm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        CustomerForm.setLayout(new java.awt.GridBagLayout());

        jLabel7.setBackground(new java.awt.Color(69, 71, 75));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(235, 244, 246));
        jLabel7.setText("Sử dụng");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        CustomerForm.add(jLabel7, gridBagConstraints);

        jLabel8.setBackground(new java.awt.Color(69, 71, 75));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(235, 244, 246));
        jLabel8.setText("Số điểm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        CustomerForm.add(jLabel8, gridBagConstraints);

        jLabel9.setBackground(new java.awt.Color(69, 71, 75));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(235, 244, 246));
        jLabel9.setText("Tổng giảm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        CustomerForm.add(jLabel9, gridBagConstraints);

        jLabel10.setBackground(new java.awt.Color(69, 71, 75));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(235, 244, 246));
        jLabel10.setText("Khách hàng");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        CustomerForm.add(jLabel10, gridBagConstraints);

        txt_CustomerPoint.setEditable(false);
        txt_CustomerPoint.setBackground(new java.awt.Color(244, 244, 242));
        txt_CustomerPoint.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_CustomerPoint.setForeground(java.awt.Color.black);
        txt_CustomerPoint.setMaximumSize(new java.awt.Dimension(64, 28));
        txt_CustomerPoint.setPreferredSize(new java.awt.Dimension(64, 28));
        txt_CustomerPoint.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        CustomerForm.add(txt_CustomerPoint, gridBagConstraints);

        sp_CustomerUsePoint.setMaximumSize(new java.awt.Dimension(64, 28));
        sp_CustomerUsePoint.setPreferredSize(new java.awt.Dimension(64, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        CustomerForm.add(sp_CustomerUsePoint, gridBagConstraints);
        sp_CustomerUsePoint.setBackground(new java.awt.Color(244, 244, 242));

        txt_CustomerDiscount.setEditable(false);
        txt_CustomerDiscount.setBackground(new java.awt.Color(244, 244, 242));
        txt_CustomerDiscount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_CustomerDiscount.setForeground(java.awt.Color.black);
        txt_CustomerDiscount.setMaximumSize(new java.awt.Dimension(64, 28));
        txt_CustomerDiscount.setPreferredSize(new java.awt.Dimension(64, 28));
        txt_CustomerDiscount.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        CustomerForm.add(txt_CustomerDiscount, gridBagConstraints);

        txt_CustomerName.setBackground(new java.awt.Color(244, 244, 242));
        txt_CustomerName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_CustomerName.setForeground(java.awt.Color.black);
        txt_CustomerName.setText("Nhập SĐT của khách vào");
        txt_CustomerName.setMaximumSize(new java.awt.Dimension(64, 28));
        txt_CustomerName.setPreferredSize(new java.awt.Dimension(64, 28));
        txt_CustomerName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_CustomerNameMouseClicked(evt);
            }
        });
        txt_CustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CustomerNameActionPerformed(evt);
            }
        });
        txt_CustomerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_CustomerNameKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        CustomerForm.add(txt_CustomerName, gridBagConstraints);

        buttonGroup1.add(rad_Point);
        rad_Point.setText("Tích điểm");
        rad_Point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_PointActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        CustomerForm.add(jRadioButton1, gridBagConstraints);

        buttonGroup1.add(rad_Apply);
        rad_Apply.setText("Áp Dụng");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        CustomerForm.add(jRadioButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        PaymentForm.add(CustomerForm, gridBagConstraints);

        ShowTotal.setBackground(new java.awt.Color(8, 131, 149));
        ShowTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ShowTotal.setLayout(new java.awt.GridBagLayout());

        jLabel3.setBackground(new java.awt.Color(69, 71, 75));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 244, 246));
        jLabel3.setText("Khuyến mãi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        ShowTotal.add(jLabel3, gridBagConstraints);

        jLabel6.setBackground(new java.awt.Color(69, 71, 75));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(235, 244, 246));
        jLabel6.setText("Khách đưa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        ShowTotal.add(jLabel6, gridBagConstraints);

        jLabel2.setBackground(new java.awt.Color(69, 71, 75));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 244, 246));
        jLabel2.setText("Trả khách");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        ShowTotal.add(jLabel2, gridBagConstraints);

        txt_CustomerPayment.setBackground(new java.awt.Color(244, 244, 242));
        txt_CustomerPayment.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txt_CustomerPayment.setForeground(java.awt.Color.black);
        txt_CustomerPayment.setMaximumSize(new java.awt.Dimension(64, 28));
        txt_CustomerPayment.setPreferredSize(new java.awt.Dimension(64, 28));
        txt_CustomerPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_CustomerPaymentKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        ShowTotal.add(txt_CustomerPayment, gridBagConstraints);

        txt_GiveBack.setEditable(false);
        txt_GiveBack.setBackground(new java.awt.Color(244, 244, 242));
        txt_GiveBack.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txt_GiveBack.setForeground(java.awt.Color.black);
        txt_GiveBack.setMaximumSize(new java.awt.Dimension(64, 28));
        txt_GiveBack.setPreferredSize(new java.awt.Dimension(64, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        ShowTotal.add(txt_GiveBack, gridBagConstraints);

        jLabel1.setBackground(new java.awt.Color(69, 71, 75));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 244, 246));
        jLabel1.setText("Khách cần trả");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        ShowTotal.add(jLabel1, gridBagConstraints);

        jLabel5.setBackground(new java.awt.Color(69, 71, 75));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(235, 244, 246));
        jLabel5.setText("Tổng số tiền");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        ShowTotal.add(jLabel5, gridBagConstraints);

        txt_TotalAmount.setEditable(false);
        txt_TotalAmount.setBackground(new java.awt.Color(244, 244, 242));
        txt_TotalAmount.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txt_TotalAmount.setForeground(java.awt.Color.black);
        txt_TotalAmount.setMaximumSize(new java.awt.Dimension(64, 28));
        txt_TotalAmount.setPreferredSize(new java.awt.Dimension(64, 28));
        txt_TotalAmount.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        ShowTotal.add(txt_TotalAmount, gridBagConstraints);

        txt_Discount.setEditable(false);
        txt_Discount.setBackground(new java.awt.Color(244, 244, 242));
        txt_Discount.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txt_Discount.setForeground(java.awt.Color.black);
        txt_Discount.setMaximumSize(new java.awt.Dimension(64, 28));
        txt_Discount.setPreferredSize(new java.awt.Dimension(64, 28));
        txt_Discount.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        ShowTotal.add(txt_Discount, gridBagConstraints);

        txt_GrandTotal.setEditable(false);
        txt_GrandTotal.setBackground(new java.awt.Color(244, 244, 242));
        txt_GrandTotal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txt_GrandTotal.setForeground(java.awt.Color.black);
        txt_GrandTotal.setMaximumSize(new java.awt.Dimension(64, 28));
        txt_GrandTotal.setPreferredSize(new java.awt.Dimension(64, 28));
        txt_GrandTotal.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        ShowTotal.add(txt_GrandTotal, gridBagConstraints);

        jSeparator1.setBackground(new java.awt.Color(69, 71, 75));
        jSeparator1.setForeground(new java.awt.Color(69, 71, 75));
        jSeparator1.setToolTipText("");
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 10));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 0, 0);
        ShowTotal.add(jSeparator1, gridBagConstraints);

        rad_PaymentGroup.add(rad_Cash);
        rad_Cash.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rad_Cash.setForeground(new java.awt.Color(235, 244, 246));
        rad_Cash.setText("Tiền mặt");
        rad_Cash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rad_CashMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        ShowTotal.add(rad_Cash, gridBagConstraints);

        rad_PaymentGroup.add(rad_Bank);
        rad_Bank.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rad_Bank.setForeground(new java.awt.Color(235, 244, 246));
        rad_Bank.setText("Chuyển khoản");
        rad_Bank.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rad_BankMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        ShowTotal.add(rad_Bank, gridBagConstraints);

        txt_Point.setEditable(false);
        txt_Point.setBackground(new java.awt.Color(204, 204, 204));
        txt_Point.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        ShowTotal.add(txt_Point, gridBagConstraints);

        jLabel4.setText("Tích điểm : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        ShowTotal.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        PaymentForm.add(ShowTotal, gridBagConstraints);

        btn_Complete.setBackground(new java.awt.Color(255, 75, 102));
        btn_Complete.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_Complete.setForeground(new java.awt.Color(255, 255, 255));
        btn_Complete.setText("Hoàn tất");
        btn_Complete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CompleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        PaymentForm.add(btn_Complete, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Làm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        PaymentForm.add(jButton1, gridBagConstraints);

        add(PaymentForm, java.awt.BorderLayout.LINE_END);

        ProductForm.setBackground(new java.awt.Color(246, 245, 242));

        BuyList.setBackground(new java.awt.Color(254, 254, 252));
        BuyList.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setBackground(new java.awt.Color(8, 131, 149));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(0, 50));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(0, 50));
        jScrollPane1.setName(""); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(0, 50));

        tbl_BuyProduct.setAutoCreateRowSorter(true);
        tbl_BuyProduct.setBackground(new java.awt.Color(8, 131, 149));
        tbl_BuyProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbl_BuyProduct.setForeground(new java.awt.Color(255, 255, 255));
        tbl_BuyProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số", "Mã SP", "Tên SP", "Đơn vị", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_BuyProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_BuyProduct.setMaximumSize(new java.awt.Dimension(0, 2000));
        tbl_BuyProduct.setMinimumSize(new java.awt.Dimension(0, 2000));
        tbl_BuyProduct.setPreferredSize(new java.awt.Dimension(0, 2000));
        tbl_BuyProduct.setRowHeight(25);
        tbl_BuyProduct.setSelectionBackground(new java.awt.Color(213, 213, 235));
        tbl_BuyProduct.setSelectionForeground(new java.awt.Color(144, 144, 251));
        tbl_BuyProduct.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_BuyProduct.setShowGrid(false);
        tbl_BuyProduct.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_BuyProduct);
        if (tbl_BuyProduct.getColumnModel().getColumnCount() > 0) {
            tbl_BuyProduct.getColumnModel().getColumn(0).setMinWidth(50);
            tbl_BuyProduct.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbl_BuyProduct.getColumnModel().getColumn(0).setMaxWidth(50);
            tbl_BuyProduct.getColumnModel().getColumn(1).setMinWidth(120);
            tbl_BuyProduct.getColumnModel().getColumn(1).setPreferredWidth(120);
            tbl_BuyProduct.getColumnModel().getColumn(1).setMaxWidth(120);
            tbl_BuyProduct.getColumnModel().getColumn(2).setPreferredWidth(220);
            tbl_BuyProduct.getColumnModel().getColumn(3).setMinWidth(90);
            tbl_BuyProduct.getColumnModel().getColumn(3).setPreferredWidth(90);
            tbl_BuyProduct.getColumnModel().getColumn(3).setMaxWidth(90);
            tbl_BuyProduct.getColumnModel().getColumn(4).setMinWidth(90);
            tbl_BuyProduct.getColumnModel().getColumn(4).setPreferredWidth(90);
            tbl_BuyProduct.getColumnModel().getColumn(4).setMaxWidth(90);
            tbl_BuyProduct.getColumnModel().getColumn(5).setMinWidth(130);
            tbl_BuyProduct.getColumnModel().getColumn(5).setPreferredWidth(130);
            tbl_BuyProduct.getColumnModel().getColumn(5).setMaxWidth(130);
            tbl_BuyProduct.getColumnModel().getColumn(6).setPreferredWidth(130);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        BuyList.add(jScrollPane1, gridBagConstraints);

        ProductSearch.setBackground(new java.awt.Color(8, 131, 149));
        ProductSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ProductSearch.setPreferredSize(new java.awt.Dimension(838, 300));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(235, 244, 246));
        jLabel11.setText("Tìm SP");

        cbx_List.setBackground(new java.awt.Color(244, 244, 242));
        cbx_List.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbx_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thức ăn", "Nước uống", "Hàng tiêu dùng", " ", " " }));

        txt_Search.setBackground(new java.awt.Color(244, 244, 242));
        txt_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SearchActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setAutoscrolls(true);
        jScrollPane3.setColumnHeaderView(null);
        jScrollPane3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane3.setMaximumSize(new java.awt.Dimension(0, 0));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(187, 191, 202));
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new java.awt.GridBagLayout());
        jScrollPane3.setViewportView(jPanel1);

        jScrollPane3.getVerticalScrollBar().setUnitIncrement(20);

        javax.swing.GroupLayout ProductSearchLayout = new javax.swing.GroupLayout(ProductSearch);
        ProductSearch.setLayout(ProductSearchLayout);
        ProductSearchLayout.setHorizontalGroup(
            ProductSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProductSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ProductSearchLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Search, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ProductSearchLayout.setVerticalGroup(
            ProductSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProductSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbx_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        BuyList.add(ProductSearch, gridBagConstraints);

        QRCode.setVisible(false);
        QRCode.setBackground(new java.awt.Color(254, 254, 252));
        QRCode.setMaximumSize(new java.awt.Dimension(300, 509));
        QRCode.setLayout(new java.awt.GridBagLayout());

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        qrCode.setBackground(new java.awt.Color(255, 255, 255));
        qrCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/qrPayment.jpg"))); // NOI18N

        btn_Transferred.setText("Đã chuyển khoản");
        btn_Transferred.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_TransferredMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Transferred, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(qrCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(0, 472, Short.MAX_VALUE)
                .addComponent(btn_Transferred, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLayout.createSequentialGroup()
                    .addComponent(qrCode)
                    .addGap(0, 37, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        QRCode.add(jPanel, gridBagConstraints);

        javax.swing.GroupLayout ProductFormLayout = new javax.swing.GroupLayout(ProductForm);
        ProductForm.setLayout(ProductFormLayout);
        ProductFormLayout.setHorizontalGroup(
            ProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QRCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BuyList, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        ProductFormLayout.setVerticalGroup(
            ProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QRCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BuyList, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );

        add(ProductForm, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void rad_BankMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rad_BankMouseClicked
        // TODO add your handling code here:
        QRCode.setVisible(true);

    }//GEN-LAST:event_rad_BankMouseClicked

    private void btn_TransferredMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TransferredMouseClicked
        // TODO add your handling code here:
        QRCode.setVisible(false);
    }//GEN-LAST:event_btn_TransferredMouseClicked

    private void rad_CashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rad_CashMouseClicked
        // TODO add your handling code here:
        QRCode.setVisible(false);
    }//GEN-LAST:event_rad_CashMouseClicked

    private void txt_CustomerNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_CustomerNameMouseClicked
        // TODO add your handling code here:
        txt_CustomerName.setText("");
    }//GEN-LAST:event_txt_CustomerNameMouseClicked

    private void txt_CustomerNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CustomerNameKeyReleased
        // TODO add your handling code here:
        levanan.moreSmooth(txt_CustomerName, txt_CustomerPayment, evt);
    }//GEN-LAST:event_txt_CustomerNameKeyReleased

    private void txt_CustomerPaymentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_CustomerPaymentKeyReleased
        // TODO add your handling code here:
        levanan.moreSmooth(txt_CustomerName, txt_CustomerPayment, evt);
    }//GEN-LAST:event_txt_CustomerPaymentKeyReleased

    private void txt_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SearchActionPerformed

    private void rad_PointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_PointActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rad_PointActionPerformed

    private void txt_CustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CustomerNameActionPerformed

    private void btn_CompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CompleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CompleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        productList = productDAO.loadAllProductsData();
        loadProductsToPanel(jPanel1, jScrollPane3, (DefaultTableModel) tbl_BuyProduct.getModel());
    }//GEN-LAST:event_jButton1ActionPerformed

    
    /**
     * Create a JPanel for a product with customized design.
     *
     * @param product the product data.
     * @param tableModel the table model to update on click.
     * @return the designed JPanel for the product.
     */
    private JPanel createProduct(Product product, DefaultTableModel tableModel) {
        DecimalFormat moneyFormat = new DecimalFormat("#,### đ");
        String pathProductImage = "src/main/resources/Image_product/";
        String imgPath = product.getImages();
        String currentImg;

        if (imgPath == null || imgPath.trim().isEmpty() || !new File(pathProductImage + imgPath).exists()) {
            currentImg = pathProductImage + "wrong.jpg";
        } else {
            currentImg = pathProductImage + imgPath;
        }

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 280));
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(255, 255, 255));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 10, 10, 10);

        ImageIcon resizedImg = resizeImage(new ImageIcon(currentImg), 180, 200);

        JLabel imgLabel = new JLabel(resizedImg);
        JLabel nameLabel = new JLabel(product.getProductName());
        JLabel priceLabel = new JLabel(moneyFormat.format(product.getPrice()));

        imgLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        imgLabel.setOpaque(true);

        nameLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        nameLabel.setForeground(new Color(0, 102, 204));
        priceLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        priceLabel.setForeground(new Color(255, 69, 0));

        imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        priceLabel.setHorizontalAlignment(SwingConstants.CENTER);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.7;
        panel.add(imgLabel, gbc);

        gbc.gridy = 1;
        gbc.weighty = 0.1;
        panel.add(nameLabel, gbc);

        gbc.gridy = 2;
        gbc.weighty = 0.2;
        panel.add(priceLabel, gbc);

        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setToolTipText("Click để xem chi tiết");

        // Khai báo biến để lưu trữ MouseListener
        MouseAdapter mouseAdapter = new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel.setBackground(new Color(240, 240, 240));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel.setBackground(new Color(255, 255, 255));
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel.setBackground(new Color(210, 210, 210));
                List<Product> clickedProducts = new ArrayList<>();
                clickedProducts.add(product);
                loadProductDataToTableSale(tableModel, clickedProducts);
            }
        };

// Thêm MouseListener vào panel
        panel.addMouseListener(mouseAdapter);

        return panel;
    }

    /**
     * Resize the given ImageIcon to specified width and height.
     *
     * @param originalIcon the original ImageIcon.
     * @param width the target width.
     * @param height the target height.
     * @return the resized ImageIcon.
     */
    public ImageIcon resizeImage(ImageIcon originalIcon, int width, int height) {
        // Get image from ImageIcon
        Image originalImage = originalIcon.getImage();

        // Create new image with specified dimensions
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        // Return the resized ImageIcon
        return new ImageIcon(resizedImage);
    }

    /**
     * Load products into a JPanel with a GridBagLayout.
     *
     * @param jPanel the JPanel to populate.
     * @param scrollPane the JScrollPane to update.
     * @param tableModel the table model to update on click.
     */
    public void loadProductsToPanel(JPanel jPanel, JScrollPane scrollPane, DefaultTableModel tableModel) {
        jPanel1.removeAll();
        
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        int maxProductsPerRow = 6;
        int currentRow = 0;
        int currentColumn = 0;

        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(5, 5, 5, 5);

        for (Product product : productList) {
            JPanel productPanel = createProduct(product, tableModel);

            gbc.gridx = currentColumn;
            gbc.gridy = currentRow;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;

            jPanel.add(productPanel, gbc);

            currentColumn++;
            if (currentColumn >= maxProductsPerRow) {
                currentColumn = 0;
                currentRow++;
            }
        }

        int totalHeight = (280 + 5) * (currentRow + 1);
        int totalWidth = (100 + 5) * maxProductsPerRow;

        jPanel.setPreferredSize(new Dimension(totalWidth, totalHeight));

        jPanel.revalidate();
        jPanel.repaint();
        scrollPane.revalidate();
        scrollPane.repaint();
    }

    /**
     * Load selected product data into the sale table model. If a product
     * already exists in the table, increment its quantity and update the total
     * price.
     *
     * @param tableModel the table model to populate.
     * @param productList the list of products to add to the sale table.
     */
    public void loadProductDataToTableSale(DefaultTableModel tableModel, List<Product> productList) {
        
        int count = 0;
        DecimalFormat moneyFormat = new DecimalFormat("#,### đ");

        for (Product product : productList) {
            boolean productExists = false;
            double productPrice = product.getPrice();

            // Duyệt qua tất cả các hàng trong bảng để kiểm tra sản phẩm đã tồn tại chưa
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                String productId = tableModel.getValueAt(i, 1).toString();
                if (productId.equals(product.getProductId())) {
                    // Sản phẩm đã tồn tại, tăng số lượng và cập nhật thành tiền
                    int quantity = (int) tableModel.getValueAt(i, 4) + 1;
                    double total = quantity * productPrice;
                    tableModel.setValueAt(quantity, i, 4); // Cập nhật số lượng
                    tableModel.setValueAt(moneyFormat.format(total), i, 6); // Cập nhật thành tiền
                    totalAmount += productPrice;
                    productExists = true;
                    break;
                }
            }

            // Nếu sản phẩm chưa tồn tại, thêm sản phẩm vào bảng
            if (!productExists) {
                count++;
                Object[] rowData = {
                    count,
                    product.getProductId(),
                    product.getProductName(),
                    product.getUnit(),
                    1, // Số lượng mặc định là 1
                    moneyFormat.format(productPrice),
                    moneyFormat.format(productPrice)
                };
                tableModel.addRow(rowData);
                totalAmount += productPrice;
            }

            // Cập nhật tổng số tiền
            txt_TotalAmount.setText(moneyFormat.format(totalAmount));
        }
    }
    
    public void payment(){
        Bill B = new Bill();

        // Kiểm tra mã hóa đơn có tồn tại không
            try {
                
                
                // Thiết lập thông tin cho hóa đơn
//                B.setAccountId(Integer.parseInt(txt_AcountID.getText().trim())); // Mã nhân viên
                B.setCustomerId(customerID); // Mã khách hàng
                B.setCreatedDate(currentTimestamp);
                B.setTotalPrice(Double.parseDouble(txt_TotalAmount.getText().trim())); // Tổng tiền
                B.setBillId(billDAO.NewBIllID());
                // Thêm chi tiết hóa đơn nhập
                List<BillDetail> chiTietList = new ArrayList<>();
                for (int i = 0; i < tbl_BuyProduct.getRowCount(); i++) {
                    BillDetail chitiet = new BillDetail();

                    chitiet.setProductId((String) tbl_BuyProduct.getValueAt(i, 0)); // Mã thuốc
                    chitiet.setNameProduct((String) tbl_BuyProduct.getValueAt(i, 1)); // Tên thuốc
                    chitiet.setQuantity((int) tbl_BuyProduct.getValueAt(i, 2)); // Số lượng
                    chitiet.setPrice((double) tbl_BuyProduct.getValueAt(i, 3)); // Giá nhập
                    chitiet.setSubtotal((double) tbl_BuyProduct.getValueAt(i, 4)); // Thành tiền

                    chiTietList.add(chitiet);
                }
                B.setBillDetailList(chiTietList);

                // Lưu thông tin hóa đơn vào cơ sở dữ liệu
                int result = billDAO.save(B);
                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                    billDAO.loadAllBillsData(); // Tải lại danh sách hóa đơn
                } else {
                    JOptionPane.showMessageDialog(this, "Lưu thất bại");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Tổng tiền và số lượng phải là số hợp lệ.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + e.getMessage());
            }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BuyList;
    private javax.swing.JPanel CustomerForm;
    private javax.swing.JPanel PaymentForm;
    private javax.swing.JPanel ProductForm;
    private javax.swing.JPanel ProductSearch;
    private javax.swing.JPanel QRCode;
    private javax.swing.JPanel ShowTotal;
    private javax.swing.JButton btn_Complete;
    private javax.swing.JButton btn_Transferred;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbx_List;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel qrCode;
    private javax.swing.JRadioButton rad_Apply;
    private javax.swing.JRadioButton rad_Bank;
    private javax.swing.JRadioButton rad_Cash;
    private javax.swing.ButtonGroup rad_PaymentGroup;
    private javax.swing.JRadioButton rad_Point;
    private javax.swing.JSpinner sp_CustomerUsePoint;
    private javax.swing.JTable tbl_BuyProduct;
    private javax.swing.JTextField txt_CustomerDiscount;
    private javax.swing.JTextField txt_CustomerName;
    private javax.swing.JTextField txt_CustomerPayment;
    private javax.swing.JTextField txt_CustomerPoint;
    private javax.swing.JTextField txt_Discount;
    private javax.swing.JTextField txt_GiveBack;
    private javax.swing.JTextField txt_GrandTotal;
    private javax.swing.JTextField txt_Point;
    private javax.swing.JTextField txt_Search;
    private javax.swing.JTextField txt_TotalAmount;
    // End of variables declaration//GEN-END:variables
}

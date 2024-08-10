package UI.Home_Panels;

import UI.LeVanAn;

public class Home_Sale extends javax.swing.JPanel {
    public LeVanAn levanan = new LeVanAn();

    public Home_Sale() {
        initComponents();
        rad_Cash.setSelected(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        rad_PaymentGroup = new javax.swing.ButtonGroup();
        PaymentForm = new javax.swing.JPanel();
        CustomerForm = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_CustomerPoint = new javax.swing.JTextField();
        sp_CustomerUsePoint = new javax.swing.JSpinner();
        txt_CustomerDiscount = new javax.swing.JTextField();
        btn_ApplyPoint = new javax.swing.JButton();
        txt_CustomerName = new javax.swing.JTextField();
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
        jButton1 = new javax.swing.JButton();
        btn_Complete = new javax.swing.JButton();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        QRCode = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        qrCode = new javax.swing.JLabel();
        btn_Transferred = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout(0, 10));

        PaymentForm.setBackground(new java.awt.Color(246, 245, 242));
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
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        CustomerForm.add(jLabel7, gridBagConstraints);

        jLabel8.setBackground(new java.awt.Color(69, 71, 75));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(235, 244, 246));
        jLabel8.setText("Số điểm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        CustomerForm.add(jLabel8, gridBagConstraints);

        jLabel9.setBackground(new java.awt.Color(69, 71, 75));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(235, 244, 246));
        jLabel9.setText("Tổng giảm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        CustomerForm.add(jLabel9, gridBagConstraints);

        jLabel10.setBackground(new java.awt.Color(69, 71, 75));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(235, 244, 246));
        jLabel10.setText("Khách hàng");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        CustomerForm.add(jLabel10, gridBagConstraints);

        txt_CustomerPoint.setEditable(false);
        txt_CustomerPoint.setBackground(new java.awt.Color(244, 244, 242));
        txt_CustomerPoint.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_CustomerPoint.setForeground(new java.awt.Color(0, 0, 0));
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

        btn_ApplyPoint.setBackground(new java.awt.Color(255, 75, 102));
        btn_ApplyPoint.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ApplyPoint.setForeground(new java.awt.Color(255, 255, 255));
        btn_ApplyPoint.setText("Áp dụng");
        btn_ApplyPoint.setPreferredSize(new java.awt.Dimension(85, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 5, 20);
        CustomerForm.add(btn_ApplyPoint, gridBagConstraints);

        txt_CustomerName.setBackground(new java.awt.Color(244, 244, 242));
        txt_CustomerName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_CustomerName.setForeground(new java.awt.Color(0, 0, 0));
        txt_CustomerName.setText("Nhập SĐT của khách vào");
        txt_CustomerName.setMaximumSize(new java.awt.Dimension(64, 28));
        txt_CustomerName.setPreferredSize(new java.awt.Dimension(64, 28));
        txt_CustomerName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_CustomerNameMouseClicked(evt);
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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
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
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        ShowTotal.add(jLabel3, gridBagConstraints);

        jLabel6.setBackground(new java.awt.Color(69, 71, 75));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(235, 244, 246));
        jLabel6.setText("Khách đưa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        ShowTotal.add(jLabel6, gridBagConstraints);

        jLabel2.setBackground(new java.awt.Color(69, 71, 75));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 244, 246));
        jLabel2.setText("Trả khách");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        ShowTotal.add(jLabel2, gridBagConstraints);

        txt_CustomerPayment.setBackground(new java.awt.Color(244, 244, 242));
        txt_CustomerPayment.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_CustomerPayment.setForeground(new java.awt.Color(0, 0, 0));
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
        txt_GiveBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_GiveBack.setForeground(new java.awt.Color(255, 0, 0));
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
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        ShowTotal.add(jLabel1, gridBagConstraints);

        jLabel5.setBackground(new java.awt.Color(69, 71, 75));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(235, 244, 246));
        jLabel5.setText("Tổng số tiền");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        ShowTotal.add(jLabel5, gridBagConstraints);

        txt_TotalAmount.setEditable(false);
        txt_TotalAmount.setBackground(new java.awt.Color(244, 244, 242));
        txt_TotalAmount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_TotalAmount.setForeground(new java.awt.Color(0, 0, 0));
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
        txt_Discount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_Discount.setForeground(new java.awt.Color(255, 255, 0));
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
        txt_GrandTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_GrandTotal.setForeground(new java.awt.Color(0, 0, 0));
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
        txt_Point.setBackground(new java.awt.Color(244, 244, 242));
        txt_Point.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_Point.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        ShowTotal.add(txt_Point, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(255, 75, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tích điểm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        ShowTotal.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        PaymentForm.add(ShowTotal, gridBagConstraints);

        btn_Complete.setBackground(new java.awt.Color(255, 75, 102));
        btn_Complete.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btn_Complete.setForeground(new java.awt.Color(255, 255, 255));
        btn_Complete.setText("Hoàn tất");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        PaymentForm.add(btn_Complete, gridBagConstraints);

        add(PaymentForm, java.awt.BorderLayout.LINE_END);

        ProductForm.setBackground(new java.awt.Color(246, 245, 242));

        BuyList.setBackground(new java.awt.Color(254, 254, 252));
        BuyList.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setBackground(new java.awt.Color(8, 131, 149));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tbl_BuyProduct.setAutoCreateRowSorter(true);
        tbl_BuyProduct.setBackground(new java.awt.Color(8, 131, 149));
        tbl_BuyProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbl_BuyProduct.setForeground(new java.awt.Color(255, 255, 255));
        tbl_BuyProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
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
        tbl_BuyProduct.setPreferredSize(new java.awt.Dimension(950, 75));
        tbl_BuyProduct.setRowHeight(25);
        tbl_BuyProduct.setSelectionBackground(new java.awt.Color(187, 191, 202));
        tbl_BuyProduct.setSelectionForeground(new java.awt.Color(218, 18, 18));
        tbl_BuyProduct.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_BuyProduct.setShowGrid(false);
        tbl_BuyProduct.setShowHorizontalLines(true);
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
            tbl_BuyProduct.getColumnModel().getColumn(6).setMinWidth(130);
            tbl_BuyProduct.getColumnModel().getColumn(6).setPreferredWidth(130);
            tbl_BuyProduct.getColumnModel().getColumn(6).setMaxWidth(130);
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
        cbx_List.setForeground(new java.awt.Color(0, 0, 0));
        cbx_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thức ăn", "Nước uống", "Hàng tiêu dùng", " ", " " }));

        txt_Search.setBackground(new java.awt.Color(244, 244, 242));
        txt_Search.setForeground(new java.awt.Color(0, 0, 0));

        jScrollPane3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setAutoscrolls(true);
        jScrollPane3.setColumnHeaderView(null);
        jScrollPane3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jPanel1.setBackground(new java.awt.Color(187, 191, 202));
        jPanel1.setMaximumSize(new java.awt.Dimension(509, 32767));
        jPanel1.setPreferredSize(new java.awt.Dimension(509, 604));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT);
        flowLayout1.setAlignOnBaseline(true);
        jPanel1.setLayout(flowLayout1);

        jPanel2.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Món 1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Món 1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Món 1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Món 1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Món 1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(200, 60));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Món 1");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel7);

        jScrollPane3.setViewportView(jPanel1);

        jScrollPane3.getVerticalScrollBar().setUnitIncrement(20);

        javax.swing.GroupLayout ProductSearchLayout = new javax.swing.GroupLayout(ProductSearch);
        ProductSearch.setLayout(ProductSearchLayout);
        ProductSearchLayout.setHorizontalGroup(
            ProductSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProductSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
                    .addGroup(ProductSearchLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Search)
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
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
            .addComponent(BuyList, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
        );
        ProductFormLayout.setVerticalGroup(
            ProductFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QRCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BuyList, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BuyList;
    private javax.swing.JPanel CustomerForm;
    private javax.swing.JPanel PaymentForm;
    private javax.swing.JPanel ProductForm;
    private javax.swing.JPanel ProductSearch;
    private javax.swing.JPanel QRCode;
    private javax.swing.JPanel ShowTotal;
    private javax.swing.JButton btn_ApplyPoint;
    private javax.swing.JButton btn_Complete;
    private javax.swing.JButton btn_Transferred;
    private javax.swing.JComboBox<String> cbx_List;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel qrCode;
    private javax.swing.JRadioButton rad_Bank;
    private javax.swing.JRadioButton rad_Cash;
    private javax.swing.ButtonGroup rad_PaymentGroup;
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

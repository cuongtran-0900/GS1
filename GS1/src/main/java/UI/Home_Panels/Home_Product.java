package UI.Home_Panels;

import DAO.ProductDAO;
import MODEL.Product;
import UI.LeVanAn;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Home_Product extends javax.swing.JPanel {
    LeVanAn levanan = new LeVanAn();
    File selectedFile;
    DecimalFormat moneyFormat = new DecimalFormat("#,### đ");
    ProductDAO productDAO = new ProductDAO();
    List<Product> productList = productDAO.loadAllProductsData();
    
    public Home_Product() {
        initComponents();
        fillDataToProductTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btn_AddProduct = new javax.swing.JButton();
        btn_UpdateProduct = new javax.swing.JButton();
        btn_ProductRemove = new javax.swing.JButton();
        btn_ProductRefesh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_ProductName = new javax.swing.JTextField();
        txt_ProductPrice = new javax.swing.JTextField();
        txt_ProductId = new javax.swing.JTextField();
        cbx_ProductType = new javax.swing.JComboBox<>();
        cbx_ProductUnit = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_ProductImage = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbl_ShowImage = new javax.swing.JLabel();
        btn_AddProductImage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Product = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txt_ProductSearch = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 85, 206));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(0, 85, 206));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btn_AddProduct.setBackground(new java.awt.Color(255, 75, 102));
        btn_AddProduct.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_AddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_AddProduct.setText("Thêm");
        btn_AddProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_AddProduct.setMaximumSize(new java.awt.Dimension(102, 25));
        btn_AddProduct.setMinimumSize(new java.awt.Dimension(102, 25));
        btn_AddProduct.setPreferredSize(new java.awt.Dimension(102, 25));
        btn_AddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddProductActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 6, 6);
        jPanel1.add(btn_AddProduct, gridBagConstraints);

        btn_UpdateProduct.setBackground(new java.awt.Color(255, 75, 102));
        btn_UpdateProduct.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_UpdateProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_UpdateProduct.setText("Cập nhật");
        btn_UpdateProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_UpdateProduct.setMaximumSize(new java.awt.Dimension(102, 25));
        btn_UpdateProduct.setMinimumSize(new java.awt.Dimension(102, 25));
        btn_UpdateProduct.setPreferredSize(new java.awt.Dimension(102, 25));
        btn_UpdateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateProductActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 6, 6);
        jPanel1.add(btn_UpdateProduct, gridBagConstraints);

        btn_ProductRemove.setBackground(new java.awt.Color(255, 75, 102));
        btn_ProductRemove.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_ProductRemove.setForeground(new java.awt.Color(255, 255, 255));
        btn_ProductRemove.setText("Xóa");
        btn_ProductRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ProductRemove.setMaximumSize(new java.awt.Dimension(102, 25));
        btn_ProductRemove.setMinimumSize(new java.awt.Dimension(102, 25));
        btn_ProductRemove.setPreferredSize(new java.awt.Dimension(102, 25));
        btn_ProductRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductRemoveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 6, 6);
        jPanel1.add(btn_ProductRemove, gridBagConstraints);

        btn_ProductRefesh.setBackground(new java.awt.Color(255, 75, 102));
        btn_ProductRefesh.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_ProductRefesh.setForeground(new java.awt.Color(255, 255, 255));
        btn_ProductRefesh.setText("Làm mới");
        btn_ProductRefesh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ProductRefesh.setMaximumSize(new java.awt.Dimension(102, 25));
        btn_ProductRefesh.setMinimumSize(new java.awt.Dimension(102, 25));
        btn_ProductRefesh.setPreferredSize(new java.awt.Dimension(102, 25));
        btn_ProductRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductRefeshActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 16, 6);
        jPanel1.add(btn_ProductRefesh, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 188;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jPanel1, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(8, 131, 149));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(0, 85, 206));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Loại sản phẩm:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 35, 10, 3);
        jPanel4.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tên sản phẩm:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 35, 10, 3);
        jPanel4.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Đơn vị tính:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 35, 10, 3);
        jPanel4.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Giá:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 35, 10, 3);
        jPanel4.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mã sản phẩm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 35, 10, 3);
        jPanel4.add(jLabel5, gridBagConstraints);

        txt_ProductName.setBackground(new java.awt.Color(244, 244, 242));
        txt_ProductName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_ProductName.setForeground(new java.awt.Color(0, 0, 0));
        txt_ProductName.setMaximumSize(new java.awt.Dimension(64, 31));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 825;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 13, 10, 12);
        jPanel4.add(txt_ProductName, gridBagConstraints);

        txt_ProductPrice.setBackground(new java.awt.Color(255, 255, 255));
        txt_ProductPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_ProductPrice.setForeground(new java.awt.Color(0, 0, 0));
        txt_ProductPrice.setMaximumSize(new java.awt.Dimension(64, 31));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 829;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 13, 10, 15);
        jPanel4.add(txt_ProductPrice, gridBagConstraints);

        txt_ProductId.setEditable(false);
        txt_ProductId.setBackground(new java.awt.Color(244, 244, 242));
        txt_ProductId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_ProductId.setMaximumSize(new java.awt.Dimension(64, 31));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 13, 10, 15);
        jPanel4.add(txt_ProductId, gridBagConstraints);

        cbx_ProductType.setBackground(new java.awt.Color(244, 244, 242));
        cbx_ProductType.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbx_ProductType.setForeground(new java.awt.Color(0, 0, 0));
        cbx_ProductType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TP", "DU", "DGD", "VPP" }));
        cbx_ProductType.setSelectedIndex(-1);
        cbx_ProductType.setMaximumSize(new java.awt.Dimension(64, 31));
        cbx_ProductType.setMinimumSize(new java.awt.Dimension(64, 31));
        cbx_ProductType.setPreferredSize(new java.awt.Dimension(64, 31));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 806;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 13, 10, 15);
        jPanel4.add(cbx_ProductType, gridBagConstraints);

        cbx_ProductUnit.setBackground(new java.awt.Color(244, 244, 242));
        cbx_ProductUnit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbx_ProductUnit.setForeground(new java.awt.Color(0, 0, 0));
        cbx_ProductUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cái", "chai", "lon", "bịch", "hộp", "gói", "tuýp", "bánh", "ổ", "bộ", "chiếc", "quyển", "đôi", "cây", " " }));
        cbx_ProductUnit.setSelectedIndex(-1);
        cbx_ProductUnit.setMaximumSize(new java.awt.Dimension(64, 31));
        cbx_ProductUnit.setMinimumSize(new java.awt.Dimension(64, 31));
        cbx_ProductUnit.setPreferredSize(new java.awt.Dimension(64, 31));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 795;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 13, 10, 15);
        jPanel4.add(cbx_ProductUnit, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ảnh:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 35, 10, 3);
        jPanel4.add(jLabel6, gridBagConstraints);

        txt_ProductImage.setBackground(new java.awt.Color(255, 255, 255));
        txt_ProductImage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_ProductImage.setForeground(new java.awt.Color(0, 0, 0));
        txt_ProductImage.setMaximumSize(new java.awt.Dimension(64, 31));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 829;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 13, 10, 15);
        jPanel4.add(txt_ProductImage, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel3.add(jPanel4, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(54, 54, 163));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        lbl_ShowImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ShowImage.setText("Ảnh sản Phẩm");
        lbl_ShowImage.setMaximumSize(new java.awt.Dimension(120, 60));
        lbl_ShowImage.setMinimumSize(new java.awt.Dimension(120, 60));
        lbl_ShowImage.setPreferredSize(new java.awt.Dimension(120, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        jPanel2.add(lbl_ShowImage, gridBagConstraints);

        btn_AddProductImage.setBackground(new java.awt.Color(255, 75, 102));
        btn_AddProductImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_AddProductImage.setForeground(new java.awt.Color(255, 255, 255));
        btn_AddProductImage.setText("Thêm ảnh");
        btn_AddProductImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_AddProductImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddProductImageActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        jPanel2.add(btn_AddProductImage, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.ipady = 137;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel3.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        add(jPanel3, gridBagConstraints);

        tbl_Product.setAutoCreateRowSorter(true);
        tbl_Product.setBackground(new java.awt.Color(8, 131, 149));
        tbl_Product.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbl_Product.setForeground(new java.awt.Color(255, 255, 255));
        tbl_Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Loại", "Tên", "Đơn vị tính", "Giá", "Ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Product);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 871;
        gridBagConstraints.ipady = 407;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jScrollPane1, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tìm kiếm:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(jLabel7, gridBagConstraints);

        txt_ProductSearch.setBackground(new java.awt.Color(255, 255, 255));
        txt_ProductSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_ProductSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ProductSearchKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 40);
        add(txt_ProductSearch, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ProductMouseClicked
        fillDataToProducDetail();
    }//GEN-LAST:event_tbl_ProductMouseClicked

    private void btn_AddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddProductActionPerformed
        addProductByButton();
    }//GEN-LAST:event_btn_AddProductActionPerformed

    private void btn_UpdateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateProductActionPerformed
        // TODO add your handling code here:
        updateProductByButton();
    }//GEN-LAST:event_btn_UpdateProductActionPerformed

    private void btn_ProductRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductRemoveActionPerformed
        // TODO add your handling code here:
        deleteProductByButton();
    }//GEN-LAST:event_btn_ProductRemoveActionPerformed

    private void btn_AddProductImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddProductImageActionPerformed
        // TODO add your handling code here:
        txt_ProductImage.setText(loadImageToLabel(lbl_ShowImage));
    }//GEN-LAST:event_btn_AddProductImageActionPerformed

    private void btn_ProductRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductRefeshActionPerformed
        // TODO add your handling code here:
        levanan.clearData(txt_ProductId,cbx_ProductType, txt_ProductName, cbx_ProductUnit, txt_ProductPrice, txt_ProductImage, lbl_ShowImage);
    }//GEN-LAST:event_btn_ProductRefeshActionPerformed

    private void txt_ProductSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ProductSearchKeyReleased
        // TODO add your handling code here:
        levanan.filterDataByTableToTextField(tbl_Product, txt_ProductSearch);
    }//GEN-LAST:event_txt_ProductSearchKeyReleased

    private void addProductByButton() {
        Product product = new Product();

        // Gán các giá trị từ giao diện người dùng vào đối tượng product
        String productType = cbx_ProductType.getSelectedItem().toString();
        String productName = txt_ProductName.getText();
        String unit = cbx_ProductUnit.getSelectedItem().toString();
        String priceText = txt_ProductPrice.getText().replaceAll("[,\\sđ]", ""); // Xóa dấu phẩy, khoảng trắng và chữ 'đ'
        String productImages = txt_ProductImage.getText();

        double price;
        try {
            price = Double.parseDouble(priceText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá sản phẩm không hợp lệ. Vui lòng nhập lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return; // Ngừng xử lý nếu giá không hợp lệ
        }
        
        // Kiểm tra xem ảnh có bị rỗng không
        if(productImages.isEmpty()){
            productImages = "DONT HAVE ANY IMAGE!!!";
        }
        
        String productId;
        do {
            // Sinh mã sản phẩm mới với số ngẫu nhiên
            int randomNumber = 100 + (int)(Math.random() * 900);
            productId = productType + String.format("%03d", randomNumber);
        } while (productDAO.isProductIdExist(productId)); // Kiểm tra nếu mã sản phẩm đã tồn tại
        
        // In mã lên text field
        txt_ProductId.setText(productId);
        
        // Hiển thị hộp thoại xác nhận
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thêm sản phẩm này?", "Xác nhận", JOptionPane.YES_NO_OPTION);

        // Nếu người dùng chọn "Có", tiếp tục thực hiện hành động thêm sản phẩm
        if (confirm == JOptionPane.YES_OPTION) {
            // Gán giá trị vào đối tượng Product
            product.setProductId(productId);
            product.setTypeId(productType);
            product.setProductName(productName);
            product.setUnit(unit);
            product.setPrice(price);
            product.setImages(productImages);
            saveImageToDisk();
            // Thêm sản phẩm vào cơ sở dữ liệu
            boolean result = productDAO.addProduct(product);

            if(result){
                JOptionPane.showMessageDialog(this, "Chúc mừng! Bạn đã thêm sản phẩm thành công.", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                // Sau khi thêm thành công, có thể làm mới bảng dữ liệu hoặc xóa trắng các trường nhập liệu
                productList = productDAO.loadAllProductsData();
                fillDataToProductTable();
                levanan.clearData(txt_ProductId,cbx_ProductType, txt_ProductName, cbx_ProductUnit, txt_ProductPrice, txt_ProductImage, lbl_ShowImage);
            } else {
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm không thành công. Vui lòng thử lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Nếu người dùng chọn "Không", dừng hành động
            JOptionPane.showMessageDialog(this, "Thêm sản phẩm đã bị hủy.", "Hủy bỏ", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private void updateProductByButton(){
        Product product = new Product();

        // Gán các giá trị từ giao diện người dùng vào đối tượng product
        String productId = txt_ProductId.getText();
        String productType = cbx_ProductType.getSelectedItem().toString();
        String productName = txt_ProductName.getText();
        String unit = cbx_ProductUnit.getSelectedItem().toString();
        String priceText = txt_ProductPrice.getText().replaceAll("[,\\sđ]", ""); // Xóa dấu phẩy, khoảng trắng và chữ 'đ'
        String productImages = txt_ProductImage.getText();

        double price;
        try {
            price = Double.parseDouble(priceText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá sản phẩm không hợp lệ. Vui lòng nhập lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return; // Ngừng xử lý nếu giá không hợp lệ
        }
        
        // Kiểm tra xem ảnh có bị rỗng không
        if(productImages.isEmpty()){
            productImages = "DONT HAVE ANY IMAGE!!!";
        }
        
        // Hiển thị hộp thoại xác nhận
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn với những thay đổi này chứ?", "Xác nhận", JOptionPane.YES_NO_OPTION);

        // Nếu người dùng chọn "Có", tiếp tục thực hiện hành động cập nhật sản phẩm
        if (confirm == JOptionPane.YES_OPTION) {
            // Gán giá trị vào đối tượng Product
            product.setProductId(productId);
            product.setTypeId(productType);
            product.setProductName(productName);
            product.setUnit(unit);
            product.setPrice(price);
            product.setImages(productImages);
            saveImageToDisk();
            // Cập nhật sản phẩm vào cơ sở dữ liệu
            boolean result = productDAO.updateProduct(product);

            if(result){
                JOptionPane.showMessageDialog(this, "Chúc mừng! Bạn sửa sản phẩm thành công.", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                // Sau khi cập nhật thành công, có thể làm mới bảng dữ liệu hoặc xóa trắng các trường nhập liệu
                productList = productDAO.loadAllProductsData();
                fillDataToProductTable();
                levanan.clearData(txt_ProductId,cbx_ProductType, txt_ProductName, cbx_ProductUnit, txt_ProductPrice, txt_ProductImage, lbl_ShowImage);
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thông tin sản phẩm không thành công. Vui lòng thử lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Nếu người dùng chọn "Không", dừng hành động
            JOptionPane.showMessageDialog(this, "Thay đổi sản phẩm đã bị hủy.", "Hủy bỏ", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private void deleteProductByButton(){
        // Gán các giá trị từ giao diện người dùng vào đối tượng product
        String productId = txt_ProductId.getText();
        // Hiển thị hộp thoại xác nhận
        int confirm = JOptionPane.showConfirmDialog(this, "Xóa sản phẩm này vĩnh viễn?", "Xác nhận", JOptionPane.YES_NO_OPTION);

        // Nếu người dùng chọn "Có", tiếp tục thực hiện hành động xóa sản phẩm
        if (confirm == JOptionPane.YES_OPTION) {
 
            boolean result = productDAO.deleteProduct(productId);

            if(result){
                JOptionPane.showMessageDialog(this, "Chúc mừng! Bạn xóa sản phẩm thành công.", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                // Sau khi xóa thành công, có thể làm mới bảng dữ liệu hoặc xóa trắng các trường nhập liệu
                productList = productDAO.loadAllProductsData();
                fillDataToProductTable();
                levanan.clearData(txt_ProductId,cbx_ProductType, txt_ProductName, cbx_ProductUnit, txt_ProductPrice, txt_ProductImage, lbl_ShowImage);
            } else {
                JOptionPane.showMessageDialog(this, "Xóa sản phẩm không thành công. Vui lòng thử lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Nếu người dùng chọn "Không", dừng hành động
            JOptionPane.showMessageDialog(this, "Thay đổi sản phẩm đã bị hủy.", "Hủy bỏ", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private void fillDataToProductTable(){
        DefaultTableModel dtm = (DefaultTableModel) tbl_Product.getModel();
        dtm.setRowCount(0);
        for (Product product : productList) {
            Object []productData = {product.getProductId(), product.getProductName(), product.getTypeId(), product.getUnit(), moneyFormat.format(product.getPrice()), product.getImages()};
            dtm.addRow(productData);
        }
    }    
    private void fillDataToProducDetail() {
        int index = tbl_Product.getSelectedRow();
        String pathProductImage = "src/main/resources/Image_product/";
        String imgPath = tbl_Product.getValueAt(index, 5).toString();
        String currentImg;

        if (imgPath == null || imgPath.trim().isEmpty() || !new File(pathProductImage + imgPath).exists()) {
            currentImg = pathProductImage + "wrong.jpg";
        } else {
            currentImg = pathProductImage + imgPath;
        }
        ImageIcon resizedImg = levanan.resizeImage(new ImageIcon(currentImg), 215, 280);
        
        
        txt_ProductId.setText(tbl_Product.getValueAt(index, 0).toString());
        txt_ProductName.setText(tbl_Product.getValueAt(index, 1).toString()); // Tên sản phẩm từ cột 1
        cbx_ProductType.setSelectedItem(tbl_Product.getValueAt(index, 2).toString()); // Loại sản phẩm từ cột 2
        cbx_ProductUnit.setSelectedItem(tbl_Product.getValueAt(index, 3).toString()); // Đơn vị sản phẩm từ cột 3
        txt_ProductPrice.setText(tbl_Product.getValueAt(index, 4).toString()); // Giá sản phẩm từ cột 4
        txt_ProductImage.setText(tbl_Product.getValueAt(index, 5).toString()); // Link hình ảnh từ cột 5
        lbl_ShowImage.setText(null);
        lbl_ShowImage.setIcon(resizedImg);
    }
    
    private String loadImageToLabel(JLabel lbl_Image) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            String fileName = selectedFile.getName(); // Lấy tên file

            // Hiển thị ảnh trực tiếp từ file đã chọn
            ImageIcon resizedImg = levanan.resizeImage(new ImageIcon(selectedFile.getAbsolutePath()), 215, 280);
            lbl_Image.setIcon(resizedImg);
            lbl_Image.setText(null); // Xóa text nếu có
            JOptionPane.showMessageDialog(this, "Tải ảnh thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);

            return fileName; // Trả về tên file
        }

        return null; // Trả về null nếu không có file được chọn
    }
    
    private void saveImageToDisk() {
        if (selectedFile == null) {
            JOptionPane.showMessageDialog(null, "Bạn chưa cho nó ảnh");
            return;
        }

        // Đường dẫn đích
        String destinationPath = "src/main/resources/Image_product/" + selectedFile.getName();

        try {
            // Tạo thư mục đích nếu chưa tồn tại
            File destinationDir = new File("src/main/resources/Image_product/");
            if (!destinationDir.exists()) {
                destinationDir.mkdirs();
            }

            // Sao chép ảnh vào thư mục đích
            Files.copy(selectedFile.toPath(), Paths.get(destinationPath), StandardCopyOption.REPLACE_EXISTING);

            JOptionPane.showMessageDialog(null, "Tải ảnh thành công");
        } catch (IOException ioException) {
            ioException.printStackTrace();
            JOptionPane.showMessageDialog(null, "Tải ảnh thất bại");
        }
}




    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddProduct;
    private javax.swing.JButton btn_AddProductImage;
    private javax.swing.JButton btn_ProductRefesh;
    private javax.swing.JButton btn_ProductRemove;
    private javax.swing.JButton btn_UpdateProduct;
    private javax.swing.JComboBox<String> cbx_ProductType;
    private javax.swing.JComboBox<String> cbx_ProductUnit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ShowImage;
    private javax.swing.JTable tbl_Product;
    private javax.swing.JTextField txt_ProductId;
    private javax.swing.JTextField txt_ProductImage;
    private javax.swing.JTextField txt_ProductName;
    private javax.swing.JTextField txt_ProductPrice;
    private javax.swing.JTextField txt_ProductSearch;
    // End of variables declaration//GEN-END:variables
}

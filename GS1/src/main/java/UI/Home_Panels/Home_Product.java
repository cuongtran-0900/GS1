package UI.Home_Panels;

import DAO.ProductDAO;
import MODEL.Product;
import UI.LeVanAn;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Home_Product extends javax.swing.JPanel {
    LeVanAn levanan = new LeVanAn();
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_ProductName = new javax.swing.JTextField();
        txt_ProductPrice = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        cbx_ProductType = new javax.swing.JComboBox<>();
        cbx_ProductUnit = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lbl_ShowImage = new javax.swing.JLabel();
        btn_AddProductImage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Product = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btn_AddProduct.setBackground(new java.awt.Color(255, 75, 102));
        btn_AddProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_AddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_AddProduct.setText("Thêm");
        btn_AddProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btn_UpdateProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_UpdateProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_UpdateProduct.setText("Cập nhật");
        btn_UpdateProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btn_ProductRemove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_ProductRemove.setForeground(new java.awt.Color(255, 255, 255));
        btn_ProductRemove.setText("Xóa");
        btn_ProductRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 16, 6);
        jPanel1.add(btn_ProductRemove, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 188;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jPanel1, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(8, 131, 149));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(0, 51, 204));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 825;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 13, 10, 12);
        jPanel4.add(txt_ProductName, gridBagConstraints);

        txt_ProductPrice.setBackground(new java.awt.Color(244, 244, 242));
        txt_ProductPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_ProductPrice.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 829;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 13, 10, 15);
        jPanel4.add(txt_ProductPrice, gridBagConstraints);

        jTextField1.setBackground(new java.awt.Color(244, 244, 242));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 13, 10, 15);
        jPanel4.add(jTextField1, gridBagConstraints);

        cbx_ProductType.setBackground(new java.awt.Color(244, 244, 242));
        cbx_ProductType.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbx_ProductType.setForeground(new java.awt.Color(0, 0, 0));
        cbx_ProductType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TP", "DU", "DGD", "VPP" }));
        cbx_ProductType.setSelectedIndex(-1);
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 795;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 13, 10, 15);
        jPanel4.add(cbx_ProductUnit, gridBagConstraints);

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
        jPanel2.add(lbl_ShowImage, gridBagConstraints);

        btn_AddProductImage.setBackground(new java.awt.Color(255, 75, 102));
        btn_AddProductImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_AddProductImage.setForeground(new java.awt.Color(255, 255, 255));
        btn_AddProductImage.setText("Thêm ảnh");
        btn_AddProductImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
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
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        add(jPanel3, gridBagConstraints);

        tbl_Product.setAutoCreateRowSorter(true);
        tbl_Product.setBackground(new java.awt.Color(8, 131, 149));
        tbl_Product.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbl_Product.setForeground(new java.awt.Color(255, 255, 255));
        tbl_Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã", "Loại", "Tên", "Đơn vị tính", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 871;
        gridBagConstraints.ipady = 407;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jScrollPane1, gridBagConstraints);
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

    private void addProductByButton() {
        Product product = new Product();

        // Gán các giá trị từ giao diện người dùng vào đối tượng product
        String productType = cbx_ProductType.getSelectedItem().toString();
        String productName = txt_ProductName.getText();
        String unit = cbx_ProductUnit.getSelectedItem().toString();
        String priceText = txt_ProductPrice.getText().replaceAll("[,\\sđ]", ""); // Xóa dấu phẩy, khoảng trắng và chữ 'đ'
        String productImages = "Null"; // Nếu có trường hình ảnh

        double price;
        try {
            price = Double.parseDouble(priceText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá sản phẩm không hợp lệ. Vui lòng nhập lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return; // Ngừng xử lý nếu giá không hợp lệ
        }

        String productId;
        do {
            // Sinh mã sản phẩm mới với số ngẫu nhiên
            int randomNumber = 100 + (int)(Math.random() * 900);
            productId = productType + String.format("%03d", randomNumber);
        } while (productDAO.isProductIdExist(productId)); // Kiểm tra nếu mã sản phẩm đã tồn tại

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

            // Thêm sản phẩm vào cơ sở dữ liệu
            boolean result = productDAO.addProduct(product);

            if(result){
                JOptionPane.showMessageDialog(this, "Chúc mừng! Bạn đã thêm sản phẩm thành công.", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                // Sau khi thêm thành công, có thể làm mới bảng dữ liệu hoặc xóa trắng các trường nhập liệu
                productList = productDAO.loadAllProductsData();
                fillDataToProductTable();
                levanan.clearData(cbx_ProductType, txt_ProductName, cbx_ProductUnit, txt_ProductPrice);
            } else {
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm không thành công. Vui lòng thử lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Nếu người dùng chọn "Không", dừng hành động
            JOptionPane.showMessageDialog(this, "Thêm sản phẩm đã bị hủy.", "Hủy bỏ", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void updateProductByButton(){
        
    }
    private void deleteProductByButton(){}
    private void fillDataToProductTable(){
        DefaultTableModel dtm = (DefaultTableModel) tbl_Product.getModel();
        dtm.setRowCount(0);
        for (Product product : productList) {
            Object []productData = {product.getProductId(), product.getProductName(), product.getTypeId(), product.getUnit(), moneyFormat.format(product.getPrice())};
            dtm.addRow(productData);
        }
    }
    
    private void fillDataToProducDetail() {
        int index = tbl_Product.getSelectedRow();
        txt_ProductName.setText(tbl_Product.getValueAt(index, 1).toString()); // Tên sản phẩm từ cột 1
        cbx_ProductType.setSelectedItem(tbl_Product.getValueAt(index, 2).toString()); // Loại sản phẩm từ cột 2
        cbx_ProductUnit.setSelectedItem(tbl_Product.getValueAt(index, 3).toString()); // Đơn vị sản phẩm từ cột 3
        txt_ProductPrice.setText(tbl_Product.getValueAt(index, 4).toString()); // Giá sản phẩm từ cột 4
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddProduct;
    private javax.swing.JButton btn_AddProductImage;
    private javax.swing.JButton btn_ProductRemove;
    private javax.swing.JButton btn_UpdateProduct;
    private javax.swing.JComboBox<String> cbx_ProductType;
    private javax.swing.JComboBox<String> cbx_ProductUnit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_ShowImage;
    private javax.swing.JTable tbl_Product;
    private javax.swing.JTextField txt_ProductName;
    private javax.swing.JTextField txt_ProductPrice;
    // End of variables declaration//GEN-END:variables
}

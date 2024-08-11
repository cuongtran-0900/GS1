/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Home_Panels;


import MODEL.Bill;
import DAO.BillDAO;
import DAO.CustomerDAO;
import MODEL.BillDetail;
import MODEL.Customer;
import UI.LeVanAn;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Home_History extends javax.swing.JPanel {
    LeVanAn levanan = new LeVanAn();
    private DecimalFormat moneyFormat = new DecimalFormat("#,### đ");
    public Home_History() {
        initComponents();
        filltoTBL_Bill();
    }

 

    BillDAO BDao = new BillDAO();
    List<Bill> BillList = BDao.loadAllBillsData();
    
    CustomerDAO customerDAO = new CustomerDAO();
    List<Customer> customerList = customerDAO.loadAllCustomersData();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        txt_Find = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_CustomerID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Bill = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_BillDetail = new javax.swing.JTable();

        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(0, 85, 206));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        txt_Find.setBackground(new java.awt.Color(255, 255, 255));
        txt_Find.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_Find.setForeground(new java.awt.Color(0, 0, 0));
        txt_Find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_FindKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(txt_Find, gridBagConstraints);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mã Khách Hàng :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        jPanel1.add(jLabel5, gridBagConstraints);

        txt_CustomerID.setEditable(false);
        txt_CustomerID.setBackground(new java.awt.Color(255, 255, 255));
        txt_CustomerID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_CustomerID.setForeground(new java.awt.Color(0, 0, 0));
        txt_CustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CustomerIDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        jPanel1.add(txt_CustomerID, gridBagConstraints);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tìm Kiếm :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LỊCH SỬ HÓA ĐƠN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(246, 245, 242));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        tbl_Bill.setAutoCreateRowSorter(true);
        tbl_Bill.setBackground(new java.awt.Color(8, 131, 149));
        tbl_Bill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbl_Bill.setForeground(new java.awt.Color(255, 255, 255));
        tbl_Bill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã HD", "Mã NV", "Thời Gian", "Tổng Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Bill.setSelectionBackground(new java.awt.Color(0, 0, 51));
        tbl_Bill.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_Bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_BillMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Bill);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 581;
        gridBagConstraints.ipady = 557;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jScrollPane1, gridBagConstraints);

        tbl_BillDetail.setAutoCreateRowSorter(true);
        tbl_BillDetail.setBackground(new java.awt.Color(204, 150, 0));
        tbl_BillDetail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tbl_BillDetail.setForeground(new java.awt.Color(255, 255, 255));
        tbl_BillDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Số Lượng", "Đơn Giá", "Thành Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_BillDetail.setSelectionBackground(new java.awt.Color(0, 0, 51));
        tbl_BillDetail.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_BillDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_BillDetailMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_BillDetail);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1043;
        gridBagConstraints.ipady = 557;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jScrollPane2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1047;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        add(jPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents







   
    public void filltoTBL_Bill() {
        DefaultTableModel model = (DefaultTableModel) tbl_Bill.getModel();
        model.setRowCount(0); // Xóa tất cả các hàng hiện có trong bảng

        // Đảm bảo BillList không chứa dữ liệu trùng lặp
        Set<String> seenBillIds = new HashSet<>();
        for (Bill B : BillList) {
            if (!seenBillIds.contains(B.getBillId())) {
                model.addRow(new Object[]{B.getBillId(), B.getAccountId(), B.getCreatedDate(), moneyFormat.format(B.getTotalPrice())});
                seenBillIds.add(B.getBillId());
            }
        }
    }

    public void showDetail() {
        int viewIndex = tbl_Bill.getSelectedRow();
        if (viewIndex == -1) {
            return;
        }

        int modelIndex = tbl_Bill.convertRowIndexToModel(viewIndex);
        if (modelIndex >= 0 && modelIndex < BillList.size()) {
            Bill B = BillList.get(modelIndex); // Lấy hóa đơn nhập từ danh sách
            
            String customerID = B.getCustomerId();
        Customer foundCustomer = customerList.stream()
                .filter(customer -> customer.getCustomerId().equals(customerID))
                .findFirst()
                .orElse(null);

        if (foundCustomer != null) {
            // Lấy CustomersID từ khách hàng được tìm thấy
            String customerName = foundCustomer.getCustomerName();
            txt_CustomerID.setText(customerName);
        } else {
            JOptionPane.showMessageDialog(null, "Không tìm thấy Tên Khách Hàng " );
        }
            
            showDetailInTblHDN(B);

        }

    }

    private void showDetailInTblHDN(Bill B) {
        DefaultTableModel model = (DefaultTableModel) tbl_BillDetail.getModel();
        model.setRowCount(0); // Xóa dữ liệu cũ trong tblHDN

        for (BillDetail BD : B.getBillDetailList()) {
            Object[] row = {
                BD.getProductId(),
                BD.getNameProduct(),
                BD.getQuantity(),
                BD.getPrice(),
                BD.getSubtotal()
            };
            model.addRow(row);
        }
    }

    private void tbl_BillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_BillMouseClicked
        // TODO add your handling code here:
        showDetail();
    }//GEN-LAST:event_tbl_BillMouseClicked

    private void tbl_BillDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_BillDetailMouseClicked

    }//GEN-LAST:event_tbl_BillDetailMouseClicked

    private void txt_CustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CustomerIDActionPerformed

    private void txt_FindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FindKeyReleased
        levanan.filterDataByTableToTextField(tbl_Bill, txt_Find);
    }//GEN-LAST:event_txt_FindKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_Bill;
    private javax.swing.JTable tbl_BillDetail;
    private javax.swing.JTextField txt_CustomerID;
    private javax.swing.JTextField txt_Find;
    // End of variables declaration//GEN-END:variables
}

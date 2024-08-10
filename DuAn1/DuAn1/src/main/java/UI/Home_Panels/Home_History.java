package UI.Home_Panels;

import DAO.BillDAO;
import DAO.BillDetailDAO;
import MODEL.Bill;
import MODEL.BillDetail;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Home_History extends javax.swing.JPanel {
    
    private JFrame parentFrame;
    private DefaultTableModel tableModel;
    private BillDetailDAO billDetailDAO;

    public Home_History() {
        initComponents();
        billDetailDAO = new BillDetailDAO();
        loadBillsToTable();
        tblBill.getSelectionModel().addListSelectionListener(e -> loadBillDetails());
    }


    
    private void loadBillsToTable() {
        BillDAO billDAO = new BillDAO();
        List<Bill> bills = billDAO.loadAllBillsData();
        tableModel = (DefaultTableModel) tblBill.getModel();
        tableModel.setRowCount(0); // Clear existing data

        for (Bill bill : bills) {
            Object[] rowData = {
                bill.getBillId(),
                bill.getCreatedDate(),
                bill.getCustomerId(),
                bill.getTotalPrice()
            };
            tableModel.addRow(rowData);
        }
    }
    
    private void loadBillDetails() {
        int selectedRow = tblBill.getSelectedRow();
        if (selectedRow >= 0) {
            String billId = (String) tblBill.getValueAt(selectedRow, 0);
            List<BillDetail> billDetails = billDetailDAO.getBillDetailsByBillId(billId);

            DefaultTableModel detailTableModel = (DefaultTableModel) tblBillDetail.getModel();
            detailTableModel.setRowCount(0); // Clear existing data

            for (BillDetail detail : billDetails) {
                Object[] rowData = {
                    detail.getBillId(),
                    detail.getProductId(),
                    detail.getQuantity(),
                    detail.getSubtotal()
                };
                detailTableModel.addRow(rowData);
            }

            jScrollPane2.setVisible(true);
        }
    }
    
    private void refresh() {
        DefaultTableModel detailTableModel = (DefaultTableModel) tblBillDetail.getModel();
        detailTableModel.setRowCount(0); // Clear existing data
        txtIdBill.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBill = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBillDetail = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtIdBill = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setPreferredSize(new java.awt.Dimension(800, 700));
        setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lịch sử giao dịch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(1, 1, 1))); // NOI18N

        tblBill.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Thời gian", "Mã khách hàng", "Tổng tiền"
            }
        ));
        tblBill.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblBill.setMaximumSize(new java.awt.Dimension(2000, 500));
        tblBill.setMinimumSize(new java.awt.Dimension(2000, 500));
        tblBill.setPreferredSize(new java.awt.Dimension(2000, 500));
        tblBill.setRowHeight(50);
        jScrollPane1.setViewportView(tblBill);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        add(jScrollPane1, gridBagConstraints);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa đơn chi tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(1, 1, 1))); // NOI18N

        tblBillDetail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblBillDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã sản phẩm", "Số lượng", "Thành tiền"
            }
        ));
        tblBillDetail.setMaximumSize(new java.awt.Dimension(2000, 500));
        tblBillDetail.setMinimumSize(new java.awt.Dimension(2000, 500));
        tblBillDetail.setPreferredSize(new java.awt.Dimension(2000, 500));
        tblBillDetail.setRowHeight(50);
        jScrollPane2.setViewportView(tblBillDetail);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        add(jScrollPane2, gridBagConstraints);

        jPanel1.setMaximumSize(new java.awt.Dimension(400, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 700));

        txtIdBill.setMaximumSize(new java.awt.Dimension(110, 20));
        txtIdBill.setMinimumSize(new java.awt.Dimension(110, 20));
        txtIdBill.setPreferredSize(new java.awt.Dimension(110, 20));
        txtIdBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBillActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tìm theo mã hóa đơn");
        jLabel1.setInheritsPopupMenu(false);
        jLabel1.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(120, 20));

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRefresh.setText("Làm mới");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdBill, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addContainerGap(617, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBillActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String idBillStr = txtIdBill.getText().trim();
        if (!idBillStr.isEmpty()) {
            try {
                BillDAO billDAO = new BillDAO();
                Bill bill = billDAO.getBillById(idBillStr); // Chuyển idBillStr thành String

                if (bill != null) {
                    List<Bill> bills = List.of(bill);
                    tableModel = (DefaultTableModel) tblBill.getModel();
                    tableModel.setRowCount(0); // Xóa dữ liệu hiện tại

                    for (Bill b : bills) {
                        Object[] rowData = {
                            b.getBillId(),
                            b.getCreatedDate(),
                            b.getCustomerId(),
                            b.getTotalPrice()
                        };
                        tableModel.addRow(rowData);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Hóa đơn không tồn tại.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Mã hóa đơn không hợp lệ.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã hóa đơn.");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        loadBillsToTable();
        loadBillDetails();
        refresh();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBill;
    private javax.swing.JTable tblBillDetail;
    private javax.swing.JTextField txtIdBill;
    // End of variables declaration//GEN-END:variables
}
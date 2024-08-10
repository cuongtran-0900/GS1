package UI;

import UI.Home_Panels.Home_History;
import UI.Home_Panels.Home_Report;
import UI.Home_Panels.Home_Dashboard;
import UI.Home_Panels.Home_Product;
import UI.Home_Panels.Home_Sale_Orders;

public class Home extends javax.swing.JFrame {
    LeVanAn levanan = new LeVanAn();
    
    public Home() {
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        // Thêm các thành phần mà mình muốn sử dụng các hiệu ứng
        levanan.setPanelEvents(pn_Home_Sale, pn_Home_Report, pn_Home_History, pn_Home_Product, pn_Home_Dashboard);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home_Help = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Header = new javax.swing.JPanel();
        Nav1 = new javax.swing.JPanel();
        lbl_Home_Out = new javax.swing.JLabel();
        lbl_Home_Help = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_Home_Notification = new javax.swing.JLabel();
        Nav2 = new javax.swing.JPanel();
        pn_Home_Dashboard = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pn_Home_History = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pn_Home_Product = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pn_Home_Report = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pn_Home_Staff = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pn_Home_Sale = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Footter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout Home_HelpLayout = new javax.swing.GroupLayout(Home_Help.getContentPane());
        Home_Help.getContentPane().setLayout(Home_HelpLayout);
        Home_HelpLayout.setHorizontalGroup(
            Home_HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_HelpLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        Home_HelpLayout.setVerticalGroup(
            Home_HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_HelpLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang chủ");
        setBackground(new java.awt.Color(254, 254, 252));
        setName("Home"); // NOI18N

        Header.setBackground(new java.awt.Color(3, 60, 114));
        Header.setPreferredSize(new java.awt.Dimension(790, 100));
        Header.setLayout(new javax.swing.BoxLayout(Header, javax.swing.BoxLayout.Y_AXIS));

        Nav1.setBackground(new java.awt.Color(254, 254, 252));

        lbl_Home_Out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exit.png"))); // NOI18N
        lbl_Home_Out.setText("Đăng xuất");
        lbl_Home_Out.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Home_Out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Home_OutMouseClicked(evt);
            }
        });

        lbl_Home_Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exclamation.png"))); // NOI18N
        lbl_Home_Help.setText("Trợ giúp");
        lbl_Home_Help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Home_Help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Home_HelpMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo_gs1-removebg-preview.png"))); // NOI18N

        lbl_Home_Notification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/envelope.png"))); // NOI18N
        lbl_Home_Notification.setText("Thông báo");
        lbl_Home_Notification.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout Nav1Layout = new javax.swing.GroupLayout(Nav1);
        Nav1.setLayout(Nav1Layout);
        Nav1Layout.setHorizontalGroup(
            Nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nav1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 712, Short.MAX_VALUE)
                .addComponent(lbl_Home_Notification)
                .addGap(18, 18, 18)
                .addComponent(lbl_Home_Help)
                .addGap(18, 18, 18)
                .addComponent(lbl_Home_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Nav1Layout.setVerticalGroup(
            Nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nav1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Home_Help)
                    .addComponent(lbl_Home_Out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Home_Notification))
                .addContainerGap())
        );

        Header.add(Nav1);

        Nav2.setLayout(new javax.swing.BoxLayout(Nav2, javax.swing.BoxLayout.LINE_AXIS));

        pn_Home_Dashboard.setBackground(new java.awt.Color(13, 18, 130));
        pn_Home_Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_Home_DashboardMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(3, 60, 114));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/eye.png"))); // NOI18N
        jLabel7.setText("Tổng quan");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setPreferredSize(new java.awt.Dimension(102, 32));

        javax.swing.GroupLayout pn_Home_DashboardLayout = new javax.swing.GroupLayout(pn_Home_Dashboard);
        pn_Home_Dashboard.setLayout(pn_Home_DashboardLayout);
        pn_Home_DashboardLayout.setHorizontalGroup(
            pn_Home_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pn_Home_DashboardLayout.setVerticalGroup(
            pn_Home_DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        Nav2.add(pn_Home_Dashboard);

        pn_Home_History.setBackground(new java.awt.Color(13, 18, 130));
        pn_Home_History.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_Home_HistoryMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(3, 60, 114));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/endless-loop.png"))); // NOI18N
        jLabel8.setText("Giao dịch");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pn_Home_HistoryLayout = new javax.swing.GroupLayout(pn_Home_History);
        pn_Home_History.setLayout(pn_Home_HistoryLayout);
        pn_Home_HistoryLayout.setHorizontalGroup(
            pn_Home_HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pn_Home_HistoryLayout.setVerticalGroup(
            pn_Home_HistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        Nav2.add(pn_Home_History);

        pn_Home_Product.setBackground(new java.awt.Color(13, 18, 130));
        pn_Home_Product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_Home_ProductMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(3, 60, 114));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/box-open-full.png"))); // NOI18N
        jLabel5.setText("Hàng hóa");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pn_Home_ProductLayout = new javax.swing.GroupLayout(pn_Home_Product);
        pn_Home_Product.setLayout(pn_Home_ProductLayout);
        pn_Home_ProductLayout.setHorizontalGroup(
            pn_Home_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pn_Home_ProductLayout.setVerticalGroup(
            pn_Home_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        Nav2.add(pn_Home_Product);

        pn_Home_Report.setBackground(new java.awt.Color(13, 18, 130));
        pn_Home_Report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_Home_ReportMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(3, 60, 114));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/file-medical-alt.png"))); // NOI18N
        jLabel9.setText("Báo cáo");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pn_Home_ReportLayout = new javax.swing.GroupLayout(pn_Home_Report);
        pn_Home_Report.setLayout(pn_Home_ReportLayout);
        pn_Home_ReportLayout.setHorizontalGroup(
            pn_Home_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pn_Home_ReportLayout.setVerticalGroup(
            pn_Home_ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        Nav2.add(pn_Home_Report);

        pn_Home_Staff.setBackground(new java.awt.Color(13, 18, 130));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Lê Văn An");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nhân viên");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout pn_Home_StaffLayout = new javax.swing.GroupLayout(pn_Home_Staff);
        pn_Home_Staff.setLayout(pn_Home_StaffLayout);
        pn_Home_StaffLayout.setHorizontalGroup(
            pn_Home_StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_Home_StaffLayout.setVerticalGroup(
            pn_Home_StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_Home_StaffLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        );

        Nav2.add(pn_Home_Staff);

        pn_Home_Sale.setBackground(new java.awt.Color(13, 18, 130));
        pn_Home_Sale.setPreferredSize(new java.awt.Dimension(128, 69));
        pn_Home_Sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_Home_SaleMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(3, 60, 114));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/shopping-basket.png"))); // NOI18N
        jLabel3.setText("Bán hàng");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pn_Home_SaleLayout = new javax.swing.GroupLayout(pn_Home_Sale);
        pn_Home_Sale.setLayout(pn_Home_SaleLayout);
        pn_Home_SaleLayout.setHorizontalGroup(
            pn_Home_SaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pn_Home_SaleLayout.setVerticalGroup(
            pn_Home_SaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        Nav2.add(pn_Home_Sale);

        Header.add(Nav2);

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        MainPanel.setBackground(new java.awt.Color(254, 254, 252));
        MainPanel.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 90)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Chào mừng đến với GS1");
        MainPanel.add(jLabel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(MainPanel, java.awt.BorderLayout.CENTER);

        Footter.setBackground(new java.awt.Color(254, 254, 252));
        Footter.setPreferredSize(new java.awt.Dimension(824, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create by Group1");
        jLabel1.setEnabled(false);

        javax.swing.GroupLayout FootterLayout = new javax.swing.GroupLayout(Footter);
        Footter.setLayout(FootterLayout);
        FootterLayout.setHorizontalGroup(
            FootterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
        );
        FootterLayout.setVerticalGroup(
            FootterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(Footter, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_Home_OutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Home_OutMouseClicked
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_lbl_Home_OutMouseClicked

    private void pn_Home_ReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_Home_ReportMouseClicked
        levanan.changePanel(MainPanel, new Home_Report());
    }//GEN-LAST:event_pn_Home_ReportMouseClicked

    private void pn_Home_HistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_Home_HistoryMouseClicked
        levanan.changePanel(MainPanel, new Home_History());
    }//GEN-LAST:event_pn_Home_HistoryMouseClicked

    private void pn_Home_ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_Home_ProductMouseClicked
        levanan.changePanel(MainPanel, new Home_Product());
    }//GEN-LAST:event_pn_Home_ProductMouseClicked

    private void pn_Home_DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_Home_DashboardMouseClicked
        levanan.changePanel(MainPanel, new Home_Dashboard());
    }//GEN-LAST:event_pn_Home_DashboardMouseClicked

    private void lbl_Home_HelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Home_HelpMouseClicked
        // TODO add your handling code here:
         Home_Help.setVisible(true);
         Home_Help.setLocationRelativeTo(null);
    }//GEN-LAST:event_lbl_Home_HelpMouseClicked

    private void pn_Home_SaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_Home_SaleMouseClicked
        levanan.changePanel(MainPanel, new Home_Sale_Orders());
    }//GEN-LAST:event_pn_Home_SaleMouseClicked
 
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home home = new Home();
                home.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footter;
    private javax.swing.JPanel Header;
    private javax.swing.JDialog Home_Help;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Nav1;
    private javax.swing.JPanel Nav2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Home_Help;
    private javax.swing.JLabel lbl_Home_Notification;
    private javax.swing.JLabel lbl_Home_Out;
    private javax.swing.JPanel pn_Home_Dashboard;
    private javax.swing.JPanel pn_Home_History;
    private javax.swing.JPanel pn_Home_Product;
    private javax.swing.JPanel pn_Home_Report;
    private javax.swing.JPanel pn_Home_Sale;
    private javax.swing.JPanel pn_Home_Staff;
    // End of variables declaration//GEN-END:variables
}

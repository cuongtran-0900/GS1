package UI;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Calendar;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame {

    LeVanAn levanan = new LeVanAn();
    Home home = new Home();

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        txt_Login_UserName.requestFocus();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Login_form = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txt_Login_UserName = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lbl_Login_ForgetPassword = new javax.swing.JLabel();
        chk_Login_RememberPassword = new javax.swing.JCheckBox();
        btn_Login = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        lbl_SignUp_form = new javax.swing.JLabel();
        txt_Login_UserPassword = new javax.swing.JPasswordField();
        SignUp_form = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txt_SignUp_Name = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btn_SignUp = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_SignUp_Address = new javax.swing.JTextArea();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        lbl_Login_form = new javax.swing.JLabel();
        txt_SignUp_Password = new javax.swing.JTextField();
        txt_SignUp_Birth = new com.toedter.calendar.JDateChooser();
        txt_SignUp_Number = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        setLocationByPlatform(true);
        setName("Login_form"); // NOI18N
        getContentPane().setLayout(new java.awt.CardLayout());

        Login_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo_gs1.jpg"))); // NOI18N
        Login_form.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(254, 254, 252));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        txt_Login_UserName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_Login_UserName.setMinimumSize(new java.awt.Dimension(64, 30));
        txt_Login_UserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Login_UserNameKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 21);
        jPanel4.add(txt_Login_UserName, gridBagConstraints);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(7, 37, 108));
        jLabel23.setText("Mật khẩu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 0);
        jPanel4.add(jLabel23, gridBagConstraints);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(7, 37, 108));
        jLabel24.setText("Tên đăng nhập");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 0);
        jPanel4.add(jLabel24, gridBagConstraints);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(7, 37, 108));
        jLabel25.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 10);
        jPanel4.add(jLabel25, gridBagConstraints);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(7, 37, 108));
        jLabel26.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 10);
        jPanel4.add(jLabel26, gridBagConstraints);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(226, 155, 80));
        jLabel27.setText("Đăng Nhập");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        jPanel4.add(jLabel27, gridBagConstraints);

        lbl_Login_ForgetPassword.setForeground(new java.awt.Color(153, 153, 153));
        lbl_Login_ForgetPassword.setText("Quên mật khẩu?");
        lbl_Login_ForgetPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 17, 21);
        jPanel4.add(lbl_Login_ForgetPassword, gridBagConstraints);

        chk_Login_RememberPassword.setForeground(new java.awt.Color(153, 153, 153));
        chk_Login_RememberPassword.setText("Nhớ mật khẩu");
        chk_Login_RememberPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 18, 17, 0);
        jPanel4.add(chk_Login_RememberPassword, gridBagConstraints);

        btn_Login.setBackground(new java.awt.Color(5, 25, 71));
        btn_Login.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_Login.setForeground(new java.awt.Color(254, 255, 255));
        btn_Login.setText("Đăng nhập");
        btn_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Login.setPreferredSize(new java.awt.Dimension(415, 40));
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });
        btn_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_LoginKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel4.add(btn_Login, gridBagConstraints);

        jPanel5.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBackground(new java.awt.Color(254, 254, 252));

        jLabel28.setForeground(new java.awt.Color(153, 153, 153));
        jLabel28.setText("Thêm tài khoản mới?");
        jPanel6.add(jLabel28);

        lbl_SignUp_form.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_SignUp_form.setForeground(new java.awt.Color(153, 153, 153));
        lbl_SignUp_form.setText("Đăng ký tại đây");
        lbl_SignUp_form.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_SignUp_form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_SignUp_formMouseClicked(evt);
            }
        });
        jPanel6.add(lbl_SignUp_form);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        jPanel5.add(jPanel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        jPanel4.add(jPanel5, gridBagConstraints);

        txt_Login_UserPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_Login_UserPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Login_UserPasswordKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 21);
        jPanel4.add(txt_Login_UserPassword, gridBagConstraints);

        Login_form.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 0, 460, 315));

        getContentPane().add(Login_form, "card2");

        SignUp_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo_gs1.jpg"))); // NOI18N
        SignUp_form.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

        jPanel7.setBackground(new java.awt.Color(254, 254, 252));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        txt_SignUp_Name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_SignUp_Name.setMinimumSize(null);
        txt_SignUp_Name.setPreferredSize(new java.awt.Dimension(64, 30));
        txt_SignUp_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_SignUp_NameKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 21);
        jPanel7.add(txt_SignUp_Name, gridBagConstraints);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(7, 37, 108));
        jLabel29.setText("Mật khẩu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 5, 0);
        jPanel7.add(jLabel29, gridBagConstraints);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(7, 37, 108));
        jLabel30.setText("Họ và tên");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 5, 0);
        jPanel7.add(jLabel30, gridBagConstraints);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(7, 37, 108));
        jLabel31.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 10);
        jPanel7.add(jLabel31, gridBagConstraints);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(7, 37, 108));
        jLabel32.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 10);
        jPanel7.add(jLabel32, gridBagConstraints);

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(226, 155, 80));
        jLabel33.setText("Đăng Kí");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 11, 0);
        jPanel7.add(jLabel33, gridBagConstraints);

        btn_SignUp.setBackground(new java.awt.Color(5, 25, 71));
        btn_SignUp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_SignUp.setForeground(new java.awt.Color(254, 255, 255));
        btn_SignUp.setText("Đăng kí");
        btn_SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SignUp.setPreferredSize(new java.awt.Dimension(415, 40));
        btn_SignUp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_SignUpKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 21, 0, 21);
        jPanel7.add(btn_SignUp, gridBagConstraints);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(7, 37, 108));
        jLabel35.setText("Ngày sinh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 5, 0);
        jPanel7.add(jLabel35, gridBagConstraints);

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(7, 37, 108));
        jLabel36.setText("Số điện thoại");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 5, 0);
        jPanel7.add(jLabel36, gridBagConstraints);

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(7, 37, 108));
        jLabel34.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 10);
        jPanel7.add(jLabel34, gridBagConstraints);

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(7, 37, 108));
        jLabel37.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 10);
        jPanel7.add(jLabel37, gridBagConstraints);

        txt_SignUp_Address.setColumns(20);
        txt_SignUp_Address.setLineWrap(true);
        txt_SignUp_Address.setRows(5);
        txt_SignUp_Address.setAutoscrolls(false);
        txt_SignUp_Address.setPreferredSize(new java.awt.Dimension(100, 84));
        txt_SignUp_Address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_SignUp_AddressKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txt_SignUp_Address);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 21);
        jPanel7.add(jScrollPane1, gridBagConstraints);

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(7, 37, 108));
        jLabel38.setText("Địa chỉ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 5, 0);
        jPanel7.add(jLabel38, gridBagConstraints);

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(7, 37, 108));
        jLabel39.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 10);
        jPanel7.add(jLabel39, gridBagConstraints);

        jPanel8.setBackground(new java.awt.Color(254, 254, 252));

        jLabel40.setForeground(new java.awt.Color(153, 153, 153));
        jLabel40.setText("Đã có tài khoản?");
        jPanel8.add(jLabel40);

        lbl_Login_form.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_Login_form.setForeground(new java.awt.Color(153, 153, 153));
        lbl_Login_form.setText("Đăng nhập tại đây");
        lbl_Login_form.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Login_form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Login_formMouseClicked(evt);
            }
        });
        jPanel8.add(lbl_Login_form);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        jPanel7.add(jPanel8, gridBagConstraints);

        txt_SignUp_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_SignUp_PasswordKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 21);
        jPanel7.add(txt_SignUp_Password, gridBagConstraints);

        txt_SignUp_Birth.setDateFormatString("dd-MM-yyyy");
        txt_SignUp_Birth.setMaxSelectableDate(new java.util.Date(1262282494000L));
        txt_SignUp_Birth.setMinSelectableDate(new java.util.Date(-946792706000L));
        // Get the current date
        Date currentDate = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);

        // Subtract 18 years from the current date
        cal.add(Calendar.YEAR, -18);

        // Set the month and day to January 1st
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);

        // Set the default date to the JDateChooser
        txt_SignUp_Birth.setDate(cal.getTime());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 21);
        jPanel7.add(txt_SignUp_Birth, gridBagConstraints);

        txt_SignUp_Number.setText("Không nhập chữ");
        txt_SignUp_Number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_SignUp_NumberKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 21);
        jPanel7.add(txt_SignUp_Number, gridBagConstraints);

        SignUp_form.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 315));

        getContentPane().add(SignUp_form, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_btn_LoginActionPerformed
    private void lbl_Login_formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Login_formMouseClicked
        CardLayout cardLayout = (CardLayout)this.getContentPane().getLayout();
        cardLayout.next(this.getContentPane());
        txt_Login_UserName.requestFocus();
        
        levanan.clearData(txt_SignUp_Name, txt_SignUp_Address, txt_SignUp_Number, txt_SignUp_Password);
    }//GEN-LAST:event_lbl_Login_formMouseClicked
    private void btn_SignUpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_SignUpKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_UP){
            txt_SignUp_Password.requestFocus();
        }else if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btn_LoginActionPerformed(null);
        }
    }//GEN-LAST:event_btn_SignUpKeyReleased
    private void txt_SignUp_PasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SignUp_PasswordKeyReleased
        levanan.moreSmooth(txt_SignUp_Number, btn_SignUp, evt);
    }//GEN-LAST:event_txt_SignUp_PasswordKeyReleased
    private void txt_SignUp_NumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SignUp_NumberKeyReleased
        levanan.moreSmooth(txt_SignUp_Address, txt_SignUp_Password , evt);
    }//GEN-LAST:event_txt_SignUp_NumberKeyReleased
    private void txt_SignUp_AddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SignUp_AddressKeyReleased
        levanan.moreSmooth(txt_SignUp_Name, txt_SignUp_Number, evt);
    }//GEN-LAST:event_txt_SignUp_AddressKeyReleased
    private void btn_LoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_LoginKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_UP){
            txt_Login_UserPassword.requestFocus();
        }else if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btn_LoginActionPerformed(null);
        }
    }//GEN-LAST:event_btn_LoginKeyReleased
    private void lbl_SignUp_formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SignUp_formMouseClicked
        CardLayout cardLayout = (CardLayout)this.getContentPane().getLayout();
        cardLayout.next(this.getContentPane());
        txt_SignUp_Name.requestFocus();
        
        levanan.clearData(txt_Login_UserName, txt_Login_UserPassword);
    }//GEN-LAST:event_lbl_SignUp_formMouseClicked
    private void txt_Login_UserPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Login_UserPasswordKeyReleased
        levanan.moreSmooth(txt_Login_UserName, btn_Login, evt);
    }//GEN-LAST:event_txt_Login_UserPasswordKeyReleased
    private void txt_Login_UserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Login_UserNameKeyReleased
        levanan.moreSmooth(null, txt_Login_UserPassword, evt);
    }//GEN-LAST:event_txt_Login_UserNameKeyReleased
    private void txt_SignUp_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_SignUp_NameKeyReleased
        levanan.moreSmooth(null, txt_SignUp_Address, evt);
    }//GEN-LAST:event_txt_SignUp_NameKeyReleased

    public static void main(String args[]) {
        try {
            // Đặt Look and Feel thành FlatDarkLaf
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login_form;
    private javax.swing.JPanel SignUp_form;
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_SignUp;
    private javax.swing.JCheckBox chk_Login_RememberPassword;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Login_ForgetPassword;
    private javax.swing.JLabel lbl_Login_form;
    private javax.swing.JLabel lbl_SignUp_form;
    private javax.swing.JTextField txt_Login_UserName;
    private javax.swing.JPasswordField txt_Login_UserPassword;
    private javax.swing.JTextArea txt_SignUp_Address;
    private com.toedter.calendar.JDateChooser txt_SignUp_Birth;
    private javax.swing.JTextField txt_SignUp_Name;
    private javax.swing.JFormattedTextField txt_SignUp_Number;
    private javax.swing.JTextField txt_SignUp_Password;
    // End of variables declaration//GEN-END:variables
}

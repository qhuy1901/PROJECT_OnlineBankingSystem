package GUI.CustomerGUI;

import DTO.Customer_DTO;
import GUI.Customer_GUI;
import GUI.LogIn;

public class Payment extends javax.swing.JFrame 
{
    public Payment() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1064, 650);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        WaterBill = new javax.swing.JPanel();
        btnLogout_Water = new javax.swing.JButton();
        btnHome_Water = new javax.swing.JButton();
        lblSupplier = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtmoneyAmount_Water = new javax.swing.JTextField();
        btnConfirm_Water = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Internet = new javax.swing.JPanel();
        btnHome_Internet = new javax.swing.JButton();
        btnLogout_Internet = new javax.swing.JButton();
        lblSupplier_Internet = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmoneyAmount_Internet = new javax.swing.JTextField();
        txtaccBalance_Internet = new javax.swing.JTextField();
        tbtConfirm_Internet = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        Electricity = new javax.swing.JPanel();
        btnLogout_Elect = new javax.swing.JButton();
        btnHome_Elect = new javax.swing.JButton();
        txtmoneyAmount_Elect = new javax.swing.JTextField();
        lblSupplier_Electricity = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtaccBalance_Elect = new javax.swing.JTextField();
        btnConfirm_Elect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        TelephoneFee = new javax.swing.JPanel();
        btnLogout_Mobi = new javax.swing.JButton();
        btnHome_Mobi = new javax.swing.JButton();
        lblSupplier_Telephone = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbbValue_Mobi = new javax.swing.JComboBox<>();
        rdbViettel_Mobi = new javax.swing.JRadioButton();
        rdbMobi_Mobi = new javax.swing.JRadioButton();
        rdbVina_Mobi = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txtNo_Mobi = new javax.swing.JTextField();
        btnConfirm_Mobi = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        WaterBill.setBackground(new java.awt.Color(239, 250, 252));
        WaterBill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout_Water.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout_Water.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogout_Water.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout_Water.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Logout.png"))); // NOI18N
        btnLogout_Water.setText("Logout");
        btnLogout_Water.setToolTipText("");
        btnLogout_Water.setBorder(null);
        btnLogout_Water.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout_Water.setIconTextGap(0);
        btnLogout_Water.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout_Water.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout_WaterActionPerformed(evt);
            }
        });
        WaterBill.add(btnLogout_Water, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 77, 58));

        btnHome_Water.setBackground(new java.awt.Color(32, 172, 216));
        btnHome_Water.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome_Water.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_Water.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome_Water.setText("Home");
        btnHome_Water.setToolTipText("");
        btnHome_Water.setBorder(null);
        btnHome_Water.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome_Water.setIconTextGap(1);
        btnHome_Water.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome_Water.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_WaterActionPerformed(evt);
            }
        });
        WaterBill.add(btnHome_Water, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 76, 58));

        lblSupplier.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblSupplier.setForeground(new java.awt.Color(32, 172, 216));
        lblSupplier.setText("Supplier:");
        WaterBill.add(lblSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(32, 172, 216));
        jLabel19.setText("Customer ID:");
        WaterBill.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        txtmoneyAmount_Water.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        WaterBill.add(txtmoneyAmount_Water, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 400, -1));

        btnConfirm_Water.setBackground(new java.awt.Color(32, 172, 216));
        btnConfirm_Water.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConfirm_Water.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm_Water.setText("Confirm");
        btnConfirm_Water.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm_WaterActionPerformed(evt);
            }
        });
        WaterBill.add(btnConfirm_Water, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Payment_Water.png"))); // NOI18N
        WaterBill.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 100));

        jLabel17.setBackground(new java.awt.Color(32, 172, 216));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("         Water Bill");
        jLabel17.setOpaque(true);
        jLabel17.setPreferredSize(new java.awt.Dimension(34, 50));
        WaterBill.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 970, 66));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dong Nai Water Supplier", "Thu Duc Water Supplier", "Ben Thanh Water Supplier", "Da Nang Water Supplier", "Clean Water Ha Noi (Hawacom)" }));
        WaterBill.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jTabbedPane1.addTab("Water Bill", WaterBill);

        Internet.setBackground(new java.awt.Color(239, 250, 252));
        Internet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome_Internet.setBackground(new java.awt.Color(32, 172, 216));
        btnHome_Internet.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome_Internet.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_Internet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome_Internet.setText("Home");
        btnHome_Internet.setToolTipText("");
        btnHome_Internet.setBorder(null);
        btnHome_Internet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome_Internet.setIconTextGap(1);
        btnHome_Internet.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome_Internet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_InternetActionPerformed(evt);
            }
        });
        Internet.add(btnHome_Internet, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 76, 58));

        btnLogout_Internet.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout_Internet.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogout_Internet.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout_Internet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Logout.png"))); // NOI18N
        btnLogout_Internet.setText("Logout");
        btnLogout_Internet.setToolTipText("");
        btnLogout_Internet.setBorder(null);
        btnLogout_Internet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout_Internet.setIconTextGap(0);
        btnLogout_Internet.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout_Internet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout_InternetActionPerformed(evt);
            }
        });
        Internet.add(btnLogout_Internet, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 77, 58));

        lblSupplier_Internet.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblSupplier_Internet.setForeground(new java.awt.Color(32, 172, 216));
        lblSupplier_Internet.setText("Supplier:");
        Internet.add(lblSupplier_Internet, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 172, 216));
        jLabel3.setText("Money Amount:");
        Internet.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 172, 216));
        jLabel5.setText("Account Balance:");
        Internet.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        txtmoneyAmount_Internet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Internet.add(txtmoneyAmount_Internet, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 400, -1));

        txtaccBalance_Internet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Internet.add(txtaccBalance_Internet, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 400, -1));

        tbtConfirm_Internet.setBackground(new java.awt.Color(32, 172, 216));
        tbtConfirm_Internet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbtConfirm_Internet.setForeground(new java.awt.Color(255, 255, 255));
        tbtConfirm_Internet.setText("Confirm");
        tbtConfirm_Internet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtConfirm_InternetActionPerformed(evt);
            }
        });
        Internet.add(tbtConfirm_Internet, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Payment_Internet.png"))); // NOI18N
        Internet.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 110));

        jLabel4.setBackground(new java.awt.Color(32, 172, 216));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("         Internet");
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(34, 50));
        Internet.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 970, 66));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FPT Telecom", "Viettel", "VNPT" }));
        Internet.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 190, -1));

        jTabbedPane1.addTab("Internet", Internet);

        Electricity.setBackground(new java.awt.Color(239, 250, 252));
        Electricity.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout_Elect.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout_Elect.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogout_Elect.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout_Elect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Logout.png"))); // NOI18N
        btnLogout_Elect.setText("Logout");
        btnLogout_Elect.setToolTipText("");
        btnLogout_Elect.setBorder(null);
        btnLogout_Elect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout_Elect.setIconTextGap(0);
        btnLogout_Elect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout_Elect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout_ElectActionPerformed(evt);
            }
        });
        Electricity.add(btnLogout_Elect, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 77, 58));

        btnHome_Elect.setBackground(new java.awt.Color(32, 172, 216));
        btnHome_Elect.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome_Elect.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_Elect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome_Elect.setText("Home");
        btnHome_Elect.setToolTipText("");
        btnHome_Elect.setBorder(null);
        btnHome_Elect.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome_Elect.setIconTextGap(1);
        btnHome_Elect.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome_Elect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_ElectActionPerformed(evt);
            }
        });
        Electricity.add(btnHome_Elect, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 76, 58));

        txtmoneyAmount_Elect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Electricity.add(txtmoneyAmount_Elect, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 400, -1));

        lblSupplier_Electricity.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblSupplier_Electricity.setForeground(new java.awt.Color(32, 172, 216));
        lblSupplier_Electricity.setText("Supplier:");
        Electricity.add(lblSupplier_Electricity, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(32, 172, 216));
        jLabel26.setText("Money Amount:");
        Electricity.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(32, 172, 216));
        jLabel27.setText("Account Balance:");
        Electricity.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        txtaccBalance_Elect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Electricity.add(txtaccBalance_Elect, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 400, -1));

        btnConfirm_Elect.setBackground(new java.awt.Color(32, 172, 216));
        btnConfirm_Elect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConfirm_Elect.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm_Elect.setText("Confirm");
        btnConfirm_Elect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm_ElectActionPerformed(evt);
            }
        });
        Electricity.add(btnConfirm_Elect, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Payment_Electricity.png"))); // NOI18N
        Electricity.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 120, 110));

        jLabel24.setBackground(new java.awt.Color(32, 172, 216));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("         Electricity Bill");
        jLabel24.setOpaque(true);
        jLabel24.setPreferredSize(new java.awt.Dimension(34, 50));
        Electricity.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 970, 66));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nothern Power Corp", "Southern Power Corp", "Central Power Corp", " ", " " }));
        Electricity.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        jTabbedPane1.addTab("Electricity Bill", Electricity);

        TelephoneFee.setBackground(new java.awt.Color(239, 250, 252));
        TelephoneFee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout_Mobi.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogout_Mobi.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout_Mobi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Logout.png"))); // NOI18N
        btnLogout_Mobi.setText("Logout");
        btnLogout_Mobi.setToolTipText("");
        btnLogout_Mobi.setBorder(null);
        btnLogout_Mobi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout_Mobi.setIconTextGap(0);
        btnLogout_Mobi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout_Mobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout_MobiActionPerformed(evt);
            }
        });
        TelephoneFee.add(btnLogout_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 77, 58));

        btnHome_Mobi.setBackground(new java.awt.Color(32, 172, 216));
        btnHome_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome_Mobi.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_Mobi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome_Mobi.setText("Home");
        btnHome_Mobi.setToolTipText("");
        btnHome_Mobi.setBorder(null);
        btnHome_Mobi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome_Mobi.setIconTextGap(1);
        btnHome_Mobi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome_Mobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_MobiActionPerformed(evt);
            }
        });
        TelephoneFee.add(btnHome_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 76, 58));

        lblSupplier_Telephone.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblSupplier_Telephone.setForeground(new java.awt.Color(32, 172, 216));
        lblSupplier_Telephone.setText("Network supplier: ");
        TelephoneFee.add(lblSupplier_Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(32, 172, 216));
        jLabel11.setText("Value: ");
        TelephoneFee.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        cbbValue_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbValue_Mobi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10.000 VNĐ", "30.000 VNĐ", "50.000 VNĐ", "100.000 VNĐ", "200.000 VNĐ" }));
        cbbValue_Mobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbValue_MobiActionPerformed(evt);
            }
        });
        TelephoneFee.add(cbbValue_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 120, -1));

        rdbViettel_Mobi.setBackground(new java.awt.Color(239, 250, 252));
        buttonGroup1.add(rdbViettel_Mobi);
        rdbViettel_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        rdbViettel_Mobi.setText("Viettel");
        TelephoneFee.add(rdbViettel_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        rdbMobi_Mobi.setBackground(new java.awt.Color(239, 250, 252));
        buttonGroup1.add(rdbMobi_Mobi);
        rdbMobi_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        rdbMobi_Mobi.setText("Mobiphone");
        TelephoneFee.add(rdbMobi_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        rdbVina_Mobi.setBackground(new java.awt.Color(239, 250, 252));
        buttonGroup1.add(rdbVina_Mobi);
        rdbVina_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        rdbVina_Mobi.setText("Vinaphone");
        TelephoneFee.add(rdbVina_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(32, 172, 216));
        jLabel13.setText("Phone No.: ");
        TelephoneFee.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        txtNo_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TelephoneFee.add(txtNo_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 420, -1));

        btnConfirm_Mobi.setBackground(new java.awt.Color(32, 172, 216));
        btnConfirm_Mobi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConfirm_Mobi.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm_Mobi.setText("Confirm");
        btnConfirm_Mobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm_MobiActionPerformed(evt);
            }
        });
        TelephoneFee.add(btnConfirm_Mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Payment_Telephone.png"))); // NOI18N
        TelephoneFee.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 120, 110));

        jLabel9.setBackground(new java.awt.Color(32, 172, 216));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("          Telephone Fee");
        jLabel9.setOpaque(true);
        jLabel9.setPreferredSize(new java.awt.Dimension(34, 50));
        TelephoneFee.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 970, 66));

        jTabbedPane1.addTab("Telephone Fee", TelephoneFee);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnHome_InternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_InternetActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_btnHome_InternetActionPerformed

    private void btnLogout_InternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout_InternetActionPerformed
        LogIn guiLogIn = new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogout_InternetActionPerformed

    private void btnLogout_ElectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout_ElectActionPerformed
        LogIn guiLogIn = new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogout_ElectActionPerformed

    private void btnLogout_WaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout_WaterActionPerformed
        LogIn guiLogIn = new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogout_WaterActionPerformed

    private void btnLogout_MobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout_MobiActionPerformed
        LogIn guiLogIn = new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogout_MobiActionPerformed

    private void btnHome_ElectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_ElectActionPerformed

    }//GEN-LAST:event_btnHome_ElectActionPerformed

    private void btnHome_WaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_WaterActionPerformed

    }//GEN-LAST:event_btnHome_WaterActionPerformed

    private void btnHome_MobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_MobiActionPerformed

    }//GEN-LAST:event_btnHome_MobiActionPerformed

    private void tbtConfirm_InternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtConfirm_InternetActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tbtConfirm_InternetActionPerformed

    private void btnConfirm_MobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm_MobiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnConfirm_MobiActionPerformed

    private void btnConfirm_WaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm_WaterActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnConfirm_WaterActionPerformed

    private void btnConfirm_ElectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm_ElectActionPerformed
            
    }//GEN-LAST:event_btnConfirm_ElectActionPerformed

    private void cbbValue_MobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbValue_MobiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbValue_MobiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Electricity;
    private javax.swing.JPanel Internet;
    private javax.swing.JPanel TelephoneFee;
    private javax.swing.JPanel WaterBill;
    private javax.swing.JButton btnConfirm_Elect;
    private javax.swing.JButton btnConfirm_Mobi;
    private javax.swing.JButton btnConfirm_Water;
    private javax.swing.JButton btnHome_Elect;
    private javax.swing.JButton btnHome_Internet;
    private javax.swing.JButton btnHome_Mobi;
    private javax.swing.JButton btnHome_Water;
    private javax.swing.JButton btnLogout_Elect;
    private javax.swing.JButton btnLogout_Internet;
    private javax.swing.JButton btnLogout_Mobi;
    private javax.swing.JButton btnLogout_Water;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbValue_Mobi;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JLabel lblSupplier_Electricity;
    private javax.swing.JLabel lblSupplier_Internet;
    private javax.swing.JLabel lblSupplier_Telephone;
    private javax.swing.JRadioButton rdbMobi_Mobi;
    private javax.swing.JRadioButton rdbViettel_Mobi;
    private javax.swing.JRadioButton rdbVina_Mobi;
    private javax.swing.JButton tbtConfirm_Internet;
    private javax.swing.JTextField txtNo_Mobi;
    private javax.swing.JTextField txtaccBalance_Elect;
    private javax.swing.JTextField txtaccBalance_Internet;
    private javax.swing.JTextField txtmoneyAmount_Elect;
    private javax.swing.JTextField txtmoneyAmount_Internet;
    private javax.swing.JTextField txtmoneyAmount_Water;
    // End of variables declaration//GEN-END:variables
}
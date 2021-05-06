package GUI.AdminGUI;

import GUI.Admin_GUI;
import GUI.LogIn;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Supplier_Management extends javax.swing.JFrame 
{
    public Supplier_Management() 
    {
        initComponents();
        setSize(1064,650);
        setLocationRelativeTo(null);
        TaoTable();
        setVisible(true);
    }
    
    DefaultTableModel tblModelSupplier;
    public void TaoTable(){
        //Tạo jTable với DefaultTableModel
        tblModelSupplier = new DefaultTableModel();
        String tieude[] = {"Supplier ID" , "Supplier Name","Transaction Type"};
        tblModelSupplier.setColumnIdentifiers(tieude);
        tblSupplier.setModel(tblModelSupplier);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSaving = new javax.swing.JPanel();
        lblImage_Supplier = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblTranfer = new javax.swing.JLabel();
        lblSupplier_ID = new javax.swing.JLabel();
        txtSupplier_ID = new javax.swing.JTextField();
        lblSupplier_Name = new javax.swing.JLabel();
        txtSupplier_Name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        lblTransaction_type = new javax.swing.JLabel();
        btnSearch_Supplier = new javax.swing.JButton();
        btnClear_Supplier = new javax.swing.JButton();
        btnAdd_Supplier = new javax.swing.JButton();
        btnUpdate_Supplier = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnDelete_Supplier1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSaving.setBackground(new java.awt.Color(239, 250, 252));
        pnlSaving.setPreferredSize(new java.awt.Dimension(1064, 650));
        pnlSaving.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Supplier_Management.png"))); // NOI18N
        pnlSaving.add(lblImage_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 100));

        btnHome.setBackground(new java.awt.Color(32, 172, 216));
        btnHome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setToolTipText("");
        btnHome.setBorder(null);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setIconTextGap(0);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        pnlSaving.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 50, 57));

        btnLogout.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(null);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setIconTextGap(0);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        pnlSaving.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 50, 57));

        lblTranfer.setBackground(new java.awt.Color(32, 172, 216));
        lblTranfer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTranfer.setForeground(new java.awt.Color(255, 255, 255));
        lblTranfer.setText("         Supplier Management");
        lblTranfer.setOpaque(true);
        pnlSaving.add(lblTranfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 30, 931, 58));

        lblSupplier_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSupplier_ID.setForeground(new java.awt.Color(51, 51, 51));
        lblSupplier_ID.setText("Supplier ID");
        pnlSaving.add(lblSupplier_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        txtSupplier_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnlSaving.add(txtSupplier_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 250, -1));

        lblSupplier_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSupplier_Name.setForeground(new java.awt.Color(51, 51, 51));
        lblSupplier_Name.setText("Supplier name");
        pnlSaving.add(lblSupplier_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        txtSupplier_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnlSaving.add(txtSupplier_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 250, -1));

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblSupplier);

        pnlSaving.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 850, 270));

        lblTransaction_type.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTransaction_type.setForeground(new java.awt.Color(51, 51, 51));
        lblTransaction_type.setText("Transaction type  ");
        pnlSaving.add(lblTransaction_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        btnSearch_Supplier.setBackground(new java.awt.Color(32, 172, 216));
        btnSearch_Supplier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearch_Supplier.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Supplier_Management_btnSearch.png"))); // NOI18N
        btnSearch_Supplier.setText("SEARCH");
        btnSearch_Supplier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSearch_Supplier.setIconTextGap(1);
        btnSearch_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch_SupplierActionPerformed(evt);
            }
        });
        pnlSaving.add(btnSearch_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 560, 113, 30));

        btnClear_Supplier.setBackground(new java.awt.Color(32, 172, 216));
        btnClear_Supplier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClear_Supplier.setForeground(new java.awt.Color(255, 255, 255));
        btnClear_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Supplier_Management_btnClear.png"))); // NOI18N
        btnClear_Supplier.setText("CLEAR");
        btnClear_Supplier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClear_Supplier.setIconTextGap(1);
        btnClear_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear_SupplierActionPerformed(evt);
            }
        });
        pnlSaving.add(btnClear_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 111, 30));

        btnAdd_Supplier.setBackground(new java.awt.Color(32, 172, 216));
        btnAdd_Supplier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd_Supplier.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Supplier_Management_btnADD.png"))); // NOI18N
        btnAdd_Supplier.setText("ADD");
        btnAdd_Supplier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdd_Supplier.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAdd_Supplier.setIconTextGap(7);
        btnAdd_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_SupplierActionPerformed(evt);
            }
        });
        pnlSaving.add(btnAdd_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 111, 30));

        btnUpdate_Supplier.setBackground(new java.awt.Color(32, 172, 216));
        btnUpdate_Supplier.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate_Supplier.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Supplier_Management_btnUpdate.png"))); // NOI18N
        btnUpdate_Supplier.setText("UPDATE");
        btnUpdate_Supplier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUpdate_Supplier.setIconTextGap(1);
        btnUpdate_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate_SupplierActionPerformed(evt);
            }
        });
        pnlSaving.add(btnUpdate_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 113, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Water Bill", "Internet", "Electricity Bill", "Telephone Free", " " }));
        pnlSaving.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 200, 30));

        btnDelete_Supplier1.setBackground(new java.awt.Color(32, 172, 216));
        btnDelete_Supplier1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete_Supplier1.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete_Supplier1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Supplier_Management_btnDelete.png"))); // NOI18N
        btnDelete_Supplier1.setText("DELETE");
        btnDelete_Supplier1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDelete_Supplier1.setIconTextGap(1);
        btnDelete_Supplier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_Supplier1ActionPerformed(evt);
            }
        });
        pnlSaving.add(btnDelete_Supplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 111, 30));

        getContentPane().add(pnlSaving, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1064, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LogIn guiLogIn = new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSearch_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch_SupplierActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnSearch_SupplierActionPerformed

    private void btnClear_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear_SupplierActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnClear_SupplierActionPerformed

    private void btnAdd_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_SupplierActionPerformed
        if(txtSupplier_ID.getText().equals("")|| txtSupplier_Name.getText().equals(""))
        {
               JOptionPane.showConfirmDialog(null, "Vui lòng nhập đầy đủ thông tin", "Ok", JOptionPane.CLOSED_OPTION);
        }
        else{
            String row[] = new String[3];
            row[0] = txtSupplier_ID.getText();
            row[1] = txtSupplier_Name.getText();
            tblModelSupplier.addRow(row);
        }
    }//GEN-LAST:event_btnAdd_SupplierActionPerformed

    private void btnUpdate_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate_SupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdate_SupplierActionPerformed

    private void btnDelete_Supplier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_Supplier1ActionPerformed
        // TODO add your handling code here:
        int indexTB = tblSupplier.getSelectedRow();
        tblModelSupplier.removeRow(indexTB);
    }//GEN-LAST:event_btnDelete_Supplier1ActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        Admin_GUI guiAdmin = new Admin_GUI();
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd_Supplier;
    private javax.swing.JButton btnClear_Supplier;
    private javax.swing.JButton btnDelete_Supplier1;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearch_Supplier;
    private javax.swing.JButton btnUpdate_Supplier;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage_Supplier;
    private javax.swing.JLabel lblSupplier_ID;
    private javax.swing.JLabel lblSupplier_Name;
    private javax.swing.JLabel lblTranfer;
    private javax.swing.JLabel lblTransaction_type;
    private javax.swing.JPanel pnlSaving;
    private javax.swing.JTable tblSupplier;
    private javax.swing.JTextField txtSupplier_ID;
    private javax.swing.JTextField txtSupplier_Name;
    // End of variables declaration//GEN-END:variables
}
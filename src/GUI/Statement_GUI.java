package GUI;

import BUS.Statement_BUS;
import DTO.Account_DTO;
import DTO.Admin_DTO;
import DTO.Customer_DTO;
import DTO.Transaction_DTO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Statement_GUI extends javax.swing.JFrame {
    Admin_DTO dtoAdmin = null;
    Statement_BUS busStatement = new Statement_BUS();
    Account_DTO dtoAccount = null;
    
    public Statement_GUI(Admin_DTO admin) 
    {
        initComponents();
        setSize(1064,650);
        setLocationRelativeTo(null);
        String title[] = {"ID", "Transaction Type", "Time", "Debit", "Credit"};
        tblStatementModel.setColumnIdentifiers(title);
        tblStatement.setModel(tblStatementModel);
        dtoAdmin = admin;
        btnExportreport.setVisible(false);
        setVisible(true);
    }
    

    DefaultTableModel tblStatementModel = new DefaultTableModel();
    public void createTable() 
    {
        ArrayList<Transaction_DTO> list = busStatement.getBankStatement(dtoAccount, datFromDate.getDate(), datToDate.getDate());
        if(list.size() == 0)
        {
             DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            JOptionPane.showMessageDialog(this, "Customers do not make transactions from " + df.format(datFromDate.getDate())+ " to " + df.format(datToDate.getDate()) , "Notification", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            tblStatementModel.setRowCount(0); 
            for(int i = 0; i < list.size(); i++) {
                Transaction_DTO dtoTransaction = list.get(i);
                String transactionId = String.valueOf(dtoTransaction.getId());
                String transactionTypeID = dtoTransaction.getTransactionTypeID();
                String transactionDate =  dtoTransaction.getTrasactionDate().toString();
                String amount = String.format("%,d", dtoTransaction.getTotalTransactionAmount());
                String debit = "";
                String credit = "";
                if(transactionTypeID.equals("NT01") || transactionTypeID.equals("TK02")) 
                    credit = amount + " VND";
                else
                    debit = amount + " VND";
                String[] rows = {transactionId, transactionTypeID , transactionDate, debit, credit};
                tblStatementModel.addRow(rows);
            }
            btnExportreport.setVisible(true);
            tblStatement.setModel(tblStatementModel);
            //setVisible(true);
        }
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblToDay = new javax.swing.JLabel();
        lblAccountID = new javax.swing.JLabel();
        lblFromDate = new javax.swing.JLabel();
        txtAccountID = new javax.swing.JTextField();
        btnExportreport = new javax.swing.JButton();
        btnStatement = new javax.swing.JButton();
        lblImage_MyWalletCusGUI = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStatement = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        datToDate = new com.toedter.calendar.JDateChooser();
        datFromDate = new com.toedter.calendar.JDateChooser();
        lblAccountID1 = new javax.swing.JLabel();
        txtAccountOnwer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Statement");

        jPanel1.setBackground(new java.awt.Color(239, 250, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblToDay.setBackground(new java.awt.Color(32, 172, 216));
        lblToDay.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblToDay.setForeground(new java.awt.Color(32, 172, 216));
        lblToDay.setText("To:");
        jPanel1.add(lblToDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, -1, -1));

        lblAccountID.setBackground(new java.awt.Color(32, 172, 216));
        lblAccountID.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblAccountID.setForeground(new java.awt.Color(32, 172, 216));
        lblAccountID.setText("Account onwer:");
        jPanel1.add(lblAccountID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        lblFromDate.setBackground(new java.awt.Color(32, 172, 216));
        lblFromDate.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblFromDate.setForeground(new java.awt.Color(32, 172, 216));
        lblFromDate.setText("From:");
        jPanel1.add(lblFromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        txtAccountID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAccountID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtAccountID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 300, 30));

        btnExportreport.setBackground(new java.awt.Color(32, 172, 216));
        btnExportreport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExportreport.setForeground(new java.awt.Color(255, 255, 255));
        btnExportreport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Export.png"))); // NOI18N
        btnExportreport.setText("Export bank statement  report");
        btnExportreport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExportreport.setIconTextGap(2);
        jPanel1.add(btnExportreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 270, 40));

        btnStatement.setBackground(new java.awt.Color(32, 172, 216));
        btnStatement.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnStatement.setForeground(new java.awt.Color(255, 255, 255));
        btnStatement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Statement_Statement.png"))); // NOI18N
        btnStatement.setText(" Statement");
        btnStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatementActionPerformed(evt);
            }
        });
        jPanel1.add(btnStatement, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 140, 40));

        lblImage_MyWalletCusGUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Statement.png"))); // NOI18N
        jPanel1.add(lblImage_MyWalletCusGUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 100));

        tblStatement.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblStatement);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 720, 260));

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
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, 50, 57));

        lblTitle.setBackground(new java.awt.Color(32, 172, 216));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 29)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("         Statement");
        lblTitle.setOpaque(true);
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 30, 935, 58));

        datToDate.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(datToDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 200, 30));

        datFromDate.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(datFromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 200, 30));

        lblAccountID1.setBackground(new java.awt.Color(32, 172, 216));
        lblAccountID1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblAccountID1.setForeground(new java.awt.Color(32, 172, 216));
        lblAccountID1.setText("Account ID:");
        jPanel1.add(lblAccountID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        txtAccountOnwer.setEditable(false);
        txtAccountOnwer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtAccountOnwer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1066, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new AdminHome_GUI(dtoAdmin);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed
    private void btnStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatementActionPerformed
        if(txtAccountID.getText().equals("") || txtAccountOnwer.getText().equals("") || datToDate.getDate() == null || datToDate.getDate() == null)
        {
            JOptionPane.showMessageDialog(this, "Required fields are empty", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            if(datFromDate.getDate().compareTo(datToDate.getDate()) == 1)
            {
                JOptionPane.showMessageDialog(this, "Invalid statement date", "Eroror", JOptionPane.ERROR_MESSAGE);
                datFromDate.setDate(null);
                datToDate.setDate(null);
            }
            else
            {
                createTable();
            }
        }
    }//GEN-LAST:event_btnStatementActionPerformed

    private void txtAccountIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountIDActionPerformed

        dtoAccount = new Account_DTO(Long.parseLong(txtAccountID.getText()));
        Customer_DTO dtoCustomer = busStatement.getCustomerInfo(dtoAccount);
        if(dtoCustomer == null)
        {
            JOptionPane.showMessageDialog(this, "Account ID is invalid", "Error", JOptionPane.ERROR_MESSAGE);
            txtAccountOnwer.setText("");
        }
        else
        {
            txtAccountOnwer.setText(dtoCustomer.getFirstName() + " " + dtoCustomer.getLastName());
        }
    }//GEN-LAST:event_txtAccountIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportreport;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnStatement;
    private com.toedter.calendar.JDateChooser datFromDate;
    private com.toedter.calendar.JDateChooser datToDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccountID;
    private javax.swing.JLabel lblAccountID1;
    private javax.swing.JLabel lblFromDate;
    private javax.swing.JLabel lblImage_MyWalletCusGUI;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblToDay;
    private javax.swing.JTable tblStatement;
    private javax.swing.JTextField txtAccountID;
    private javax.swing.JTextField txtAccountOnwer;
    // End of variables declaration//GEN-END:variables
}
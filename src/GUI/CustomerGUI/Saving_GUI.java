package GUI.CustomerGUI;

import BUS.Saving_BUS;
import DTO.AccountType_DTO;
import DTO.Account_DTO;
import DTO.Customer_DTO;
import DTO.UserLogin_DTO;
import GUI.CustomerMenu_GUI;
import GUI.LogIn;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Saving_GUI extends javax.swing.JFrame 
{
    Saving_BUS busSaving = new Saving_BUS();
    
    Customer_DTO dtoCustomer = null;
    AccountType_DTO dtoSavingsAccountType = null;
    Account_DTO dtoPaymentAccount = null;
    
    public Saving_GUI(Customer_DTO customer, Account_DTO account) 
    {
        initComponents();
        setLocationRelativeTo(null);
        setSize(1064, 650);
        setVisible(true);
        cboSavingsAccountType.setSelectedItem(null);
        cboTerm.setSelectedItem(null);
        dtoCustomer = customer;
        dtoPaymentAccount = account;
        btnOpenAccount.setVisible(false);
        txtTotalSavingAccount.setText(String.format("%,d",busSaving.getTotalSavingAccount(dtoCustomer)) + " VND");
        createTable();
        tblSavingsAccountSelectRow();
    }

    DefaultTableModel tblAccountModel;
    public void createTable()
    {
        ArrayList<Account_DTO> list = busSaving.getSavingsAccountList(dtoCustomer);
        tblAccountModel = new DefaultTableModel();
        String title[] = {"Account No", "Name", "Amount", "Open Date", "Maturity Date"};
        tblAccountModel.setColumnIdentifiers(title);
        tblAccountModel.setRowCount(0); 
        for(int i = 0; i < list.size(); i++)
        {
            Account_DTO dtoAccount = list.get(i);
            String[] rows = {String.valueOf(dtoAccount.getId()), dtoAccount.getAccountTypeID(), String.format("%,d", dtoAccount.getCurrentBalance()), String.valueOf(dtoAccount.getOpenDay()), String.valueOf(dtoAccount.getMaturityDate())};
            tblAccountModel.addRow(rows);
        }
        tblSavingsAccount.setModel(tblAccountModel);
        setVisible(true);
    }
    
    int savingAccountId = 0;
    public void tblSavingsAccountSelectRow()
    {
        tblSavingsAccount.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if(!lse.getValueIsAdjusting())
                {
                    int row = tblSavingsAccount.getSelectedRow();
                    if(row >= 0)
                    {
                        savingAccountId = Integer.parseInt(tblSavingsAccount.getModel().getValueAt(row, 0).toString());
                    }
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        WithdrawOnlineSavings = new javax.swing.JPanel();
        btnLogout1 = new javax.swing.JButton();
        btnHome1 = new javax.swing.JButton();
        lblIcon = new javax.swing.JLabel();
        lblTit = new javax.swing.JLabel();
        btnSettlement = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSavingsAccount = new javax.swing.JTable();
        lblDebitAccount6 = new javax.swing.JLabel();
        txtTotalSavingAccount = new javax.swing.JFormattedTextField();
        lblCurrentSavingAccountsList = new javax.swing.JLabel();
        OpenOnlineSavings = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblIcon1 = new javax.swing.JLabel();
        lblTit1 = new javax.swing.JLabel();
        lblDebitAccount = new javax.swing.JLabel();
        lblTerm = new javax.swing.JLabel();
        lblVND = new javax.swing.JLabel();
        cboSavingsAccountType = new javax.swing.JComboBox<>();
        txtDeposits = new javax.swing.JTextField();
        cboTerm = new javax.swing.JComboBox<>();
        btnFindSuitableProduct = new javax.swing.JButton();
        btnOpenAccount = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lblDebitAccount3 = new javax.swing.JLabel();
        lblDebitAccount5 = new javax.swing.JLabel();
        lblInterestRate = new javax.swing.JLabel();
        lblDebitAccount7 = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblAnticipatedInterest = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtInterestRate = new javax.swing.JTextField();
        txtAnticipatedInterest = new javax.swing.JTextField();
        lblInterestRate1 = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        txtMaturityDate = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        lblInterestRate3 = new javax.swing.JLabel();
        lblDebitAccount4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Online Banking System");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        WithdrawOnlineSavings.setBackground(new java.awt.Color(239, 250, 252));
        WithdrawOnlineSavings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout1.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogout1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Logout.png"))); // NOI18N
        btnLogout1.setText("Logout");
        btnLogout1.setToolTipText("");
        btnLogout1.setBorder(null);
        btnLogout1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout1.setIconTextGap(0);
        btnLogout1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });
        WithdrawOnlineSavings.add(btnLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 77, 58));

        btnHome1.setBackground(new java.awt.Color(32, 172, 216));
        btnHome1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome1.setForeground(new java.awt.Color(255, 255, 255));
        btnHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome1.setText("Home");
        btnHome1.setToolTipText("");
        btnHome1.setBorder(null);
        btnHome1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome1.setIconTextGap(1);
        btnHome1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome1ActionPerformed(evt);
            }
        });
        WithdrawOnlineSavings.add(btnHome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 76, 58));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/customergui_tietkiem.png"))); // NOI18N
        WithdrawOnlineSavings.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 120, 110));

        lblTit.setBackground(new java.awt.Color(32, 172, 216));
        lblTit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTit.setForeground(new java.awt.Color(255, 255, 255));
        lblTit.setText("                 View Online Savings Accounts");
        lblTit.setOpaque(true);
        lblTit.setPreferredSize(new java.awt.Dimension(34, 50));
        WithdrawOnlineSavings.add(lblTit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 940, 66));

        btnSettlement.setBackground(new java.awt.Color(32, 172, 216));
        btnSettlement.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSettlement.setForeground(new java.awt.Color(255, 255, 255));
        btnSettlement.setText("Settlement");
        btnSettlement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettlementActionPerformed(evt);
            }
        });
        WithdrawOnlineSavings.add(btnSettlement, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 130, 40));

        tblSavingsAccount.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblSavingsAccount);

        WithdrawOnlineSavings.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 230, 760, 240));

        lblDebitAccount6.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount6.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lblDebitAccount6.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount6.setText("Total Saving Account:");
        WithdrawOnlineSavings.add(lblDebitAccount6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        txtTotalSavingAccount.setEditable(false);
        txtTotalSavingAccount.setBackground(new java.awt.Color(239, 250, 252));
        txtTotalSavingAccount.setBorder(null);
        txtTotalSavingAccount.setForeground(new java.awt.Color(32, 172, 216));
        txtTotalSavingAccount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        txtTotalSavingAccount.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        WithdrawOnlineSavings.add(txtTotalSavingAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 220, -1));

        lblCurrentSavingAccountsList.setBackground(new java.awt.Color(32, 172, 216));
        lblCurrentSavingAccountsList.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lblCurrentSavingAccountsList.setForeground(new java.awt.Color(32, 172, 216));
        lblCurrentSavingAccountsList.setText("Current Saving Accounts List:");
        WithdrawOnlineSavings.add(lblCurrentSavingAccountsList, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jTabbedPane1.addTab("View Online Savings Information", WithdrawOnlineSavings);

        OpenOnlineSavings.setBackground(new java.awt.Color(239, 250, 252));
        OpenOnlineSavings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setBackground(new java.awt.Color(32, 172, 216));
        btnHome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Home.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setToolTipText("");
        btnHome.setBorder(null);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setIconTextGap(1);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 76, 58));

        btnLogout.setBackground(new java.awt.Color(32, 172, 216));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/Logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setToolTipText("");
        btnLogout.setBorder(null);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setIconTextGap(0);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 77, 58));

        lblIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/customergui_tietkiem.png"))); // NOI18N
        OpenOnlineSavings.add(lblIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 110));

        lblTit1.setBackground(new java.awt.Color(32, 172, 216));
        lblTit1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTit1.setForeground(new java.awt.Color(255, 255, 255));
        lblTit1.setText("         Open Online Savings Account");
        lblTit1.setOpaque(true);
        lblTit1.setPreferredSize(new java.awt.Dimension(34, 50));
        OpenOnlineSavings.add(lblTit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 940, 66));

        lblDebitAccount.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lblDebitAccount.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount.setText("Deposits:");
        OpenOnlineSavings.add(lblDebitAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        lblTerm.setBackground(new java.awt.Color(32, 172, 216));
        lblTerm.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lblTerm.setForeground(new java.awt.Color(32, 172, 216));
        lblTerm.setText("Term:");
        OpenOnlineSavings.add(lblTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        lblVND.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        lblVND.setForeground(new java.awt.Color(32, 172, 216));
        lblVND.setText("VND");
        OpenOnlineSavings.add(lblVND, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, -1, -1));

        cboSavingsAccountType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboSavingsAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Term Savings Account", "Non-term Savings Account" }));
        cboSavingsAccountType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSavingsAccountTypeActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(cboSavingsAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 210, -1));

        txtDeposits.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDeposits.setForeground(new java.awt.Color(1, 1, 1));
        txtDeposits.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDepositsMousePressed(evt);
            }
        });
        txtDeposits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepositsActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(txtDeposits, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 320, -1));

        cboTerm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboTerm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 month", "3 months", "6 months" }));
        cboTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTermActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(cboTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 170, -1));

        btnFindSuitableProduct.setBackground(new java.awt.Color(32, 172, 216));
        btnFindSuitableProduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFindSuitableProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnFindSuitableProduct.setText("Find Suitable Product");
        btnFindSuitableProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindSuitableProductActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(btnFindSuitableProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, -1, 30));

        btnOpenAccount.setBackground(new java.awt.Color(32, 172, 216));
        btnOpenAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOpenAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnOpenAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/plus_25px.png"))); // NOI18N
        btnOpenAccount.setText("Open Account");
        btnOpenAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenAccountActionPerformed(evt);
            }
        });
        OpenOnlineSavings.add(btnOpenAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 170, -1));
        OpenOnlineSavings.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 710, 10));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDebitAccount3.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount3.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        lblDebitAccount3.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount3.setText("Maturity date:");
        jPanel1.add(lblDebitAccount3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        lblDebitAccount5.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lblDebitAccount5.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount5.setText("Suitable Product Details:");
        jPanel1.add(lblDebitAccount5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblInterestRate.setBackground(new java.awt.Color(32, 172, 216));
        lblInterestRate.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        lblInterestRate.setForeground(new java.awt.Color(32, 172, 216));
        lblInterestRate.setText("(VND)");
        jPanel1.add(lblInterestRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        lblDebitAccount7.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount7.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        lblDebitAccount7.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount7.setText("Total received amount: ");
        jPanel1.add(lblDebitAccount7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        lblStartDate.setBackground(new java.awt.Color(32, 172, 216));
        lblStartDate.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        lblStartDate.setForeground(new java.awt.Color(32, 172, 216));
        lblStartDate.setText("Start date:");
        jPanel1.add(lblStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        lblAnticipatedInterest.setBackground(new java.awt.Color(32, 172, 216));
        lblAnticipatedInterest.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        lblAnticipatedInterest.setForeground(new java.awt.Color(32, 172, 216));
        lblAnticipatedInterest.setText("Anticipated Interest:");
        jPanel1.add(lblAnticipatedInterest, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(32, 172, 216));
        txtTotal.setBorder(null);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 140, -1));

        txtInterestRate.setEditable(false);
        txtInterestRate.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        txtInterestRate.setForeground(new java.awt.Color(32, 172, 216));
        txtInterestRate.setBorder(null);
        txtInterestRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInterestRateActionPerformed(evt);
            }
        });
        jPanel1.add(txtInterestRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 140, -1));

        txtAnticipatedInterest.setEditable(false);
        txtAnticipatedInterest.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        txtAnticipatedInterest.setForeground(new java.awt.Color(32, 172, 216));
        txtAnticipatedInterest.setBorder(null);
        txtAnticipatedInterest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnticipatedInterestActionPerformed(evt);
            }
        });
        jPanel1.add(txtAnticipatedInterest, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 140, -1));

        lblInterestRate1.setBackground(new java.awt.Color(32, 172, 216));
        lblInterestRate1.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        lblInterestRate1.setForeground(new java.awt.Color(32, 172, 216));
        lblInterestRate1.setText("Interest rate:");
        jPanel1.add(lblInterestRate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txtStartDate.setEditable(false);
        txtStartDate.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtStartDate.setForeground(new java.awt.Color(32, 172, 216));
        txtStartDate.setBorder(null);
        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });
        jPanel1.add(txtStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 140, -1));

        txtMaturityDate.setEditable(false);
        txtMaturityDate.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtMaturityDate.setForeground(new java.awt.Color(32, 172, 216));
        txtMaturityDate.setBorder(null);
        txtMaturityDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaturityDateActionPerformed(evt);
            }
        });
        jPanel1.add(txtMaturityDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 150, -1));

        txtProductName.setEditable(false);
        txtProductName.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txtProductName.setForeground(new java.awt.Color(32, 172, 216));
        txtProductName.setBorder(null);
        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 470, -1));

        lblInterestRate3.setBackground(new java.awt.Color(32, 172, 216));
        lblInterestRate3.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N
        lblInterestRate3.setForeground(new java.awt.Color(32, 172, 216));
        lblInterestRate3.setText("(VND)");
        jPanel1.add(lblInterestRate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        OpenOnlineSavings.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 710, 210));

        lblDebitAccount4.setBackground(new java.awt.Color(32, 172, 216));
        lblDebitAccount4.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        lblDebitAccount4.setForeground(new java.awt.Color(32, 172, 216));
        lblDebitAccount4.setText("Saving Account Type:");
        OpenOnlineSavings.add(lblDebitAccount4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jTabbedPane1.addTab("Open Online Savings", OpenOnlineSavings);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        LogIn guiLogIn= new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogout1ActionPerformed

    private void btnHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome1ActionPerformed
        new CustomerMenu_GUI(dtoCustomer);
        this.setVisible(false);
    }//GEN-LAST:event_btnHome1ActionPerformed

    private void btnSettlementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettlementActionPerformed
        // Xử lý tất toán tài khoản tiết kiệm
        int row = tblSavingsAccount.getSelectedRow();
        if(savingAccountId == 0)
        {
            JOptionPane.showMessageDialog(this, "Please select a saving account to settle.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            // Lấy ngày bắt đầu và ngày đáo hạn từ bảng đã chọn ra để so sánh
            Date openDay = null;
            Date maturityDate = null;
            try {
                openDay = new SimpleDateFormat("yyyy-MM-dd").parse(tblSavingsAccount.getModel().getValueAt(row, 3).toString().replaceAll("\\s+",""));
                maturityDate = new SimpleDateFormat("yyyy-MM-dd").parse(tblSavingsAccount.getModel().getValueAt(row, 4).toString().replaceAll("\\s+",""));
            } catch (ParseException ex) {
                Logger.getLogger(Saving_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            if(maturityDate.compareTo(openDay) > 0) // Nếu chưa đến ngày đáo hạn
            {
                String accountSavingType = tblSavingsAccount.getModel().getValueAt(row, 1).toString().replaceAll("\\s+","");
                if(accountSavingType.contains("TSA")) // Đối với tiết kiệm có kỳ hạn thì không được tất toán
                {
                    JOptionPane.showMessageDialog(this, "Term savings account cannot be settled because the maturity date hasn't come yet.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else // Đối với tiết kiệm không kỳ hạn thì có thể tất toán được.
                {
                    int reply = JOptionPane.showConfirmDialog(null, "The maturity date hasn't come yet, are you sure to settle this saving account?", "Confirm", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) 
                    {
                        String enteredPassword = confirmPassword();
                        UserLogin_DTO dtoUserLogIn = busSaving.getUserLogin(dtoCustomer);
                        if(enteredPassword.equals(dtoUserLogIn.getPassword()))
                        {
                            // Nếu password đúng thì thực hiện tất toán
                            Account_DTO dtoSavingAccount= new Account_DTO(savingAccountId);
                            if(busSaving.settle(dtoSavingAccount))
                            {
                                JOptionPane.showMessageDialog(this, "Settled successfully" , "Notification", JOptionPane.INFORMATION_MESSAGE); 
                                createTable();
                                txtTotalSavingAccount.setText(String.format("%,d",busSaving.getTotalSavingAccount(dtoCustomer)) + " VND");
                            }
                        }
                        else if(enteredPassword.equals("cancel"))
                        {
                            // Không làm gì hết
                        }
                        else
                            JOptionPane.showMessageDialog(this, "Password is incorrect", "Incorrect details", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            else // Đã tới hoặc qua ngày đáo hạn thì cả 2 loại tiết kiệm đều có thể tất toán
            {
                String enteredPassword = confirmPassword();
                UserLogin_DTO dtoUserLogIn = busSaving.getUserLogin(dtoCustomer);
                if(enteredPassword.equals(dtoUserLogIn.getPassword()))
                {
                    Account_DTO dtoSavingAccount= new Account_DTO(savingAccountId);
                    if(busSaving.settle(dtoSavingAccount))
                    {
                        JOptionPane.showMessageDialog(this, "Settled successfully" , "Notification", JOptionPane.INFORMATION_MESSAGE); 
                        createTable();
                        txtTotalSavingAccount.setText(String.format("%,d",busSaving.getTotalSavingAccount(dtoCustomer)) + " VND");
                    }
                }
                else if(enteredPassword.equals("cancel"))
                {
                    // Không làm gì hết
                }
                else
                    JOptionPane.showMessageDialog(this, "Password is incorrect", "Incorrect details", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btnSettlementActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        new CustomerMenu_GUI(dtoCustomer);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LogIn guiLogIn= new LogIn();
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void cboTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTermActionPerformed
        //Clear form
        txtInterestRate.setText("");
        txtAnticipatedInterest.setText("");
        txtTotal.setText("");
        txtStartDate.setText("");
        txtMaturityDate.setText("");
        txtProductName.setText("");
        btnOpenAccount.setVisible(false);
    }//GEN-LAST:event_cboTermActionPerformed

    private void btnFindSuitableProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindSuitableProductActionPerformed
        if(cboSavingsAccountType.getSelectedItem() == null ||cboTerm.getSelectedItem() == null || txtDeposits.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Required field are empty", "Please fill required field...!", JOptionPane.ERROR_MESSAGE);
        }
        else if(Long.parseLong(txtDeposits.getText()) > dtoPaymentAccount.getCurrentBalance())
        {
            JOptionPane.showMessageDialog(this, "Current balance is not enough", "Incorrect details", JOptionPane.ERROR_MESSAGE);
        }
        else if(Long.parseLong(txtDeposits.getText()) < 1000000)
        {
            JOptionPane.showMessageDialog(this, "The deposit amount must be more than 1,000,000 VND", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            // Bus lấy loại tài khoản tiết kiệm, lãi suất từ database
            dtoSavingsAccountType = busSaving.getSavingsAccountType(cboSavingsAccountType.getSelectedItem().toString(), cboTerm.getSelectedItem().toString());
            
            // Lấy lãi suất
            double interestRate = dtoSavingsAccountType.getInterestRate();
            
            int numberOfMonth = 0;
            //-- Tính ngày đáo hạn
            long millis = System.currentTimeMillis();
            java.sql.Date startDate = new java.sql.Date(millis);
            Calendar temp = Calendar.getInstance();
            temp.setTime(startDate);
            String term = cboTerm.getSelectedItem().toString();
            if(term.equals("6 months"))
            {
                numberOfMonth = 6;
                temp.roll(Calendar.MONTH, 6);
            }
            else if(term.equals("3 months"))
            {
                numberOfMonth = 3;
                temp.roll(Calendar.MONTH, 3);
            }
            else
            {
                numberOfMonth = 1;
                temp.roll(Calendar.MONTH, 1);
            }
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String maturityDate = df.format(temp.getTime());
            
            //-- Tính tiền lãi dự kiến = số tiền gửi x  lãi suất (% năm)/ 12  x số tháng gửi
            long anticipatedInterest = (long)(Long.parseLong(txtDeposits.getText()) * interestRate * numberOfMonth) / 12;
            //-- Tính tổng số tiền nhận được khi tất toán tài khoản tiết kiệm
            long total = (long)(Long.parseLong(txtDeposits.getText()) + anticipatedInterest);
            
            // Hiển thị sản phẩm phù hợp lên form
            txtProductName.setText(dtoSavingsAccountType.getName());
            txtInterestRate.setText(String.valueOf(Math.round(interestRate * 100.0 * 100.0) / 100.0) + "%/year");
            txtAnticipatedInterest.setText(String.format("%,d",anticipatedInterest));
            txtTotal.setText(String.format("%,d",total));
            txtStartDate.setText(startDate.toString());
            txtMaturityDate.setText(maturityDate);
            btnOpenAccount.setVisible(true);
        }
    }//GEN-LAST:event_btnFindSuitableProductActionPerformed

    private String confirmPassword()
    {
        // Create Password JOptionPane
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Please enter your password:");
        JPasswordField pass = new JPasswordField(10);
        panel.add(label);
        panel.add(pass);
        String[] options = new String[]{"Confirm", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, panel, "Verify by password", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
        String password = "";
        if(option == 0) // pressing OK button
        {
            char[] pw = pass.getPassword();
            password = new String(pw);
        }
        else
            return "cancel";
        return password;
    }
    
    private void btnOpenAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenAccountActionPerformed
        UserLogin_DTO dtoUserLogIn = busSaving.getUserLogin(dtoCustomer); // Lấy password người dùng
        String EnteredPassword = confirmPassword();
        if(EnteredPassword.equals(dtoUserLogIn.getPassword()))// // So sánh password với password người dùng nhập
        {
            // Lấy ngày đáo hạn từ form xuống
            Date maturityDate = null;
            try {
                maturityDate = new SimpleDateFormat("yyyy-MM-dd").parse(txtMaturityDate.getText());
            } catch (ParseException ex) {
                Logger.getLogger(Saving_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Account_DTO dtoNewSavingAccount = new Account_DTO(dtoSavingsAccountType.getId(), Long.parseLong(txtDeposits.getText()), maturityDate, Long.parseLong(txtAnticipatedInterest.getText().replaceAll(",","")) , dtoCustomer.getId());
            if(busSaving.openSavingsAccount(dtoNewSavingAccount))
            {
                JOptionPane.showConfirmDialog(null, "Open savings account is successful", "Successful", JOptionPane.CLOSED_OPTION);
                createTable();
                txtTotalSavingAccount.setText(String.format("%,d",busSaving.getTotalSavingAccount(dtoCustomer)) + " VND");
                
                //Clear form
                cboSavingsAccountType.setSelectedItem(null);
                cboTerm.setSelectedItem(null);
                txtDeposits.setText("");
                txtInterestRate.setText("");
                txtAnticipatedInterest.setText("");
                txtTotal.setText("");
                txtStartDate.setText("");
                txtMaturityDate.setText("");
                txtProductName.setText("");
                btnOpenAccount.setVisible(false);
            }
            else
            JOptionPane.showConfirmDialog(null, "Cannot open savings account.", "Error", JOptionPane.CLOSED_OPTION);
        }
        else if(EnteredPassword.equals("cancel"))
        {
            // Không làm gì hết
        }
        else
        JOptionPane.showMessageDialog(this, "Password is incorrect", "Incorrect details", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_btnOpenAccountActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtInterestRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInterestRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInterestRateActionPerformed

    private void txtAnticipatedInterestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnticipatedInterestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnticipatedInterestActionPerformed

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateActionPerformed

    private void txtMaturityDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaturityDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaturityDateActionPerformed

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void cboSavingsAccountTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSavingsAccountTypeActionPerformed
        //Clear form
        txtInterestRate.setText("");
        txtAnticipatedInterest.setText("");
        txtTotal.setText("");
        txtStartDate.setText("");
        txtMaturityDate.setText("");
        txtProductName.setText("");
        btnOpenAccount.setVisible(false);
    }//GEN-LAST:event_cboSavingsAccountTypeActionPerformed

    private void txtDepositsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDepositsMousePressed
        txtInterestRate.setText("");
        txtAnticipatedInterest.setText("");
        txtTotal.setText("");
        txtStartDate.setText("");
        txtMaturityDate.setText("");
        txtProductName.setText("");
        btnOpenAccount.setVisible(false);
    }//GEN-LAST:event_txtDepositsMousePressed

    private void txtDepositsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepositsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepositsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OpenOnlineSavings;
    private javax.swing.JPanel WithdrawOnlineSavings;
    private javax.swing.JButton btnFindSuitableProduct;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHome1;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JButton btnOpenAccount;
    private javax.swing.JButton btnSettlement;
    private javax.swing.JComboBox<String> cboSavingsAccountType;
    private javax.swing.JComboBox<String> cboTerm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAnticipatedInterest;
    private javax.swing.JLabel lblCurrentSavingAccountsList;
    private javax.swing.JLabel lblDebitAccount;
    private javax.swing.JLabel lblDebitAccount3;
    private javax.swing.JLabel lblDebitAccount4;
    private javax.swing.JLabel lblDebitAccount5;
    private javax.swing.JLabel lblDebitAccount6;
    private javax.swing.JLabel lblDebitAccount7;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblInterestRate;
    private javax.swing.JLabel lblInterestRate1;
    private javax.swing.JLabel lblInterestRate3;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTerm;
    private javax.swing.JLabel lblTit;
    private javax.swing.JLabel lblTit1;
    private javax.swing.JLabel lblVND;
    private javax.swing.JTable tblSavingsAccount;
    private javax.swing.JTextField txtAnticipatedInterest;
    private javax.swing.JTextField txtDeposits;
    private javax.swing.JTextField txtInterestRate;
    private javax.swing.JTextField txtMaturityDate;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JFormattedTextField txtTotalSavingAccount;
    // End of variables declaration//GEN-END:variables
}
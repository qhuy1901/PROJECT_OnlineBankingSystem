/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.SupportFrames;

import BUS.Customer_BUS;
import DTO.Customer_DTO;
import GUI.Admin_GUI;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author DUONG NGOC YEN
 */
public class Customer_Management extends javax.swing.JFrame 
{
    Customer_BUS customer_BUS = new Customer_BUS();
    public Customer_Management() {
        initComponents();
        setLocationRelativeTo(null);
        display();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomers = new javax.swing.JTable();
        btnExit1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnHome1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtIDCard = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtUpdateName = new javax.swing.JTextField();
        txtUpdateID = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cbbUpdateGender = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtUpdateAddress = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtUpdatePhoneNumber = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        btnShowInformation = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        txtUpdateIDCard = new javax.swing.JTextField();
        btnHome_Update = new javax.swing.JButton();
        btnExit_Update = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        btnUpdate2.setBackground(new java.awt.Color(32, 172, 216));
        btnUpdate2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate2.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/delete_25px.png"))); // NOI18N
        btnUpdate2.setText("Delete");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(239, 250, 252));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel9.setBackground(new java.awt.Color(239, 250, 252));

        txtSearch.setForeground(new java.awt.Color(204, 204, 204));
        txtSearch.setText("Enter ID, Name, ID Card,... to search");
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        tableCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Address", "Phone Number", "ID Card"
            }
        ));
        jScrollPane1.setViewportView(tableCustomers);

        btnExit1.setBackground(new java.awt.Color(32, 172, 216));
        btnExit1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnExit1.setForeground(new java.awt.Color(255, 255, 255));
        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/shutdown_20px.png"))); // NOI18N
        btnExit1.setText("Logout");
        btnExit1.setToolTipText("");
        btnExit1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit1.setIconTextGap(0);
        btnExit1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setText("Search");

        btnHome1.setBackground(new java.awt.Color(32, 172, 216));
        btnHome1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome1.setForeground(new java.awt.Color(255, 255, 255));
        btnHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/home_25px.png"))); // NOI18N
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

        jLabel7.setBackground(new java.awt.Color(32, 172, 216));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("        View Customer");
        jLabel7.setOpaque(true);
        jLabel7.setPreferredSize(new java.awt.Dimension(34, 50));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(700, 700, 700)
                                .addComponent(btnHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(800, 800, 800)
                                .addComponent(btnExit1))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("View Customer", jPanel9);

        jPanel1.setBackground(new java.awt.Color(239, 250, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 172, 216));
        jLabel5.setText("ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 124, 94, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 172, 216));
        jLabel6.setText("Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 169, 94, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 172, 216));
        jLabel8.setText("Date of birth");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 232, -1, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 161, 428, 32));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 111, 222, 32));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(32, 172, 216));
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 232, -1, -1));

        cbGender.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        cbGender.setSelectedIndex(-1);
        jPanel1.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 228, 122, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(32, 172, 216));
        jLabel10.setText("Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 286, -1, -1));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 286, 428, 32));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(32, 172, 216));
        jLabel11.setText("Phone No.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 358, -1, -1));
        jPanel1.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 350, 428, 32));

        btnAdd.setBackground(new java.awt.Color(32, 172, 216));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/plus_25px.png"))); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(948, 94, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/administrator_male_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel12)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(35, 35, 35))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 203, -1, -1));

        btnHome.setBackground(new java.awt.Color(32, 172, 216));
        btnHome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/home_25px.png"))); // NOI18N
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
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 24, 76, 58));

        btnExit.setBackground(new java.awt.Color(32, 172, 216));
        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/shutdown_20px.png"))); // NOI18N
        btnExit.setText("Logout");
        btnExit.setToolTipText("");
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setIconTextGap(0);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 24, 77, 58));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/add_user_group_man_man_55px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 17, 125, 77));

        jLabel4.setBackground(new java.awt.Color(32, 172, 216));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("        Add Customer");
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(34, 50));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 19, 906, 66));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(32, 172, 216));
        jLabel34.setText("ID Card");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 409, -1, -1));
        jPanel1.add(txtIDCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 409, 225, 32));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 228, 178, 32));

        jTabbedPane1.addTab("Add Customer", jPanel1);

        jPanel3.setBackground(new java.awt.Color(239, 250, 252));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/add_user_group_man_man_55px.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(32, 172, 216));
        jLabel13.setText("ID");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(32, 172, 216));
        jLabel14.setText("Name");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(32, 172, 216));
        jLabel16.setText("Date of birth");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(32, 172, 216));
        jLabel17.setText("Gender");

        cbbUpdateGender.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        cbbUpdateGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        cbbUpdateGender.setSelectedIndex(-1);
        cbbUpdateGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbUpdateGenderActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(32, 172, 216));
        jLabel18.setText("Address");

        txtUpdateAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateAddressActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(32, 172, 216));
        jLabel19.setText("Phone No.");

        btnUpdate.setBackground(new java.awt.Color(32, 172, 216));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/update_25px.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/administrator_male_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel20)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(35, 35, 35))
        );

        jLabel22.setBackground(new java.awt.Color(32, 172, 216));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("        Update/ Delete Customer");
        jLabel22.setOpaque(true);
        jLabel22.setPreferredSize(new java.awt.Dimension(34, 50));

        btnShowInformation.setBackground(new java.awt.Color(32, 172, 216));
        btnShowInformation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnShowInformation.setForeground(new java.awt.Color(255, 255, 255));
        btnShowInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/search_20px.png"))); // NOI18N
        btnShowInformation.setText("Show Information");
        btnShowInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowInformationActionPerformed(evt);
            }
        });

        btnDeleteCustomer.setBackground(new java.awt.Color(32, 172, 216));
        btnDeleteCustomer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDeleteCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/delete_25px.png"))); // NOI18N
        btnDeleteCustomer.setText("Delete");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(32, 172, 216));
        jLabel35.setText("ID Card");

        btnHome_Update.setBackground(new java.awt.Color(32, 172, 216));
        btnHome_Update.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHome_Update.setForeground(new java.awt.Color(255, 255, 255));
        btnHome_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/home_25px.png"))); // NOI18N
        btnHome_Update.setText("Home");
        btnHome_Update.setToolTipText("");
        btnHome_Update.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome_Update.setIconTextGap(1);
        btnHome_Update.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome_UpdateActionPerformed(evt);
            }
        });

        btnExit_Update.setBackground(new java.awt.Color(32, 172, 216));
        btnExit_Update.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnExit_Update.setForeground(new java.awt.Color(255, 255, 255));
        btnExit_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/shutdown_20px.png"))); // NOI18N
        btnExit_Update.setText("Logout");
        btnExit_Update.setToolTipText("");
        btnExit_Update.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit_Update.setIconTextGap(0);
        btnExit_Update.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel13)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(txtUpdateID, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnShowInformation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteCustomer)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)))
                .addGap(18, 18, 18))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel35))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbbUpdateGender, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUpdateName)
                    .addComponent(txtUpdateAddress)
                    .addComponent(txtUpdatePhoneNumber)
                    .addComponent(txtUpdateIDCard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGap(0, 82, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExit_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHome_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpdateID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowInformation)
                    .addComponent(btnDeleteCustomer)
                    .addComponent(btnUpdate))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUpdateName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(cbbUpdateGender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUpdateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUpdatePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(txtUpdateIDCard, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(481, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(" Update/ Delete Customer", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        Admin_GUI guiAdmin = new Admin_GUI();
        guiAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(isFormValid())
        {
            Customer_DTO ct = new Customer_DTO(Integer.parseInt(txtID.getText()) , txtName.getText(), cbGender.getSelectedItem().toString(), txtAddress.getText(), txtPhoneNumber.getText(), txtIDCard.getText());
            if(customer_BUS.insert(ct))
            {
                JOptionPane.showMessageDialog(this, "Customer added susccessfully...!", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Clear Form
                txtID.setText("");
                txtName.setText("");
                cbGender.setSelectedItem(null);
                txtAddress.setText("");
                txtPhoneNumber.setText("");
                txtIDCard.setText("");
            }
            else
                JOptionPane.showMessageDialog(this, "Cannot add customers!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel SearchTable = (DefaultTableModel) tableCustomers.getModel();
        String search = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(SearchTable);
        tableCustomers.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        if(txtSearch.getForeground() != Color.BLACK)
        {
            if(txtSearch.getText().equals("Enter ID, Name, ID Card,... to search"))
            {
                txtSearch.setText("");
            }
            txtSearch.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        // TODO add your handling code here:
        if(txtSearch.getForeground() != Color.BLACK)
        {
            if(txtSearch.getText().equals("Enter ID, Name, ID Card,... to search"))
            {
                txtSearch.setText("");
            }
            txtSearch.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtSearchMouseClicked
    
    private boolean isTxtUpdateIDIsFilled()
    {
            if(txtUpdateID.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Required field are empty", "Please fill required field...!", JOptionPane.ERROR_MESSAGE);
                return false;
            }    
            else
                return true;
    }
    
    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerActionPerformed
        // TODO add your handling code here:
        if(isTxtUpdateIDIsFilled())
        {
            Customer_DTO ct = new Customer_DTO(Integer.parseInt(txtUpdateID.getText()));
            if(customer_BUS.delete(ct))
            {
                JOptionPane.showMessageDialog(this, "Customer deleted susccessfully...!", "Success", JOptionPane.INFORMATION_MESSAGE);
                
                // Clear Form
                txtUpdateID.setText("");
                if(isTxtUpdateIDIsFilled())
                {
                    txtUpdateName.setText(ct.getName());
                    cbbUpdateGender.setSelectedItem(ct.getGender());
                    txtUpdateAddress.setText(ct.getAddress());
                    txtUpdatePhoneNumber.setText(ct.getPhoneNumber());
                    txtUpdateIDCard.setText(ct.getIDCard());
                }
            }
            else
                JOptionPane.showMessageDialog(this, "Cannot delete customers!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

    private void cbbUpdateGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbUpdateGenderActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbbUpdateGenderActionPerformed

    private boolean isValidUpdateForm()
    {
            if(txtUpdateName.getText().equals("") || txtUpdateID.getText().equals("") || txtUpdateAddress.getText().equals("") || txtUpdatePhoneNumber.getText().equals("") || txtUpdateIDCard.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Required fields are empty", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
                return false;
            }    
            else
                return true;
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        Customer_DTO ct = new Customer_DTO(Integer.parseInt(txtUpdateID.getText()) , txtUpdateName.getText(), cbbUpdateGender.getSelectedItem().toString(), txtUpdateAddress.getText(), txtUpdatePhoneNumber.getText(), txtUpdateIDCard.getText());
        if(customer_BUS.update(ct))
        {
            JOptionPane.showMessageDialog(this, "Customer updated susccessfully...!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this, "Cannot update customers!", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnUpdateActionPerformed
    
    
    private void btnShowInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowInformationActionPerformed
        // TODO add your handling code here:
        if(isTxtUpdateIDIsFilled())
        {
            Customer_DTO ct = customer_BUS.getInformation(Integer.parseInt(txtUpdateID.getText()));
            if(ct != null)
            {
                txtUpdateName.setText(ct.getName());
                cbbUpdateGender.setSelectedItem(ct.getGender());
                txtUpdateAddress.setText(ct.getAddress());
                txtUpdatePhoneNumber.setText(ct.getPhoneNumber());
                txtUpdateIDCard.setText(ct.getIDCard());
            }
            else
                JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin khách hàng!", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnShowInformationActionPerformed

    private void txtUpdateAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateAddressActionPerformed

    private void btnHome_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome_UpdateActionPerformed
        // TODO add your handling code here:
        btnHomeActionPerformed(evt);
    }//GEN-LAST:event_btnHome_UpdateActionPerformed

    private void btnHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHome1ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private boolean isFormValid()
    {
            if(txtName.getText().equals("") || txtID.getText().equals("") || txtAddress.getText().equals("") || txtPhoneNumber.getText().equals("") || txtIDCard.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Required fields are empty", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
                return false;
            }    
            else
                return true;
    }
    
    public void display()
    {
        ArrayList<Customer_DTO> list = customer_BUS.getCustomersList();
        DefaultTableModel model = (DefaultTableModel)tableCustomers.getModel();
        Object[] row = new Object[6];
        
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getGender();
            row[3] = list.get(i).getAddress();
            row[4] = list.get(i).getPhoneNumber();
            row[5] = list.get(i).getIDCard();
            model.addRow(row);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnExit_Update;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHome1;
    private javax.swing.JButton btnHome_Update;
    private javax.swing.JButton btnShowInformation;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate2;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JComboBox<String> cbbUpdateGender;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableCustomers;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDCard;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUpdateAddress;
    private javax.swing.JTextField txtUpdateID;
    private javax.swing.JTextField txtUpdateIDCard;
    private javax.swing.JTextField txtUpdateName;
    private javax.swing.JTextField txtUpdatePhoneNumber;
    // End of variables declaration//GEN-END:variables
}
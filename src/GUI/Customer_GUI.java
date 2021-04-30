package GUI;

public class Customer_GUI extends javax.swing.JFrame 
{
    public Customer_GUI() 
    {
        initComponents();
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCustomerManagement1 = new javax.swing.JButton();
        btnCustomerManagement2 = new javax.swing.JButton();
        btnCustomerManagement3 = new javax.swing.JButton();
        btnCustomerManagement4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/FontAwesome_f007(0)_128.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnLogOut.setBackground(new java.awt.Color(239, 250, 252));
        btnLogOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(32, 172, 210));
        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 150, 40));

        jLabel2.setBackground(new java.awt.Color(32, 172, 210));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(239, 250, 252));
        jLabel2.setText("        Chúc quý khách một ngày tốt lành!");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 35, 1010, 80));

        jPanel2.setBackground(new java.awt.Color(32, 172, 210));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Welcome");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel2.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("to");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setFocusTraversalPolicyProvider(true);
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 190));
        jPanel2.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("NK Bank");
        jLabel6.setPreferredSize(new java.awt.Dimension(250, 44));
        jPanel2.add(jLabel6);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 167, 291, 409));

        jPanel1.setBackground(new java.awt.Color(239, 250, 252));

        btnCustomerManagement1.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomerManagement1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCustomerManagement1.setForeground(new java.awt.Color(32, 172, 210));
        btnCustomerManagement1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/customergui_vicuatoi.png"))); // NOI18N
        btnCustomerManagement1.setText("Ví của tôi");
        btnCustomerManagement1.setBorder(null);
        btnCustomerManagement1.setBorderPainted(false);
        btnCustomerManagement1.setDefaultCapable(false);
        btnCustomerManagement1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCustomerManagement1.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnCustomerManagement1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCustomerManagement1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerManagement1ActionPerformed(evt);
            }
        });

        btnCustomerManagement2.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomerManagement2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCustomerManagement2.setForeground(new java.awt.Color(32, 172, 210));
        btnCustomerManagement2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/customergui_chyentien.png"))); // NOI18N
        btnCustomerManagement2.setText("Chuyển tiền");
        btnCustomerManagement2.setBorder(null);
        btnCustomerManagement2.setBorderPainted(false);
        btnCustomerManagement2.setDefaultCapable(false);
        btnCustomerManagement2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCustomerManagement2.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnCustomerManagement2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCustomerManagement2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerManagement2ActionPerformed(evt);
            }
        });

        btnCustomerManagement3.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomerManagement3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCustomerManagement3.setForeground(new java.awt.Color(32, 172, 210));
        btnCustomerManagement3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/customergui_tietkiem.png"))); // NOI18N
        btnCustomerManagement3.setText("Tiết kiệm");
        btnCustomerManagement3.setBorder(null);
        btnCustomerManagement3.setBorderPainted(false);
        btnCustomerManagement3.setDefaultCapable(false);
        btnCustomerManagement3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCustomerManagement3.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnCustomerManagement3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCustomerManagement3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerManagement3ActionPerformed(evt);
            }
        });

        btnCustomerManagement4.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomerManagement4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCustomerManagement4.setForeground(new java.awt.Color(32, 172, 210));
        btnCustomerManagement4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/customergui_thanhtoan.png"))); // NOI18N
        btnCustomerManagement4.setText("Thanh toán");
        btnCustomerManagement4.setBorder(null);
        btnCustomerManagement4.setBorderPainted(false);
        btnCustomerManagement4.setDefaultCapable(false);
        btnCustomerManagement4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCustomerManagement4.setMargin(new java.awt.Insets(0, 14, 30, 14));
        btnCustomerManagement4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCustomerManagement4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerManagement4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCustomerManagement3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerManagement1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCustomerManagement2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerManagement4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCustomerManagement2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerManagement1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCustomerManagement3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerManagement4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1064, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        LogIn guiLogIn= new LogIn();
        guiLogIn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnCustomerManagement1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerManagement1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCustomerManagement1ActionPerformed

    private void btnCustomerManagement2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerManagement2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCustomerManagement2ActionPerformed

    private void btnCustomerManagement3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerManagement3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCustomerManagement3ActionPerformed

    private void btnCustomerManagement4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerManagement4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCustomerManagement4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerManagement1;
    private javax.swing.JButton btnCustomerManagement2;
    private javax.swing.JButton btnCustomerManagement3;
    private javax.swing.JButton btnCustomerManagement4;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

package banking.admin;

import banking.customer.checkBalance;
import banking.customer.deposit;
import banking.customer.withdraw;
import connection.connect;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class admindashboard extends javax.swing.JFrame {

    String name, B, phone, father, adhaar, address, pincode, ste, email, password, user, usertype, department;
    int adminno, accn;

    public admindashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jl = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("username");

        jLabel5.setText("admin number");

        jl.setAutoscrolls(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banking/admin/eaba0df644455e4209a1857829e45307.jpg"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jl, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setForeground(new java.awt.Color(153, 204, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(70, 18));
        jPanel2.setMinimumSize(new java.awt.Dimension(70, 18));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MAIN MENU");
        jLabel4.setToolTipText("");
        jLabel4.setMaximumSize(new java.awt.Dimension(80, 30));
        jLabel4.setPreferredSize(new java.awt.Dimension(70, 20));

        jButton1.setText("ADD NEW MEMBER");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("VIEW STAFF");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("VIEW CUSTOMER");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("log out");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        filler1.setBackground(new java.awt.Color(0, 0, 0));
        filler1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        filler1.setInheritsPopupMenu(true);

        jButton4.setText("SALARY");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("CHECK BALANCE");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("CHECK HISTORY");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("DEPOSIT");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("WITHDRAW");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("PROFILE");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                        .addGap(44, 44, 44))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(65, 65, 65)
                .addComponent(jButton6)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            addnewstaff as = new addnewstaff();
            as.setVisible(true);
            as.jLabel10.setText(jlabel.getText());
            as.jLabel14.setText(jl.getText());
            dispose();

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        connect cn = new connect();
        try {
            Statement stmt = cn.conn();
            String query1 = "select * from admin where admin_no='" + jl.getText() + "'";
            ResultSet rs = stmt.executeQuery(query1);
            adminData ad = new adminData();
            while (rs.next()) {

                if (rs.getString("usertype").equals("user")) {
                    ad.jButton2.setVisible(false);
                }
                ad.setVisible(true);
                ad.jLabel5.setText(jl.getText());
                ad.jLabel4.setText(jlabel.getText());
                dispose();

            }
            String query2 = "select * from admin";
            rs = stmt.executeQuery(query2);
            DefaultTableModel model = (DefaultTableModel) ad.jTable1.getModel();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("admin_no"), rs.getString("name"), rs.getString("phone_no"),
                    rs.getString("father"), rs.getString("address"), rs.getString("adhaar"), rs.getString("pincode"),
                    rs.getString("state"), rs.getString("email"), rs.getString("usertype")});
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        connect cn = new connect();
        try {
            Statement stmt = cn.conn();
            String query1 = "select * from admin where admin_no='" + jl.getText() + "'";
            ResultSet rs = stmt.executeQuery(query1);
            adminData ad = new adminData();
            while (rs.next()) {
                if (rs.getString("usertype").equals("user")) {
                    ad.jButton2.setVisible(false);
                }
                ad.setVisible(true);
                ad.jLabel5.setText(jl.getText());
                ad.jLabel4.setText(jlabel.getText());
                dispose();
            }
            String query2 = "select * from dashboard";
            rs = stmt.executeQuery(query2);
            DefaultTableModel model = (DefaultTableModel) ad.jTable1.getModel();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("Account_no"), rs.getString("name"), rs.getString("phone"),
                    rs.getString("father"), rs.getString("adhaar"), rs.getString("address"), rs.getString("pincode"),
                    rs.getString("state"), rs.getString("email"), rs.getString("balance")});
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        connect cn = new connect();

        try {
            Statement stmt = cn.conn();

            int result = JOptionPane.showConfirmDialog(this, "Do you really want to log out?", "warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            switch (result) {
                case JOptionPane.YES_OPTION -> {
                    JOptionPane.showMessageDialog(this, "you are succesfully logged out", "yayy", JOptionPane.INFORMATION_MESSAGE);
                    adminlogin al = new adminlogin();
                    al.setVisible(true);
                    dispose();
                }
                case JOptionPane.NO_OPTION -> {
                    String query2 = "select * from admin where admin_no='" + jl.getText() + "'";
                    ResultSet rs = stmt.executeQuery(query2);
                    while (rs.next()) {
                        admindashboard ad = new admindashboard();
                        ad.setVisible(true);
                        ad.jl.setText(jl.getText());
                        ad.jlabel.setText(jlabel.getText());

                        if ("user".equals(rs.getString("usertype"))) {
                            ad.jButton4.setVisible(false);
                        }
                        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                        String formattedDate = formatter.format(new java.util.Date());
                        ad.jLabel3.setText("DATE : " + formattedDate);
                        dispose();

                    }
                }
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {

            salary s = new salary();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String formattedDate = formatter.format(new Date());
            s.jLabel11.setText(formattedDate);
            s.setVisible(true);
            s.jLabel10.setText(jl.getText());
            s.jLabel9.setText(jlabel.getText());
            dispose();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        connect cn = new connect();
        try {
            Statement stmt = cn.conn();
            ResultSet rs = stmt.executeQuery("select * from admin where admin_no='" + jl.getText() + "'");
            while (rs.next()) {
                B = rs.getString("balance");
                checkBalance cb = new checkBalance();
                cb.setVisible(true);
                cb.jLabel3.setText("admin no");
                cb.jLabel7.setText(jl.getText());
                cb.jLabel6.setText(jlabel.getText());
                cb.jLabel5.setText(B);
                dispose();
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        connect cn = new connect();
        try {
            Statement stmt = cn.conn();
            administory h = new administory();
            DefaultTableModel model = (DefaultTableModel) h.jTable2.getModel();

            String query = "select * from admin where admin_no='" + jl.getText() + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                if (rs.getString("usertype").equals("user")) {
                    String query1 = "select DISTINCT date from administory where admin_no='" + jl.getText() + "' Group by date";
                    ResultSet rs1 = stmt.executeQuery(query1);
                    while (rs1.next()) {
                        h.jComboBox2.addItem(rs1.getString("date"));
                    }
                    String query2 = "select DISTINCT to_admin_no from administory where admin_no='" + jl.getText() + "' Group by to_admin_no";
                    ResultSet rs2 = stmt.executeQuery(query2);
                    while (rs2.next()) {
                        h.jComboBox3.addItem(rs2.getString("to_admin_no"));
                    }
                    String query3 = "select DISTINCT type from administory where admin_no='" + jl.getText() + "' Group by type";
                    ResultSet rs3 = stmt.executeQuery(query3);
                    while (rs3.next()) {
                        h.jComboBox1.addItem(rs3.getString("type"));
                    }

                    String queryy = "select * from administory where admin_no='" + jl.getText() + "'";
                    ResultSet rst = stmt.executeQuery(queryy);
                    while (rst.next()) {
                        model.addRow(new Object[]{rst.getString("admin_no"), rst.getString("date"), rst.getString("to_admin_no"), rst.getString("amount"), rst.getString("type")});
                        h.setVisible(true);
                        h.jLabel3.setText(jlabel.getText());
                        h.jLabel5.setText(jl.getText());
                        dispose();
                    }
                } else {
                    String query1 = "select DISTINCT date from administory where admin_no='" + jl.getText() + "' Group by date";
                    ResultSet rs1 = stmt.executeQuery(query1);
                    while (rs1.next()) {
                        h.jComboBox2.addItem(rs1.getString("date"));
                    }
                    String query2 = "select DISTINCT to_admin_no from administory where admin_no='" + jl.getText() + "' Group by to_admin_no";
                    ResultSet rs2 = stmt.executeQuery(query2);
                    while (rs2.next()) {
                        h.jComboBox3.addItem(rs2.getString("to_admin_no"));
                    }
                    String query3 = "select DISTINCT type from administory where admin_no='" + jl.getText() + "' Group by type";
                    ResultSet rs3 = stmt.executeQuery(query3);
                    while (rs3.next()) {
                        h.jComboBox1.addItem(rs3.getString("type"));
                    }
                    String query4 = "select * from administory";
                    ResultSet rss = stmt.executeQuery(query4);
                    while (rss.next()) {
                        model.addRow(new Object[]{rss.getString("admin_no"), rss.getString("date"), rss.getString("to_admin_no"), rss.getString("amount"), rss.getString("type")});
                        h.setVisible(true);
                        h.jLabel3.setText(jlabel.getText());
                        h.jLabel5.setText(jl.getText());
                        dispose();
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code her
        try {

            deposit d = new deposit();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String formattedDate = formatter.format(new Date());
            d.jLabel8.setText(formattedDate);
            d.setVisible(true);
            d.jLabel5.setText("admin no");
            d.jLabel7.setText(jl.getText());
            d.jLabel6.setText(jlabel.getText());
            dispose();

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        connect cn = new connect();
        try {
            Statement stmt = cn.conn();
            String query1 = "select * from admin where admin_no='" + jl.getText() + "'";
            ResultSet rs = stmt.executeQuery(query1);
            while (rs.next()) {
                withdraw w = new withdraw();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                String formattedDate = formatter.format(new Date());
                w.jLabel9.setText(formattedDate);
                accn = Integer.parseInt(rs.getString("admin_no"));
                user = rs.getString("email");
                w.setVisible(true);
                w.jLabel5.setText("admin no");
                w.jLabel7.setText(Integer.toString(accn));
                w.jLabel6.setText(user);
                dispose();
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        connect cn = new connect();
        try {

            Statement stmt = cn.conn();
            String query1 = "select * from admin where admin_no='" + jl.getText() + "'";
            ResultSet rs = stmt.executeQuery(query1);
            while (rs.next()) {
                name = rs.getString("name");
                phone = rs.getString("phone_no");
                father = rs.getString("father");
                adhaar = rs.getString("adhaar");
                address = rs.getString("address");
                pincode = rs.getString("pincode");
                ste = rs.getString("state");
                email = rs.getString("email");
                password = rs.getString("password");
                adminno = rs.getInt("admin_no");
                usertype = rs.getString("usertype");
                department = rs.getString("department");
                admin_details ud = new admin_details();
                ud.setVisible(true);
                ud.jLabel9.setText(name);
                ud.jLabel10.setText(phone);
                ud.jLabel13.setText(father);
                ud.jLabel14.setText(adhaar);
                ud.jLabel15.setText(address);
                ud.jLabel16.setText(pincode);
                ud.jLabel17.setText(ste);
                ud.jLabel19.setText(email);
                ud.jLabel20.setText(password);
                ud.jLabel22.setText(Integer.toString(adminno));
                ud.jLabel24.setText(usertype);
                ud.jLabel26.setText(department);

                dispose();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admindashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel jl;
    public javax.swing.JLabel jlabel;
    // End of variables declaration//GEN-END:variables
}

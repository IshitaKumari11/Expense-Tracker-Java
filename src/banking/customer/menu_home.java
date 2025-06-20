package banking.customer;

import banking.admin.admindashboard;
import connection.connect;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class menu_home extends javax.swing.JFrame {

    String name, B, phone, father, adhaar, address, pincode, ste, email, password, user;
    int account, accn;

    public menu_home() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jl = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        canvas2 = new java.awt.Canvas();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banking/c1d976cf2c1b2a66658715488a60fa16.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(235, 196));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("acc no");

        jl.setAutoscrolls(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jl, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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

        jButton1.setText("PROFILE");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("WITHDRAW");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DEPOSIT");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("CHECK BALANCE");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("LOG OUT ");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setText("CALCULATOR");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setText("TRANSFER");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("HISTORY");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(61, 61, 61)
                .addComponent(jButton6)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        connect cn = new connect();
        try {
            Statement stmt = cn.conn();
            String query1 = "select * from dashboard where Account_no='" + jl.getText() + "'";
            ResultSet rs = stmt.executeQuery(query1);
            while (rs.next()) {
                withdraw w = new withdraw();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                String formattedDate = formatter.format(new Date());
                w.jLabel9.setText(formattedDate);
                accn = Integer.parseInt(rs.getString("Account_no"));
                user = rs.getString("email");
                w.jLabel5.setText("acc no");
                w.setVisible(true);
                w.jLabel7.setText(Integer.toString(accn));
                w.jLabel6.setText(user);
                dispose();
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        connect cn = new connect();
        try {
            Statement stmt = cn.conn();
            String query1 = "select * from dashboard where Account_no='" + jl.getText() + "'";
            ResultSet rs = stmt.executeQuery(query1);
            deposit d = new deposit();
            while (rs.next()) {

                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                String formattedDate = formatter.format(new Date());
                d.jLabel8.setText(formattedDate);
                accn = Integer.parseInt(rs.getString("Account_no"));
                user = rs.getString("email");

                d.setVisible(true);
                d.jLabel5.setText("acc no");
                d.jLabel7.setText(Integer.toString(accn));
                d.jLabel6.setText(user);
                dispose();
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        connect cn = new connect();
        try {
            Statement stmt = cn.conn();

            ResultSet rs = stmt.executeQuery("select * from dashboard where Account_no='" + jl.getText() + "'");
            while (rs.next()) {
                int result = JOptionPane.showConfirmDialog(this, "Do you really want to log out?", "warning", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                switch (result) {
                    case JOptionPane.YES_OPTION -> {
                        JOptionPane.showMessageDialog(this, "you are succesfully logged out", "yayy", JOptionPane.INFORMATION_MESSAGE);
                        login l = new login();
                        l.setVisible(true);
                        dispose();
                    }
                    case JOptionPane.NO_OPTION -> {
                        menu_home h = new menu_home();
                        h.setVisible(true);
                        h.jl.setText(jl.getText());
                        h.jlabel.setText(jlabel.getText());
                        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                        String formattedDate = formatter.format(new java.util.Date());
                        h.jLabel3.setText("DATE : " + formattedDate);
                        dispose();
                    }
                }
            }
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        connect cn = new connect();
        try {

            Statement stmt = cn.conn();
            String query1 = "select * from dashboard where Account_no='" + jl.getText() + "'";
            ResultSet rs = stmt.executeQuery(query1);
            while (rs.next()) {
                name = rs.getString("name");
                phone = rs.getString("phone");
                father = rs.getString("father");
                adhaar = rs.getString("adhaar");
                address = rs.getString("address");
                pincode = rs.getString("pincode");
                ste = rs.getString("state");
                email = rs.getString("email");
                password = rs.getString("password");
                account = rs.getInt("Account_no");

                user_details ud = new user_details();
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
                ud.jLabel22.setText(Integer.toString(account));
                dispose();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        connect cn = new connect();
        try {
            Statement stmt = cn.conn();
            String query1 = "select * from dashboard where Account_no='" + jl.getText() + "'";
            ResultSet rs = stmt.executeQuery(query1);
            while (rs.next()) {
                accn = Integer.parseInt(rs.getString("Account_no"));
                user = rs.getString("email");
                NewJFrame8 cal = new NewJFrame8();
                cal.setVisible(true);
                cal.jLabel4.setText(Integer.toString(accn));
                cal.jLabel5.setText(user);
                dispose();
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        connect cn = new connect();
        try {
            Statement stmt = cn.conn();
            String query1 = "select * from dashboard where Account_no='" + jl.getText() + "'";
            ResultSet rs = stmt.executeQuery(query1);
            while (rs.next()) {
                accn = Integer.parseInt(rs.getString("Account_no"));
                user = rs.getString("email");
                B = rs.getString("balance");
                checkBalance cb = new checkBalance();
                cb.setVisible(true);
                cb.jLabel3.setText("acc no");
                cb.jLabel7.setText(Integer.toString(accn));
                cb.jLabel6.setText(user);
                cb.jLabel5.setText(B);
                dispose();
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        connect cn = new connect();
        try {
            Statement stmt = cn.conn();
            String query1 = "select * from dashboard where Account_no='" + jl.getText() + "'";
            ResultSet rs = stmt.executeQuery(query1);
            while (rs.next()) {
                transfer t = new transfer();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                String formattedDate = formatter.format(new Date());
                t.jLabel11.setText(formattedDate);
                accn = Integer.parseInt(rs.getString("Account_no"));
                user = rs.getString("email");

                t.setVisible(true);
                t.jLabel10.setText(Integer.toString(accn));
                t.jLabel9.setText(user);
                dispose();
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        connect cn = new connect();
        try {
            Statement stmt = cn.conn();
            history h = new history();
            String query2 = "select DISTINCT date from transaction where account_no='" + jl.getText() + "' Group by date";
            ResultSet rs1 = stmt.executeQuery(query2);
            while (rs1.next()) {
                h.jComboBox2.addItem(rs1.getString("date"));
            }
            String query3 = "select DISTINCT Transaction_type from transaction where account_no='" + jl.getText() + "' Group by Transaction_type";
            ResultSet rs2 = stmt.executeQuery(query3);
            while (rs2.next()) {
                h.jComboBox1.addItem(rs2.getString("Transaction_type"));
            }
            String query4 = "select DISTINCT to_account_no from transaction where account_no='" + jl.getText() + "' Group by to_account_no";
            ResultSet rs3 = stmt.executeQuery(query4);
            while (rs3.next()) {
                h.jComboBox3.addItem(rs3.getString("to_account_no"));
            }
            String query1 = "select * from transaction where account_no='" + jl.getText() + "'";
            ResultSet rs = stmt.executeQuery(query1);
            DefaultTableModel model = (DefaultTableModel) h.jTable2.getModel();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("Transaction_type"), rs.getString("date"), rs.getString("amount"), rs.getString("to_account_no")});
                h.setVisible(true);
                h.jLabel5.setText(jl.getText());
                h.jLabel3.setText(jlabel.getText());
                dispose();
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(menu_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_home().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private java.awt.Canvas canvas2;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel jl;
    public javax.swing.JLabel jlabel;
    // End of variables declaration//GEN-END:variables
}

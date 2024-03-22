import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class transfer_money extends javax.swing.JFrame {

    static int customer_id = 0;
    static long from_account = 0;
    static int branch_id = 0;
    long balance = 0;
    
    public transfer_money() {
        initComponents();
        
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
            PreparedStatement pst = con.prepareStatement("select * from account where customer_id = ?");
            pst.setInt(1, customer_id);
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                tf_from.setText(rs.getString("account_number"));
                tf_from.setEditable(false);
                from_account = Long.parseLong(rs.getString("account_number"));
                balance = Long.parseLong(rs.getString("balance"));
            }
            PreparedStatement pst1 = con.prepareStatement("select account_number from account");
            ResultSet rs1 = pst1.executeQuery();
            
            while(rs1.next())
            {
                 cb_account_number.addItem(rs1.getString("account_number"));
            }
        }
        
        catch(Exception ex)
        {
            System.out.println("Exception : "+ex);
        }
    }
    
    public transfer_money(int x) {
        customer_id = x;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tf_amount = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_from = new javax.swing.JTextField();
        cb_account_number = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transfer Money");
        setLocation(new java.awt.Point(270, 120));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Transfer Money ");
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("To");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 51, 0));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4jButton2ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 204, 204));
        jButton7.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 255));
        jButton7.setText("Proceed");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Amount");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        tf_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_amountActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("From");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cb_account_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_account_numberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(133, 133, 133)
                                .addComponent(cb_account_number, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(124, 124, 124)
                                    .addComponent(tf_from, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(250, 250, 250))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cb_account_number, tf_amount, tf_from});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_from, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_account_number, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton7))
                .addGap(65, 65, 65))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cb_account_number, tf_amount});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4jButton2ActionPerformed
        this.setVisible(false);
        new customer(customer_id);
        new customer().setVisible(true);
    }//GEN-LAST:event_jButton4jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      
       
         if(tf_amount.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill in every field");
        }
        else if( !(tf_amount.getText().matches("[0-9]+")) )
        {
            JOptionPane.showMessageDialog(null, "Please enter digits only");      
        }
     
        else
        {
          
            long amount = Long.parseLong(tf_amount.getText());
            String to_account = (String) cb_account_number.getSelectedItem();
           
            if(amount == 0)
                 {
                    JOptionPane.showMessageDialog(null, "Amount should be greater than 0");
                 }
              
             else if ( amount>50000)
                     {
                         JOptionPane.showMessageDialog(null, "Amount should be less than 50000");
                     }
            
             
              else
                 {
                try 
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
                    PreparedStatement pst = con.prepareStatement("select customer_id from account where account_number = ?");
                    pst.setString(1, to_account);
                    ResultSet rs = pst.executeQuery();
                    if(rs.next())
                    {
                        if(amount<=balance)
                        {
                            pst = con.prepareStatement("Update account set balance = ? where customer_id = ?");
                            pst.setLong(1, (balance-amount));
                            pst.setInt(2, customer_id);
                            pst.executeUpdate();

                            pst = con.prepareStatement("Update account set balance = ? where customer_id = ?");
                            pst.setLong(1, (balance+amount));
                            pst.setInt(2, Integer.parseInt(rs.getString("customer_id")));
                            pst.executeUpdate();

                            Date date = new Date();  
                            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
                            String strDate = formatter.format(date);  

                            pst = con.prepareStatement("insert into transaction(customer_id,mode,amount,date,to_id) values(?,?,?,?,?)");
                            pst.setInt(1, customer_id);
                            pst.setString(2, "Debited");
                            pst.setLong(3, amount);
                            pst.setString(4, strDate);
                            pst.setInt(5, Integer.parseInt(rs.getString("customer_id")));
                            pst.executeUpdate();

                            pst = con.prepareStatement("insert into transaction(customer_id,mode,amount,date,to_id) values(?,?,?,?,?)");
                            pst.setInt(1, Integer.parseInt(rs.getString("customer_id")));
                            pst.setString(2, "Credited");
                            pst.setLong(3, amount);
                            pst.setString(4, strDate);
                            pst.setInt(5, customer_id);
                            pst.executeUpdate();

                            JOptionPane.showMessageDialog(null, "Money Transferred : "+amount+"\nAvailable balance : "+(balance-amount));
                            this.setVisible(false);
                            new customer(customer_id);
                            new customer().setVisible(true);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Available amount is "+balance+"\nCannot transfer money");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Account number not found");
                    }
                    
                }
                catch(Exception ex)
                {
                    System.out.println("Exception : "+ex);
                }
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void cb_account_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_account_numberActionPerformed
        // TODO add your handling code here:
        String account_number = (String) cb_account_number.getSelectedItem();

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
            PreparedStatement pst = con.prepareStatement("select branch_id from account where account_number = ?");
            pst.setString(1, account_number);
            ResultSet rs = pst.executeQuery();

            if(rs.next())
            {
                branch_id = Integer.parseInt(rs.getString("branch_id"));
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception : "+ex);
        }
    }//GEN-LAST:event_cb_account_numberActionPerformed

    private void tf_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_amountActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

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
            java.util.logging.Logger.getLogger(transfer_money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transfer_money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transfer_money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transfer_money.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transfer_money().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_account_number;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tf_amount;
    private javax.swing.JTextField tf_from;
    // End of variables declaration//GEN-END:variables
}

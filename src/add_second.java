import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

public class add_second extends javax.swing.JFrame {

    static int branch_id = 0;
     static int customer_id = 1;
    public add_second() {
        initComponents();
        
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
            PreparedStatement pst = con.prepareStatement("select branch_name from branch");
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                cb_branch_name.addItem(rs.getString("branch_name"));
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception : "+ex);
        }
    }
      public add_second(int x){
             customer_id = x;
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cb_bank_name5 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cb_account_type = new javax.swing.JComboBox<>();
        cb_branch_name = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 120));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Account Details");
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cb_bank_name5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jaganath Limited Bank" }));
        cb_bank_name5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_bank_name5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Account Type");

        jLabel9.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Bank Name");

        jLabel10.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Branch Name");

        cb_account_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saving Account", "Current Account" }));
        cb_account_type.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cb_account_typeFocusGained(evt);
            }
        });
        cb_account_type.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_account_typeMouseClicked(evt);
            }
        });
        cb_account_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_account_typeActionPerformed(evt);
            }
        });

        cb_branch_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_branch_nameActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 0));
        jButton1.setText("Submit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_branch_name, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(cb_account_type, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(cb_bank_name5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(126, 126, 126))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_bank_name5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_branch_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(49, 49, 49)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_account_type, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(69, 69, 69)
                .addComponent(jButton1)
                .addGap(79, 79, 79))
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cb_bank_name5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_bank_name5ActionPerformed

    }//GEN-LAST:event_cb_bank_name5ActionPerformed

    private void cb_account_typeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cb_account_typeFocusGained

    }//GEN-LAST:event_cb_account_typeFocusGained

    private void cb_account_typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_account_typeMouseClicked

    }//GEN-LAST:event_cb_account_typeMouseClicked

    private void cb_account_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_account_typeActionPerformed

    }//GEN-LAST:event_cb_account_typeActionPerformed

    private void cb_branch_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_branch_nameActionPerformed

        String branch_name = (String) cb_branch_name.getSelectedItem();

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
            PreparedStatement pst = con.prepareStatement("select branch_id from branch where branch_name = ?");
            pst.setString(1, branch_name);
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

    }//GEN-LAST:event_cb_branch_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

               
     
        
        try 
        {  
               Date date = new Date(); 
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
                String strDate = formatter.format(date); 
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
                PreparedStatement pst1 = con.prepareStatement("insert into transfer(customer_id,mode,amount,date) values(?,?,?,?)");
               
                pst1.setInt(1, customer_id);
                pst1.setString(2, "Deposited");
                pst1.setString(3, "5000");
                pst1.setString(4, strDate);
              
                pst1.executeUpdate();
            
               PreparedStatement pst = con.prepareStatement("select * from customer");
               ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                customer_id++;
            }
        
            String name = add_first.name;
            String email = add_first.email;
            String password = add_first.password;
            String dob =add_first.dob;
            String pan_number =add_first.pan_number;
            String address =add_first.address;
            String mobile_number =add_first.mobile_number;
            String aadhar_number =add_first.aadhar_number;

            String account_type = (String) cb_account_type.getSelectedItem();

           
            Date temp = new Date();
            String opening_date = formatter.format(temp);
            
            long balance = 5000;
            
            Random rnd = new Random();
            int pin = rnd.nextInt(9999);
            
            Random random = new Random();    
            long account_number = (long) (1000000000L + random.nextFloat() * 9000000000L);
            long debit_card_no = (long) (1000000000000000L + random.nextFloat() * 9000000000000000L);
            
            pst = con.prepareStatement("insert into customer(customer_id,name,email,password,dob,address,mobile_number,aadhar_number,pan_number) values(?,?,?,?,?,?,?,?,?)");           
            pst.setInt(1, customer_id);
            pst.setString(2, name);
            pst.setString(3, email);
            pst.setString(4, password);
            pst.setString(5, dob);
            pst.setString(6, address);
            pst.setString(7, mobile_number);
            pst.setString(8, aadhar_number);
            pst.setString(9,pan_number);
            
            pst.executeUpdate();
            
            pst = con.prepareStatement("insert into account(account_number,balance,account_type,opening_date,debit_card_no,pin,customer_id,branch_id) values(?,?,?,?,?,?,?,?)");           
            pst.setLong(1, account_number);
            pst.setLong(2, balance);
            pst.setString(3, account_type);
            pst.setString(4, opening_date);
            pst.setLong(5, debit_card_no);
            pst.setInt(6, pin);
            pst.setInt(7, customer_id);
            pst.setInt(8, branch_id);
            pst.executeUpdate();
            
            

            
            
           
            
            JOptionPane.showMessageDialog(null, "Account Created Successfully");
            this.setVisible(false);
            new home().setVisible(true);
        }
        catch(Exception ex)
        {
            System.out.println("Exception : "+ex);
        }   
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
  
   
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(add_second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_second().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_account_type;
    private javax.swing.JComboBox<String> cb_bank_name5;
    private javax.swing.JComboBox<String> cb_branch_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    // End of variables declaration//GEN-END:variables
}
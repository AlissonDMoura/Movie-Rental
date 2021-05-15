/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentallab.windows;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import movierentallab.classes.Cart;

/**
 *
 * @author mvini
 */
public class Account extends javax.swing.JFrame {
private JFrame window;
Cart cart = new Cart();

private int receipt;

private int daychk;

    /**
     * Creates new form Account
     */
    public Account(JFrame window) {
    this.window = window;
    this.setTitle("Account");
    this.setLocationRelativeTo(null);   
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        goBackButton = new javax.swing.JButton();
        CustomerButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        GuestButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        goBackButton.setText("BACK");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        CustomerButton.setText("Already a Customer");
        CustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerButtonActionPerformed(evt);
            }
        });

        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        GuestButton.setText("Enter as a Guest");
        GuestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuestButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Register as a User, Login, or Enter basic payment information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(goBackButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GuestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 111, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(CustomerButton)
                .addGap(51, 51, 51)
                .addComponent(RegisterButton)
                .addGap(56, 56, 56)
                .addComponent(GuestButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(goBackButton)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        WindowCart sMovie = new WindowCart(window);
      
        sMovie.setVisible(true);
        sMovie.setLocationRelativeTo(null);
        sMovie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }//GEN-LAST:event_goBackButtonActionPerformed
// dispose actual window and open Frame SelectMovie
    private void CustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerButtonActionPerformed
        this.dispose();
        Customer sMovie = new Customer(window);
      
        sMovie.setVisible(true);
        sMovie.setLocationRelativeTo(null);
        sMovie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_CustomerButtonActionPerformed
//dispose this frame and open Frame for Customer Login page.
    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        
        this.dispose();
        Register sMovie = new Register(window);
      
        sMovie.setVisible(true);
        sMovie.setLocationRelativeTo(null);
        sMovie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_RegisterButtonActionPerformed
//dispose the actual windo and Open userRegister window
    private void GuestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuestButtonActionPerformed

    try {
        receipt = cart.MyCartNo();
        System.out.println("my Receipt is " + receipt);
        daychk = cart.PanelDays(1, receipt);
        System.out.println("dayChk is" + daychk);
        
        
        if(daychk < 2){
            daychk = cart.PanelDays(2, receipt);
        System.out.println("FIRST IF dayChk is" + daychk);}
        if(daychk < 2){
            daychk = cart.PanelDays(3, receipt);
        System.out.println("SECOND IF dayChk is" + daychk);}
        if(daychk < 2){
            daychk = cart.PanelDays(4, receipt);
        System.out.println("SECOND IF dayChk is" + daychk);}
        
        if(daychk >= 2){
            JOptionPane.showMessageDialog(this, "As a Guest you can only Rent movies for a maximun of 2 days, please register to proceed.");}
        else {
        this.dispose();
        Guest sMovie = new Guest(window);
      
        sMovie.setVisible(true);
        sMovie.setLocationRelativeTo(null);
        sMovie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  }     
        
        
    } catch (SQLException ex) {
        Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_GuestButtonActionPerformed
//Validates if any movies has more than 2 days, If no: opens the GuestRegister Page; If yes: message informing the amount of days is too big.
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
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerButton;
    private javax.swing.JButton GuestButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
//class fully commented;
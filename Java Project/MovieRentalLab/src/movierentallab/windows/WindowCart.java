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
import movierentallab.classes.Cart;

/**
 *
 * @author aliss
 */
public class WindowCart extends javax.swing.JFrame {

    private JFrame window;
    
    Cart cart = new Cart();
    
    private String mPanel1;
    private String mPanel2;
    private String mPanel3;
    private String mPanel4;
    
    private String mType1;
    private String mType2;
    private String mType3;
    private String mType4;
    
    private float fPrice1;
    private String Price1;
    private float fPrice2;
    private String Price2;
    private float fPrice3;
    private String Price3;
    private float fPrice4;
    private String Price4;
    
    private int idays1;
    private String days1;
    private int idays2;
    private String days2;
    private int idays3;
    private String days3;
    private int idays4;
    private String days4;
    
    private float ftotal1;
    private String total1;
    private float ftotal2;
    private String total2;
    private float ftotal3;
    private String total3;
    private float ftotal4;
    private String total4;
     
    public WindowCart(JFrame window) {
        
        this.window = window;
        this.setTitle("Xtra-Vision Cart");
        this.setLocationRelativeTo(null);   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  
        
        
        try {           
        this.mPanel1 = cart.PanelMovieName(1, cart.MyCartNo());        
        this.mType1 = cart.PanelType(1, cart.MyCartNo());
        this.fPrice1 = cart.PanelPrice(1, cart.MyCartNo());
        this.Price1 = Float.toString(fPrice1);
        this.idays1 = cart.PanelDays(1,cart.MyCartNo());
        this.days1 = Integer.toString(idays1);
        ftotal1 = this.idays1 * this.fPrice1;
        if(!days1.equals("0")){
        total1 = Float.toString(ftotal1);
        } else{ total1 = Price1;}
        //All Labels for Panel 1
        
        this.mPanel2 = cart.PanelMovieName(2, cart.MyCartNo()); 
        this.mType2 = cart.PanelType(2, cart.MyCartNo());
        this.fPrice2 = cart.PanelPrice(2, cart.MyCartNo());
        this.Price2 = Float.toString(fPrice2);
        this.idays2 = cart.PanelDays(2, cart.MyCartNo());
        this.days2 = Integer.toString(idays2);
        ftotal2 = this.idays2 * this.fPrice2;
        total2 = Float.toString(ftotal2);
        if(!days2.equals("0")){
        total2 = Float.toString(ftotal2);
        } else{ total2 = Price2;}
        
        //All Labels for Panel 2
        
        this.mPanel3 = cart.PanelMovieName(3, cart.MyCartNo());        
        this.mType3 = cart.PanelType(3, cart.MyCartNo());
        this.fPrice3 = cart.PanelPrice(3, cart.MyCartNo());
        this.Price3 = Float.toString(fPrice3);
        this.idays3 = cart.PanelDays(3, cart.MyCartNo());
        this.days3 = Integer.toString(idays3);
        ftotal3 = this.idays3 * this.fPrice3;
        total3 = Float.toString(ftotal3);
        if(!days3.equals("0")){
        total3 = Float.toString(ftotal3);
        } else{ total3 = Price3;}
        //All Labels for Panel 3
        
        this.mPanel4 = cart.PanelMovieName(4, cart.MyCartNo());        
        this.mType4 = cart.PanelType(4, cart.MyCartNo());
        this.fPrice4 = cart.PanelPrice(4, cart.MyCartNo());
        this.Price4 = Float.toString(fPrice4);
        this.idays4 = cart.PanelDays(4, cart.MyCartNo());
        this.days4 = Integer.toString(idays4);
        ftotal4 = this.idays4 * this.fPrice4;
        total4 = Float.toString(ftotal4);
        if(!days4.equals("0")){
        total4 = Float.toString(ftotal4);
        } else{ total4 = Price4;}
        //All Labels for Panel 4
        
        } catch (SQLException ex) {
            Logger.getLogger(WindowCart.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }
//Opens the window, Validate the prices for each movie with information from database and write the labelswith their respective information for different Types(Purchase or renting), 
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        deletePanel1 = new javax.swing.JButton();
        labelMovie1 = new javax.swing.JLabel();
        labelStatus1 = new javax.swing.JLabel();
        labelPrice1 = new javax.swing.JLabel();
        labelDays1 = new javax.swing.JLabel();
        labelTotal1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        deletePanel2 = new javax.swing.JButton();
        labelMovie2 = new javax.swing.JLabel();
        labelStatus2 = new javax.swing.JLabel();
        labelPrice2 = new javax.swing.JLabel();
        labelDays2 = new javax.swing.JLabel();
        labelTotal2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        deletePanel3 = new javax.swing.JButton();
        labelMovie3 = new javax.swing.JLabel();
        labelStatus3 = new javax.swing.JLabel();
        labelPrice3 = new javax.swing.JLabel();
        labelDays3 = new javax.swing.JLabel();
        labelTotal3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        deletePanel4 = new javax.swing.JButton();
        labelMovie4 = new javax.swing.JLabel();
        labelStatus4 = new javax.swing.JLabel();
        labelPrice4 = new javax.swing.JLabel();
        labelDays4 = new javax.swing.JLabel();
        labelTotal4 = new javax.swing.JLabel();
        labelTitleDays = new javax.swing.JLabel();
        labelTitleTotal = new javax.swing.JLabel();
        labelTitlePrice = new javax.swing.JLabel();
        labelTypePanel = new javax.swing.JLabel();
        labelTitlePanel = new javax.swing.JLabel();
        labelDelete = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        checkOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(860, 550));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setMaximumSize(new java.awt.Dimension(958, 7));
        jPanel3.setPreferredSize(new java.awt.Dimension(864, 78));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deletePanel1.setText("Delete");
        deletePanel1.setActionCommand("DELETE");
        deletePanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePanel1ActionPerformed(evt);
            }
        });
        jPanel3.add(deletePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        labelMovie1.setText(mPanel1);
        jPanel3.add(labelMovie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        labelStatus1.setText(mType1);
        jPanel3.add(labelStatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        labelPrice1.setText(Price1);
        jPanel3.add(labelPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        labelDays1.setText(days1);
        jPanel3.add(labelDays1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        labelTotal1.setText(total1);
        jPanel3.add(labelTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deletePanel2.setText("Delete");
        deletePanel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePanel2ActionPerformed(evt);
            }
        });
        jPanel4.add(deletePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        labelMovie2.setText(mPanel2);
        jPanel4.add(labelMovie2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        labelStatus2.setText(mType2);
        jPanel4.add(labelStatus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        labelPrice2.setText(Price2);
        jPanel4.add(labelPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        labelDays2.setText(days2);
        jPanel4.add(labelDays2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        labelTotal2.setText(total2);
        jPanel4.add(labelTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(821, 78));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deletePanel3.setText("Delete");
        deletePanel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePanel3ActionPerformed(evt);
            }
        });
        jPanel6.add(deletePanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        labelMovie3.setText(mPanel3);
        jPanel6.add(labelMovie3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        labelStatus3.setText(mType3);
        jPanel6.add(labelStatus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        labelPrice3.setText(Price3);
        jPanel6.add(labelPrice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        labelDays3.setText(days3);
        jPanel6.add(labelDays3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        labelTotal3.setText(total3);
        jPanel6.add(labelTotal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(808, 78));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deletePanel4.setText("Delete");
        deletePanel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePanel4ActionPerformed(evt);
            }
        });
        jPanel5.add(deletePanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        labelMovie4.setText(mPanel4);
        jPanel5.add(labelMovie4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 173, -1));

        labelStatus4.setText(mType4);
        jPanel5.add(labelStatus4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        labelPrice4.setText(Price4);
        jPanel5.add(labelPrice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        labelDays4.setText(days4);
        jPanel5.add(labelDays4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        labelTotal4.setText(total4);
        jPanel5.add(labelTotal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        labelTitleDays.setText("Days");

        labelTitleTotal.setText("Total");

        labelTitlePrice.setText("Price");

        labelTypePanel.setText("Buying/Renting");

        labelTitlePanel.setText("Movie");

        labelDelete.setText("Delete from Cart");

        messageLabel.setText("As a guest you pay the full amount and you can be refunded at your DVD return");

        backButton.setText("BACK");
        backButton.setToolTipText("");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        checkOutButton.setText("CHECK OUT");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDelete)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(messageLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(labelTitlePanel)
                        .addGap(121, 121, 121)
                        .addComponent(labelTypePanel)
                        .addGap(110, 110, 110)
                        .addComponent(labelTitleDays)
                        .addGap(109, 109, 109)
                        .addComponent(labelTitlePrice)
                        .addGap(95, 95, 95)
                        .addComponent(labelTitleTotal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkOutButton)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(messageLabel)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelTitleDays)
                        .addComponent(labelTypePanel)
                        .addComponent(labelTitlePanel)
                        .addComponent(labelDelete)
                        .addComponent(labelTitlePrice)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkOutButton)
                    .addComponent(backButton))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        this.dispose();
        SelectMovie sMovie = new SelectMovie(window);

        sMovie.setVisible(true);
        sMovie.setLocationRelativeTo(null);
        sMovie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_backButtonActionPerformed
//Dispose the actual window and opens a new frame for selectMovie
    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        this.dispose();
        Account sMovie = new Account(window);

        sMovie.setVisible(true);
        sMovie.setLocationRelativeTo(null);
        sMovie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_checkOutButtonActionPerformed
// dispose the actual window and opens the CheckOut Frame.
    private void deletePanel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePanel4ActionPerformed
        try {
            cart.RemoveFromCart(4);
        } catch (SQLException ex) {Logger.getLogger(WindowCart.class.getName()).log(Level.SEVERE, null, ex);}

        this.dispose();
        WindowCart wCart = new WindowCart(window);
        wCart.setVisible(true);
        wCart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wCart.setLocationRelativeTo(null);
    }//GEN-LAST:event_deletePanel4ActionPerformed
// Delete information from Cart in Panel 4, dispose this window and open it again for information refresh.
    private void deletePanel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePanel3ActionPerformed
        try {
            cart.RemoveFromCart(3);
        } catch (SQLException ex) {Logger.getLogger(WindowCart.class.getName()).log(Level.SEVERE, null, ex);}

        this.dispose();
        WindowCart wCart = new WindowCart(window);
        wCart.setVisible(true);
        wCart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wCart.setLocationRelativeTo(null);
    }//GEN-LAST:event_deletePanel3ActionPerformed
// Delete information from Cart in Panel 3, dispose this window and open it again for information refresh.
    private void deletePanel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePanel2ActionPerformed
        try {
            cart.RemoveFromCart(2);
        } catch (SQLException ex) {Logger.getLogger(WindowCart.class.getName()).log(Level.SEVERE, null, ex);}

        this.dispose();
        WindowCart wCart = new WindowCart(window);
        wCart.setVisible(true);
        wCart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wCart.setLocationRelativeTo(null);
    }//GEN-LAST:event_deletePanel2ActionPerformed
// Delete information from Cart in Panel 2, dispose this window and open it again for information refresh.
    private void deletePanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePanel1ActionPerformed
        try {
            cart.RemoveFromCart(1);
        } catch (SQLException ex) {Logger.getLogger(WindowCart.class.getName()).log(Level.SEVERE, null, ex);}

        this.dispose();
        WindowCart wCart = new WindowCart(window);
        wCart.setVisible(true);
        wCart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wCart.setLocationRelativeTo(null);
    }//GEN-LAST:event_deletePanel1ActionPerformed
// Delete information from Cart in Panel 1, dispose this window and open it again for information refresh.
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
            java.util.logging.Logger.getLogger(WindowCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JButton deletePanel1;
    private javax.swing.JButton deletePanel2;
    private javax.swing.JButton deletePanel3;
    private javax.swing.JButton deletePanel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelDays1;
    private javax.swing.JLabel labelDays2;
    private javax.swing.JLabel labelDays3;
    private javax.swing.JLabel labelDays4;
    private javax.swing.JLabel labelDelete;
    private javax.swing.JLabel labelMovie1;
    private javax.swing.JLabel labelMovie2;
    private javax.swing.JLabel labelMovie3;
    private javax.swing.JLabel labelMovie4;
    private javax.swing.JLabel labelPrice1;
    private javax.swing.JLabel labelPrice2;
    private javax.swing.JLabel labelPrice3;
    private javax.swing.JLabel labelPrice4;
    private javax.swing.JLabel labelStatus1;
    private javax.swing.JLabel labelStatus2;
    private javax.swing.JLabel labelStatus3;
    private javax.swing.JLabel labelStatus4;
    private javax.swing.JLabel labelTitleDays;
    private javax.swing.JLabel labelTitlePanel;
    private javax.swing.JLabel labelTitlePrice;
    private javax.swing.JLabel labelTitleTotal;
    private javax.swing.JLabel labelTotal1;
    private javax.swing.JLabel labelTotal2;
    private javax.swing.JLabel labelTotal3;
    private javax.swing.JLabel labelTotal4;
    private javax.swing.JLabel labelTypePanel;
    private javax.swing.JLabel messageLabel;
    // End of variables declaration//GEN-END:variables
}
//class fully commented
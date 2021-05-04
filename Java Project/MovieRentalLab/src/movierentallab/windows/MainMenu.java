/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentallab.windows;

import javax.swing.JFrame;

/**
 *
 * @author aliss
 */
public class MainMenu extends javax.swing.JPanel {

    private JFrame window;
    /**
     * Creates new form MainMenu
     */
    
    
    public MainMenu(JFrame window) {
        this.window = window;
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
        rentMbutton = new javax.swing.JButton();
        returnMbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(860, 550));

        rentMbutton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rentMbutton.setText("Rent a Movie");
        rentMbutton.setToolTipText("Click to Rent");
        rentMbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rentMbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rentMbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentMbuttonActionPerformed(evt);
            }
        });

        returnMbutton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        returnMbutton.setText("Return a Movie");
        returnMbutton.setToolTipText("Click to return an order");
        returnMbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        returnMbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnMbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnMbuttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Welcome to Xtra-Vision Kiosk.");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Please choose one option");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(rentMbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(returnMbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentMbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnMbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rentMbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentMbuttonActionPerformed
        
////        
////        //SELECT MOVIE BUTTON
//        SelectMovie sMovie = new SelectMovie(window);
//        window.dispose();
//        sMovie.setVisible(true);
//        sMovie.setBounds(0, 0, 860, 550);
//        sMovie.setLocationRelativeTo(null);
//        sMovie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        //Dispose the actual window and open a new JFRAME for SelectMovies, Set the defoult close operation.
        
        //SELECT MOVIE BUTTON
        
        CheckOut sMovie = new CheckOut(window);
        window.dispose();
        sMovie.setVisible(true);
        sMovie.setLocationRelativeTo(null);
        sMovie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }//GEN-LAST:event_rentMbuttonActionPerformed

    private void returnMbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnMbuttonActionPerformed
        
        //RETURN MOVIE BUTTON
         ReturnMovie rMovie = new ReturnMovie(window);
        window.dispose();
        rMovie.setVisible(true);
        rMovie.setBounds(0, 0, 860, 550);
        rMovie.setLocationRelativeTo(null);
        rMovie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Dispose the actual window and open a new JFRAME for SelectMovies, Set the defoult close operation.
        
        
    }//GEN-LAST:event_returnMbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton rentMbutton;
    private javax.swing.JButton returnMbutton;
    // End of variables declaration//GEN-END:variables
}

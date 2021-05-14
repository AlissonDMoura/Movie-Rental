/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentallab;


import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import movierentallab.classes.Cart;
import movierentallab.classes.Connector;
import movierentallab.windows.MainMenu;




/**
 *
 * @author aliss
 */
public class MovieRentalLab extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        
            
        JFrame window = new JFrame("Xtra-Vision");
        window.setBounds(0, 0, 860, 550);
        window.setLocationRelativeTo(null);

        
        MainMenu menu = new MainMenu(window);
        window.add(menu);
        window.validate();
        window.repaint();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
        Cart lala = new Cart ();
      
        System.out.println(lala.EnterAsGuest("1234123412341234","E@Mail", 123, "12/11"));
        
        
        
        
        
              
     }
    
    
    
}

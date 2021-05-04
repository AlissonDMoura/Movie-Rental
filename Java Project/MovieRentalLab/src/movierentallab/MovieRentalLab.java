/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentallab;


import java.sql.SQLException;
import javax.swing.JFrame;
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
    
        Connector conn = new Connector();
        System.out.println(conn.equals(conn));
        
        
        
        System.out.println(conn.getMovieStock("Shrek"));
        
        
        
        
        JFrame window = new JFrame("X-tra Vision");
        window.setBounds(0, 0, 860, 550);
        window.setLocationRelativeTo(null);

        MainMenu menu = new MainMenu(window);
        window.add(menu);
        window.validate();
        window.repaint();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
        
        
              
     }
    
    
    
}

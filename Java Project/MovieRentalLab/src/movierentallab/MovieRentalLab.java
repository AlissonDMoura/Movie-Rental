/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentallab;


import javax.swing.JFrame;
import movierentallab.classes.Connection;
import movierentallab.windows.MainMenu;




/**
 *
 * @author aliss
 */
public class MovieRentalLab extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Connection conn = new Connection();
        System.out.println(conn.equals(conn));
        //Connection Checker
        
        
        JFrame window = new JFrame("X-tra Vision");
        window.setBounds(200, 200, 860, 550);

        MainMenu menu = new MainMenu(window);
        window.add(menu);
        window.validate();
        window.repaint();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
        
        
              
     }
    
    
    
}

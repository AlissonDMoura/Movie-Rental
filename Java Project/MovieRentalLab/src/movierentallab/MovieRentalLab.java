/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentallab;

import javax.swing.JFrame;
import movierentallab.windows.Account;
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
    
        
        JFrame window = new JFrame();
        window.setVisible(true);
        
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        
        window.add(menu);
        
        
        
              
     }
    
    
    
}

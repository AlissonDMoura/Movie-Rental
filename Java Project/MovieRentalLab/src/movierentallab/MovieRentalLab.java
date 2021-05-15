/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentallab;


import java.sql.SQLException;
import javax.swing.JFrame;
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
        
        //Every class, method or Action is commented at the end of the method/class/Action to keep the code clean
        //the blocks are divided by functions, these functions will be explained in order in the comment at the botton
            
        JFrame window = new JFrame("Xtra-Vision");
        window.setBounds(0, 0, 860, 550);
        window.setLocationRelativeTo(null);

        
        MainMenu menu = new MainMenu(window);
        window.add(menu);
        window.validate();
        window.repaint();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
        
        
     }//Inform the lecturer about comment structure, opens a new frame ans set sizes. Create an stance of the Menu window Class and place it into the frame. validate and open the frame with exite closeOperation.
    
    
    
}// Class fully commented.

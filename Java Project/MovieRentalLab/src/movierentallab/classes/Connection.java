/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentallab.classes;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aliss
 */
public class Connection {
    
            private static final String URL = "jdbc:mysql://52.50.23.197:3306/Marcos_2019146?useSSL=false";
            private static final String USER = "Marcos_2019146";
            private static final String PASS = "2019146";
            
    public static Connection getConnection(){
                            
                
                try {                           
                    //connects to the database, return a message confirming it was successful, and return the connection
                    
                    Connection conn = (Connection) DriverManager.getConnection(URL, USER, PASS);
                    System.out.println("Retrieving data");
                    return conn;
                    
                                        
                                        
                    //catch error and report the connection wasn't stabilished.
                } catch (SQLException ex) {
                    throw new RuntimeException("Error Connecting", ex);
                }
                
            }
            //connect into the database for further queries.

}
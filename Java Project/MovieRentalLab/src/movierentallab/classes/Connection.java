/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentallab.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aliss
 */
public class Connection {
    
            private static final String URL = "jdbc:mysql://52.50.23.197:3306/-----------------?useSSL=false";
            private static final String USER = "----------------";
            private static final String PASS = "----------------";
            
            
    
    public static java.sql.Connection getConnection(){
                            
                
                try {                           
                    //connects to the database, return a message confirming it was successful, and return the connection
                    
                    java.sql.Connection conn = DriverManager.getConnection(URL, USER, PASS);
                    System.out.println("Retrieving data");
                    return conn;                                                            
                    //catch error and report the connection wasn't stabilished.
                } catch (SQLException ex) {throw new RuntimeException("Error Connecting", ex);}                
            }
    
    
    
    
}
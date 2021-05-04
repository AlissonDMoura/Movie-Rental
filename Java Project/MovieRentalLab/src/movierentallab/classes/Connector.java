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


/**
 *
 * @author aliss
 */
public class Connector {
    
            //Private strings that cannot changed (final), to be accessed by our connector. protects information.
            private static final String URL = "jdbc:mysql://52.50.23.197:3306/Marcos_2019146?useSSL=false";
            private static final String USER = "Marcos_2019146";
            private static final String PASS = "2019146";
            
            
             public Connection getConnection(){
                            
                
                try {                           
                    //connects to the database, return a message confirming it was successful, and return the connection
                    
                    Connection conn = DriverManager.getConnection(URL, USER, PASS);
                    System.out.println("Retrieving data");
                    return conn;
                                                           
                                        
                    //catch error and report the connection wasn't stabilished.
                } catch (SQLException ex) {
                    throw new RuntimeException("Error Connecting", ex);
                }
                
            }
            
     public String getMovieInfo(String movieName) throws SQLException{
                                         
                    String movieInfo= "";
         
                    Statement selector;              
                    selector = getConnection().createStatement();
                
                    //Check a name and fetch the movie info.
                    ResultSet eInfo;               
                    eInfo = selector.executeQuery("Select movieInfo from movie where title = '" + movieName +"'");
                    while(eInfo.next()){
                        movieInfo = eInfo.getString(1);                    }
                    System.out.println("Movie info Saved for " + movieName);
               
                    return movieInfo;  } 
     // Returns the movie info section from a movie.
     
      public int getMovieStock(String movieName) throws SQLException{
          
                    String query = "SELECT Count(*) from movie where title = ? and status ='In stock';";
                    //Query protected by an `?` 
                    PreparedStatement ps = getConnection().prepareStatement(query);
                    ps.setString(1, movieName);
                    //set the "?" to the variable wanted.
                    int movieStock = 0;
                    //Check a name and fetch the movie info.
                    
                    ResultSet rs;
                    rs = ps.executeQuery();
                    rs.next();
                    
                    movieStock =rs.getInt(1);
                    
                                             
                    System.out.println("Total in stock for " + movieName + " is " + movieStock);
               
                    return movieStock;  }    //Returns the number of movies with same title that holds status "in stock"
      
      
public int getMovieId(String movieName) throws SQLException{

                    String query = "SELECT idMovie FROM movie where status = 'In stock' AND title = '" + movieName +"'";
                    Statement selector = getConnection().createStatement();
                    ResultSet eId = selector.executeQuery(query);
                    
                    int movieId = eId.getInt(1);
                    System.out.println("This is your ID for "+movieName+ " "+ movieId);
                    return movieId;
} // Return the first movie iD with status in stock.
          
          
      }
    

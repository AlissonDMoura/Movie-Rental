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
                
            }// Connects into the dataBase
            
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
               
                    return movieInfo;  }   // Returns the movie info section from a movie.
     
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

public int getMoviesRented(String mName) throws SQLException{
    
                    String query = "SELECT Count(*) from movie where title = ? and status ='Rented';";
                    //Query protected by an `?` 
                    PreparedStatement ps = getConnection().prepareStatement(query);
                    ps.setString(1, mName);
                    //set the "?" to the variable wanted.
                    //Check a name and fetch the movie info.
                    
                    ResultSet rs;
                    rs = ps.executeQuery();
                    rs.next();
                    
                    int moviesRented =rs.getInt(1);
                    
                                             
                    System.out.println("Total movies Rented for " + mName + " is " + moviesRented);
                    return moviesRented;}// Returns the amount of movies rented

public int getSoldMovies(String mName) throws SQLException{
    
                    String query = "SELECT Count(*) from movie where title = ? and status ='Sold';";
                    //Query protected by an `?` 
                    PreparedStatement ps = getConnection().prepareStatement(query);
                    ps.setString(1, mName);
                    //set the "?" to the variable wanted.
                    //Check a name and fetch the movie info.
                    
                    ResultSet rs;
                    rs = ps.executeQuery();
                    rs.next();
                    
                    int soldMovies =rs.getInt(1);
                    
                                             
                    System.out.println("Total Sold movies for " + mName + " is " + soldMovies);
                    return soldMovies;}//Return the amount of sold movies for a certain title.

public int getMovieId(String movieName) throws SQLException{

                    String query = "SELECT idMovie FROM movie where status = 'In stock' AND title = '" + movieName +"'";
                    Statement selector = getConnection().createStatement();
                    ResultSet eId = selector.executeQuery(query);
                    
                    int movieId = eId.getInt(1);
                    System.out.println("This is your ID for "+movieName+ " "+ movieId);
                    return movieId;
} // Return the first movie iD with status in stock.
                
public String getMovieStatus(int movieId) throws SQLException{
                    String query = "SELECT status FROM movie where idMovie = " + movieId +";";
                    Statement selector = getConnection().createStatement();
                    ResultSet eStatus = selector.executeQuery(query);
                    
                    String mStatus = eStatus.getString(1);
                    System.out.println("movie iD "+movieId+ " Status is "+ mStatus);
                    return mStatus;}// Return the Status of a Specific movie with a certain ID.

public String getMovieTitle(int movieId) throws SQLException{
                    String query = "SELECT title FROM movie where idMovie = " + movieId +";";
                    Statement selector = getConnection().createStatement();
                    ResultSet eTitle = selector.executeQuery(query);
                    
                    String mTitle = eTitle.getString(1);
                    System.out.println("movie ID "+ movieId+ " is Registered as  "+ mTitle); 
                    return mTitle;} //Return the title registerd under a certain ID.

public float getMovieRentPrice(String mName) throws SQLException{
                    String query = "SELECT priceRent FROM movie where title = '" + mName +"';";
                    Statement selector = getConnection().createStatement();
                    ResultSet ePrice = selector.executeQuery(query);
                    
                    float mRent = ePrice.getFloat(1);
                    System.out.println("movie "+ mName + " Costs "+ mRent + " per day."); 
                    return mRent; }// Return the daily price of a movie.

public float getMovieBuyPrice(String mName) throws SQLException{
                    String query = "SELECT priceBuy FROM movie where title = '" + mName +"';";
                    Statement selector = getConnection().createStatement();
                    ResultSet ePrice = selector.executeQuery(query);
                    
                    float mBuy = ePrice.getFloat(1);
                    System.out.println("movie "+ mName + " Costs "+ mBuy ); 
                    return mBuy; }// Return the total price of a movie
     


}
    

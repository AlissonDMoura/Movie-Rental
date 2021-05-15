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
            
            Connection conn;
            
            
public Connection getConnection() throws SQLException{
            try{
                    conn = DriverManager.getConnection(URL, USER, PASS);
                    System.out.println("Retrieving data");
                    return conn;
                    //connects to the database, return a message confirming it was successful, and return the connection                                       
                    
               }
                catch (SQLException ex) {
                    throw new RuntimeException("Error Connecting", ex);               }
                          //catch error and report the connection wasn't stabilished.
            }// Connects into the dataBase with credentials and returns a connection. - TESTED
            
public String getMovieInfo(String movieName) throws SQLException{
                    String movieInfo= "";
                    
                    Statement selector;              
                    selector = getConnection().createStatement();
                    ResultSet eInfo;               
                    eInfo = selector.executeQuery("Select movieInfo from movie where title = '" + movieName +"'");
                    //Create a statement connection and a resultSet cursor and execute a query to select movieInfo from database
                    
                    if(eInfo.next()){
                    movieInfo = eInfo.getString(1);                    }
                    System.out.println("Movie info Saved for " + movieName);
                    eInfo.close();
                    selector.close();
                    CloseConnection();                    
                    //save the selected string into the String movieInfo, close all connections and return the movieInfo String.
                    
                    return movieInfo;  }   // Returns the movie info section from a movie. - TESTED
     
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
                    //collects the information in database and save the in into a variable.
                    
                    rs.close();
                    ps.close();
                    CloseConnection();
                    return movieStock;  }    //Returns the number of movies with same title that holds status "in stock" - NOT IMPLEMENTED

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
                    
                    rs.close();
                    ps.close();
                    CloseConnection();
                    return moviesRented;}// Returns the amount of movies rented - NOT IMPLEMENTED

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
                    
                    rs.close();
                    ps.close();
                    CloseConnection();
                    return soldMovies;}//Return the amount of sold movies for a certain title. - NOT IMPLEMENTED

public int getMovieId(String movieName) throws SQLException{

                    String query = "SELECT idMovie FROM movie where status = 'In stock' AND title = '" + movieName +"'";
                    Statement selector = getConnection().createStatement();
                    ResultSet eId = selector.executeQuery(query);
                    
                    int movieId = eId.getInt(1);
                    System.out.println("This is your ID for "+movieName+ " "+ movieId);
                    
                    eId.close();
                    selector.close();
                    CloseConnection();
                    return movieId;
} // Return the first movieiD with status in stock from Database. - TESTED
                
public String getMovieStatus(int movieId) throws SQLException{
                    String query = "SELECT status FROM movie where idMovie = " + movieId +";";
                    Statement selector = getConnection().createStatement();
                    ResultSet eStatus = selector.executeQuery(query);
                    
                    String mStatus = eStatus.getString(1);
                    System.out.println("movie iD "+movieId+ " Status is "+ mStatus);
                    
                    eStatus.close();
                    selector.close();
                    CloseConnection();
                    return mStatus;}// Return the Status of a Specific movie with a certain ID. - TESTED

public String getMovieTitle(int movieId) throws SQLException{
                    String query = "SELECT title FROM movie where idMovie = " + movieId +";";
                    Statement selector = getConnection().createStatement();
                    ResultSet eTitle = selector.executeQuery(query);
                    
                    String mTitle = eTitle.getString(1);
                    System.out.println("movie ID "+ movieId+ " is Registered as  "+ mTitle); 
                    
                    eTitle.close();
                    selector.close();
                    CloseConnection();
                    return mTitle;} //Return the title registerd under a certain ID. - TESTED

public float getMovieRentPrice(String mName) throws SQLException{
                    String query = "SELECT priceRent FROM movie where title = '" + mName +"';";
                    Statement selector = getConnection().createStatement();
                    ResultSet ePrice = selector.executeQuery(query);
                    
                    float mRent = ePrice.getFloat(1);
                    System.out.println("movie "+ mName + " Costs "+ mRent + " per day."); 
                    
                    ePrice.close();
                    selector.close();
                    CloseConnection();
                    return mRent; }// Return the daily price of a movie. - TESTED

public float getMovieBuyPrice(String mName) throws SQLException{
                    String query = "SELECT priceBuy FROM movie where title = '" + mName +"';";
                    Statement selector = getConnection().createStatement();
                    ResultSet ePrice = selector.executeQuery(query);
                    
                    float mBuy = ePrice.getFloat(1);
                    System.out.println("movie "+ mName + " Costs "+ mBuy ); 
                    
                    ePrice.close();
                    selector.close();
                    CloseConnection();
                    return mBuy; }// Return the total price of a movie - TESTED

public void CloseConnection() throws SQLException{
    
    if(!conn.isClosed()){
        conn.close();}
    
}//Verify if is there a connection open, if it's open, closes the connection.

}//Class Fully commented.
    

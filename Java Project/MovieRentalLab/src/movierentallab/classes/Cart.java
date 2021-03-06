/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentallab.classes;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aliss
 */


public class Cart {
    
    private long diff;
    
    private String specialQuery;
    private String cartState;
    private String mName1;
    private String mName2;
    private String mName3;
    private String mName4;
    private String closestReturn;
    private String return1;
    private String return2;
    private String return3;
    private String return4;
    private String Type1;
    private String Type2;
    private String Type3;
    private String Type4;
    private String title;
    private String status;
    private String userEmail;
    private String priceBuy;
    private String priceRent;
    private String userName;
    
    
    private float price1;
    private float price2;
    private float price3;
    private float price4;
    private float total1;
    private float total2;
    private float total3;
    private float total4;
    private float pBuy;
    private float pRent;
    private float lab;
    
    
    private int receipt;
    private int Item1;
    private int Item2;
    private int Item3;
    private int Item4;
    private int checkOutReceipt;
    private int day;
    private int day1;
    private int day2;
    private int day3;
    private int day4;
    private int smaller;
    private int movieId;
    
    private boolean cartFull;
    private boolean isNewUser;
    
    Connector conn = new Connector();
    
    
    public int NextReceiptNumber() throws SQLException{
                    String query = "SELECT receipt FROM cart;";
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);
                    
                     while(rs.next()){
                        receipt = rs.getInt(1);
                        receipt++;                    }
                     
                    System.out.println("This is my Next ID:" + receipt);
                    
                    rs.close();
                    selector.close();
                    conn.conn.close();
                    return receipt;}//return the next valid writable receipt number - TESTED

    public void CartOrganizer(int receipt) throws SQLException{
                    
                            
                    String query = "SELECT Item1 FROM cart Where receipt = " + receipt + ";";
                    String query2 = "SELECT Type1 FROM cart Where receipt = " + receipt + ";";
                    String query3 = "SELECT Item2 FROM cart Where receipt = " + receipt + ";";
                    String query4 = "SELECT Type2 FROM cart Where receipt = " + receipt + ";";
                    String query5 = "SELECT Item3 FROM cart Where receipt = " + receipt + ";";
                    String query6 = "SELECT Type3 FROM cart Where receipt = " + receipt + ";";
                    String query7 = "SELECT Item4 FROM cart Where receipt = " + receipt + ";";
                    String query8 = "SELECT Type4 FROM cart Where receipt = " + receipt + ";";
                    String query9 = "SELECT Days1 FROM cart Where receipt = " + receipt + ";";
                    String query10 = "SELECT Days2 FROM cart Where receipt = " + receipt + ";";
                    String query11 = "SELECT Days3 FROM cart Where receipt = " + receipt + ";";
                    String query12 = "SELECT Days4 FROM cart Where receipt = " + receipt + ";";
                    
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);
                    if(rs.next()){                        
                        this.Item1 = rs.getInt(1);}
                    selector.close();
                    rs.close();
                    conn.conn.close();
                    
                    selector = conn.getConnection().createStatement();
                    ResultSet rs2 = selector.executeQuery(query2);
                    if(rs2.next()){                        
                        this.Type1 = rs2.getString(1);}
                    selector.close();
                    rs2.close();
                    conn.conn.close();
                    
                    
                    selector = conn.getConnection().createStatement();
                    ResultSet rs9 = selector.executeQuery(query9);
                    if(rs9.next()){                        
                        this.day1 = rs9.getInt(1);}
                    selector.close();
                    rs9.close();
                    conn.conn.close();
                    //CART POSITION ONE
                    
                    selector = conn.getConnection().createStatement();
                    ResultSet rs3 = selector.executeQuery(query3);
                    if(rs3.next()){                        
                        this.Item2 = rs3.getInt(1);}
                    selector.close();
                    rs3.close();
                    conn.conn.close();
                    
                    selector = conn.getConnection().createStatement();
                    ResultSet rs4 = selector.executeQuery(query4);
                    if(rs4.next()){                        
                        this.Type2 = rs4.getString(1);}
                    selector.close();
                    rs4.close();
                    conn.conn.close();
                    
                    selector = conn.getConnection().createStatement();
                    ResultSet rs10 = selector.executeQuery(query10);
                    if(rs10.next()){
                        this.day2 = rs10.getInt(1);}
                    selector.close();
                    rs10.close();
                    conn.conn.close();
                    
                    //CART POSITION two                    
                    
                    selector = conn.getConnection().createStatement();
                    ResultSet rs5 = selector.executeQuery(query5);
                    if(rs5.next()){                        
                        this.Item3 = rs5.getInt(1);}
                    selector.close();
                    rs5.close();
                    conn.conn.close();
                    
                    selector = conn.getConnection().createStatement();
                    ResultSet rs6 = selector.executeQuery(query6);
                    if(rs6.next()){
                        this.Type3 = rs6.getString(1);}
                    selector.close();
                    rs6.close();
                    conn.conn.close();
                    
                    selector = conn.getConnection().createStatement();
                    ResultSet rs11 = selector.executeQuery(query11);
                    if(rs11.next()){
                        this.day3 = rs11.getInt(1);}
                    selector.close();
                    rs11.close();
                    conn.conn.close();
                    //CART POSITION three
                    
                    selector = conn.getConnection().createStatement();
                    ResultSet rs7 = selector.executeQuery(query7);
                    if(rs7.next()){
                        this.Item4 = rs7.getInt(1);}
                    selector.close();
                    rs7.close();
                    conn.conn.close();
                    
                    selector = conn.getConnection().createStatement();
                    ResultSet rs8 = selector.executeQuery(query8);
                    if(rs8.next()){
                        this.Type4 = rs8.getString(1);}
                    selector.close();
                    rs8.close();
                    conn.conn.close();
                    
                    selector = conn.getConnection().createStatement();
                    ResultSet rs12 = selector.executeQuery(query12);
                    if(rs12.next()){
                        this.day4 = rs12.getInt(1);}
                    selector.close();
                    rs12.close();
                    conn.conn.close();
                    //CART POSITION four
                    
                    
                                      
                    
                        
                        if(Item1 == 0 && Item2 != 0 && Item3 != 0 && Item4 != 0 ){
                            this.Item1 = this.Item2;
                            this.Type1 = this.Type2;
                            this.day1 = this.day2;
                            this.Item2 = this.Item3;
                            this.Type2 = this.Type3;
                            this.day2 = this.day3;
                            this.Item3 = this.Item4;
                            this.Type3 = this.Type4;
                            this.day3 = this.day4;
                            this.Item4 = 0;
                            this.Type4 = null;
                            this.day4 = 0;
                            System.out.println("First IF");}    
                            //  0   1   1   1
                            
                        else if(Item1 != 0 && Item2 == 0 && Item3 != 0 && Item4 != 0 ){
                            this.Item2 = this.Item3;
                            this.Type2 = this.Type3;
                            this.day2 = this.day3;
                            this.Item3 = this.Item4;
                            this.Type3 = this.Type4;
                            this.day3 = this.day4;
                            this.Item4 = 0;
                            this.Type4 = null;
                            this.day4 = 0;
                        System.out.println("Second IF");} 
                            // 1    0   1   1
                            
                        else if(Item1 != 0 && Item2 != 0 && Item3 == 0 && Item4 != 0 ){
                            this.Item3 = this.Item4;
                            this.Type3 = this.Type4;
                            this.day3 = this.day4;
                            this.Item4 = 0;
                            this.Type4 = null;
                            this.day4 = 0;
                        System.out.println("Third IF");}
                            //   1   1   0   1
                           //All combinations for one GAP
                            
                        else if(Item1 == 0 && Item2 == 0 && Item3 != 0 && Item4 != 0 ){
                            this.Item1 = this.Item3;
                            this.Type1 = this.Type3;
                            this.day1 = this.day3;
                            this.Item3 = 0;
                            this.Type3 = null;
                            this.day3 = 0;
                            this.Item2 = this.Item4;
                            this.Type2 = this.Type4;
                            this.day2 = this.day4;
                            this.Item4 = 0;
                            this.Type4 = null;
                            this.day4 = 0;
                        System.out.println("Fourth IF");} 
                        
                            //  0   0   1   1
                            
                        else if(Item1 != 0 && Item2 == 0 && Item3 == 0 && Item4 != 0){
                            this.Item2 = this.Item4;
                            this.Type2 = this.Type4;
                            this.day2 = this.day4;
                            this.Item4 = 0;
                            this.Type4 = null;
                            this.day4 = 0;
                        System.out.println("Fifth IF");} 
                            //  1   0   0   1
                                                    
                        else if(Item1 == 0 && Item2 != 0 && Item3 == 0 && Item4 != 0){
                            this.Item1 = this.Item2;
                            this.Type1 = this.Type2;
                            this.day1 = this.day2;
                            this.Item2 = this.Item4;
                            this.Type2 = this.Type4;
                            this.day2 = this.day4;
                            this.Item4 = 0;
                            this.Type4 = null;
                            this.day4 = 0;
                        System.out.println("Sixth IF");}
                            //  0   1   0   1
                            
                                                    
                        else if(Item1 == 0 && Item2 != 0 && Item3 != 0 && Item4 == 0){
                            this.Item1 = this.Item2;
                            this.Type1 = this.Type2;
                            this.day1 = this.day2;
                            this.Item2 = this.Item3;
                            this.Type2 = this.Type3;
                            this.day2 = this.day3;
                            this.Item3 = 0;
                            this.Type3 = null;
                            this.day4 = 0;
                        System.out.println("Seventh IF");}
                            //  0   1   1   0
                            //All combinations for two GAPs
                        
                        else if(Item1 == 0 && Item2 == 0 && Item3 == 0 && Item4 != 0){
                            this.Item1 = this.Item4;
                            this.Type1 = this.Type4;
                            this.day1 = this.day4;
                            this.Item4 = 0;
                            this.Type4 = null;
                            this.day4 = 0;
                        System.out.println("Eight IF");}
                            //  0    0   0   1
                        
                        else if(Item1 == 0 && Item2 == 0 && Item3 != 0 && Item4 == 0){
                            this.Item1 = this.Item3;
                            this.Type1 = this.Type3;
                            this.day1 = this.day3;
                            this.Item3 = 0;
                            this.Type3 = null;
                            this.day3 = 0;
                        System.out.println("Nineth IF");}
                            //  0   0   1   0
                            
                        else if(Item1 == 0 && Item2 != 0 && Item3 == 0 && Item4 == 0 ){
                            this.Item1 = this.Item2;
                            this.Type1 = this.Type2;
                            this.day1 = this.day2;
                            this.Item2 = 0;
                            this.Type2 = null;
                            this.day2 = 0;
                        System.out.println("Tenth IF");}
                            //  0   1   0   0
                           //All combinations for three GAPs        
                        
                        //                        
                        
        Statement stmt = conn.getConnection().createStatement();
        stmt.execute("UPDATE cart SET Item1 = " + this.Item1 +", Type1 = '" + this.Type1 + "', Days1 = "+ this.day1+", Item2 = "+ this.Item2 + ", Type2 = '"+ this.Type2 +"', Days2 = "+ this.day2+", Item3 = "
                    + this.Item3 +", Type3 ='" + this.Type3 +"', Days3 = "+ this.day3+", Item4 =" + this.Item4 +", Type4 ='"+ this.Type4 +"', Days4 = "+ this.day4+" Where receipt =" + receipt +";");
        
        stmt.close();
        conn.conn.close();
    }//Organize the cart items and change the database Row for a certain receipt number. - TESTED
        
    public int NewCart() throws SQLException{
            
        int id = NextReceiptNumber();
        
         Statement stmt = conn.getConnection().createStatement();                   
         stmt.execute("INSERT INTO cart (receipt, status) VALUES ("+id+",'Open');");
         
         System.out.println("New cart number "+id+" Opened"); 
         
         stmt.close();
         conn.conn.close();
         
         return id;} //Create a new cart and define it's status as open, Return the Cart ID. - TESTED
    
    public int MyCartNo() throws SQLException{
        int cartNo = 0;
        
                    
                    String query = "SELECT receipt FROM cart where status ='Open';";
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);
        
                                                          
                    if(rs.next()){
                        System.out.println("this means I Have a Result");
            
                    cartNo = rs.getInt(1);} else {
            NewCart();
            MyCartNo(); //if a cart wasn't initialized, make one and run this code again
            System.out.println("I don't have a result, making a new cart and trying again.");}
            
                    
                    System.out.println(cartNo +" is my cart returned");
                    
                    rs.close();
                    selector.close();
                    conn.conn.close();
                            
        
        return cartNo;}//Selects The Cart Active in the database, if there's none, it runs the method to create one and run this code again, returns the cartId AKA receipt.- TESTED
    
    public int MovieSelected(String mName) throws SQLException{
                            
                    String query = "Select idMovie FROM movie WHERE title ='"+mName+"' AND status = 'In stock';";
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);
                    
                    if(rs.next()){
                    movieId = rs.getInt(1);    
                                                        }

                    rs.close();
                    selector.close();
                    conn.conn.close();
                    
        return movieId;
    } // Selects a movie with status "In Stock" and returns it's ID. --- if Movie iD = 0 there's no movie with this title in stock. - TESTED
    
    public boolean CartFilledChecker() throws SQLException{
        
        int cart = MyCartNo();
        CartOrganizer(cart);        
        
                    //String query = "Select Type4 FROM cart WHERE receipt = "+cart+";";
                    String type;
                    String query = "Select Type4 FROM cart WHERE receipt = " + cart + ";";
                    
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);
                    
                                        
                    if(rs.next()){
                    type = rs.getString(1);
                    
                        if(type == null || type.equals("null")){
                            cartFull = false;}
                            else {
                            cartFull = true;}
                    } else{
                        System.out.println("it doest have a next, Error close to line 340, resultSet String: " +rs.getString(1));}
                    

                    rs.close();
                    selector.close();
                    conn.conn.close();
                    
                    return cartFull;} //Organizes the Cart, and check if there is any item on last space. returns true for cartFull if the cart is full, or false if it ain't- TESTED
    
    public void MovieAddIntoCart(String Sold, String mName) throws SQLException{
                            
        //FOR SOLD MOVIES
        String state = Sold;
        
        CartOrganizer(MyCartNo()); //gets or opens a new cart, and organize it if necessary.
           
                    int movieId = MovieSelected(mName);
         
                    Statement stmt = conn.getConnection().createStatement();                   
                    stmt.execute("UPDATE movie SET status = '" + state +"' WHERE (idMovie = "+ movieId +");");
                    stmt.execute("UPDATE cart SET Item4 = "+ movieId +", Type4 = '" + state + "' WHERE receipt ="+ MyCartNo()+";");
                    
                    
        CartOrganizer(MyCartNo()); //Second time is for the cart to look good, otherwise the movie would be positioned down to the botton
                    stmt.close();
                    conn.conn.close();
    } //Organize the cart, add a movie into it, change movie state As Sold- TESTED
    
    public void MovieAddIntoCart(String Rented, String mName, int Days) throws SQLException{
                            
        //FOR RENTED MOVIES
        String state = Rented;
        int dayN = Days;
        int movieId = MovieSelected(mName);
        
        CartOrganizer(MyCartNo()); //gets or opens a new cart, and organize it if necessary.
           
                    Statement stmt = conn.getConnection().createStatement();
                    stmt.execute("UPDATE movie SET status = '" + state +"' WHERE (idMovie = "+ movieId +");");
                    stmt.execute("UPDATE cart SET Item4 = "+ movieId +", Type4 = '" + state + "', Days4 = "+ dayN + " WHERE receipt = "+ MyCartNo()+";");
                    
                    CartOrganizer(MyCartNo()); //Second time is for the cart to look good, otherwise the movie would be positioned down to the botton
                    stmt.close();
                    conn.conn.close();
    
    }//Organize the cart, add a movie into it, change movie state As rented and update days as well as other informations in cart and movie Tables-  TESTED
                    
    public void RemoveFromCart(int ItemNumber) throws SQLException{
        
        int i = ItemNumber;
        
        String item;
        String type;
        String day;
        int movieId;
        
        if(i == 1){
        type = "Type1";
        item = "Item1";
        day = "Days1";}
        else if(i == 2){
        type = "Type2";
        item = "Item2";
        day = "Days2";}
        else if(i == 3){
        type = "Type3";
        item = "Item3";
        day = "Days3";}
        else{       
        type = "Type4";
        item = "Item4";
        day = "Days4";}
                                
                                Statement stmt = conn.getConnection().createStatement();                   
                                ResultSet rs = stmt.executeQuery("SELECT " + item + " from cart where receipt = " + MyCartNo() +";");
                                
                                if(rs.next()){
                                this.movieId = rs.getInt(1);}
                                
                                stmt.execute("UPDATE cart SET "+ item + " = 0, " + type +" = null, "+ day +" = 0 WHERE receipt ="+ MyCartNo()+ ";");
                                stmt.execute("UPDATE movie SET status = 'In stock' WHERE idMovie = "+ this.movieId +";");
                              
                                stmt.close();
                                conn.conn.close();
                                
    CartOrganizer(MyCartNo());
    
    
    } // Remove the item displayed into One of the panels, and update the DB movie and cart tables. Then it organizes the cart. - Modified
    
    public String PanelMovieName(int PanelNumber, int receipt) throws SQLException{
        int i = PanelNumber; 
        int movieId = 0;
        String item;
        int j = receipt;
        
        if(i == 1){
        item = "Item1";
            System.out.println("FIRST IF item= " +item);}
        else if(i == 2){
        item = "Item2";
        System.out.println("SECOND IF - item= " +item);}
        else if(i == 3){
        item = "Item3";
        System.out.println("THIRD IF item= " +item);}
        else{       
        item = "Item4";
        System.out.println("LAST IF item= " +item);}
        
                    String query = "Select " +item+ " FROM cart WHERE receipt =" + j + ";";
                    
                    Statement selector = conn.getConnection().createStatement();
                    
                    
                    ResultSet rs = selector.executeQuery(query);//Get Movie ID
                    if(rs.next()){
                    movieId = rs.getInt(1);
                    System.out.println("movieId is " + movieId);}    
                    rs.close();
                    selector.close();
                    conn.conn.close();
                    
                    if(movieId != 0){
                    String query2 = "SELECT title FROM movie WHERE idMovie =" + movieId +";";
                    
                    selector = conn.getConnection().createStatement();
                    ResultSet rs2 = selector.executeQuery(query2);// Gets Movie Title
                    if(rs2.next()){
                    title = rs2.getString(1);
                    
                    System.out.println("movie Name is " + title);}
                    rs2.close();
                    selector.close();
                    conn.conn.close();
                    
                     return title;}
                    else { 
                    
                    
                        title = "empty";
                        return title;
                                            }
                    
                    
    } //Reads the movie ID from a certain position in the cart and returns the movie Title. - TESTED

    public String PanelType(int PanelNumber, int receipt) throws SQLException{
        int i = PanelNumber; 
        String type;
        int j = receipt;
        
        if(i == 1){
        type = "Type1";}
        else if(i == 2){
        type = "Type2";}
        else if(i == 3){
        type = "Type3";}
        else{       
        type = "Type4";}
        
                    String query = "SELECT " + type + " FROM cart WHERE receipt =" + j +";";
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);//Get Type
                    
                    if(rs.next()){
                    status = rs.getString(1);
                    System.out.println("movie Type is " + status);}

                    rs.close();
                    selector.close();
                    conn.conn.close();
                    
                    return status;}//A certain position in the cart and returns the type of purchase (RENT OR BUY)- TESTED
    
    public float PanelPrice(int PanelNumber, int receipt) throws SQLException{
        int i = PanelNumber;
        int movieId=0;
        String item;
        String type;
        int j = receipt;
        
        if(i == 1){
        item = "Item1";
        type = "Type1";}
        else if(i == 2){
        item = "Item2";
        type = "Type2";}
        else if(i == 3){
        item = "Item3";
        type = "Type3";}
        else{       
        item = "Item4";
        type = "Type4";}
                    
                    
        
                    String query = "Select " +item+ " FROM cart WHERE receipt ="+j+" ;";
                    String query2 = "Select " +type+ " FROM cart WHERE receipt ="+j+" ;";
                    
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);//Get Movie ID
                    if(rs.next()){
                    movieId = rs.getInt(1);
                    System.out.println("movieId is " + movieId);}
                    rs.close();
                    selector.close();
                    conn.conn.close();
                    
                    String query3 = "SELECT priceBuy FROM  movie WHERE idMovie =" + movieId +";";
                    String query4 = "SELECT priceRent FROM  movie WHERE idMovie =" + movieId +";";
                    
                    if(movieId != 0){
                    
                    selector = conn.getConnection().createStatement();
                    ResultSet rs2 = selector.executeQuery(query2);
                    if(rs2.next()){
                    type = rs2.getString(1);}
                    rs2.close();
                    selector.close();
                    conn.conn.close();
                    
                    selector = conn.getConnection().createStatement();
                    ResultSet rs3 = selector.executeQuery(query3);
                    if(rs3.next()){
                    pBuy = rs3.getFloat(1);}
                    rs3.close();
                    selector.close();
                    conn.conn.close();
                    
                    selector = conn.getConnection().createStatement();
                    ResultSet rs4 = selector.executeQuery(query4);
                    if(rs4.next()){
                    pRent = rs4.getFloat(1);}
                    rs4.close();
                    selector.close();
                    conn.conn.close();
                    
                    
                    if(type.equals("SOLD")){
                        System.out.println("Price for purchase: " +pBuy);

                        
                        return pBuy;} 
                    else{
                        System.out.println("Price for Rent: " + pRent);

                        return pRent;}}
                    
                    else {return 0;}
    }//Reads the movie from a certain position in the cart, reads its pricing and returns the pricing for the type of purchase (Rent or Buy) - TESTED
    
    public int PanelDays(int PanelNumber, int receipt) throws SQLException{
        int i = PanelNumber; 
        String days;
        int j = receipt;
        
        if(i == 1){
        days = "Days1";}
        else if(i == 2){
        days = "Days2";}
        else if(i == 3){
        days = "Days3";}
        else{       
        days = "Days4";}
        
                    String query = "SELECT " + days + " FROM cart WHERE receipt =" + j +";";
                    Statement selector = conn.getConnection().createStatement();
                    
                    ResultSet rs = selector.executeQuery(query);//Get days amount
                    if(rs.next()){
                    day = rs.getInt(1);
                    System.out.println("movie has " + day + " Days ");}  
                    

                    rs.close();
                    selector.close();
                    conn.conn.close();
                    return day;}// Reads the DB for an certain movie positioned in the Cart, return the amount of days in the Table. - TESTED
    
    public String CartState(int CartNo) throws SQLException{
        
        CartOrganizer(CartNo);
        CartOrganizer(CartNo);
        //It works second time, means one situation wasn't contempled in the If's of Cart Organizer
        
            this.cartState = null;
        
            String query3 = "Select Type1 from cart where receipt = " + MyCartNo()+";";
            String query4 = "Select Type2 from cart where receipt = " + MyCartNo()+";";
            String query5 = "Select Type3 from cart where receipt = " + MyCartNo()+";";
            String query6 = "Select Type4 from cart where receipt = " + MyCartNo()+";";
            
            Statement stmt = conn.getConnection().createStatement();
            ResultSet rs3 = stmt.executeQuery(query3);//Type1
            if(rs3.next()){                        
                        Type1 = rs3.getString(1);
                        System.out.println(Type1);            }
            stmt.close();
            rs3.close();
            conn.conn.close();
            
            stmt = conn.getConnection().createStatement();
            ResultSet rs4 = stmt.executeQuery(query4);//Type2
            if(rs4.next()){                        
                        Type2 = rs4.getString(1);
            System.out.println(Type2);}
            stmt.close();
            rs4.close();
            conn.conn.close();
            
            stmt = conn.getConnection().createStatement();
            ResultSet rs5 = stmt.executeQuery(query5);//Type3
            if(rs5.next()){
                        Type3 = rs5.getString(1);
                        System.out.println(Type3);}
            stmt.close();
            rs5.close();
            conn.conn.close();
            
            stmt = conn.getConnection().createStatement();
            ResultSet rs6 = stmt.executeQuery(query6);//Type4
            if(rs6.next()){
                        Type4 = rs6.getString(1);
                        System.out.println(Type4);}
            stmt.close();
            rs5.close();
            conn.conn.close();
            
                           
            if( Type1.equals("RENTED") || Type2.equals("RENTED") || Type3.equals("RENTED") || Type4.equals("RENTED") ){
            cartState = "Due"; }
            else {
            cartState = "Finished";}

            return cartState;} //Check a Cart in DB and inform return state, due if any movie is rented and finished if all movies are sold. = TESTED
    
    public String Today(){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date today = new Date();
        
        
        return df.format(today);}//Returns today's date as a String. - TESTED
    
    public String Return() throws SQLException, ParseException{
       int cartNo = MyCartNo();
       
       
       String query1 = "Select Days1 from cart Where receipt = "+ cartNo +";";
       String query2 = "Select Days2 from cart Where receipt = "+ cartNo +";";
       String query3 = "Select Days3 from cart Where receipt = "+ cartNo +";";
       String query4 = "Select Days4 from cart Where receipt = "+ cartNo +";";
       
       
       
       
       
       Statement stmt = conn.getConnection().createStatement();
       ResultSet rs1 = stmt.executeQuery(query1);
       if(rs1.next()){
           day1 = rs1.getInt(1);}
       rs1.close();
       stmt.close();
       conn.conn.close();
       
       stmt = conn.getConnection().createStatement();
       ResultSet rs2 = stmt.executeQuery(query2);
       if(rs2.next()){
           day2 = rs2.getInt(1);}
       rs2.close();
       stmt.close();
       conn.conn.close();
       
       stmt = conn.getConnection().createStatement();
       ResultSet rs3 = stmt.executeQuery(query3);
       if(rs3.next()){
           day3 = rs3.getInt(1);}
       rs3.close();
       stmt.close();
       conn.conn.close();
       
       stmt = conn.getConnection().createStatement();
       ResultSet rs4 = stmt.executeQuery(query4);
       if(rs4.next()){
           day4 = rs4.getInt(1);}
       rs3.close();
       stmt.close();
       conn.conn.close();
       
           
       if( day1 != 0 && day2 !=0 && day3 != 0 && day4 != 0){
           System.out.println("FIRST IF");
           String sDate = Today();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
           
           Calendar c1 = Calendar.getInstance();
           c1.setTime(date);
           c1.add(Calendar.DAY_OF_MONTH, day1);
           this.return1 = sdf.format(c1.getTime());
           
           Calendar c2 = Calendar.getInstance();
           c2.setTime(date);
           c2.add(Calendar.DAY_OF_MONTH, day2);
           this.return2 = sdf.format(c2.getTime());
           
           Calendar c3 = Calendar.getInstance();
           c3.setTime(date);
           c3.add(Calendar.DAY_OF_MONTH, day3);
           this.return3 = sdf.format(c3.getTime());
           
           Calendar c4 = Calendar.getInstance();
           c4.setTime(date);
           c4.add(Calendar.DAY_OF_MONTH, day4);
           this.return4 = sdf.format(c4.getTime());
       
           if ( day1 <= day2 && day1 <= day3 && day1 <= day4){
           smaller = day1;}
            else if(day2 <= day1 && day2 <= day3 && day2 <= day4){
           smaller = day2;}
            else if(day3 <= day1 && day3 <= day2 && day3 <= day4){
           smaller = day3;}
            else if (day4 <= day1 && day4 <= day2 && day4 <= day3){
           smaller = day4;}
       }
       // ALL DAYS ARE DIFFERENT FROM ZERO.
       //   1   1   1   1
       
       else if( day1 != 0 && day2 !=0 && day3 != 0 && day4 == 0){
           System.out.println("SECOND IF");
           String sDate = Today();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
           
           Calendar c1 = Calendar.getInstance();
           c1.setTime(date);
           c1.add(Calendar.DAY_OF_MONTH, day1);
           this.return1 = sdf.format(c1.getTime());
           
           Calendar c2 = Calendar.getInstance();
           c2.setTime(date);
           c2.add(Calendar.DAY_OF_MONTH, day2);
           this.return2 = sdf.format(c2.getTime());
           
           Calendar c3 = Calendar.getInstance();
           c3.setTime(date);
           c3.add(Calendar.DAY_OF_MONTH, day3);
           this.return3 = sdf.format(c3.getTime());
           
           this.return4 = null;
           
           if ( day1 <= day2 && day1 <= day3){
           smaller = day1;}
            else if(day2 <= day1 && day2 <= day3){
           smaller = day2;}
            else if(day3 <= day1 && day3 <= day2){
           smaller = day3;}            
       }
       // JUST DAY4 IS EQUAL TO ZERO.
       //   1   1   1   0
       
       else if( day1 != 0 && day2 !=0 && day3 == 0 && day4 != 0){
           System.out.println("THIRD IF");
           String sDate = Today();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
           
           Calendar c1 = Calendar.getInstance();
           c1.setTime(date);
           c1.add(Calendar.DAY_OF_MONTH, day1);
           this.return1 = sdf.format(c1.getTime());
           
           Calendar c2 = Calendar.getInstance();
           c2.setTime(date);
           c2.add(Calendar.DAY_OF_MONTH, day2);
           this.return2 = sdf.format(c2.getTime());
           
           this.return3 = null;
           
           Calendar c4 = Calendar.getInstance();
           c4.setTime(date);
           c4.add(Calendar.DAY_OF_MONTH, day4);
           this.return4 = sdf.format(c4.getTime());
       
           if ( day1 <= day2 && day1 <= day4){
           smaller = day1;}
            else if(day2 <= day1 && day2 <= day4){
           smaller = day2;}
            else if (day4 <= day1 && day4 <= day2){
           smaller = day4;}
       }
       //JUST DAY 3 IS EQUAL TO ZERO.
       //   1   1   0   1
           
       else if( day1 != 0 && day2 == 0 && day3 != 0 && day4 != 0){
           System.out.println("FOURTH IF");
           String sDate = Today();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
           
           Calendar c1 = Calendar.getInstance();
           c1.setTime(date);
           c1.add(Calendar.DAY_OF_MONTH, day1);
           this.return1 = sdf.format(c1.getTime());
           
           this.return2 = null;
           
           Calendar c3 = Calendar.getInstance();
           c3.setTime(date);
           c3.add(Calendar.DAY_OF_MONTH, day2);
           this.return3 = sdf.format(c3.getTime());
           
           Calendar c4 = Calendar.getInstance();
           c4.setTime(date);
           c4.add(Calendar.DAY_OF_MONTH, day4);
           this.return4 = sdf.format(c4.getTime());
       
           if (day1 <= day3 && day1 <= day4){
           smaller = day1;}
            else if(day3 <= day1 && day3 <= day4){
           smaller = day3;}
            else if (day4 <= day1 && day4 <= day3){
           smaller = day4;}       
       }    
       // JUST DAY2 IS EQUAL TO ZERO.
       //   1   0   1   1
           
       else if( day1 == 0 && day2 !=0 && day3 != 0 && day4 != 0){
           System.out.println("FIFTH IF");
           String sDate = Today();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
           
           this.return1 = null;
           
           Calendar c2 = Calendar.getInstance();
           c2.setTime(date);
           c2.add(Calendar.DAY_OF_MONTH, day2);
           this.return2 = sdf.format(c2.getTime());
           
           Calendar c3 = Calendar.getInstance();
           c3.setTime(date);
           c3.add(Calendar.DAY_OF_MONTH, day2);
           this.return3 = sdf.format(c3.getTime());
           
           Calendar c4 = Calendar.getInstance();
           c4.setTime(date);
           c4.add(Calendar.DAY_OF_MONTH, day4);
           this.return4 = sdf.format(c4.getTime());
       
           if(day2 <= day3 && day2 <= day4){
           smaller = day2;}
            else if(day3 <= day2 && day3 <= day4){
           smaller = day3;}
            else if (day4 <= day2 && day4 <= day3){
           smaller = day4;}
              }    
       // JUST DAY1 IS EQUAL TO ZERO.
       //   0   1   1   1
       
       
       else if( day1 == 0 && day2 ==0 && day3 != 0 && day4 != 0){
           System.out.println("SIXTH IF");
           String sDate = Today();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
           
           this.return1 = null;
           this.return2 = null;
           
           Calendar c3 = Calendar.getInstance();
           c3.setTime(date);
           c3.add(Calendar.DAY_OF_MONTH, day3);
           this.return3 = sdf.format(c3.getTime());
           
           Calendar c4 = Calendar.getInstance();
           c4.setTime(date);
           c4.add(Calendar.DAY_OF_MONTH, day4);
           this.return4 = sdf.format(c4.getTime());
       
           if(day3 <= day1 && day3 <= day4){
           smaller = day3;}
            else if (day4 <= day3){
           smaller = day4;}
           
       }    
       // DAY1 AND DAY2 ARE EQUAL TO ZERO.
       //   0   0   1   1
       
        else if( day1 == 0 && day2 !=0 && day3 == 0 && day4 != 0){
            System.out.println("SEVENTH IF");
           String sDate = Today();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
           
           this.return1 = null;
           
           Calendar c2 = Calendar.getInstance();
           c2.setTime(date);
           c2.add(Calendar.DAY_OF_MONTH, day2);
           this.return2 = sdf.format(c2.getTime());
           
           this.return3 = null;
           
           Calendar c4 = Calendar.getInstance();
           c4.setTime(date);
           c4.add(Calendar.DAY_OF_MONTH, day4);
           this.return4 = sdf.format(c4.getTime());
           
           
           if(day2 <= day4){
           smaller = day2;}
           else if (day4 <= day2){
           smaller = day4;}
           
        }    
       // DAY1 AND DAY3 ARE EQUAL TO ZERO.
       //  0   1   0   1
        
        else if( day1 == 0 && day2 !=0 && day3 != 0 && day4 == 0){
            System.out.println("EIGHT IF");
           String sDate = Today();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
           
           this.return1 = null;
           
           Calendar c2 = Calendar.getInstance();
           c2.setTime(date);
           c2.add(Calendar.DAY_OF_MONTH, day2);
           this.return2 = sdf.format(c2.getTime());
                      
           Calendar c3 = Calendar.getInstance();
           c3.setTime(date);
           c3.add(Calendar.DAY_OF_MONTH, day3);
           this.return3 = sdf.format(c3.getTime());
           
           this.return4 = null;
        
           
           if(day2 <= day3){
           smaller = day2;}
            else if(day3 <= day2){
           smaller = day3;}
           
        }    
        // DAY1 AND DAY4 ARE EQUAL TO ZERO.
        //  0   1   1   0
        
        else if( day1 != 0 && day2 ==0 && day3 == 0 && day4 != 0){
            System.out.println("NINETH IF");
           String sDate = Today();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
           
           Calendar c1 = Calendar.getInstance();
           c1.setTime(date);
           c1.add(Calendar.DAY_OF_MONTH, day1);
           this.return1 = sdf.format(c1.getTime());
           
           this.return2 = null;
           this.return3 = null;
           
           Calendar c4 = Calendar.getInstance();
           c4.setTime(date);
           c4.add(Calendar.DAY_OF_MONTH, day4);
           this.return4 = sdf.format(c4.getTime());
        
           if (day1 <= day4){
           smaller = day1;}
            else if (day4 <= day1){
           smaller = day4;}
        
        }
        // DAY2 AND DAY3 ARE EQUAL TO ZERO.
        // 1    0   0   1
       
       else if( day1 != 0 && day2 ==0 && day3 != 0 && day4 == 0){
           System.out.println("TENTH IF");
           String sDate = Today();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
           
           Calendar c1 = Calendar.getInstance();
           c1.setTime(date);
           c1.add(Calendar.DAY_OF_MONTH, day1);
           this.return1 = sdf.format(c1.getTime());
           
           this.return2 = null;
                      
           Calendar c3 = Calendar.getInstance();
           c3.setTime(date);
           c3.add(Calendar.DAY_OF_MONTH, day3);
           this.return3 = sdf.format(c3.getTime());
           
           this.return4 = null;
       
           if (day1 <= day3){
           smaller = day1;}
            else if(day3 <= day1){
           smaller = day3;}
            
       
       }
        // DAY2 AND DAY4 ARE EQUAL TO ZERO.
       //   1   0   1   0
       
       else if( day1 != 0 && day2 !=0 && day3 == 0 && day4 == 0){
           System.out.println("ELEVENTH IF");
           String sDate = Today();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
           
           Calendar c1 = Calendar.getInstance();
           c1.setTime(date);
           c1.add(Calendar.DAY_OF_MONTH, day1);
           this.return1 = sdf.format(c1.getTime());
                                 
           Calendar c2 = Calendar.getInstance();
           c2.setTime(date);
           c2.add(Calendar.DAY_OF_MONTH, day2);
           this.return2 = sdf.format(c2.getTime());
           
           this.return2 = null;
           this.return4 = null;
           
            if ( day1 <= day2){
           smaller = day1;}
            else if(day2 <= day1){
           smaller = day2;}
            
           
       }
        // DAY3 AND DAY4 ARE EQUAL TO ZERO.
       //   1   1   0   0
       
       
       else if( day1 == 0 && day2 ==0 && day3 == 0 && day4 != 0){
           System.out.println("TWELVETH IF");
           String sDate = Today();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
           
           this.return1 = null;
           this.return2 = null;
           this.return4 = null;
           
           Calendar c4 = Calendar.getInstance();
           c4.setTime(date);
           c4.add(Calendar.DAY_OF_MONTH, day4);
           this.return4 = sdf.format(c4.getTime());
       
            smaller = day4;
       
       }
        // ONLY DAY4 IS DIFFERENT TO ZERO.
       //   0   0   0   1
       
       else if( day1 != 0 && day2 ==0 && day3 == 0 && day4 == 0){
           System.out.println("THIRTEENTH IF");
           String sDate = Today();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
           
           this.return3 = null;
           this.return2 = null;
           this.return4 = null;
           
           Calendar c1 = Calendar.getInstance();
           c1.setTime(date);
           c1.add(Calendar.DAY_OF_MONTH, day1);
           this.return1 = sdf.format(c1.getTime());
       
       
           smaller = day1;
       }
        // ONLY DAY1 IS DIFFERENT TO ZERO.
       //   1   0   0   0
           
       else if( day1 == 0 && day2 !=0 && day3 == 0 && day4 == 0){
           System.out.println("FOURTEENTH IF");
           String sDate = Today();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
           
           this.return1 = null;
           this.return3 = null;
           this.return4 = null;
           
           Calendar c2 = Calendar.getInstance();
           c2.setTime(date);
           c2.add(Calendar.DAY_OF_MONTH, day2);
           this.return2 = sdf.format(c2.getTime());
       
           smaller = day2;
       }
        // ONLY DAY2 IS DIFFERENT TO ZERO.
       //   0   1   0   0
       
       else if( day1 == 0 && day2 ==0 && day3 != 0 && day4 == 0){
           System.out.println("FIFTEENTH IF");
           String sDate = Today();
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
           
           this.return1 = null;
           this.return2 = null;
           this.return4 = null;
           
           Calendar c3 = Calendar.getInstance();
           c3.setTime(date);
           c3.add(Calendar.DAY_OF_MONTH, day3);
           this.return3 = sdf.format(c3.getTime());
           
           smaller = day3;
       }
        // ONLY DAY3 IS DIFFERENT TO ZERO.
       //   0   0   1   0
           
            
            
       if(smaller == day1){

           conn.CloseConnection();
           return return1;}
       else if (smaller == day2){

           conn.CloseConnection();
           return return2;}
       else if (smaller == day3){

           conn.CloseConnection();
           return return3;}
       else if (smaller == day4){

           conn.CloseConnection();
           return return4;}
       else {

           conn.CloseConnection();
           return null;}     }// Select the amount of days in each Cart position. Save them into ints. Select the smaller int that is not equal to zero. add this int into today's Date and return the closest due day of return as a String - TESTED
            
    public boolean NewUser(String CreditCard, String Name, String Email, String Password, int CCV, String ExpDate) throws SQLException{
        
            isNewUser = true;
            specialQuery = null;
            
            
            Type1 = null;
            Type2 = null;
            Type3 = null;
            Type4 = null;
            
            
            String query = "Select name FROM users WHERE cCard ='"+CreditCard+"';";
            String query2 = "INSERT INTO users (`cCard`, `email`, `name`, `password`, `CCV`, `expDate`) VALUES ('"+CreditCard+"', '"+Name+"', '"+ Email+"', '"+Password+"', "+ CCV +", '"+ ExpDate + "');";
            
            
        try {specialQuery = "Update `cart` set `status` = '" + CartState(MyCartNo()) + "', `date` = '"+ Today()+"', `return` ='" + Return()+"', `creditcard` = '"+ CreditCard+"' Where `receipt` = "+ MyCartNo() +";";
        } catch (ParseException ex) {Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);}
            
            Statement stmt = conn.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()){
                isNewUser = false;}
            else{
                isNewUser = true;
                stmt.execute(query2);
                stmt.execute(specialQuery);}
            

            rs.close();
            stmt.close();
            conn.conn.close();
            return isNewUser; 
            } // Checks if the CC is already in the system with a name, return negative if there's already a name for this card or false if the user is new. - TESTED
    
    public boolean UserLogin(String Email, String Password) throws SQLException{
        isNewUser = true;
        specialQuery = null;
        String cartState = CartState(MyCartNo());
        
        String query = "Select `name` from `users` Where `email` = '"+ Email+"' AND `password` = '"+ Password+"';";
        String query2 = "Select `cCard` from `users` Where `email` = '"+ Email+"' AND `password` = '"+ Password+"';";
        
        Statement stmt = conn.getConnection().createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        if(rs.next()){
            userName = rs.getString(1);
        isNewUser = false;}
        else{isNewUser = true;}
        rs.close();
        stmt.close();
        conn.conn.close();
        
        
        stmt = conn.getConnection().createStatement();
        ResultSet rs2 = stmt.executeQuery(query2);
        if(rs2.next()){
            String CreditCard = rs2.getString(1);
            try {specialQuery = "Update `cart` set `status` = '" + cartState + "', `date` = '"+ Today()+"', `return` ='" + Return()+"', `creditcard` = '"+ CreditCard+"' Where `receipt` = "+ MyCartNo() +";";
        } catch (ParseException ex) {Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);}
        stmt.execute(specialQuery);}
        rs2.close();
        stmt.close();
        conn.conn.close();    

        return isNewUser;
    }// Check if is there user data in DB, if not returns true, If threre's it fetches the CCard from Db and Writes the Sale in the DB and returns false. - TESTED
    
    public boolean EnterAsGuest(String CreditCard, String Email, int CCV, String ExpDate) throws SQLException{
        
            isNewUser = true;
            receipt = MyCartNo();
            String cartState = CartState(MyCartNo());
            
            Type1 = null;
            Type2 = null;
            Type3 = null;
            Type4 = null;
            
            
            String query = "Select status FROM cart WHERE creditcard = '"+CreditCard+"';";
            String query2 = "INSERT INTO users (`cCard`, `email`, `CCV`, `expDate`) VALUES ('"+CreditCard+"', '"+ Email+"', "+ CCV +", '"+ ExpDate + "');";
            
            
        try {specialQuery = "Update `cart` set `status` = '" + cartState + "', `date` = '"+ Today()+"', `return` ='" + Return()+"', `creditcard` = '"+ CreditCard+"' Where `receipt` = "+ MyCartNo() +";";
        } catch (ParseException ex) {Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);}
            
            Statement stmt = conn.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()){
                System.out.println("I HAVE A NEXT RIGHT HERE"); 
                System.out.println("MY RS GET STRING IS " + rs.getString(1));
                
                if(rs.getString(1).equals("Due")){
                    System.out.println("SO MY STRING WAS DUE, SO I SHOULD HAVE A FALSE.");
                    
                    isNewUser = false;
                    rs.close();
                    stmt.close();
                    conn.conn.close();
                return isNewUser;}
                
                else{
                    System.out.println("SO MY STRING IS Stg Else, I SHOULD HAVE A TRUE, WRITTING YOUR SALE INTO THE DB");
                    isNewUser = true;
                    stmt.execute(query2);
                    stmt.execute(specialQuery);
                    
                    rs.close();
                    stmt.close();
                    conn.conn.close();
                return isNewUser; }            }
            else{ isNewUser = true;
                
                System.out.println("FIRST TIMER! WELCOME! -- PLEASE ENJOY!");
                    stmt.execute(query2);
                    stmt.execute(specialQuery);

                    rs.close();
                    stmt.close();
                    conn.conn.close();
                return isNewUser;
                        }
    }//Verify if the card Still have any receipts open, If there False = Message to close last receipt,  If True Accept payment and write into database. - TESTED

    public float PriceDifferenceCalc(int receipt) throws SQLException, ParseException{
            String today = Today();
            this.return1 = null;
            float late = 5;
            diff = 0;
            lab = 0;
        
            mName1 = PanelMovieName(1, receipt);
            Type1 = PanelType(1, receipt);
            day1 = PanelDays(1, receipt);
            price1 = PanelPrice(1, receipt);
            
            if(day1 != 0){
                  total1 = (day1 * price1);}
            else{ total1 = price1;}
            //information of movie positioned in position 1
            
            mName2 = PanelMovieName(2, receipt);
            Type2 = PanelType(2, receipt);
            day2 = PanelDays(2, receipt);
            price2 = PanelPrice(2, receipt);
            if(day2 != 0){
                  total2 = (day2 * price2);}
            else{ total2 = price2;}
            //information of movie positioned in position 2
            
            mName3 = PanelMovieName(3, receipt);
            Type3 = PanelType(3, receipt);
            day3 = PanelDays(3, receipt);
            price3 = PanelPrice(3, receipt);
            if(day3 != 0){
                  total3 = (day3 * price3);}
            else{ total3 = price3;}
            //information of movie positioned in position 3
            
            mName4 = PanelMovieName(4, receipt);
            Type4 = PanelType(4, receipt);
            day4 = PanelDays(4, receipt);
            price4 = PanelPrice(4, receipt);
            if(day4 != 0){
                  total4 = (day4 * price4);}
            else{ total4 = price4;}
            
            String query = "Select `return` from `cart` where `receipt` = "+receipt +" ;";
            Statement stmt = conn.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                this.closestReturn = rs.getString(1);}
            rs.close();
            stmt.close();
            conn.conn.close();
            
            Date d1 = new SimpleDateFormat("dd/MM/yyyy").parse(closestReturn);
            Date d2 = new Date();
            
            if(d2.after(d1)){
                return (-5); }
            
            else if(day1 != 0){
            diff = d2.getTime() - d1.getTime();// milliseconds
            diff = (diff/1000); // Seconds
            diff = (diff/60); // minutes
            diff = (diff/60); // hours
            diff = (diff/24); // days
                        
            if( lab < (diff - day1)){
                lab = (diff - day1);}
            return (lab *price1);}
            
            else if(day2 != 0){
            diff = d2.getTime() - d1.getTime();// milliseconds
            diff = (diff/1000); // Seconds
            diff = (diff/60); // minutes
            diff = (diff/60); // hours
            diff = (diff/24); // days
                        
            if( lab < (diff - day2)){
                lab = (diff - day2);}
            return (lab *price2);}
            
            else if(day3 != 0){
            diff = d2.getTime() - d1.getTime();// milliseconds
            diff = (diff/1000); // Seconds
            diff = (diff/60); // minutes
            diff = (diff/60); // hours
            diff = (diff/24); // days
                        
            if( lab < (diff - day3)){
                lab = (diff - day3);}
            return (lab *price3);}
            
            else if(day4 != 0){
            diff = d2.getTime() - d1.getTime();// milliseconds
            diff = (diff/1000); // Seconds
            diff = (diff/60); // minutes
            diff = (diff/60); // hours
            diff = (diff/24); // days
                        
            if( lab < (diff - day4)){
                lab = (diff - day4);}
            return (lab *price4);}
            
            return 0;
            }

    public int CheckOutCart(String cCardNumber) throws SQLException{
            
            checkOutReceipt = 0;
        
            String query = "Select receipt from cart where creditcard = '"+ cCardNumber +"' and status = 'Due' ;";
            Statement stmt = conn.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            if(rs.next()){
                checkOutReceipt = rs.getInt(1);}
            rs.close();
            stmt.close();
            conn.conn.close();
            return checkOutReceipt;}  // Return the cart receipt for Checkout when its due and the cCard number match with it. - TESTED
    
    public String CheckOutReceipt(int receipt, float donation) throws SQLException{
            
            float totalOverall;
            
        
            mName1 = PanelMovieName(1, receipt);
            Type1 = PanelType(1, receipt);
            day1 = PanelDays(1, receipt);
            price1 = PanelPrice(1, receipt);
            
            if(day1 != 0){
                  total1 = (day1 * price1);}
            else{ total1 = price1;}
            //information of movie positioned in position 1
            
            mName2 = PanelMovieName(2, receipt);
            Type2 = PanelType(2, receipt);
            day2 = PanelDays(2, receipt);
            price2 = PanelPrice(2, receipt);
            if(day2 != 0){
                  total2 = (day2 * price2);}
            else{ total2 = price2;}
            //information of movie positioned in position 2
            
            mName3 = PanelMovieName(3, receipt);
            Type3 = PanelType(3, receipt);
            day3 = PanelDays(3, receipt);
            price3 = PanelPrice(3, receipt);
            if(day3 != 0){
                  total3 = (day3 * price3);}
            else{ total3 = price3;}
            //information of movie positioned in position 3
            
            mName4 = PanelMovieName(4, receipt);
            Type4 = PanelType(4, receipt);
            day4 = PanelDays(4, receipt);
            price4 = PanelPrice(4, receipt);
            if(day4 != 0){
                  total4 = (day4 * price4);}
            else{ total4 = price4;}
            //information of movie positioned in position 4
            
            totalOverall = (total1 + total2 + total3 + total4 + donation);
                
                
                return "Position 1: Movie "+mName1+", was "+Type1+" and was due for "+day1+" days; Costs for this movie was "+total1+". \n"
                     + "Position 2: Movie "+mName2+", was "+Type2+" and was due for "+day2+" days; Costs for this movie was "+total2+". \n"
                     + "Position 3: Movie "+mName3+", was "+Type3+" and was due for "+day3+" days; Costs for this movie was "+total3+". \n"
                     + "Position 4: Movie "+mName4+", was "+Type4+" and was due for "+day4+" days; Costs for this movie was "+total4+". \n"
                     + "You have donated  $"+donation+" for needded IT Students, thank your for your support! \n"  
                     + " The total of this purchase was $" + totalOverall + ", Thank you for your Prefference! Come back Soon!";
    }// returns a receipt of a purchase for a cart number and a donation price. - TESTED
 
    public String UserEmail(String CreditCard) throws SQLException{
        
        userEmail = null;
        
        String query = "Select `email` from `users` where `cCard` = '"+ CreditCard+"' ;";
        Statement stmt = conn.getConnection().createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        if(rs.next()){
            userEmail = rs.getString(1);}
        
        
        return userEmail;
    }
    
    
}// Class fully commented.
    
    
    
    
    
    
    


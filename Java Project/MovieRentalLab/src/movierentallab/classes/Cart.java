/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentallab.classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aliss
 */


public class Cart {
    
    private int receipt;
    private int clientId;
    private int Item1;
    private int Item2;
    private int Item3;
    private int Item4;
    
    private int day1;
    private int day2;
    private int day3;
    private int day4;
    
    private int day;
        
    private String Type1;
    private String Type2;
    private String Type3;
    private String Type4;
    private String priceBuy = null;
    private String priceRent = null;
    
    private boolean cartFull;
    
    private float pBuy;
    private float pRent;
    
    private String title;
    private String status;
    
    private int movieId;
    Connector conn = new Connector();
    
    public int NextReceiptNumber() throws SQLException{
                    String query = "SELECT receipt FROM cart;";
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);
                    
                     while(rs.next()){
                        receipt = rs.getInt(1);
                        receipt++;
                    }
                    System.out.println("This is my Next ID:" + receipt);
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
                    Statement selector2 = conn.getConnection().createStatement();
                    Statement selector3 = conn.getConnection().createStatement();
                    Statement selector4 = conn.getConnection().createStatement();
                    Statement selector5 = conn.getConnection().createStatement();
                    Statement selector6 = conn.getConnection().createStatement();
                    Statement selector7 = conn.getConnection().createStatement();
                    Statement selector8 = conn.getConnection().createStatement();
                    Statement selector9 = conn.getConnection().createStatement();
                    Statement selector10 = conn.getConnection().createStatement();
                    Statement selector11 = conn.getConnection().createStatement();
                    Statement selector12 = conn.getConnection().createStatement();
                    
                    
                    ResultSet rs = selector.executeQuery(query);
                    ResultSet rs2 = selector2.executeQuery(query2);
                    ResultSet rs3 = selector3.executeQuery(query3);
                    ResultSet rs4 = selector4.executeQuery(query4);
                    ResultSet rs5 = selector5.executeQuery(query5);
                    ResultSet rs6 = selector6.executeQuery(query6);
                    ResultSet rs7 = selector7.executeQuery(query7);
                    ResultSet rs8 = selector8.executeQuery(query8);
                    ResultSet rs9 = selector9.executeQuery(query9);
                    ResultSet rs10 = selector10.executeQuery(query10);
                    ResultSet rs11 = selector11.executeQuery(query11);
                    ResultSet rs12 = selector12.executeQuery(query12);
                    
                    if(rs.next()){                        
                        this.Item1 = rs.getInt(1);}
                    if(rs2.next()){                        
                        this.Type1 = rs2.getString(1);}
                    if(rs9.next()){
                        this.day1 = rs9.getInt(1);}
                    //CART POSITION ONE
                    
                    
                    if(rs3.next()){                        
                        this.Item2 = rs3.getInt(1);}
                    if(rs4.next()){                        
                        this.Type2 = rs4.getString(1);}
                    if(rs10.next()){
                        this.day2 = rs10.getInt(1);}
                    //CART POSITION two                    
                    
                    
                    if(rs5.next()){                        
                        this.Item3 = rs5.getInt(1);}
                    if(rs6.next()){
                        this.Type3 = rs6.getString(1);}
                    if(rs11.next()){
                        this.day3 = rs11.getInt(1);}
                    //CART POSITION three
                    
                    
                    if(rs7.next()){
                        this.Item4 = rs7.getInt(1);}
                    if(rs8.next()){
                        this.Type4 = rs8.getString(1);}
                    if(rs12.next()){
                        this.day4 = rs12.getInt(1);}
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
    }//Organize the cart items and change the database Row for a certain receipt number. - TESTED
        
    public int NewCart() throws SQLException{
            
        int id = NextReceiptNumber();
        
         Statement stmt = conn.getConnection().createStatement();                   
         stmt.execute("INSERT INTO cart (receipt, status) VALUES ("+id+",'Open');");
         System.out.println("New cart number "+id+" Opened");         
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
        
        
        return cartNo;}//Selects The Cart Active in the database, if there's none, it runs the method to create one and run this code again, returns the cartId AKA receipt.- TESTED
    
    public int MovieSelected(String mName) throws SQLException{
                            
                    String query = "Select idMovie FROM movie WHERE title ='"+mName+"' AND status = 'In stock';";
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);
                    
                    if(rs.next()){
                    movieId = rs.getInt(1);    
                    }
                    
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
                        
                    return cartFull;} //Organizes the Cart, and check if there is any item on last space. returns true for cartFull if the cart is full, or false if it ain't- TESTED
    
    public void MovieAddIntoCart(String Sold, String mName) throws SQLException{
                            
        //FOR SOLD MOVIES
        String state = Sold;
        
        CartOrganizer(MyCartNo()); //gets or opens a new cart, and organize it if necessary.
           
                    int movieId = MovieSelected(mName);
         
                    Statement stmt = conn.getConnection().createStatement();                   
                    stmt.execute("UPDATE movie SET status = '" + state +"' WHERE (idMovie = "+ movieId +");");
                    stmt.execute("UPDATE cart SET Item4 = "+ movieId +", Type4 = '" + state + "' WHERE receipt ="+ MyCartNo()+";");
                    
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
    CartOrganizer(MyCartNo());
    } // Remove the item displayed into One of the panels, and update the DB movie and cart tables. Then it organizes the cart. - Modified
    
    public String PanelMovieName(int PanelNumber) throws SQLException{
        int i = PanelNumber; 
        int movieId = 0;
        String item;
        int j = MyCartNo();
        
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
                    Statement selector2 = conn.getConnection().createStatement();
                    
                    ResultSet rs = selector.executeQuery(query);//Get Movie ID
                    if(rs.next()){
                    movieId = rs.getInt(1);
                    System.out.println("movieId is " + movieId);}    
                    
                    if(movieId != 0){
                    String query2 = "SELECT title FROM movie WHERE idMovie =" + movieId +";";
                    
                    ResultSet rs2 = selector2.executeQuery(query2);// Gets Movie Title
                    if(rs2.next()){
                    title = rs2.getString(1);
                    System.out.println("movie Name is " + title);}                    
                     
                     return title;}
                    else { 
                        title = "empty";
                        return title;}
    } //Reads the movie ID from a certain position in the cart and returns the movie Title. - TESTED

    public String PanelType(int PanelNumber) throws SQLException{
        int i = PanelNumber; 
        String type;
        int j = MyCartNo();
        
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
                    
                    return status;}//A certain position in the cart and returns the type of purchase (RENT OR BUY)- TESTED
    
    public float PanelPrice(int PanelNumber) throws SQLException{
        int i = PanelNumber;
        int movieId=0;
        String item;
        String type;
        int j = MyCartNo();
        
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
                    
                    Statement selector = conn.getConnection().createStatement();
        
                    String query = "Select " +item+ " FROM cart WHERE receipt ="+j+" ;";
                    String query2 = "Select " +type+ " FROM cart WHERE receipt ="+j+" ;";
                    
                    
                    ResultSet rs = selector.executeQuery(query);//Get Movie ID
                    if(rs.next()){
                    movieId = rs.getInt(1);
                    System.out.println("movieId is " + movieId);}
                    
                    String query3 = "SELECT priceBuy FROM  movie WHERE idMovie =" + movieId +";";
                    String query4 = "SELECT priceRent FROM  movie WHERE idMovie =" + movieId +";";
                    
                    if(movieId != 0){
                    
                    ResultSet rs2 = selector.executeQuery(query2);
                    if(rs2.next()){
                    type = rs2.getString(1);}
                    
                    ResultSet rs3 = selector.executeQuery(query3);
                    if(rs3.next()){
                    pBuy = rs3.getFloat(1);}
                    
                    ResultSet rs4 = selector.executeQuery(query4);
                    if(rs4.next()){
                    pRent = rs4.getFloat(1);}
                    
                    if(type.equals("SOLD")){
                        System.out.println("Price for purchase: " +pBuy);
                        return pBuy;} 
                    else{
                        System.out.println("Price for Rent: " + pRent);
                        return pRent;}}
                    
                    else { return 0;}
    }//Reads the movie from a certain position in the cart, reads its pricing and returns the pricing for the type of purchase (Rent or Buy) - TESTED
    
    public int PanelDays(int PanelNumber) throws SQLException{
        int i = PanelNumber; 
        String days;
        int j = MyCartNo();
        
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
                    
                    return day;}// Reads the DB for an certain movie positioned in the Cart, return the amount of days in the Table. - TESTED
    
    public void CartRented(int CartNo){
        
        
        
    }    
    
    public boolean NewUser(String CreditCard, String Name, String Email, String Password, int CCV, String ExpDate) throws SQLException{
        
            boolean isNewUser;
            
            Type1 = null;
            Type2 = null;
            Type3 = null;
            Type4 = null;
            
            String state;
            
            String query = "Select name FROM users WHERE cCard ='"+CreditCard+"';";
            String query2 = "INSERT INTO users (`cCard`, `e-mail`, `name`, `password`, `CCV`, `expDate`) VALUES ('"+CreditCard+"', '"+Name+"', '"+ Email+"', '"+Password+"', "+ CCV +", '"+ ExpDate + "');";
            
            
            String query3 = "Select Type1 from cart where receipt = " + MyCartNo()+";";
            String query4 = "Select Type2 from cart where receipt = " + MyCartNo()+";";
            String query5 = "Select Type3 from cart where receipt = " + MyCartNo()+";";
            String query6 = "Select Type4 from cart where receipt = " + MyCartNo()+";";
            
            
                    
            Statement stmt = conn.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
                            
            
            if(rs.next()){
                isNewUser = false;}
            else {
                isNewUser = true;
            Statement stmt2 = conn.getConnection().createStatement();
            Statement stmt3 = conn.getConnection().createStatement();
            Statement stmt4 = conn.getConnection().createStatement();
            Statement stmt5 = conn.getConnection().createStatement();
            Statement stmt6 = conn.getConnection().createStatement();
            
            ResultSet rs3 = stmt3.executeQuery(query3);//Type1
            ResultSet rs4 = stmt4.executeQuery(query4);//Type2
            ResultSet rs5 = stmt5.executeQuery(query5);//Type3
            ResultSet rs6 = stmt6.executeQuery(query6);//Type4
            
            if(rs3.next()){                        
                        Type1 = rs3.getString(1);}
            if(rs4.next()){                        
                        Type2 = rs4.getString(1);}
            if(rs5.next()){
                        Type3 = rs5.getString(1);}
            if(rs5.next()){
                        Type4 = rs6.getString(1);}
                           
            if( Type1.equals("RENTED") || Type2.equals("RENTED") || Type3.equals("RENTED") || Type4.equals("RENTED") ){
            state = "due";
            stmt.execute("Update cart set status = '"+ state +"', cCard = '"+ CreditCard +"';");
            stmt2.execute(query2);}
            
            else {
            state = "Finished";
            stmt.execute("Update cart set status = '"+ state +"', cCard = '"+ CreditCard +"';");}            
            stmt2.execute(query2);
            
            }                        
        
        return isNewUser;
    } // Checks if the CC is already in the system with a name, return negative if there's already a name for this card or false if the user is new. - TESTED
    
    
    
    
}
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
    
    private String Type1;
    private String Type2;
    private String Type3;
    private String Type4;
    private String priceBuy = null;
    private String priceRent = null;
    
    private boolean cartFull;
    
    private String title;
    
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
                    return receipt;}//return the next valid writable receipt number

    public void CartOrganizer(int receipt) throws SQLException{
                    
                            
                    String query = "SELECT Item1 FROM cart Where receipt = " + receipt + ";";
                    String query2 = "SELECT Type1 FROM cart Where receipt = " + receipt + ";";
                    String query3 = "SELECT Item2 FROM cart Where receipt = " + receipt + ";";
                    String query4 = "SELECT Type2 FROM cart Where receipt = " + receipt + ";";
                    String query5 = "SELECT Item3 FROM cart Where receipt = " + receipt + ";";
                    String query6 = "SELECT Type3 FROM cart Where receipt = " + receipt + ";";
                    String query7 = "SELECT Item4 FROM cart Where receipt = " + receipt + ";";
                    String query8 = "SELECT Type4 FROM cart Where receipt = " + receipt + ";";
                    
                    Statement selector = conn.getConnection().createStatement();
                    
                    
                    
                    Statement selector2 = conn.getConnection().createStatement();
                    Statement selector3 = conn.getConnection().createStatement();
                    Statement selector4 = conn.getConnection().createStatement();
                    Statement selector5 = conn.getConnection().createStatement();
                    Statement selector6 = conn.getConnection().createStatement();
                    Statement selector7 = conn.getConnection().createStatement();
                    Statement selector8 = conn.getConnection().createStatement();
                    
                    
                    ResultSet rs = selector.executeQuery(query);
                    ResultSet rs2 = selector2.executeQuery(query2);
                    ResultSet rs3 = selector3.executeQuery(query3);
                    ResultSet rs4 = selector4.executeQuery(query4);
                    ResultSet rs5 = selector5.executeQuery(query5);
                    ResultSet rs6 = selector6.executeQuery(query6);
                    ResultSet rs7 = selector7.executeQuery(query7);
                    ResultSet rs8 = selector8.executeQuery(query8);
                    
                    if(rs.next()){
                        
                        this.Item1 = rs.getInt(1);
                        System.out.println("Value in Item1 is " + Item1);}                    
                    if(rs2.next()){
                        
                        this.Type1 = rs2.getString(1);
                        System.out.println("Value in Type1 is " + Type1);}                                                           
                    if(rs3.next()){
                        
                        this.Item2 = rs3.getInt(1);
                        System.out.println("Value in Item2 is " + Item2);}                    
                    if(rs4.next()){
                        
                        this.Type2 = rs4.getString(1);
                        System.out.println("Value in Type2 is " + Type2);}                    
                    if(rs5.next()){
                        
                        this.Item3 = rs5.getInt(1);
                        System.out.println("Value in Item3 is " + Item3);}
                    
                    if(rs6.next()){
                        this.Type3 = rs6.getString(1);
                        System.out.println("Value in Type3 is " + Type3);}
                    
                    if(rs7.next()){
                        this.Item4 = rs7.getInt(1);
                        System.out.println("Value in Item4 is " + Item4);}
                    
                    if(rs8.next()){
                        this.Type4 = rs8.getString(1);
                        System.out.println("Value in Type4 is " + Type4);}
                        
                        if(Item1 == 0 && Item2 != 0 && Item3 != 0 && Item4 != 0 ){
                            this.Item1 = this.Item2;
                            this.Type1 = this.Type2;
                            this.Item2 = this.Item3;
                            this.Type2 = this.Type3;
                            this.Item3 = this.Item4;
                            this.Type3 = this.Type4;
                            this.Item4 = 0;
                            this.Type4 = null;
                            System.out.println("First IF");}
    
                            //  0   1   1   1
                            
                        else if(Item1 != 0 && Item2 == 0 && Item3 != 0 && Item4 != 0 ){
                            this.Item2 = this.Item3;
                            this.Type2 = this.Type3;
                            this.Item3 = this.Item4;
                            this.Type3 = this.Type4;
                            this.Item4 = 0;
                            this.Type4 = null;
                        System.out.println("Second IF");} 
                            // 1    0   1   1
                            
                        else if(Item1 != 0 && Item2 != 0 && Item3 == 0 && Item4 != 0 ){
                            this.Item3 = this.Item4;
                            this.Type3 = this.Type4;
                            this.Item4 = 0;
                            this.Type4 = null;
                        System.out.println("Third IF");}
                            //   1   1   0   1
                           //All combinations for one GAP
                            
                        else if(Item1 == 0 && Item2 == 0 && Item3 != 0 && Item4 != 0 ){
                            this.Item1 = this.Item3;
                            this.Type1 = this.Type3;
                            this.Item3 = 0;
                            this.Type3 = null;
                            this.Item2 = this.Item4;
                            this.Type2 = this.Type4;
                            this.Item4 = 0;
                            this.Type4 = null;
                        System.out.println("Fourth IF");} 
                        
                            //  0   0   1   1
                            
                        else if(Item1 != 0 && Item2 == 0 && Item3 == 0 && Item4 != 0){
                            this.Item2 = this.Item4;
                            this.Type2 = this.Type4;
                            this.Item4 = 0;
                            this.Type4 = null;
                        System.out.println("Fifth IF");} 
                            //  1   0   0   1
                                                    
                        else if(Item1 == 0 && Item2 != 0 && Item3 == 0 && Item4 != 0){
                            this.Item1 = this.Item2;
                            this.Type1 = this.Type2;
                            this.Item2 = this.Item4;
                            this.Type2 = this.Type4;
                            this.Item4 = 0;
                            this.Type4 = null;
                        System.out.println("Sixth IF");}
                            //  0   1   0   1
                            
                        else if(Item1 == 0 && Item2 != 0 && Item3 == 0 && Item4 != 0){
                            this.Item1 = this.Item2;
                            this.Type1 = this.Type2;
                            this.Item2 = this.Item4;
                            this.Type2 = this.Type4;
                            this.Item4 = 0;
                            this.Type4 = null;
                        System.out.println("Seventh IF");} 
                            //  0   1   0   1   
                            
                        else if(Item1 == 0 && Item2 != 0 && Item3 != 0 && Item4 == 0){
                            this.Item1 = this.Item2;
                            this.Type1 = this.Type2;
                            this.Item2 = this.Item3;
                            this.Type2 = this.Type3;
                            this.Item3 = 0;
                            this.Type3 = null;
                        System.out.println("Eight IF");}
                            //  0   1   1   0
                            //All combinations for two GAPs
                        
                        else if(Item1 == 0 && Item2 == 0 && Item3 == 0 && Item4 != 0){
                            this.Item1 = this.Item4;
                            this.Type1 = this.Type4;
                            this.Item4 = 0;
                            this.Type4 = null;
                        System.out.println("Nineth IF");}
                            //  0    0   0   1
                        
                        else if(Item1 == 0 && Item2 == 0 && Item3 != 0 && Item4 == 0){
                            this.Item1 = this.Item3;
                            this.Type1 = this.Type3;
                            this.Item3 = 0;
                            this.Type3 = null;
                        System.out.println("Tenth IF");}
                            //  0   0   1   0
                            
                        else if(Item1 == 0 && Item2 != 0 && Item3 == 0 && Item4 == 0 ){
                            this.Item1 = this.Item2;
                            this.Type1 = this.Type2;
                            this.Item2 = 0;
                            this.Type2 = null;
                        System.out.println("Eleventh IF");}
                            //  0   1   0   0
                           //All combinations for three GAPs        
                        
                        //                        
                        
        Statement stmt = conn.getConnection().createStatement();
        stmt.execute("UPDATE cart SET Item1 = " + this.Item1 +", Type1 = '" + this.Type1 + "', Item2 = "+ this.Item2 + ", Type2 = '"+ this.Type2 +"', Item3 = " + this.Item3 +", Type3 ='" + this.Type3 +"', Item4 =" + this.Item4 +", Type4 ='"+ this.Type4 +"' Where receipt =" + receipt +";");
    }//Organize the cart items and change the database Row for a certain receipt number.    
        
    public int NewCart() throws SQLException{
            
        int id = NextReceiptNumber();
        
         Statement stmt = conn.getConnection().createStatement();                   
         stmt.execute("INSERT INTO cart (receipt, status) VALUES ("+id+",'Open');");
         System.out.println("New cart number "+id+" Opened");         
         return id;} //Create a new cart and define it's status as open, Return the Cart ID.
    
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
        
        
        return cartNo;}//Selects The Cart Active in the database, if there's none, it runs the method to create one and run this code again, returns the cartId AKA receipt.
    
    public int MovieSelected(String mName) throws SQLException{
                            
                    String query = "Select idMovie FROM movie WHERE title ='"+mName+"' AND status = 'In stock';";
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);
                    
                    if(rs.next()){
                    movieId = rs.getInt(1);    
                    }
                    
        return movieId;
    } // Selects a movie with status "In Stock" and returns it's ID. --- if Movie iD = 0 there's no movie with this title in stock.
    
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
                        System.out.println("I have a next, and type is " +type);
                    
                        if(type == null || type.equals("null")){
                            cartFull = false;
                            System.out.println("Cartfull variable is  " +cartFull);
                        } else {
                            cartFull = true;
                            System.out.println("Cart is Full boolean type = " +cartFull);
                        }
                    } else{
                        System.out.println("it doest have a next, Error close to line 288, resultSet String: " +rs.getString(1));
                    }
                        
                    return cartFull;    } //Organizes the Cart, and check if there is any item on last space. returns true for cartFull if the cart is full, or false if it ain't
    
    public void MovieAddIntoCart(boolean type, String mName) throws SQLException{
                            
        //TRUE IS SOLD
        //FALSE IS RENTED
        String state = "";
        
        if(type == true)    {
            state = "SOLD"; } else{
            state = "RENTED";     }
        
                    CartOrganizer(MyCartNo()); //gets or opens a new cart, and organize it if necessary.
           
                    int movieId = MovieSelected(mName);
         
                    Statement stmt = conn.getConnection().createStatement();                   
                    stmt.execute("UPDATE movie SET status = '" + state +"' WHERE (idMovie = "+ movieId +");");
                    stmt.execute("UPDATE cart SET Item4 = "+ movieId +", Type4 = '" + state + "' WHERE receipt ="+ MyCartNo()+";");} //Organize the cart, add a movie into it, change movie state to the chosen state "SOLD or RENTED".                    
                    
    public void RemoveFromCart(int ItemNumber) throws SQLException{
        
        int i = ItemNumber;
        
        String item;
        int movieId;
        String type;
        
        
        if(i == 1){
        type = "Type1";
        item = "Item1";
            System.out.println("my Item is " +item);}
        else if(i == 2){
        type = "Type2";
        item = "Item2";}
        else if(i == 3){
        type = "Type3";
        item = "Item3";}
        else{       
        type = "Type4";
        item = "Item4";}
                                
                                
                     
        
                                Statement stmt = conn.getConnection().createStatement();                   
                                ResultSet rs = stmt.executeQuery("SELECT " + item + " from cart where receipt = " + MyCartNo() +";");
                                
                                if(rs.next()){
                                this.movieId = rs.getInt(1);}
                                
                                stmt.execute("UPDATE cart SET "+ item + " = 0, " + type +" = null WHERE receipt ="+ MyCartNo()+ ";");
                                stmt.execute("UPDATE movie SET status = 'In Stock' WHERE idMovie = "+ this.movieId +";");
    CartOrganizer(MyCartNo());
    } // Remove the item displayed into One of the panels, and update the DB movie and cart tables. Then it organizes the cart.
    
    public String PanelMovieName(int PanelNumber) throws SQLException{
        int i = PanelNumber; 
        int movieId=0;//
        String item;
        String mName;
        int j = MyCartNo();

        
        
        if(i == 1){
        item = "Item1";}
        else if(i == 2){
        item = "Item2";}
        else if(i == 3){
        item = "Item3";}
        else{       
        item = "Item4"; }
                                
        
                    String query = "Select " +item+ " FROM cart WHERE receipt =" + j + ";";
                    String query2 = "SELECT title FROM  movie WHERE idMovie =" + movieId +";";
                    
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);//Get Movie ID
                    ResultSet rs2 = selector.executeQuery(query2);// Gets Movie Title
                    
                    movieId = rs.getInt(1);
                    mName = rs2.getString(1);
                    System.out.println(mName);
                         
                     
                     return mName;
    } //Reads the movie ID from a certain position in the cart and returns the movie Title.

    public String PanelType(int PanelNumber) throws SQLException{
        int i = PanelNumber; 
        String type;
        String typeStatus;
        int j = MyCartNo();

        
        if(i == 1){
        type = "Type1";}
        else if(i == 2){
        type = "Type2";}
        else if(i == 3){
        type = "Type3";}
        else{       
        type = "Type4";}
                                
        
                    String query = "Select " +type+ " FROM cart WHERE receipt =" + j + ";";
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);
                    typeStatus = rs.getString(1);
                        
                    return typeStatus; }//Reads the movie ID from a certain position in the cart and returns the type of purchase (RENT OR BUY)
    
    public float PanelPrice(int PanelNumber) throws SQLException{
        int i = PanelNumber;
        int movieId=0;//
        String item;
        String type;
        int j = MyCartNo();
        
        float pBuy;
        float pRent;
        
        
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
                    String query3 = "SELECT priceBuy FROM  movie WHERE idMovie =" + movieId +";";
                    String query4 = "SELECT priceRent FROM  movie WHERE idMovie =" + movieId +";";
                    
                    ResultSet rs = selector.executeQuery(query);
                    ResultSet rs2 = selector.executeQuery(query2);
                    ResultSet rs3 = selector.executeQuery(query3);
                    ResultSet rs4 = selector.executeQuery(query4);

                    movieId = rs.getInt(1);
                    type = rs2.getString(1);
                    pBuy = rs3.getFloat(1);
                    pRent = rs4.getFloat(1);
                    
                    if(type =="Buy"){
                        return pBuy;} else{
                        return pRent;
                    }
                     
                     
    }//Reads the movie from a certain position in the cart, reads its pricing and returns the pricing for the type of purchase (Rent or Buy)
    
   
    
    
    
    
    
    
}
                    
        
        
    
    
    

        
        
    


  


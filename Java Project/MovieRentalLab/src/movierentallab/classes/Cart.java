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
    private String Item1;
    private String Item2;
    private String Item3;
    private String Item4;
    
    private String Type1;
    private String Type2;
    private String Type3;
    private String Type4;
           
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
                    
                            
                    String query = "SELECT Item1, Type1, Item2, Type2, Item3, Type3, Item4, Type4 FROM cart Where receipt = " + receipt + ";";
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);
                    
                        Item1 = rs.getString(1);
                        Type1 = rs.getString(2);
                        Item2 = rs.getString(3);
                        Type2 = rs.getString(4);
                        Item3 = rs.getString(5);
                        Type3 = rs.getString(6);
                        Item4 = rs.getString(7);
                        Type4 = rs.getString(8);
                        
                        
                        
                        if(Item1 == null && Item2 != null && Item3 != null && Item4 != null ){
                            this.Item1 = this.Item2;
                            this.Type1 = this.Type2;
                            this.Item2 = this.Item3;
                            this.Type2 = this.Type3;
                            this.Item3 = this.Item4;
                            this.Type3 = this.Type4;
                            this.Item4 = null;
                            this.Type4 = null;} else{
                            //  0   1   1   1
                            
                        if(Item1 != null && Item2 == null && Item3 != null && Item4 != null ){
                            this.Item2 = this.Item3;
                            this.Type2 = this.Type3;
                            this.Item3 = this.Item4;
                            this.Type3 = this.Type4;
                            this.Item4 = null;
                            this.Type4 = null;} else{
                            // 1    0   1   1
                            
                        if(Item1 != null && Item2 != null && Item3 == null && Item4 != null ){
                            this.Item3 = this.Item4;
                            this.Type3 = this.Type4;
                            this.Item4 = null;
                            this.Type4 = null;} else{
                            //   1   1   0   1
                           //All combinations for one GAP
                            
                        if(Item1 == null && Item2 == null && Item3 != null && Item4 != null ){
                            this.Item1 = this.Item3;
                            this.Type1 = this.Type3;
                            this.Item3 = null;
                            this.Type3 = null;
                            this.Item2 = this.Item4;
                            this.Type2 = this.Type4;
                            this.Item4 = null;
                            this.Type4 = null;} else{
                            //  0   0   1   1
                            
                        if(Item1 != null && Item2 == null && Item3 == null && Item4 != null ){
                            this.Item2 = this.Item4;
                            this.Type2 = this.Type4;
                            this.Item4 = null;
                            this.Type4 = null;} else{
                            //  1   0   0   1
                                                    
                        if(Item1 == null && Item2 != null && Item3 == null && Item4 != null ){
                            this.Item1 = this.Item2;
                            this.Type1 = this.Type2;
                            this.Item2 = this.Item4;
                            this.Type2 = this.Type4;
                            this.Item4 = null;
                            this.Type4 = null;} else{
                            //  0   1   0   1
                            
                        if(Item1 == null && Item2 != null && Item3 == null && Item4 != null ){
                            this.Item1 = this.Item2;
                            this.Type1 = this.Type2;
                            this.Item2 = this.Item4;
                            this.Type2 = this.Type4;
                            this.Item4 = null;
                            this.Type4 = null;} else{
                            //  0   1   0   1   
                            
                        if(Item1 == null && Item2 != null && Item3 != null && Item4 == null ){
                            this.Item1 = this.Item2;
                            this.Type1 = this.Type2;
                            this.Item2 = this.Item3;
                            this.Type2 = this.Type3;
                            this.Item3 = null;
                            this.Type3 = null;} else{
                            //  0   1   1   0
                            //All combinations for two GAPs
                        
                        if(Item1 == null && Item2 == null && Item3 == null && Item4 != null ){
                            this.Item1 = this.Item4;
                            this.Type1 = this.Type4;
                            this.Item4 = null;
                            this.Type4 = null;} else{
                            //  0    0   0   1
                        
                        if(Item1 == null && Item2 == null && Item3 != null && Item4 == null ){
                            this.Item1 = this.Item3;
                            this.Type1 = this.Type3;
                            this.Item3 = null;
                            this.Type3 = null;} else{
                            //  0   0   1   0
                            
                        if(Item1 == null && Item2 != null && Item3 == null && Item4 == null ){
                            this.Item1 = this.Item2;
                            this.Type1 = this.Type2;
                            this.Item2 = null;
                            this.Type2 = null;}
                            //  0   1   0   0
                           //All combinations for three GAPs                       
                        }}}}}}}}}}
                        
                        
        Statement stmt = conn.getConnection().createStatement();
        stmt.execute("UPDATE cart SET 'Item1' = '" + this.Item1 + "', 'Item2' = '"+this.Item2+"' 'Item3' = '" + this.Item3 +"'Item4' = '" + this.Item4 +"' Where(receipt =" + receipt +";");}//Organize the cart items and change the database Row for a certain receipt number.
    ////////////COLOCAR O TIPO TBM
        
    public int NewCart() throws SQLException{
            
        int id = NextReceiptNumber();
        
         Statement stmt = conn.getConnection().createStatement();                   
         stmt.execute("INSERT INTO 'cart' ('receipt', 'status') VALUES ('"+id+"', 'Open'");
         System.out.println("New cart number "+id+" Opened");         
         return id;} //Create a new cart and define it's status as open, Return the Cart ID.
    
    public int MyCartNo() throws SQLException{
        int cartNo;
        
                    
                    String query = "SELECT receipt FROM cart where status ='Open';";
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);
        
                    cartNo = rs.getInt(1);
            if(cartNo == 0){
            NewCart();
            MyCartNo();} //if a cart wasn't initialized, make one and run this code again
        
        
        
        return cartNo;}//Selects The Cart Active in the database, if there's none, it runs the method to create one and run this code again, returns the cartId AKA receipt.
    
    public int MovieSelected(String mName) throws SQLException{
                    int movieId;
        
                    String query = "Select idMovie FROM movie WHERE title ='"+mName+"' AND status = 'In stock';";
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);
                    
                    movieId = rs.getInt(1);
        return movieId;
    } // Selects a movie with status "In Stock" and returns it's ID. --- if Movie iD = 0 there's no movie with this title in stock.
    
    public boolean CartFilledChecker() throws SQLException{
        
        int cart = MyCartNo();
        CartOrganizer(cart);
        boolean cartFull;
        
                    String query = "Select Item4 FROM cart WHERE receipt = "+cart+";";
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);
                    
                    if( rs.getString(1) != null){
                        cartFull = true;} else{
                        cartFull = false;}
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
        
        String item = null;
        int movieId;
        String type;
        
        
        if(i == 1){
        type = "Type1";
        item = "Item1";}else{       
        if(i == 2){
        type = "Type2";
        item = "Item2";}else    {
        if(i == 3){
        type = "Type3";
        item = "Item3";}else        {       
        type = "Type4";
        item = "Item4";             }
                                }
                            }       
                     
        
                                Statement stmt = conn.getConnection().createStatement();                   
                                ResultSet rs = stmt.executeQuery("SELECT " + item + "from cart where receipt = " + MyCartNo() +";");
                                movieId = rs.getInt(1);
                                
                                stmt.execute("UPDATE cart SET "+ item + " = null, " + type +" = null WHERE receipt ="+ MyCartNo()+ ";");
                                stmt.execute("UPDATE movie SET status = 'In Stock' WHERE idMovie = "+ movieId +";");
    CartOrganizer(MyCartNo());
    } // Remove the item displayed into One of the panels, and update the DB movie and cart tables. Then it organizes the cart.
    
    
    
    
    
    
    
    
    
    
    
    
}
                    
        
        
    
    
    
    
//    String type;
//    if(SaleType == true){
//    type = "Buy"; }
//    else {type = "Rent";}
//    //defines the type of sale for a movie
      
        
    
        
        
        
    


  


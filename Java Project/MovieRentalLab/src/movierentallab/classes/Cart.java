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
        stmt.execute("UPDATE cart SET 'Item1' = '" + this.Item1 + "', 'Item2' = '"+this.Item2+"' 'Item3' = '" + this.Item3 +"'Item4' = '" + this.Item4 +"' Where('receipt' =" + receipt +"'");}//Organize the cart items and change the database Row for a certain receipt number.
        
    public int NewCart() throws SQLException{
            
        int id = NextReceiptNumber();
        
         Statement stmt = conn.getConnection().createStatement();                   
         stmt.execute("INSERT INTO 'cart' ('receipt', 'status') VALUES ('"+id+"', 'Open'");
         System.out.println("New cart number "+id+" Opened");         
         return id;} //Create a new cart and define it's status as open, Return the Cart ID.
    
    public void MovieAddIntoCart(int receipt, boolean type, int movieId) throws SQLException{
                    CartOrganizer(receipt);
         
                    String query = "SELECT Item4 FROM cart;";
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);
                    
                    
        
        
    }
    
    
    
    
    
    
    
    
    
}
                    
        
        
    
    
    
    
//    String type;
//    if(SaleType == true){
//    type = "Buy"; }
//    else {type = "Rent";}
//    //defines the type of sale for a movie
      
        
    
        
        
        
    


  


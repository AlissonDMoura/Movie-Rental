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
                    
                            
                    String query = "SELECT Item1,item2,item3,item4 FROM cart;";
                    Statement selector = conn.getConnection().createStatement();
                    ResultSet rs = selector.executeQuery(query);
                    
                        Item1 = rs.getString(1);
                        Item2 = rs.getString(2);
                        Item3 = rs.getString(3);
                        Item4 = rs.getString(4);
                        
                        
                        
                        if(Item1 == null && Item2 != null && Item3 != null && Item4 != null ){
                            this.Item1 = this.Item2;
                            this.Item2 = this.Item3;
                            this.Item3 = this.Item4;
                            this.Item4 = null; } else{
                            //  0   1   1   1
                            
                        if(Item1 != null && Item2 == null && Item3 != null && Item4 != null ){
                            this.Item2 = this.Item3;
                            this.Item3 = this.Item4;
                            this.Item4 = null;} else{
                            // 1    0   1   1
                            
                        if(Item1 != null && Item2 != null && Item3 == null && Item4 != null ){
                            this.Item3 = this.Item4;
                            this.Item4 = null;} else{
                            //   1   1   0   1
                           //All combinations for one GAP
                            
                        if(Item1 == null && Item2 == null && Item3 != null && Item4 != null ){
                            this.Item1 = this.Item3;
                            this.Item3 = null;
                            this.Item2 = this.Item4;
                            this.Item4 = null;} else{
                            //  0   0   1   1
                            
                        if(Item1 != null && Item2 == null && Item3 == null && Item4 != null ){
                            this.Item2 = this.Item4;
                            this.Item4 = null;} else{
                            //  1   0   0   1
                                                    
                        if(Item1 == null && Item2 != null && Item3 == null && Item4 != null ){
                            this.Item1 = this.Item2;
                            this.Item2 = this.Item4;
                            this.Item4 = null;} else{
                            //  0   1   0   1
                            
                        if(Item1 == null && Item2 != null && Item3 == null && Item4 != null ){
                            this.Item1 = this.Item2;
                            this.Item2 = this.Item4;
                            this.Item4 = null;} else{
                            //  0   1   0   1   
                            
                        if(Item1 == null && Item2 != null && Item3 != null && Item4 == null ){
                            this.Item1 = this.Item2;
                            this.Item2 = this.Item3;
                            this.Item3 = null;} else{
                            //  0   1   1   0
                            //All combinations for two GAPs
                        
                        if(Item1 == null && Item2 == null && Item3 == null && Item4 != null ){
                            this.Item1 = this.Item4;
                            this.Item4 = null;} else{
                            //  0    0   0   1
                        
                        if(Item1 == null && Item2 == null && Item3 != null && Item4 == null ){
                            this.Item1 = this.Item3;
                            this.Item3 = null;} else{
                            //  0   0   1   0
                            
                        if(Item1 == null && Item2 != null && Item3 == null && Item4 == null ){
                            this.Item1 = this.Item2;
                            this.Item2 = null;}
                            //  0   1   0   0
                           //All combinations for three GAPs                       
                        }}}}}}}}}}
                        
                        
        Statement stmt = conn.getConnection().createStatement();
        stmt.execute("UPDATE cart SET 'Item1' = '" + this.Item1 + "', 'Item2' = '"+this.Item2+"' 'Item3' = '" + this.Item3 +"'Item4' = '" + this.Item4 +"' Where('receipt' =" + receipt +"'");}//Organize the cart items and change the database Row for a certain receipt number.
}
                    
        
        
    
    
    
    
//    String type;
//    if(SaleType == true){
//    type = "Buy"; }
//    else {type = "Rent";}
//    //defines the type of sale for a movie
      
        
    
        
        
        
    


  


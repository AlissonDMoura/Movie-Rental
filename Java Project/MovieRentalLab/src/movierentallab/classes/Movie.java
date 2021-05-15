/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierentallab.classes;

/**
 *
 * @author aliss
 */
public class Movie {
    
    
    private String name;
    private String mInfo;
    private String mImage;
    private String status;
    
    private int days;
    private int ID;

    private float rPrice;
    private float bPrice;
    
    
    
    
    public void setbPrice(float bPrice) {
        this.bPrice = bPrice;
    }//Set price for Movie

    public int getDays() {
        return days;
    }//return days for Movie

    public void setDays(int days) {
        this.days = days;
    }//Set days for Movie
    
    
    
    
    Connector conn = new Connector();
    
        public String getName() {
        return name;
    }//return name for Movie

    public String getmInfo() {
        return mInfo;
    }//return movieInfo for Movie

    public String getmImage() {
        return mImage;
    }//return movie Image path for Movie

    public String getStatus() {
        return status;
    }//return movieStatus for Movie

    public float getrPrice() {
        return rPrice;
    }//return movie rent Price

    public float getbPrice() {
        return bPrice;
    }//return movie buy price

    public int getID() {
        return ID;
    }//return movie Id
   
    
    
        
    
    
    public void setName(String name) {
        
        this.name = name;
    }// set Movie Name

    public void setmInfo(String mInfo) {
        this.mInfo = mInfo;
    }//set Movie Info

    public void setmImage(String mImage) {
        this.mImage = mImage;
    }// set Movie image path

    public void setStatus(String status) {
        this.status = status;
    }//set movie status

    public void setRprice(float rPrice) {
        this.rPrice = rPrice;
    }// set movie rent price.
    
    
        
}
//Class fully commented
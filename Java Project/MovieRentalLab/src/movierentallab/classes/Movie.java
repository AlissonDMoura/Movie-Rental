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

    public void setbPrice(float bPrice) {
        this.bPrice = bPrice;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    
    private float rPrice;
    private float bPrice;
    
    private int ID;
    
    
    Connector conn = new Connector();
    
        public String getName() {
        return name;
    }

    public String getmInfo() {
        return mInfo;
    }

    public String getmImage() {
        return mImage;
    }

    public String getStatus() {
        return status;
    }

    public float getrPrice() {
        return rPrice;
    }

    public float getbPrice() {
        return bPrice;
    }

    public int getID() {
        return ID;
    }
   
    
    
        
    
    
    public void setName(String name) {
        
        this.name = name;
    }

    public void setmInfo(String mInfo) {
        this.mInfo = mInfo;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRprice(float rPrice) {
        this.rPrice = rPrice;
    }
    
    
        
}

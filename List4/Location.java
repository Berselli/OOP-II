/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPII.List4;

/**
 *
 * @author berse
 */
public class Location {
    
    private int latitude;
    private int longitude;
    
    public Location(int latitude, int longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }
    @Override
    public String toString(){
        return "latitude " + latitude + " longitude " + longitude;
    }
    
    public int getLatitude(){
        return latitude;
    }
    
    public int getLongitude(){
        return longitude;
    }
    
    
}

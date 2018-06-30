/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPII.List4;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author berse
 */
public class User {
    
    private Map<String, Location> myLocations;
    private String name;
    
    public User(String name){
        myLocations = new HashMap();
        this.name = name;
    }    
    private boolean hasThisKey(String locationName){
        if(!myLocations.isEmpty()){
            return myLocations.containsKey(locationName);
        }
        return false;
    }    
    public boolean addLocation(String locationName, int latitude, int longitude){
        if(!hasThisKey(locationName)){
            myLocations.put(locationName, new Location(latitude,longitude));
            return true;
        }
        return false;            
    }
    
    public Map getMyLocations(){
        return myLocations;
    }
    
    public String getName(){
        return name;
    }
}

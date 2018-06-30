/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPII.List4;

import java.util.ArrayList;

/**
 *
 * @author berse
 */
public class Maps {
    private ArrayList<User> userList;
    
    public Maps(){
        userList = new ArrayList<>();
    }
    
    public void addUser(User user){
        userList.add(user);
    }
    
    
    public ArrayList<Location> searchLocationName(String locationName){
        ArrayList<Location> array = new ArrayList<>();
        userList.forEach((user) -> {
            user.getMyLocations().forEach( (key, value) -> {
                Location location = (Location)value;
                if(locationName.equals(key)){
                    array.add(location);
                }
            });
        });
        return array;
    }
    
    public void listPublicLocations(int intialLatitude, int finalLatitude, int initialLongitude, int finalLongitude){
        userList.forEach((user) -> {
            System.out.printf("User: %s", user.getName());
            user.getMyLocations().forEach( (key, value) -> {
                Location location = (Location)value;
                int latitude = location.getLatitude();
                int longitude = location.getLongitude();
                if(latitude >= intialLatitude && latitude <= finalLatitude && longitude >= initialLongitude && longitude <= finalLongitude)
                {
                    System.out.printf("\n"+"Location %s on %s",key,location.toString());
                }
                
            });
        });
    }
}

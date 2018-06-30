/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_4_number_2.List4;

import java.util.ArrayList;

/**
 *
 * @author berse
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        User user_1 = new User("Juliano");
        User user_2 = new User("Everton");
        user_1.addLocation("Bento Gonçalves", 0, 0);
        user_1.addLocation("Garibaldi", 0, 1);
        user_2.addLocation("Garibaldi", 0, 1);
        user_2.addLocation("Monte Belo do Sul", -1, 0);
        Maps map = new Maps();
        
        map.addUser(user_1);
        map.addUser(user_2);
        
        map.listPublicLocations(0, 2, 0, 2);
        
        String search = "Garibaldi";
        ArrayList<Location> array =  map.searchLocationName(search);
        
        System.out.printf("\nResults for Search %s :", search);
        if(!array.isEmpty())
            array.forEach( (location) -> {
                System.out.printf("\n %s",location.toString() );
            });
        
    }
    
}

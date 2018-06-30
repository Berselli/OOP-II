/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPII.List3.Number3;

import java.util.Comparator;

/**
 *
 * @author berse
 */
public class Patient implements Comparable<Patient>{
    private Ticket color;
    private int time;
    private int value;
    
    public Patient(Ticket color){
        time = 0;
        this.color = color;
        value = 1;
    }
    
    public void patientWait(){
        time++;
    }
    
    public Ticket getColor(){
        return color;
    }
    public int getTime(){
        return time;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    @Override
    public int compareTo(Patient patient) {
		return this.value - patient.getValue();
	}
    
    
    public static Comparator<Patient> PatientComparator 
                          = new Comparator<Patient>() {

	    public int compare(Patient patient_1, Patient patient_2) {
                
                if((patient_1.color == Ticket.RED && patient_2.color == Ticket.RED && patient_2.time <= patient_1.time) ||
                        (patient_1.color == Ticket.YELLOW && patient_2.color == Ticket.YELLOW && patient_2.time <= patient_1.time) ||
                        (patient_1.color == Ticket.BLUE && patient_2.color == Ticket.BLUE && patient_2.time <= patient_1.time) ||
                        (patient_1.color == Ticket.GREEN && patient_2.color == Ticket.GREEN && patient_2.time <= patient_1.time) ||
                        (patient_1.color == Ticket.RED && patient_2.color != Ticket.RED) ||
                        (patient_1.color == Ticket.YELLOW && patient_2.color != Ticket.RED && patient_2.color != Ticket.YELLOW) ||
                        (patient_1.color == Ticket.BLUE && patient_2.color != Ticket.RED && patient_2.color != Ticket.YELLOW && patient_2.color != Ticket.BLUE)
                        ){                  
                    patient_2.setValue(2);
                    patient_1.setValue(1);
                } else{
                    patient_1.setValue(1);
                    patient_2.setValue(0);
                }
	      
	      //ascending order
	      return patient_1.compareTo(patient_2);
	    }

	};
    
}

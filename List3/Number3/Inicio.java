
package OOPII.List3.Number3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author berse
 */

public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Patient> arrayPatient = new ArrayList();
        
        
        arrayPatient.add(new Patient(Ticket.RED));
        arrayPatient.add(new Patient(Ticket.BLUE));
        arrayPatient.add(new Patient(Ticket.GREEN));
        arrayPatient.add(new Patient(Ticket.YELLOW));
        arrayPatient.add(new Patient(Ticket.GREEN));
        arrayPatient.add(new Patient(Ticket.RED));
        arrayPatient.add(new Patient(Ticket.BLUE));
        arrayPatient.add(new Patient(Ticket.YELLOW));
        arrayPatient.add(new Patient(Ticket.GREEN));
        arrayPatient.add(new Patient(Ticket.GREEN));
        arrayPatient.add(new Patient(Ticket.GREEN));
        
        Doctor doctor_1 = new Doctor(1);
        Doctor doctor_2 = new Doctor(2);
        Doctor doctor_3 = new Doctor(1);
        Doctor doctor_4 = new Doctor(3);
        
        System.out.println("Array sem ordenação: ");
        
        arrayPatient.forEach((item) -> {
                System.out.print(" " + item.getColor() + ",");
        });
        
        
        System.out.println("\n"+"Array ordenado: ");
        
        Collections.sort(arrayPatient, Patient.PatientComparator);
        
        arrayPatient.forEach((item) -> {
                System.out.print(" " + item.getColor() + ",");
        });
        System.out.println("\n");
        
        while(!arrayPatient.isEmpty()){
            
            ArrayList <Patient> remove = new ArrayList();
            
            Collections.sort(arrayPatient, Patient.PatientComparator);
            
            arrayPatient.forEach((item) -> {
                if(doctor_1.isVague()){
                    doctor_1.attend();
                    remove.add(item);
                    System.out.println("Paciente " + item.getColor() +" sendo atendido pelo doutor 1.");
                } else if(doctor_2.isVague()){
                    doctor_2.attend();
                    remove.add(item);
                    System.out.println("Paciente " + item.getColor() +" sendo atendido pelo doutor 2.");
                } else if(doctor_3.isVague()){
                    doctor_3.attend();
                    remove.add(item);
                    System.out.println("Paciente " + item.getColor() +" sendo atendido pelo doutor 3.");
                } else if(doctor_4.isVague()){
                    doctor_4.attend();
                    remove.add(item);
                    System.out.println("Paciente " + item.getColor() +" sendo atendido pelo doutor 4.");
                }
            });
            
            System.out.println("Fila está cheia. \n");
            
            doctor_1.cycle();
            doctor_2.cycle();
            doctor_3.cycle();
            doctor_4.cycle();            
            
            arrayPatient.removeAll(remove);
            
        }
        
        
        
    }
    
}

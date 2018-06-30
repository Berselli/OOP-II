/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPII.List3.Number3;

/**
 *
 * @author berse
 */
public class Doctor {
    private boolean vague;
    private int time;
    private int baseTime;
    
    public Doctor(int time){
        vague = true;
        this.time = time;
        baseTime = time;
    }
    
    public void cycle(){
        if(time > 0)
        {
            time--;
        } else {
            time = baseTime;
            vague = true;
        }
    }
    
    public void attend(){
        vague = false;
    }
    
    public boolean isVague(){
        return vague;
    }
}

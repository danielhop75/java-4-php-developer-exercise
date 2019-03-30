/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupawatkow;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danielhop75
 */
public class Watek extends Thread {
 private String nazwa;
 private boolean wykonuj;
 private int timebetweenexecution;
 
    //konstruktor
    public Watek(String nazwa){
    
        
        this.nazwa=nazwa;
        this.wykonuj=true;
        //1 sekunda = 1000 mil. sek.
        this.timebetweenexecution=1000;
    
    }
    
    public void ustawStatusWatku(boolean b1){
        
        this.wykonuj=b1;
        
    }
    
    public void ustawczasmiedzywykonaniami(int t1){
        this.timebetweenexecution=t1;
    }
    
    
    @Override
    public void run(){
        //petla nieskonczona
        while(this.wykonuj){
            System.out.println("Nazwa wątku" + this.nazwa);
          try { 
            sleep(this.timebetweenexecution);   
            }
            catch(InterruptedException ex){
                    Logger.getLogger(Watek.class.getName()).log(Level.SEVERE, null, ex);
           }
        } //end while
        
    }
    
    
}

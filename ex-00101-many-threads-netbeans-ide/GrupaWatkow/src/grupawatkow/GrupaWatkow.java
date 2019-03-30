/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupawatkow;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author danielhop75
 */
public class GrupaWatkow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
             int n;
        n=40;
        System.out.println("Po naciskieciu klawiatury konczę program, ale teraz lecę");
        System.out.println("Zaczynam program tworzymy mnostwo wątków w ilości n =>" +n);
   
        
        //lista zawierajaca referencję do wątków
        ArrayList<Watek> l1=new ArrayList<Watek>();
       
        
        
       for (int i=0;i<n;i++){
          Watek w=new Watek("Numerek watku " + i);
          w.ustawczasmiedzywykonaniami(100);
          w.start();
          l1.add(w);
        }

        
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter something. When press I will finish all forks  > ");
        String inputString = input.nextLine();
        System.out.print("You entered : ");
        System.out.println(inputString);


        for (Watek x:l1){
            x.ustawStatusWatku(false);
        }    
        
        
        //wylaczam wąteki
        
        
        
        System.out.println("Koncze program");

        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilprojekt;

import java.util.ArrayList;

/**
 *
 * @author sune
 */
public class BilProjekt {

  
 
    
    public static void main(String[] args) {
        
     
        
        
           ArrayList<Bil> biler = new ArrayList();
        String s;
        
             
        Bil minEgenBil = new Bil();
        //minEgenBil.nummerplade = "XYX 453464";
        
        minEgenBil.nummerplade = new Nummerplade("XYX", 453464);
               
        minEgenBil.vægt = 2.1;
        minEgenBil.farve = "Gul";
        
        
        biler.add(minEgenBil);
        
               
        Bil bil2 = new Bil( "blå", 4.3, "WERT", 234235);
        biler.add(bil2);
        
        
        Bil bil3 = new Bil();
        biler.add(bil3);
        
        
        System.out.println("Min bil: "+ minEgenBil.nummerplade);
        
        Nummerplade egonsN = new Nummerplade("JYTFR", 5836736);
        Bil egonsBil = new Bil("rød", 0.9, egonsN);
        //egonsBil.nummerplade = "JYTFR #¤&%#¤&";
        egonsBil.vægt = 0.9;
        
        biler.add(egonsBil);
        
        
        System.out.println("status "+biler);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilprojekt;

import java.util.ArrayList;



/**
 *
 * 
 * 
 * @author sune
 * 
 * 
 * 
 * 
 */




public class Bil {
    
    Nummerplade nummerplade;
    String farve;
    double vægt;
    
    
    //default konstruktør
    public Bil (){}
    
    //Konstruktør med 4 paramtre
    public Bil (String f, double v, String hoved, int hale){
        farve = f;
        vægt = v;
        nummerplade = new Nummerplade(hoved, hale);
    }
    
     
    //Konstruktør med 3 paramtre
    public Bil (String f, double v, Nummerplade n){
        farve = f;
        vægt = v;
        nummerplade = n;
    }
    
    
   public String getNummerplade() {
    return nummerplade.hoved + " " + nummerplade.hale;
   }

   @Override
    public String toString() {
        return farve + " "+vægt + " " + nummerplade + "3";
    }
    
    
    
    
   
    
}

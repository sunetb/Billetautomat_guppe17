/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilprojekt;

/**
 *
 * @author sune
 */
public class Nummerplade {
    
    String hoved;
    int hale;
    
    Nummerplade (String hoved, int hale_){
        this.hoved = hoved;
        hale = hale_;
    
    }

    @Override
    public String toString() {
        return hoved+hale;
    }
    
    
}

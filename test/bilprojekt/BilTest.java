/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilprojekt;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sune
 */
public class BilTest {
    
    public BilTest() {
    }

    /**
     * Test of getNummerplade method, of class Bil.
     */
    @Test
    public void testGetNummerplade() {
        System.out.println("getNummerplade");
        Bil instance = new Bil();
        instance.nummerplade = new Nummerplade("abc", 123);
        String expResult = "abc 123";
        String result = instance.getNummerplade();
        assertEquals(expResult, result);
        
    }


   
    
}

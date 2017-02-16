/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chriskitchens
 */
public class StartProgramViewTest {
    
    public StartProgramViewTest() {
    }

    /**
     * Test of displayStartProgramView method, of class StartProgramView.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        /***********************
         * Test Case #1
         **********************/
        System.out.println("\tTest Case #1");
        
        //input values for test case 1
        String value = "Harry Potter";
        
        
        //expected output
        String expResult = "Harry Potter";
        
        //create instance of displayStartProgramView class
        StartProgramView instance = new StartProgramView();
        
        //call function to run test
        String result = instance.getPlayerName();
        
        //compare expected return value with actual return value
        assertEquals(expResult, result, 0.0001);
        
        instance.displayStartProgramView();
        
    }
    
}

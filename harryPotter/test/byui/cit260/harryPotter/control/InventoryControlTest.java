/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cami
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of moneyExchange method, of class InventoryControl.
     */
    @Test
    public void testMoneyExchange() {
        System.out.println("moneyExchange");
        
        /************************
         * Test case one
         ************************/
       System.out.println("\tTest case #1");
       //input calues for test case 1
        double galleons = 4;
        double sickles = 2;
        
        double expResult = 2.25; // expectd output returned value
        
        //create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        //call function to run test
        double result = instance.moneyExchange(galleons, sickles);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
        /************************
         * Test case two
         ************************/
       System.out.println("\tTest case #2");
       //input calues for test case 2
         galleons = -1;
         sickles = 1;
        
         expResult = -1; // expectd output returned value
        
        
        //call function to run test
         result = instance.moneyExchange(galleons, sickles);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        
              /************************
         * Test case three
         ************************/
       System.out.println("\tTest case #3");
       //input calues for test case 3
         galleons = 1;
         sickles = -1;
        
         expResult = -1; // expectd output returned value
        
        
        //call function to run test
         result = instance.moneyExchange(galleons, sickles);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
              /************************
         * Test case four
         ************************/
       System.out.println("\tTest case #4");
       //input calues for test case 4
         galleons = 1001;
         sickles = 1;
        
         expResult = -1; // expectd output returned value
        
        
        //call function to run test
         result = instance.moneyExchange(galleons, sickles);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
              /************************
         * Test case five
         ************************/
       System.out.println("\tTest case #5");
       //input calues for test case 5
         galleons = 0;
         sickles = 10;
        
         expResult = 1.25; // expectd output returned value
        
        
        //call function to run test
         result = instance.moneyExchange(galleons, sickles);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
              /************************
         * Test case six
         ************************/
       System.out.println("\tTest case #6");
       //input calues for test case 6
         galleons = 10;
         sickles = 0;
        
         expResult = 5; // expectd output returned value
        
        
        //call function to run test
         result = instance.moneyExchange(galleons, sickles);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
              /************************
         * Test case seven
         ************************/
       System.out.println("\tTest case #7");
       //input calues for test case 7
         galleons = 1000;
         sickles = 4;
        
         expResult = 500.5; // expectd output returned value
        
        
        //call function to run test
         result = instance.moneyExchange(galleons, sickles);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
    }
    
}

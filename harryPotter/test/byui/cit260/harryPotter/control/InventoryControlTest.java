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
     * Test of calcBroomSpeed method, of class InventoryControl.
     */
    @Test
    public void testCalcBroomSpeed() {
        System.out.println("calcBroomSpeed");
        
        /***********************
         * Test Case #1
         **********************/
        System.out.println("\tTest Case #1");
        
        //input values for test case 1
        double distance = 100;
        double broomSpeed = 150;
        
        //expected output
        double expResult = 3;
        
        //create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        //call function to run test
        double result = instance.calcBroomSpeed(distance, broomSpeed);
        
        //compare expected return value with actual return value
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         * Test Case #2
         **********************/
        System.out.println("\tTest Case #2");
        
        //input values for test case 2
        distance = 100;
        broomSpeed = 20;
        
        //expected output
        expResult = -1;       
        
        //call function to run test
        result = instance.calcBroomSpeed(distance, broomSpeed);
        
        //compare expected return value with actual return value
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         * Test Case #3
         **********************/
        System.out.println("\tTest Case #3");
        
        //input values for test case 3
        distance = 100;
        broomSpeed = 201;
        
        //expected output
        expResult = -1;       
        
        //call function to run test
        result = instance.calcBroomSpeed(distance, broomSpeed);
        
        //compare expected return value with actual return value
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         * Test Case #4
         **********************/
        System.out.println("\tTest Case #4");
        
        //input values for test case 4
        distance = -1;
        broomSpeed = 100;
        
        //expected output
        expResult = -1;       
        
        //call function to run test
        result = instance.calcBroomSpeed(distance, broomSpeed);
        
        //compare expected return value with actual return value
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         * Test Case #5
         **********************/
        System.out.println("\tTest Case #5");
        
        //input values for test case 5
        distance = 10;
        broomSpeed = 60;
        
        //expected output
        expResult = 3;       
        
        //call function to run test
        result = instance.calcBroomSpeed(distance, broomSpeed);
        
        //compare expected return value with actual return value
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         * Test Case #6
         **********************/
        System.out.println("\tTest Case #6");
        
        //input values for test case 6
        distance = 500;
        broomSpeed = 100;
        
        //expected output
        expResult = 30;       
        
        //call function to run test
        result = instance.calcBroomSpeed(distance, broomSpeed);
        
        //compare expected return value with actual return value
        assertEquals(expResult, result, 0.0001);
        
        /***********************
         * Test Case #7
         **********************/
        System.out.println("\tTest Case #7");
        
        //input values for test case 7
        distance = 0;
        broomSpeed = 100;
        
        //expected output
        expResult = 0;       
        
        //call function to run test
        result = instance.calcBroomSpeed(distance, broomSpeed);
        
        //compare expected return value with actual return value
        assertEquals(expResult, result, 0.0001);

        
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

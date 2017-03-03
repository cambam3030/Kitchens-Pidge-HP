/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import java.util.Scanner;

/**
 *
 * @author chriskitchens
 */
public abstract class View implements ViewInterface {
    
    private String displayMessage;
       
    public abstract void display();
    
    public String getInput(String prompt) {
        Scanner keyboard = new Scanner(System.in); // get inFile for keyboard
        String value = null; // value to be returned
        boolean valid = false; // initialized not valid
        
        while(!valid){ // loop while invalid value is entered
            System.out.println("\n"+ prompt);
        
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
        
            if(value.length()<1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue; 
            }
        
            break; // end loop
        
        }
        return value; // return value entered
    }
    
    public String getInput(){
        return getInput(this.displayMessage);
    }
    
}

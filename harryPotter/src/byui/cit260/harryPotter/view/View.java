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
    protected String displayMessage;
    
    public View() {
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        boolean done = false;
        do {
            // prompt for and get player name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the view
            
            // do requested action and display next view
            done = this.doAction(value);
        } while (!done); // exit view when done == true
    }
    
   @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in); // get inFile for keyboard
        String value = null; // value to be returned
        boolean valid = false; // initialized not valid
        
        while(!valid){ // loop while invalid value is entered
            System.out.println("\n"+ this.displayMessage);
        
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
    
    
}

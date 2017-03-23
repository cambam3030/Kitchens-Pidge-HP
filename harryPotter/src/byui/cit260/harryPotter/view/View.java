/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import harrypotter.HarryPotter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author chriskitchens
 */
public abstract class View implements ViewInterface {
    
    private String displayMessage;
    
    protected final BufferedReader keyboard = HarryPotter.getInFile();
    protected final PrintWriter console = HarryPotter.getOutFile();
    
       
    public abstract void display();
    
    public String getInput(String prompt) {
        // get inFile for keyboard
        String value = null; // value to be returned
        boolean valid = false; // initialized not valid
        try{
        while(!valid){ // loop while invalid value is entered
            this.console.println("\n"+ prompt);
        
            value = this.keyboard.readLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
        
            if(value.length()<1) { // value is blank
                ErrorView.display(this.getClass().getName(),"\nInvalid value: value cannot be blank");
                continue; 
            }
          
            break; // end loop
        }
        }catch (Exception e){
                ErrorView.display(this.getClass().getName(),"Error reading input:"
                                   + e.getMessage());
                }
        
        
        return value; // return value entered
    }
    
    public String getInput(){
        return getInput(this.displayMessage);
    }
    
}

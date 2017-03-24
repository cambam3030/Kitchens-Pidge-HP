/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import byui.cit260.harryPotter.control.InventoryControl;
import byui.cit260.harryPotter.exceptions.InventoryControlException;
import java.util.Scanner;

/**
 *
 * @author Cami
 */
public class LocationDungeon {
    public String description;
    public double time;
    public double weight;
    public String weightInput;
    public String timeInput;
  /*  
    public void displayLocationDungeonView() 
            throws InventoryControlException {
        
        boolean done = false; // begin false for loop
        
        while (done == false){
            
            double timeInput = this.getTimeInput();
            double weightInput = this.getWeightInput();
            try {
                done = this.doAction(weightInput, timeInput);
            } catch (InventoryControlException ive) {
                ErrorView.display(this.getClass().getName(),ive.getMessage());
                
            } catch (Throwable te) {
                ErrorView.display(this.getClass().getName(),te.getMessage());
                te.printStackTrace();
                //return;
        }
    }
    }
  

    public LocationDungeon() {
        this.description = "\n Welcome to the Dungeons! Today we're going"
                + "\n to calculate the does of Poly Juice potion needed to"
                + "\n disguise your character based on their weight and the"
                + "\n time they need to be disguesed."
                + "\n"
                + "\n Please enter in the weight of your character and the time"
                + "\n they need the potion to work. The weight must be between"
                + "\n 100 and 400 pounds. The time needs to be between 60 and "
                + "\n 190 minutes. Once entered, the dosage will be calculated!"
                ;
    }
    
    private double getTimeInput() {
       
        
        boolean valid = false; // initialized not valid
        this.console.println("\n" + this.description);
        this.console.println("\n Please enter the time requried:");
        
        while(!valid){ // loop while invalid value is entered
            
            timeInput = this.keyboard.readLine(); // get next line typed on keyboard            
            try {
                time = Double.parseDouble(timeInput);
                return time;
            } catch(NumberFormatException nf){
                    ErrorView.display(this.getClass().getName(),"Please enter a valid number.");                    
            }
            if (!valid) {
                continue;
            } else {             
            }
            break;// end loop
        
        }
        return time; // return value entered
    }

    private double getWeightInput() {
        
        
        boolean valid = false; // initialized not valid
        
        this.console.println("\n Please enter the character's weight:");
        
        while(!valid){ // loop while invalid value is entered
            
        
            weightInput = this.keyboard.readLine(); // get next line typed on keyboard
            
            try {
                weight = Double.parseDouble(weightInput);
                return weight;
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),"\n You must enter a valid number");
            }
            
            if(!valid) {
                continue;
            } else {
            }
            
            break; // end loop
        
        }
        return weight; // return value entered
    }
        
    private boolean doAction(double weightInput, double timeInput) 
            throws InventoryControlException {
        InventoryControl inventoryControlPolyJuice = new InventoryControl();
        inventoryControlPolyJuice.calcPolyJuice(weightInput, timeInput);
        
        this.console.println("\n Please take " + inventoryControlPolyJuice.doseInOunces + " ounces for best results!");
        
        return true;
    }*/
}
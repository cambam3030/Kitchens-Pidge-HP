/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import byui.cit260.harryPotter.control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author Cami
 */
public class LocationDungeon {
    public String description;
    public double time;
    public double weight;
    
    public void displayLocationDungeonView() {
        
        boolean done = false; // begin false for loop
        while (done == false) {
            double timeInput = this.getTimeInput();
            double weightInput = this.getWeightInput();
            done = this.doAction(timeInput, weightInput);
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
        Scanner keyboard = new Scanner(System.in); // get inFile for keyboard
        
        boolean valid = false; // initialized not valid
        System.out.println("\n" + this.description);
        System.out.println("\n Please enter the time requried:");
        
        while(!valid){ // loop while invalid value is entered

            time = keyboard.nextDouble(); // get next line typed on keyboard
            
        
            if (time < 60 || weight > 190) { // checks for valid time
                System.out.println("\n Invalid value: time cannot be less than 60 or more than 190"
                        + "Please enter your desired time:");
                continue; 
            }
        
            break; // end loop
        
        }
        return time; // return value entered
    }

    private double getWeightInput() {
        Scanner keyboard = new Scanner(System.in); // get inFile for keyboard
        
        boolean valid = false; // initialized not valid
        
        System.out.println("\n Please enter the character's weight:");
        
        while(!valid){ // loop while invalid value is entered
            
        
            weight = keyboard.nextDouble(); // get next line typed on keyboard
            
        
            if(weight < 100 || time > 400) { // checks for valid weight
                System.out.println("\n Invalid value: weight cannot be less than 100 or more than 400"
                        + "\n Please enter the character's weight:");
                continue; 
            }
        
            break; // end loop
        
        }
        return weight; // return value entered
    }
        
    private boolean doAction(double timeInput, double weightInput) {
        InventoryControl inventoryControlPolyJuice = new InventoryControl();
        inventoryControlPolyJuice.calcPolyJuice(timeInput, weightInput);
        
        System.out.println("\n Please take " + inventoryControlPolyJuice.doseInOunces + " for best results!");
        
        return true;
    }
}
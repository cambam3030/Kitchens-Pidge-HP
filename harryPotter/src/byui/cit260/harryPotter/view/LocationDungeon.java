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
    public String thisAssignmentIsStupid;
    public String timeInput;
    
    public void displayLocationDungeonView() 
            throws InventoryControlException {
        
        boolean done = false; // begin false for loop
        
        while (done == false){
            
            double timeInput = this.getTimeInput();
            double weightInput = this.getWeightInput();
            try {
                done = this.doAction(weightInput, timeInput);
            } catch (InventoryControlException ive) {
                System.out.println(ive.getMessage());
                
            } catch (Throwable te) {
                System.out.println(te.getMessage());
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
        Scanner keyboard = new Scanner(System.in); // get inFile for keyboard
        
        boolean valid = false; // initialized not valid
        System.out.println("\n" + this.description);
        System.out.println("\n Please enter the time requried:");
        
        while(!valid){ // loop while invalid value is entered
            
            timeInput = keyboard.next(); // get next line typed on keyboard            
            try {
                time = Double.parseDouble(timeInput);
                
            } catch(NumberFormatException nf){
                    System.out.println("Please enter a valid number.");                    
            }
            break;// end loop
        
        }
        return time; // return value entered
    }

    private double getWeightInput() {
        Scanner keyboard = new Scanner(System.in); // get inFile for keyboard
        
        boolean valid = false; // initialized not valid
        
        System.out.println("\n Please enter the character's weight:");
        
        while(!valid){ // loop while invalid value is entered
            
        
            thisAssignmentIsStupid = keyboard.nextLine(); // get next line typed on keyboard
            
            try {
                weight = Double.parseDouble(thisAssignmentIsStupid);
            } catch (NumberFormatException nf) {
                System.out.println("\n You must enter a valid number");
            }
            
            
            break; // end loop
        
        }
        return weight; // return value entered
    }
        
    private boolean doAction(double weightInput, double timeInput) 
            throws InventoryControlException {
        InventoryControl inventoryControlPolyJuice = new InventoryControl();
        inventoryControlPolyJuice.calcPolyJuice(weightInput, timeInput);
        
        System.out.println("\n Please take " + inventoryControlPolyJuice.doseInOunces + " ounces for best results!");
        
        return true;
    }
}
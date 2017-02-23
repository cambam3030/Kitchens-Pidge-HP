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
 * @author chriskitchens
 */
public class LocationPitch {
    public String description;
    public double speed;
    public double distance;
    
    public void displayLocationPitchView() {
        
        boolean done = false; // begin false for loop
        while (done == false) {
            double speedInput = this.getSpeedInput();
            double distanceInput = this.getDistanceInput();
            done = this.doAction(distanceInput, speedInput);
        }
    }
    

    public LocationPitch() {
        this.description = "\n Welcome to the Quidditch Pitch! Today we're going"
                + "\n to calculate the time it would take to catch the Snitch"
                + "\n depending on the broom being used and how far away the Snitch"
                + "\n started from you in yards and if it's traveling in the opposite"
                + "\n direction. This might sound complicated, but it's necessary for"
                + "\n every Quidditch player to know! Now, let's have you enter the"
                + "\n desired speed of your broom and the distance away from the Snitch"
                + "\n to see how long it would take you to catch it!"
                + "\n"
                + "\n As a reference, a Nimbus 2000 travels at 80 ft/s, a Firebolt"
                + "\n travels at 100 ft/s and a practice broom travels at 60 ft/s."
                + "\n"
                + "\n Make sure your speed is between 60-200 ft/s and the distance"
                + "\n isn't greater than 500!"
                ;
    }
    
    private double getSpeedInput() {
        Scanner keyboard = new Scanner(System.in); // get inFile for keyboard
        
        boolean valid = false; // initialized not valid
        System.out.println("\n" + this.description);
        System.out.println("\n Please enter your desired speed:");
        
        while(!valid){ // loop while invalid value is entered

            speed = keyboard.nextDouble(); // get next line typed on keyboard
            
        
            if(speed < 60 || speed > 200) { // value is blank
                System.out.println("\n Invalid value: speed cannot be less than 60 or more than 200"
                        + "Please enter your desired speed:");
                continue; 
            }
        
            break; // end loop
        
        }
        return speed; // return value entered
    }

    private double getDistanceInput() {
        Scanner keyboard = new Scanner(System.in); // get inFile for keyboard
        
        boolean valid = false; // initialized not valid
        
        System.out.println("\n Please enter the desired distance:");
        
        while(!valid){ // loop while invalid value is entered
            
        
            distance = keyboard.nextDouble(); // get next line typed on keyboard
            
        
            if(distance < 0 || distance > 500) { // value is blank
                System.out.println("\n Invalid value: distance cannot be 0 or more than 500"
                        + "\n Please enter the desired distance:");
                continue; 
            }
        
            break; // end loop
        
        }
        return distance; // return value entered
    }
        
    private boolean doAction(double distanceInput, double speedInput) {
        InventoryControl inventoryControlQuidditch = new InventoryControl();
        inventoryControlQuidditch.calcBroomSpeed(distanceInput, speedInput);
        
        System.out.println("\n It would take you " + inventoryControlQuidditch.qTime + " seconds to catch the Snitch!");
        
        return true;
    }




    
}

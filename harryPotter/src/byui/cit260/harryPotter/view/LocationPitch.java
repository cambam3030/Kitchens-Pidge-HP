/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import byui.cit260.harryPotter.control.InventoryControl;
import byui.cit260.harryPotter.exceptions.InventoryControlException;
import byui.cit260.harryPotter.model.Game;
import byui.cit260.harryPotter.model.Location;
import byui.cit260.harryPotter.model.Map;


/**
 *
 * @author chriskitchens
 */
public class LocationPitch extends ViewCalc{


    
    @Override
    public void display() {
        boolean done = false;
        do {
            
            //Game.map.setColumnCount(2);
            //Game.map.setRowCount(3);
            
            console.println(displayMessage);
            double speed = this.getDoubleInput("Please enter desired speed:");
            if (speed < 60) {
                ErrorView.display(this.getClass().getName(),"Speed must be between 60 and 200.");
                continue;
            }
            
            double distance = getDoubleInput("Please enter desired distance:");
            if (distance < 0 || distance > 500) {
                ErrorView.display(this.getClass().getName(),"Distance must be between 0 and 500.");
                continue;
                }
            
   
            
           
            try {               
                done = doAction(distance, speed);
            } catch (InventoryControlException ice) {
                ErrorView.display(this.getClass().getName(),ice.getMessage());
                return;
            } catch (Throwable te) {
                ErrorView.display(this.getClass().getName(),te.getMessage());
                te.printStackTrace();
                return;
            }
        } while (!done); // exit view when done == true
    }
    

    public LocationPitch() {
        displayMessage = "\n Welcome to the Quidditch Pitch! Today we're going"
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
    
        
    public boolean doAction(double distanceInput, double speedInput) 
            throws InventoryControlException {
        InventoryControl inventoryControlQuidditch = new InventoryControl();
        inventoryControlQuidditch.calcBroomSpeed(distanceInput, speedInput);
               
        this.console.println("\n It would take you " + inventoryControlQuidditch.qTime + " seconds to catch the Snitch!");
        
        return true;
    }




    
}

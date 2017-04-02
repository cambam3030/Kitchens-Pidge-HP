 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import byui.cit260.harryPotter.control.InventoryControl;
import byui.cit260.harryPotter.exceptions.InventoryControlException;

/**
 *
 * @author Cami
 */
public class LocationDungeon extends ViewCalc {
  
    @Override
    public void display() {
        console.println(displayMessage); 
        boolean done = false; // begin false for loop   
        do{
            //prompt for time and weight. 
            
            double time = this.getDoubleInput("Please enter time needed:");
            double weight = getDoubleInput("Please enter character's weight");

                      
            try {
                done = doAction(weight, time);
            } catch (InventoryControlException ive) {
                ErrorView.display(this.getClass().getName(),ive.getMessage());
                return;                
            } catch (Throwable te) {
                ErrorView.display(this.getClass().getName(),te.getMessage());
                te.printStackTrace();
                return;
            }
            } while(!done); //exit view when done == true
    }
      
    public LocationDungeon() {
        
        
        displayMessage = "\n Welcome to the Dungeons! Today we're going"
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
    
           
    public boolean doAction(double weightInput, double timeInput) 
            throws InventoryControlException {
        InventoryControl inventoryControlPolyJuice = new InventoryControl();
        inventoryControlPolyJuice.calcPolyJuice(weightInput, timeInput);
        
        this.console.println("\n Please take " + inventoryControlPolyJuice.doseInOunces + " ounces for best results!");
        
        return true;
    }
}
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
public class LocationGringotts extends ViewCalc{
    
    @Override
    public void display() {
        console.println(displayMessage);
        boolean done = false;
        do {
            // prompt for galleons and sickles
            double galleons = this.getDoubleInput("Please enter galleons:");
            double sickles = getDoubleInput("Please enter sickles:");
            
                
            
            // do requested action and display next view
            try {
                done = doAction(galleons, sickles);
            } catch (InventoryControlException ive) {
                ErrorView.display(this.getClass().getName(),ive.getMessage());
                return;
            } catch (Throwable te) {
                ErrorView.display(this.getClass().getName(),te.getMessage());
                te.printStackTrace();
                return;
            }
        } while (!done); // exit view when done == true
    }
    

    public LocationGringotts() {
        displayMessage =  "\n Welcome to Gringotts! It's time to exchange your"
                + "\n wizzarding money for US dollars. You will need to enter in"
                + "\n the amount of galleons and sickles you have left. The goblins"
                + "\n will do some quick calulating and tell you what you have left"
                + "\n in US dollars. The galleons and sickles amount cannot be"
                + "\n less than 0 or greater than 1000."        
                ;
    }
    
        
    public boolean doAction(double galleonsInput, double sicklesInput) 
            throws InventoryControlException {
        InventoryControl inventoryControlMoney = new InventoryControl();
        inventoryControlMoney.moneyExchange(galleonsInput, sicklesInput);
        
        this.console.println("\n You have $" + inventoryControlMoney.dollars + " US Dollars Left!");
        
        return true;
    }
   
}

    


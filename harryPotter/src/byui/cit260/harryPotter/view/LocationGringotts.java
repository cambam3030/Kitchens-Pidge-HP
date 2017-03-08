/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import byui.cit260.harryPotter.control.InventoryControl;

/**
 *
 * @author Cami
 */
public class LocationGringotts extends ViewCalc{
    
    @Override
    public void display() {
        System.out.println(displayMessage);
        boolean done = false;
        do {
            // prompt for and get player name
            double galleons = this.getDoubleInput("Please enter galleons:");
            double sickles = getDoubleInput("Please enter sickles:");
            
                
            
            // do requested action and display next view
            done = doAction(galleons, sickles);
        } while (!done); // exit view when done == true
    }
    

    public LocationGringotts() {
        super(  "\n Welcome to Gringotts! It's time to exchange your"
                + "\n wizzarding money for US dollars. You will need to enter in"
                + "\n the amount of galleons and sickles you have left. The goblins"
                + "\n will do some quick calulating and tell you what you have left"
                + "\n in US dollars. The galleons and sickles amount cannot be"
                + "\n less than 0 or greater than 1000."
        )
                ;
    }
    
        
    public boolean doAction(double galleonsInput, double sicklesInput) {
        InventoryControl inventoryControlMoney = new InventoryControl();
        inventoryControlMoney.moneyExchange(galleonsInput, sicklesInput);
        
        System.out.println("\n You have $" + inventoryControlMoney.dollars + " US Dollars Left!");
        
        return true;
    }
   
}

    


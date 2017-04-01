/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import byui.cit260.harryPotter.model.Inventory;
import harrypotter.HarryPotter;

/**
 *
 * @author chriskitchens
 */
public class LocationOllivanders extends ViewMenu{
    
    public LocationOllivanders(){
        super("\n Welcome to Ollivanders, the world renowned wand-maker's shop!"
                + "\n Every witch and wizard needs a want to perform spells. This"
                + "\n is an essential tool to have!"
                + "\n"
                + "\n W - obtain wand"
                + "\n E - exit");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "W": //obtain wand
                console.println("\n You've obtained a wand! Now you're ready to start casting spells!");
                Inventory[] inventory = HarryPotter.getCurrentGame().getInventory();
                inventory[0].setStockAvailable(1);
                return true;
            case "E": //exit
                return true;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }    
}

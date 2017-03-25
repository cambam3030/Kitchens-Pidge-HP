/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import byui.cit260.harryPotter.control.GameControl;
import byui.cit260.harryPotter.model.Inventory;
import harrypotter.HarryPotter;

/**
 *
 * @author chriskitchens
 */
public class ListItems extends ViewMenu {
       
    public ListItems() {
        super("\n The following items will be seen throughout the game:"
                + "\n 1. Wand"
                + "\n 2. Invisibility Cloak"
                + "\n 3. Time-turner"
                + "\n 4. Owl"
                + "\n 5. Potions"
                + "\n\t Polyjuice Potion"
                + "\n\t Felix Felices"
                + "\n 6. Ingredients"
                + "\n\t Mandrake Root"
                + "\n\t Bezoar"
                + "\n\t Dittany"
                + "\n\t Dragon's blood"
                + "\n 7. Broomstick"
                + "\n 8. Potions book"
                + "\n 9. Cauldron"
                + "\n 10.Library pass to restricted section"
                + "\n 11.Snitch"
                + "\n"
                + "\n ** Press 'R' to return **"
                + "\n ** Press 'P' to print list to file **");
}
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch (choice) {
            case "R": //return
                done = true;
                break;
            case "P": //print item list to file
                printItems();
                done = true;
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return done;
    }

    private void printItems() {
        String filePath = getInput("\n*\nEnter the file path for your saved game.");
        StringBuilder line;
        
        String[] items = Inventory.printItems();
        this.console.println("\n  LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                    ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        this.console.println(line.toString());
        
        //for each inventory item 
        for (String item : items){
            line = new StringBuilder("                                       ");
            line.insert(0,item);
            
            
            
            //DISPAY the line
            this.console.println(line.toString());
        }
        
        
        try{
            //save the game to a specified file
            GameControl.printItemList(items, filePath);
            console.println("\nItem list successfully printed.");
        }catch (Exception ex){
            ErrorView.display("ListItems", ex.getMessage());
        }
    }
}

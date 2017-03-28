/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import byui.cit260.harryPotter.control.GameControl;
import byui.cit260.harryPotter.model.Spells;

/**
 *
 * @author Cami
 */
public class ListSpells extends ViewMenu {
       
    public ListSpells() {
        super("\n The following Spells will be used throughout the game:"
                + "\n 1. Alohamora "
                + "\n 2. Wingardium Leviosa "
                + "\n 3. Expelliarmus "
                + "\n 4. Obliviate "
                + "\n 5. Lumos "
                + "\n 6. Knox"
                + "\n 7. Felix Felices"
                + "\n 8. Petrificus Totalis "
                + "\n 9. Reparo"
                + "\n 10. Protego"
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
        
        String[] spells = Spells.printSpells();
        this.console.println("\n  LIST OF SPELLS");
        line = new StringBuilder("                                    ");
        line.insert(0, "EFFECT");
        line.insert(20, "IN STOCK");
        this.console.println(line.toString());
        
        //for each inventory item 
        for (String item : spells){
            line = new StringBuilder("                                       ");
            line.insert(0,item);
            
            
            
            //DISPAY the line
            this.console.println(line.toString());
        }
        
        
        try{
            //save the game to a specified file
            GameControl.printSpellsList(spells, filePath);
            console.println("\nSpells list successfully printed.");
        }catch (Exception ex){
            ErrorView.display("ListSpells", ex.getMessage());
        }
    }
}



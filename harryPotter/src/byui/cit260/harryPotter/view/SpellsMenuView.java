/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import byui.cit260.harryPotter.control.GameControl;
import byui.cit260.harryPotter.model.Spells;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author chriskitchens
 */

/*
* accessed from Gameplay Menu
*/

public class SpellsMenuView extends ViewMenu {

    
    /**
     * displays spells menu view
     */
    
/*    public void displaySpellsMenuView() {
        
        boolean done = false; // begin false for loop
        while (done == false) {
            String menuOption = this.getMenuOption();
            done = this.doAction(menuOption);
        }
    } */
    
    public SpellsMenuView() {
        super("\n"
                + "\n----------------------------------------------------------"
                + "\n| Spells Menu                                            |"
                + "\n----------------------------------------------------------"
                + "\n AL - Alohamora"
                + "\n W  - Wingardium Leviosa"
                + "\n E  - Expelliarmus"
                + "\n O  - Obliviate"
                + "\n L  - Lumos"
                + "\n N  - Knox"
                + "\n PT - Petrificus Totalis"
                + "\n FX - Reparo"
                + "\n PR - Protego"
                + "\n\t *R  - Return to previous menu*"
                + "\n\t *P - Print Spells list*"
                + "\n----------------------------------------------------------");
    }

 
@Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case
        boolean done = false;
        // provide spell description based on choice entered
        switch (choice){
            case "AL": 
                this.console.println("Alohamora is used to unlock things! Doors, chests, you name it!");
                break;
            case "W": 
                this.console.println("Wingardium Leviosa is used to levitate objects!");
                break;
            case "EX":
                this.console.println("Expelliarmus is your standard disarming charm against opponents!");
                break;
            case "O": 
                this.console.println("Obliviate is a memory charm! Use wisely.");
                break;
            case "L": 
                this.console.println("Lumos lights the end of your wand so you can see your surroundings better!");
                break;
            case "N": 
                this.console.println("Knox removes the light at the end of your wand tip!");
                break;
            case "PT": 
                this.console.println("Petrificus Totalis petrifies your opponent, making them stiff as a board!");
                break;
            case "FX": 
                this.console.println("Reparo can be used to repair items and various objects!");
                break;
            case "PR": 
                this.console.println("Protego is your basic shielding charm to protect yourself!");
                break; 
            case "P":
                this.console.println("Print a list of Spells");
                printItems();
                break;
            case "R":
                done = true;
                this.console.println("\n*** Returning ***");
                return done;
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

    


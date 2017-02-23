/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import java.util.Scanner;
/**
 *
 * @author chriskitchens
 */
public class SpellsMenuView {
    private String menu;
    
    /**
     * displays spells menu view
     */
    
    public void displaySpellsMenuView() {
        
        boolean done = false; // begin false for loop
        while (done == false) {
            String menuOption = this.getMenuOption();
            done = this.doAction(menuOption);
        }
    }
    
    public SpellsMenuView() {
        this.menu = "\n"
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
                + "\n----------------------------------------------------------";
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get inFile for keyboard
        String choice = ""; // value to be returned
        boolean valid = false; // initialized not valid
        
        while(!valid){ // loop while invalid value is entered
            System.out.println("\n"+ this.menu);
        
            choice = keyboard.nextLine(); // get next line typed on keyboard
            choice = choice.trim(); // trim off leading and trailing blanks
        
            if(choice.length()<1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue; 
            }
        
            break; // end loop
        
        }
        return choice; // return value entered
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case
        boolean done = false;
        // provide spell description based on choice entered
        switch (choice){
            case "AL": 
                System.out.println("Alohamora is used to unlock things! Doors, chests, you name it!");
                break;
            case "W": 
                System.out.println("Wingardium Leviosa is used to levitate objects!");
                break;
            case "EX":
                System.out.println("Expelliarmus is your standard disarming charm against opponents!");
                break;
            case "O": 
                System.out.println("Obliviate is a memory charm! Use wisely.");
                break;
            case "L": 
                System.out.println("Lumos lights the end of your wand so you can see your surroundings better!");
                break;
            case "N": 
                System.out.println("Knox removes the light at the end of your wand tip!");
                break;
            case "PT": 
                System.out.println("Petrificus Totalis petrifies your opponent, making them stiff as a board!");
                break;
            case "FX": 
                System.out.println("Reparo can be used to repair items and various objects!");
                break;
            case "PR": 
                System.out.println("Protego is your basic shielding charm to protect yourself!");
                break;    
            case "R":
                done = true;
                System.out.println("\n*** Returning ***");
                return done;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return done;
    }




    
}

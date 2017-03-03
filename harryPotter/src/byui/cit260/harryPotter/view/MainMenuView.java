/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import byui.cit260.harryPotter.control.GameControl;
import harrypotter.HarryPotter;


/**
 *
 * @author Cami
 */
public class MainMenuView extends ViewMenu {
   
   
   /**
    * displays the start program view
    */

    public MainMenuView() {
     super("\n"
               + "\n------------------------------------------"
               + "\n| Main Menu                              |"
               + "\n------------------------------------------"
               + "\nN - Start new game"
               + "\nG - Get and start saved game"
               + "\nH - Get help on how to play the game"
               + "\nGP- Game Play Menu"
               + "\nS - Save game"
               + "\nQ - Quit"
               + "\n------------------------------------------");
    }

@Override  
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            case "N": //get and start an existing game
                this.startNewGame();
                break;
            case "G": //get and start an existing game
                this.startExistingGame();
                break;
            case "H":// display the help menu
                this.displayHelpMenuView();
                break;
            case "T"://test for LocationPitch class -- this will not be included here and is only used as test
                this.displayLocationPitchView();
                break;
            case "D":// test for LocationDungeon class-- this will not be included here and is only used as test
                this.displayLocationDungeonView();
                break;
            case "GP"://Display Game Play Menu
                this.displayGameMenuView();
                break;
            case "S": //save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
        
    }

    private void startNewGame() {
       // create a new game
       GameControl.createNewGame(HarryPotter.getPlayer());
       
       //display the game menu
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("\n*** The startExistingGame() function was called"); 
    }

    private void displayHelpMenuView() {
        //display the help menu
       HelpMenuView helpMenuView = new HelpMenuView();
       helpMenuView.display();
    }
    private void displayGameMenuView() {
        //display the help menu
       GameMenuView gameMenuView = new GameMenuView();
       gameMenuView.display();
    }
    private void saveGame() {
        System.out.println("\n*** The saveGame() function was called"); 
    }

    private void displayLocationPitchView() {
         LocationPitch locationPitch = new LocationPitch();
         locationPitch.display();
    }
    
    private void displayLocationDungeonView() {
         LocationDungeon locationDungeon = new LocationDungeon();
         locationDungeon.displayLocationDungeonView();
    }

   
    
 
    }
    


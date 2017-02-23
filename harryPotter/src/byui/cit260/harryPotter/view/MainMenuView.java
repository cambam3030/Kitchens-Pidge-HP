/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import byui.cit260.harryPotter.control.GameControl;
import harrypotter.HarryPotter;
import java.util.Scanner;

/**
 *
 * @author Cami
 */
public class MainMenuView {
   private String menu;
   
   /**
    * displays the start program view
    */

  public void displayMainMenuView() {
       
      boolean done = false; // set flag to not done
      do{ 
          // prompt for and get players name
          String menuOption = this.getMenuOption();
          if (menuOption.toUpperCase().equals ("Q")) // user wants to quit
              return; // exit the game
          
          // do the requested action and sisplay the next view
          done = this.doAction(menuOption);
      } while (!done);
    }

    public MainMenuView() {
     this.menu = "\n"
               + "\n------------------------------------------"
               + "\n| Main Menu                              |"
               + "\n------------------------------------------"
               + "\nN - Start new game"
               + "\nG - Get and start saved game"
               + "\nH - Get help on how to play the game"
               + "\nS - Save game"
               + "\nQ - Quit"
               + "\n------------------------------------------";
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
       helpMenuView.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("\n*** The saveGame() function was called"); 
    }

    private void displayLocationPitchView() {
         LocationPitch locationPitch = new LocationPitch();
         locationPitch.displayLocationPitchView();
    }

   
    
 
    }
    


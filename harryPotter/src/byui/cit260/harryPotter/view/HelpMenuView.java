/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import java.util.Scanner;

/**
 *
 * @author Cami
 */
public class HelpMenuView {
   private String menu;
   
   /**
    * displays the start program view
    */

  public void displayHelpMenuView() {
       
      boolean done = false; // set flag to not done
      do{ 
          // prompt for and get players selection
          String menuOption = this.getMenuOption();
          if (menuOption.toUpperCase().equals ("R")) // user wants to quit
              return; // exit the game
          
          // do the requested action and sisplay the next view
          done = this.doAction(menuOption);
      } while (!done);
    }

    public HelpMenuView() {
     this.menu = "\n"
               + "\n------------------------------------------"
               + "\n| Help Menu                              |"
               + "\n------------------------------------------"
               + "\nH - How to Play"
               + "\nM - Movement"
               + "\nW - Where am I?"
               + "\nR - Return"
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
            case "H": //instructions on how to play and the goal of the game
                this.howToPlay();
                break;
            case "M": //how to move
                this.howToMovement();
                break;
            case "W":// display user's current location
                this.whereAmI();
                break;
            case "R"://return to main menu
                this.returnToMain();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
        
    }


    private void howToPlay() {
         System.out.println("\n*** The howToPlay() function was called**");
          this.displayHelpMenuView();
    }

    private void howToMovement() {
         System.out.println("\n*** The howToMovement() function was called**");
         this.displayHelpMenuView();
    }

    private void whereAmI() {
         System.out.println("\n*** The whereAmI() function was called**");
          this.displayHelpMenuView();
    }

    private void returnToMain() {
         MainMenuView mainMenu = new MainMenuView();
         mainMenu.displayMainMenuView();
    }

   
    
 
    }
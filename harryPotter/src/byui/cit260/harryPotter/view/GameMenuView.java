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
public class GameMenuView {

   private String menu;
   
   /**
    * displays the game menu view
    */

  public void displayGameMenuView() {
       
    boolean done = false; // set flag to not done
      while (done == false) {
          String menuOption = this.getMenuOption();
          done = this.doAction(menuOption);
      }  
      
      /*do{ 
          // prompt for and get players selection
          String menuOption = this.getMenuOption();
          if (menuOption.toUpperCase().equals ("R")) // user wants to quit
              done = true; // exit the game
          
          // do the requested action and display the next view
          done = this.doAction(menuOption);
      } while (!done);*/
    }

    public GameMenuView() {
     this.menu = "\n"
               + "\n------------------------------------------"
               + "\n| Game Menu                              |"
               + "\n------------------------------------------"
               + "\nP - Pause"
               + "\nR - Resume"
               + "\nI - Inventory"
               + "\nC - Characters Met"
               + "\nS - Save"
               + "\nH -  Help Menu"
               + "\nE -  Exit"
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
     boolean done = false;    
        switch (choice){
            case "P": //Pause game
                this.pauseGame();
                break;
            case "R": //Resume Game
                this.resumeGame();
                break;
            case "I":// View Inventory
                this.viewInventory();
                break;
            case "C": //View Characters Met
                this.charactersMet();
                break;
            case "S": //save the current game
                this.saveGame();
                break;
            case "H": // View Help Menu
                this.helpMenu();
                break;
            case "E": //Exit Game
                done = true;
                return done;           
                                
            default:   
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
        
    }
    private void saveGame() {
        System.out.println("\n*** The saveGame() function was called"); 
    }

    private void pauseGame() {
       System.out.println("The pauseGame() function was called."); 
    }

    private void resumeGame() {
        System.out.println("The resumeGame() function was called."); 
    }

    private void viewInventory() {
        System.out.println("The viewInventory() function was called."); 
    }

    private void charactersMet() {
        System.out.println("The charcatersMet() function was called."); 
    }

    private void helpMenu() {
        System.out.println("The helpMenu() function was called."); 
    }

    void displayMenu() {
        System.out.println("The displayMenu() function was called."); 
    }

   
    
 
    }
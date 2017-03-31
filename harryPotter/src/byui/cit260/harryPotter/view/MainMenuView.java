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
               + "\n N - Start new game"
               + "\n L - Load a saved game"
               + "\n H - Get help on how to play the game"
               + "\n GP- Game Play Menu"              
               + "\n Q - Quit"
               + "\n------------------------------------------");
    }

@Override  
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            case "N": //get and start an existing game
                this.startNewGame();
                break;
            case "L": //get and start an existing game
                this.startExistingGame();
                break;
            case "H":// display the help menu
                this.displayHelpMenuView();
                break;
            /*case "T"://test for LocationPitch class -- this will not be included here and is only used as test
                this.displayLocationPitchView();
                break;
            case "D":// test for LocationDungeon class-- this will not be included here and is only used as test
                try{
                    this.displayLocationDungeonView();
                } catch (InventoryControlException ive) {
                    ErrorView.display(this.getClass().getName(),ive.getMessage());
                } catch (Throwable te){
                    ErrorView.display(this.getClass().getName(),te.getMessage());
                }
                break;
            case "B"://test for LocationGringotts class -- this will not be included here and is only used as test
                this.displayLocationGringottsView();
                break;
                */
            case "GP"://Display Game Play Menu
                this.displayGameMenuView();
                break;
            case "Q":
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
        
    }

    private void startNewGame() {
       // create a new game
       GameControl.createNewGame(HarryPotter.getPlayer());
       
       //display the game menu
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.display();
    }

    private void startExistingGame() {
         
        String filePath = this.getInput("\n*Enter the file path for your saved game");
        
        try{
            //save the existing game to a specified file 
            GameControl.getSavedGame(filePath);
        }catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        console.println("\n Currently playing as: ");
        console.println(HarryPotter.getCurrentGame().getPlayer().getName());
        //display te game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
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

}

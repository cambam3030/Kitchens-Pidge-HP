/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

/**
 *
 * @author Cami
 */
public class GameMenuView extends ViewMenu{

   /**
    * displays the game menu view
    */

    

    public GameMenuView() {
     super("\n"
               + "\n------------------------------------------"
               + "\n| Game Menu                              |"
               + "\n------------------------------------------"
               + "\n P - Pause"
               + "\n R - Resume"
               + "\n I - Inventory"
               + "\n SP- Spells"
               + "\n C - Characters Met"
               + "\n S - Save"
               + "\n H - Help Menu"
               + "\n E - Exit"
               + "\n------------------------------------------");
    }
    @Override    
    public boolean doAction(String choice) {
        
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
            case "SP":
                this.displaySpellMenuView();
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
    
    private void displaySpellMenuView() {
        SpellsMenuView spellMenuView = new SpellsMenuView();
        spellMenuView.display();
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
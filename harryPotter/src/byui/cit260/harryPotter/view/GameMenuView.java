/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import byui.cit260.harryPotter.model.Game;
import byui.cit260.harryPotter.model.Inventory;
import byui.cit260.harryPotter.model.Location;
import byui.cit260.harryPotter.model.Map;
import harrypotter.HarryPotter;

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
               + "\n M - Map"
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
            case "M": //View Map
                this.displayMap();
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
        StringBuilder line;
        Game game = HarryPotter.getCurrentGame();
        Inventory[] inventory = game.getInventory();
        
        System.out.println("\n  LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                    ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        System.out.println(line.toString());
        
        //for each inventory item 
        for (Inventory item : inventory){
            line = new StringBuilder("                                       ");
            line.insert(0,item.getName());
            line.insert(23,item.getAmountNeeded());
            line.insert(33, item.getStockAvailable());
            
            //DISPAY the line
            System.out.println(line.toString());
        }
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

    private void displayMap() {
        StringBuilder line;
        Game game = HarryPotter.getCurrentGame();
        Map map = game.getMap();
        
        System.out.println("\n     MAP     ");
        line = new StringBuilder("                                      ");
        line.insert(0, "DESCRIPTION");
        line.insert(20,"ROW");
        line.insert(30, "COLUMN");
        
        System.out.println(line.toString());
        //For every row
        
        for(Location rowCount: scene){
            line = new StringBuilder("                                  ");
            line.insert(0, scence.getDescription);
            
            location = locations[row][column];
            
            
        } 
         
        
        

/*PRINT a row divider
 PRINT the row number on a new line
 FOR every column in row
 PRINT a column divider
 location = locations[row][column]
 IF location has been visited
 PRINT the mapSymbol in the scene in this location
 ELSE
 DISPLAY " ?? "
 ENDIF
 PRINT the ending column divider
 ENDFOR
 PRINT ending row divider
END*/
        
    }

   
    
 
    }
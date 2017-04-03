/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import byui.cit260.harryPotter.control.GameControl;
import byui.cit260.harryPotter.model.Game;
import byui.cit260.harryPotter.model.HousePoints;
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
               + "\n T - Travel to a location within the game"
               + "\n I - Inventory"
               + "\n SP- Spells"
               + "\n C - Characters"
               + "\n HP- View House Points"
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
            case "T": // LocationMenuView
                locationMenuView();
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
            case "HP":
                this.housePoints();
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
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
        
    }
    
    private void saveGame() {
        String filePath = getInput("\n*\nEnter the file path for your saved game.");
        
        try{
            //save the game to a specified file
            GameControl.saveGame(HarryPotter.getCurrentGame(), filePath);
        }catch (Exception ex){
            ErrorView.display("GameMenuView", ex.getMessage());
        } 
    }

    private void viewInventory() {
        StringBuilder line;
        Game game = HarryPotter.getCurrentGame();
        Inventory[] inventory = game.getInventory();
        
        this.console.println("\n  LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                    ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        this.console.println(line.toString());
        
        //for each inventory item 
        for (Inventory item : inventory){
            line = new StringBuilder("                                       ");
            line.insert(0,item.getName());
            line.insert(23,item.getAmountNeeded());
            line.insert(33, item.getStockAvailable());
            
            //DISPLAY the line
            this.console.println(line.toString());
        }
    }
    
    private void displaySpellMenuView() {
        SpellsMenuView spellMenuView = new SpellsMenuView();
        spellMenuView.display();
    }

    private void charactersMet() {
        this.console.println("In this game you may run across the following characters"
                + "\n Hagrid"
                + "\n Ron" 
                + "\n Hermione" 
                + "\n Harry" 
                + "\n Ginny" 
                + "\n Fred and George" 
                + "\n Malfoy" 
                + "\n Peeves" 
                + "\n Filch" 
                + "\n Professor Snape" 
                + "\n Professor Lupin" 
                + "\n Professor Bins"
                + "\n Professor Mcgonagall"
                + "\n Professor Dumbledore"
                + "\n Madam Pompfrey"
                + "\n Gringots Goblin"
                + "\n Ollivander"
                + "\n Firenze "
                + "\n Aragog"
                + "\n Death Eater"
                + "\n Moaning Myrtle"
                + "\n Luna Lovegood"
                + "\n Neville Longbottom"
                + "\n Minister of Magic"
                + "\n Dementors  "); 
    }
    
    private void housePoints() {
        console.println("\n ---*** Current House Points ***---"
                + "\n Gryffindor: " + HousePoints.housePoints[0] + "<-- Player"
                + "\n Slytherin: " + HousePoints.housePoints[1]
                + "\n Ravenclaw: " + HousePoints.housePoints[2]
                + "\n HufflePuff: " + HousePoints.housePoints[3]
                );
    }
    
    private void helpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();    
    }


    private void displayMap() {
        StringBuilder line;
        Game game = HarryPotter.getCurrentGame();
        Map map = game.getMap();
        
        this.console.println("\n     MAP     ");
        line = new StringBuilder("                                      ");
        /*line.insert(0, "DESCRIPTION");
        line.insert(20,"ROW");
        line.insert(30, "COLUMN");*/
        
        this.console.println(line.toString());
        //For every row
        
        Location[][] locations = map.getLocations();
        
        for(int row = 0; row < locations.length; row++){
            for(int column = 0; column < locations[row].length; column++){
                Location location = locations[row][column];
                this.console.print(location.getScene().getMapSymbol());
                this.console.print(" ");
            }
            this.console.println();
            
        }         
    }

    private void locationMenuView() {
        LocationMenuView locationMenuView = new LocationMenuView();
        locationMenuView.display();
    }



        
    }
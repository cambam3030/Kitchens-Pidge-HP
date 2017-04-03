/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.control;

import byui.cit260.harryPotter.exceptions.GameControlException;
import byui.cit260.harryPotter.model.Game;
import byui.cit260.harryPotter.model.HousePoints;
import byui.cit260.harryPotter.model.Inventory;
import byui.cit260.harryPotter.model.Location;
import byui.cit260.harryPotter.model.Map;
import byui.cit260.harryPotter.model.Player;
import byui.cit260.harryPotter.model.Scene;
import byui.cit260.harryPotter.model.Scene.SceneType;
import harrypotter.HarryPotter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Cami
 */
public class GameControl {
    
    private static PrintWriter inventoryFile = null;

    public static PrintWriter getInventoryFile() {
        return inventoryFile;
    }

    public static void setInventoryFile(PrintWriter inventoryFile) {
        GameControl.inventoryFile = inventoryFile;
    }
    
    

    public static Player createPlayer(String name) {
       
        if (name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        HarryPotter.setPlayer(player); //save the player
      
             return player;
    }

    public static void createNewGame(Player player) {
        
        Game game = new Game(); //create new game
        HarryPotter.setCurrentGame(game); //save in HarryPotter
        
        game.setPlayer(player); // save player in game
        
        // create the inventory list and save in the game
        Inventory[] inventory = GameControl.createInventoryList();
        game.setInventory(inventory);
        
        //Character[] character = GameControl.createCharacter();
        //game.setCharacter(character);
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in game
        
        //move characters to starting postion in the map
        //MapControl.moveCharacterToStartingLocation(map);
        
    }

        

    private static Inventory[] createInventoryList() {//don't need data types, just parameter names * needs fix
        //Inventory inventory = new Inventory(name, amountNeeded, stockAvailable);
        
        Inventory[] inventory = Inventory.createInventory();
        
        return inventory;
    }
    
    
    public static void submitHousePoints(){
        int housePoints[] = {500, 600, 700, 800};
        
        /*this.console.println("\n\t HOUSE POINTS");
        this.console.println(" Hufflepuff has " + housePoints[0] + " house points!");
        this.console.println(" Ravenclaw has " + housePoints[1] + " house points!");
        this.console.println(" Slytherin has " + housePoints[2] + " house points!");
        this.console.println(" Gryffindor has " + housePoints[3] + " house points!");*/
        
        findMinMaxPoints(housePoints);
    }
    
    public static void findMinMaxPoints(int housePoints[]){
        int min, max;
        
        min = max = housePoints[0];
        for(int i=1; i < 4; i++){ // i starts at 1 to compare next value. if statements replace min/max value
            if(housePoints[i] < min) min = housePoints[i];
            if(housePoints[i] > max) max = housePoints[i];
        }
        
        /*this.console.println("\n Minimum and Maximum House Points: " + min + " and " + max);*/
    }

    public static void saveGame(Game currentGame, String filePath) 
            throws GameControlException{
            try(FileOutputStream fops = new FileOutputStream(filePath)){
                ObjectOutputStream output = new ObjectOutputStream(fops);
                
                output.writeObject(currentGame);
                //write the game object to a file
            }
       catch(Exception e){
           throw new GameControlException(e.getMessage());
       }
    }

    public static void getSavedGame(String filePath) 
            throws GameControlException{ 
           Game game = null;
           try(FileInputStream fips = new FileInputStream(filePath)){
               ObjectInputStream input = new ObjectInputStream (fips);
               
               game = (Game) input.readObject();
           }catch (Exception e){
               throw new GameControlException (e.getMessage());
           }
           //close the output file
           HarryPotter.setCurrentGame(game);//save in HarryPotter
       
    }


    public static void printItemList(String[] printItems, String filePath) 
            throws GameControlException {
        try(FileOutputStream fops = new FileOutputStream(filePath)){
                ObjectOutputStream output = new ObjectOutputStream(fops);
                
                output.writeObject(printItems);
                //write the game object to a file
            }
       catch(Exception e){
           throw new GameControlException(e.getMessage());
       }
    }
    
    public static void printItemsList(Inventory[] items){
        try{
            String filePath = "inventory.txt";
            GameControl.inventoryFile = new PrintWriter(filePath);

            StringBuilder line;
            Game game = HarryPotter.getCurrentGame();
            Inventory[] inventory = game.getInventory();
        
            inventoryFile.println("\n  LIST OF INVENTORY ITEMS");
            line = new StringBuilder("                                    ");
            line.insert(0, "DESCRIPTION");
            line.insert(20, "REQUIRED");   
            line.insert(30, "IN STOCK");
            inventoryFile.println(line.toString());
        
            //for each inventory item 
            for (Inventory item : inventory){
            line = new StringBuilder("                                       ");
            line.insert(0,item.getName());
            line.insert(23,item.getAmountNeeded());
            line.insert(33, item.getStockAvailable());
            
            inventoryFile.println(line.toString());
            }

        } catch(Exception e) {
                System.out.println("Exception" + e.toString() +
                    "\nCause: " + e.getCause() +
                    "\nMessage: " + e.getMessage());

                e.printStackTrace();
        } finally{
            try{
                if (GameControl.inventoryFile != null)
                    GameControl.inventoryFile.close();
                } catch (Exception ex) {
                    GameControlException.display(HarryPotter.class.getName(), "Error closing files");
                    return;
            }
        }
    }

    public static void printSpellsList(String[] printSpells, String filePath)
        throws GameControlException {
        try(FileOutputStream fops = new FileOutputStream(filePath)){
                ObjectOutputStream output = new ObjectOutputStream(fops);
                
                output.writeObject(printSpells);
                //write the game object to a file
            }
       catch(Exception e){
           throw new GameControlException(e.getMessage());
    

}
    }
}

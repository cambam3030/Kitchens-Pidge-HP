/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.control;

import byui.cit260.harryPotter.model.Game;
import byui.cit260.harryPotter.model.HousePoints;
import byui.cit260.harryPotter.model.Inventory;
import byui.cit260.harryPotter.model.Location;
import byui.cit260.harryPotter.model.Map;
import byui.cit260.harryPotter.model.Player;
import byui.cit260.harryPotter.model.Scene;
import byui.cit260.harryPotter.model.Scene.SceneType;
import harrypotter.HarryPotter;

/**
 *
 * @author Cami
 */
public class GameControl {

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
        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        //Character[] character = GameControl.createCharacter();
        //game.setCharacter(character);
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in game
        
        //move characters to starting postion in the map
        //MapControl.moveCharacterToStartingLocation(map);
        
    }

        

    private static Inventory[] createInventoryList() {//don't need data types, just parameter names * needs fix
        //Inventory inventory = new Inventory(name, amountNeeded, stockAvailable);
        return null;
    }
    
    
    public static void submitHousePoints(){
        int housePoints[] = {500, 600, 700, 800};
        
        this.console.println("\n\t HOUSE POINTS");
        this.console.println(" Hufflepuff has " + housePoints[0] + " house points!");
        this.console.println(" Ravenclaw has " + housePoints[1] + " house points!");
        this.console.println(" Slytherin has " + housePoints[2] + " house points!");
        this.console.println(" Gryffindor has " + housePoints[3] + " house points!");
        
        findMinMaxPoints(housePoints);
    }
    
    public static void findMinMaxPoints(int housePoints[]){
        int min, max;
        
        min = max = housePoints[0];
        for(int i=1; i < 4; i++){ // i starts at 1 to compare next value. if statements replace min/max value
            if(housePoints[i] < min) min = housePoints[i];
            if(housePoints[i] > max) max = housePoints[i];
        }
        
        this.console.println("\n Minimum and Maximum House Points: " + min + " and " + max);
    }
    

}

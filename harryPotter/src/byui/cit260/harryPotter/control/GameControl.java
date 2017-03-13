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
        
        Character[] character = GameControl.createCharacter();
        game.setCharacter(character);
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in game
        
        //move characters to starting postion in the map
        MapControl.moveCharacterToStartingLocation(map);
        
    }


    private static Inventory[] createInventoryList() {
        Inventory inventory = new Inventory(String name, double amountNeeded, double stockAvailable);
        return null;
    }

    
    public static void submitHousePoints(){
        int housePoints[] = {500, 600, 700, 800};
        
        System.out.println("\n\t HOUSE POINTS");
        System.out.println(" Hufflepuff has " + housePoints[0] + " house points!");
        System.out.println(" Ravenclaw has " + housePoints[1] + " house points!");
        System.out.println(" Slytherin has " + housePoints[2] + " house points!");
        System.out.println(" Gryffindor has " + housePoints[3] + " house points!");
        
        findMinMaxPoints(housePoints);
    }
    
    public static void findMinMaxPoints(int housePoints[]){
        int min, max;
        
        min = max = housePoints[0];
        for(int i=1; i < 4; i++){ // i starts at 1 to compare next value. if statements replace min/max value
            if(housePoints[i] < min) min = housePoints[i];
            if(housePoints[i] > max) max = housePoints[i];
        }
        
        System.out.println("\n Minimum and Maximum House Points: " + min + " and " + max);
    }
    
    
    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.diagonAlley.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.gringotts.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.leakyCauldron.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.ollivanders.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.flourishAndBlotts.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.knockturnAlley.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.hogwartsExpress.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.hogwarts.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.greatHall.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.dormitory.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.potions.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.charms.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.quidditch.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.library.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.transfiguration.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.hagridsHut.ordinal()]);
        locations[1][10].setScene(scenes[SceneType.forbiddenForest.ordinal()]);
        locations[1][11].setScene(scenes[SceneType.roomOfRequirements.ordinal()]);
        locations[1][12].setScene(scenes[SceneType.headMastersOffice.ordinal()]);
        
        
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.control;

import byui.cit260.harryPotter.model.Player;
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
        
       Game game = new Game();// create new game
       HarryPotter.setCurrentGame(game);// save in HarryPotter
       
       game.setPlayer(player);// save player in game
       
       //create the inventory list aand save in the game
       Inventory[] inventoryList = GameControl.createInventoryList();
       game.setInventory(inventoryList);
       
       Map map = MapControl.createMap();// create and initialize new map 
       game.setMap(map);//save map in game
       
      //Character character = new Character();// creacte and save character
      // game.setCharacter(character);
       //move actors to starting position in the map
       MapControl.moveCharactersToStartLocation(map);
    }
    public static Inventory[] createInventoryList(){
        System.out.println("*** called createInventoryList***");
        return null;        
    }
    }

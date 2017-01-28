/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harrypotter;

import byui.cit260.harryPotter.model.Character;
import byui.cit260.harryPotter.model.CharacterScene;
import byui.cit260.harryPotter.model.Game;
import byui.cit260.harryPotter.model.HousePoints;
import byui.cit260.harryPotter.model.Inventory;
import byui.cit260.harryPotter.model.Location;
import byui.cit260.harryPotter.model.Map;
import byui.cit260.harryPotter.model.Player;
import byui.cit260.harryPotter.model.Potions;
import byui.cit260.harryPotter.model.Quidditch;
import byui.cit260.harryPotter.model.ResourceTypeScene;
import byui.cit260.harryPotter.model.Scene;
import byui.cit260.harryPotter.model.Spells;

/**
 *
 * @author Cami
 */
public class HarryPotter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player playerOne = new Player();
       
       playerOne.setName("Ron Weasley");
       playerOne.setBestTime(7.00);
       
               
       String playerInfo= playerOne.toString();
       System.out.println(playerInfo);
       
       Location locationOne = new Location();
       
       locationOne.setRow("A");
       locationOne.setColumn("25");
       locationOne.setAmountRemaining(10);
       locationOne.setVisited("Hagrid");
       
       String locationInfo = locationOne.toString();
       System.out.println(locationInfo);
       
       Character characterOne = new Character();
       
       characterOne.setName("Neville Longbottom");
       characterOne.setDescription("Forgetful");
       characterOne.setCoordinates("Great Hall");
       
       String characterInfo = characterOne.toString();
       System.out.println(characterInfo);
       
      HousePoints housePoints = new HousePoints();
       
      housePoints.setHouse("Slytherin");
      housePoints.setAmount(1000);
      
      String housePointsInfo = housePoints.toString();
      System.out.println(housePointsInfo);
       
      
      Scene sceneOne = new Scene();
      
      sceneOne.setDescription("The bathroom is dark, smells of boomslang and Moaning Myrtle is crying");
      sceneOne.setTravelTime(20);
      sceneOne.setBlockedLocation("Slytherin common room.");
      sceneOne.setDisplaySymbol("Symbol");
      
      String sceneInfo = sceneOne.toString();
      System.out.println(sceneInfo);
      
      CharacterScene characterScene = new CharacterScene();
      
      characterScene.setName("Dungeon Scene");
      characterScene.setCreature("House Elf");
      characterScene.setFriendFoe("Foe");
      characterScene.setLocation("Common Room");
      characterScene.setMet("Met");
      characterScene.setAmountRemaining(100);
      
      ResourceTypeScene resourceType = new ResourceTypeScene();
      
      resourceType.setResourceType ("School Supplies");
      resourceType.setAmountAvailable(5);
      
      
      Inventory playerInventory = new Inventory();
      
      playerInventory.setName("Player Inventory");
      playerInventory.setAmountNeeded(5);
      playerInventory.setStockAvailable(4);
      
      String playerInventoryInfo = playerInventory.toString();
      System.out.println(playerInventoryInfo);
      
      Potions playerPotions = new Potions();
      playerPotions.setName("Felix Felices");
      playerPotions.setEffect("Grants luck");
      playerPotions.setAmountNeeded(2);
      playerPotions.setStockAvailable(1);
      playerPotions.setIngredients("Lots of brewing time");
      
      String playerPotionsInfo = playerPotions.toString();
      System.out.println(playerPotionsInfo);
      
      Quidditch playerQuidditch = new Quidditch();
      playerQuidditch.setName("Broom");
      playerQuidditch.setName("Nimbus 2000");
      playerQuidditch.setAmountNeeded(1);
      playerQuidditch.setStockAvailable(1);
      playerQuidditch.setSpeed(10);
      
      String playerQuidditchInfo = playerQuidditch.toString();
      System.out.println(playerQuidditchInfo);
      
      Spells playerSpells = new Spells();
      playerSpells.setEffect("Creates light.");
      playerSpells.setAmountNeeded(1);
      playerSpells.setStockAvailable(1);
      playerSpells.setName("Lumos");
      
      String playerSpellsInfo = playerSpells.toString();
      System.out.println(playerSpellsInfo);
      
      Game playerGame = new Game();
      playerGame.setNoPeople(1);
      playerGame.setTotalTime(50);
      
      String playerGameInfo = playerGame.toString();
      System.out.println(playerGameInfo);
      
      Map playerMap = new Map();
      playerMap.setColumnCount(2);
      playerMap.setRowCount(4);
      
      String playerMapInfo = playerMap.toString();
      System.out.println(playerMapInfo);
    }
    
}

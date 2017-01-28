/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harrypotter;

import byui.cit260.harryPotter.model.Character;
import byui.cit260.harryPotter.model.CharacterScene;
import byui.cit260.harryPotter.model.HousePoints;
import byui.cit260.harryPotter.model.Location;
import byui.cit260.harryPotter.model.Player;
import byui.cit260.harryPotter.model.RescourseTypeScene;
import byui.cit260.harryPotter.model.Scene;

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
      
      RescourseTypeScene resourceType = new RescourseTypeScene();
      
      resourceType.setResourceType ("School Supplies");
      resourceType.setAmountAvailable(5);
      
      
      
    }
    
}

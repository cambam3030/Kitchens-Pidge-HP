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
import byui.cit260.harryPotter.view.StartProgramView;

/**
 *
 * @author Cami
 */
public class HarryPotter {
    private static Game currentGame = null;
    private static Player player = null;
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // create StartProgramViewOrg and display start program view
       StartProgramView startProgramView = new StartProgramView();
       
       try {
           startProgramView.displayStartProgramView();       
       } catch (Throwable te) {
           System.out.println(te.getMessage());
           te.printStackTrace();
           startProgramView.displayStartProgramView();
       }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        HarryPotter.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        HarryPotter.player = player;
    }
    
}

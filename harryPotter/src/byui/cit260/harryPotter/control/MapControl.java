/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.control;

import byui.cit260.harryPotter.model.Map;
import byui.cit260.harryPotter.model.Scene;

/**
 *
 * @author Cami
 */
public class MapControl {

    private static Map createMap() {
        //create the map
        Map map = new Map(20,20);
        
        //create the scenes for the game
        Scene[] scenes = createScenes();
        
        //assign scenes to location
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
     
    }

    private static Scene[] createScenes() {
        Scene scene = new Scene();
        
        return null;

    }

    
}

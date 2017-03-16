/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.control;

import byui.cit260.harryPotter.model.Location;
import byui.cit260.harryPotter.model.Map;
import byui.cit260.harryPotter.model.Scene;

/**
 *
 * @author Cami
 */
public class MapControl {

    private static Map map;

    public static Map createMap() {
        //create the map
        map = new Map(4, 5);

        //create the scenes for the game
        Scene[] scenes = createScenes();

        //assign scenes to location
        assignScenesToLocations(map, scenes);

        return map;

    }

    private static Scene[] createScenes() {
        Scene scene = new Scene();

        Scene[] scenes = new Scene[Scene.SceneType.values().length];

        Scene start = new Scene();
        start.setDescription("");
        start.setMapSymbol(" ST ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[Scene.SceneType.start.ordinal()] = start;

        Scene diagonAlley = new Scene();
        diagonAlley.setDescription("Shopping Center");
        diagonAlley.setMapSymbol(" DA ");
        diagonAlley.setBlockedLocation(false);
        diagonAlley.setTravelTime(240);
        scenes[Scene.SceneType.diagonAlley.ordinal()] = diagonAlley;

        Scene leakyCauldron = new Scene();
        leakyCauldron.setDescription("Restaurant and Pub");
        leakyCauldron.setMapSymbol(" LC ");
        leakyCauldron.setBlockedLocation(false);
        leakyCauldron.setTravelTime(240);
        scenes[Scene.SceneType.leakyCauldron.ordinal()] = leakyCauldron;

        Scene gringotts = new Scene();
        gringotts.setDescription("wizard bank");
        gringotts.setMapSymbol(" GG ");
        gringotts.setBlockedLocation(false);
        gringotts.setTravelTime(240);
        scenes[Scene.SceneType.gringotts.ordinal()] = gringotts;

        Scene ollivanders = new Scene();
        ollivanders.setDescription("Wand Shop");
        ollivanders.setMapSymbol(" OL ");
        ollivanders.setBlockedLocation(false);
        ollivanders.setTravelTime(240);
        scenes[Scene.SceneType.ollivanders.ordinal()] = ollivanders;

        Scene knockturnAlley = new Scene();
        knockturnAlley.setDescription("Seedy Shopping Center");
        knockturnAlley.setMapSymbol(" KA ");
        knockturnAlley.setBlockedLocation(false);
        knockturnAlley.setTravelTime(240);
        scenes[Scene.SceneType.knockturnAlley.ordinal()] = knockturnAlley;

        Scene flourishAndBlotts = new Scene();
        flourishAndBlotts.setDescription("Book Shop");
        flourishAndBlotts.setMapSymbol(" FB ");
        flourishAndBlotts.setBlockedLocation(false);
        flourishAndBlotts.setTravelTime(240);
        scenes[Scene.SceneType.flourishAndBlotts.ordinal()] = flourishAndBlotts;

        Scene hogwartsExpress = new Scene();
        hogwartsExpress.setDescription("Train to Hogwarts");
        hogwartsExpress.setMapSymbol(" HE ");
        hogwartsExpress.setBlockedLocation(false);
        hogwartsExpress.setTravelTime(240);
        scenes[Scene.SceneType.hogwartsExpress.ordinal()] = hogwartsExpress;

        Scene hogwarts = new Scene();
        hogwarts.setDescription("School of witchcraft and wizardry");
        hogwarts.setMapSymbol(" HW ");
        hogwarts.setBlockedLocation(false);
        hogwarts.setTravelTime(240);
        scenes[Scene.SceneType.hogwarts.ordinal()] = hogwarts;

        Scene greatHall = new Scene();
        greatHall.setDescription("Gathering place");
        greatHall.setMapSymbol(" GH ");
        greatHall.setBlockedLocation(false);
        greatHall.setTravelTime(240);
        scenes[Scene.SceneType.greatHall.ordinal()] = greatHall;

        Scene dormitory = new Scene();
        dormitory.setDescription("Sleeping quarters");
        dormitory.setMapSymbol(" DM ");
        dormitory.setBlockedLocation(false);
        dormitory.setTravelTime(240);
        scenes[Scene.SceneType.dormitory.ordinal()] = dormitory;

        Scene potions = new Scene();
        potions.setDescription("Postions Class");
        potions.setMapSymbol(" PS ");
        potions.setBlockedLocation(false);
        potions.setTravelTime(240);
        scenes[Scene.SceneType.potions.ordinal()] = potions;

        Scene charms = new Scene();
        charms.setDescription("Charms Class");
        charms.setMapSymbol(" CS ");
        charms.setBlockedLocation(false);
        charms.setTravelTime(240);
        scenes[Scene.SceneType.charms.ordinal()] = charms;

        Scene quidditch = new Scene();
        quidditch.setDescription("Wizrd sporting event");
        quidditch.setMapSymbol(" QT ");
        quidditch.setBlockedLocation(false);
        quidditch.setTravelTime(240);
        scenes[Scene.SceneType.quidditch.ordinal()] = quidditch;

        Scene herbology = new Scene();
        herbology.setDescription("Herbology class");
        herbology.setMapSymbol(" HC ");
        herbology.setBlockedLocation(false);
        herbology.setTravelTime(240);
        scenes[Scene.SceneType.herbology.ordinal()] = herbology;

        Scene library = new Scene();
        library.setDescription("School Library");
        library.setMapSymbol(" LB ");
        library.setBlockedLocation(false);
        library.setTravelTime(240);
        scenes[Scene.SceneType.library.ordinal()] = library;

        Scene transfiguration = new Scene();
        transfiguration.setDescription("Transfiguration class");
        transfiguration.setMapSymbol(" TC ");
        transfiguration.setBlockedLocation(false);
        transfiguration.setTravelTime(240);
        scenes[Scene.SceneType.transfiguration.ordinal()] = transfiguration;

        Scene hagridsHut = new Scene();
        hagridsHut.setDescription("Hagrids house");
        hagridsHut.setMapSymbol(" HH ");
        hagridsHut.setBlockedLocation(false);
        hagridsHut.setTravelTime(240);
        scenes[Scene.SceneType.hagridsHut.ordinal()] = hagridsHut;

        Scene forbiddenForest = new Scene();
        forbiddenForest.setDescription("Students are forbidden to enter");
        forbiddenForest.setMapSymbol(" FF ");
        forbiddenForest.setBlockedLocation(false);
        forbiddenForest.setTravelTime(240);
        scenes[Scene.SceneType.forbiddenForest.ordinal()] = forbiddenForest;

        Scene roomOfRequirements = new Scene();
        roomOfRequirements.setDescription("Anything you need at the time appears");
        roomOfRequirements.setMapSymbol(" RR ");
        roomOfRequirements.setBlockedLocation(false);
        roomOfRequirements.setTravelTime(240);
        scenes[Scene.SceneType.roomOfRequirements.ordinal()] = roomOfRequirements;

        Scene headMastersOffice = new Scene();
        headMastersOffice.setDescription("Report to the headmaster for help or punishment");
        headMastersOffice.setMapSymbol(" HM ");
        headMastersOffice.setBlockedLocation(false);
        headMastersOffice.setTravelTime(240);
        scenes[Scene.SceneType.headMastersOffice.ordinal()] = headMastersOffice;

        return scenes;

    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {

        Location[][] locations = map.getLocations();

        //start point
        locations[0][0].setScene(scenes[Scene.SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[Scene.SceneType.diagonAlley.ordinal()]);
        locations[0][2].setScene(scenes[Scene.SceneType.gringotts.ordinal()]);
        locations[0][3].setScene(scenes[Scene.SceneType.leakyCauldron.ordinal()]);
        locations[0][4].setScene(scenes[Scene.SceneType.ollivanders.ordinal()]);
        locations[1][0].setScene(scenes[Scene.SceneType.flourishAndBlotts.ordinal()]);
        locations[1][1].setScene(scenes[Scene.SceneType.knockturnAlley.ordinal()]);
        locations[1][2].setScene(scenes[Scene.SceneType.hogwartsExpress.ordinal()]);
        locations[1][3].setScene(scenes[Scene.SceneType.hogwarts.ordinal()]);
        locations[1][4].setScene(scenes[Scene.SceneType.greatHall.ordinal()]);
        locations[2][0].setScene(scenes[Scene.SceneType.dormitory.ordinal()]);
        locations[2][1].setScene(scenes[Scene.SceneType.potions.ordinal()]);
        locations[2][2].setScene(scenes[Scene.SceneType.charms.ordinal()]);
        locations[2][3].setScene(scenes[Scene.SceneType.quidditch.ordinal()]);
        locations[2][4].setScene(scenes[Scene.SceneType.library.ordinal()]);
        locations[3][0].setScene(scenes[Scene.SceneType.transfiguration.ordinal()]);
        locations[3][1].setScene(scenes[Scene.SceneType.hagridsHut.ordinal()]);
        locations[3][2].setScene(scenes[Scene.SceneType.forbiddenForest.ordinal()]);
        locations[3][3].setScene(scenes[Scene.SceneType.roomOfRequirements.ordinal()]);
        locations[3][4].setScene(scenes[Scene.SceneType.headMastersOffice.ordinal()]);

    }

    public static Map getMap() {
        return map;
    }
    
    

}
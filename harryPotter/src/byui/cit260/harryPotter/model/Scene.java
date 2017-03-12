/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Cami
 */
public class Scene implements Serializable{
    
    //class instance variables
    private String description;
    private double travelTime;
    private boolean blockedLocation;
    private String displaySymbol;
    private String mapSymbol;

    public Scene() {
   
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene start = new Scene();
        start.setDescription("");
        start.setMapSymbol(" ST ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = start;
        
        Scene  diagonAlley = new Scene();
        start.setDescription("Shopping Center");
        start.setMapSymbol(" DA ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.diagonAlley.ordinal()] = diagonAlley;
        
        Scene leakyCauldron = new Scene();
        start.setDescription("Restaurant and Pub");
        start.setMapSymbol(" LC ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.leakyCauldron.ordinal()] =  leakyCauldron;
        
        Scene gringotts = new Scene();
        start.setDescription("wizard bank");
        start.setMapSymbol(" GG ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.gringotts.ordinal()] = gringotts;
        
        Scene ollivanders = new Scene();
        start.setDescription("Wand Shop");
        start.setMapSymbol(" OL ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.ollivanders.ordinal()] = ollivanders;
        
        Scene knockturnAlley = new Scene();
        start.setDescription("Seedy Shopping Center");
        start.setMapSymbol(" KA ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.knockturnAlley.ordinal()] = knockturnAlley;
        
        Scene flourishAndBlotts = new Scene();
        start.setDescription("Book Shop");
        start.setMapSymbol(" FB ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.flourishAndBlotts.ordinal()] = flourishAndBlotts;
        
        Scene hogwartsExpress = new Scene();
        start.setDescription("Train to Hogwarts");
        start.setMapSymbol(" HE ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.hogwartsExpress.ordinal()] = hogwartsExpress;
        
        Scene hogwarts = new Scene();
        start.setDescription("School of witchcraft and wizardry");
        start.setMapSymbol(" HW ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.hogwarts.ordinal()] = hogwarts;
        
        Scene greatHall = new Scene();
        start.setDescription("Gathering place");
        start.setMapSymbol(" GH ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.greatHall.ordinal()] = greatHall;
        
        Scene dormitory = new Scene();
        start.setDescription("Sleeping quarters");
        start.setMapSymbol(" DM ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.dormitory.ordinal()] = dormitory;
        
        Scene potions = new Scene();
        start.setDescription("Postions Class");
        start.setMapSymbol(" PS ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.potions.ordinal()] = potions;
        
        Scene charms = new Scene();
        start.setDescription("Charms Class");
        start.setMapSymbol(" CS ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.charms.ordinal()] = charms;
        
        Scene quidditch = new Scene();
        start.setDescription("Wizrd sporting event");
        start.setMapSymbol(" QT ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.quidditch.ordinal()] = quidditch;
        
        Scene herbology = new Scene();
        start.setDescription("Herbology class");
        start.setMapSymbol(" HC ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.herbology.ordinal()] = herbology;
        
        Scene library = new Scene();
        start.setDescription("School Library");
        start.setMapSymbol(" LB ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.library.ordinal()] = library;
        
        Scene transfiguration = new Scene();
        start.setDescription("Transfiguration class");
        start.setMapSymbol(" TC ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.transfiguration.ordinal()] = transfiguration;
        
        Scene hagridsHut = new Scene();
        start.setDescription("Hagrids house");
        start.setMapSymbol(" HH ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.hagridsHut.ordinal()] = hagridsHut;
        
        Scene forbiddenForest = new Scene();
        start.setDescription("Students are forbidden to enter");
        start.setMapSymbol(" FF ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.forbiddenForest.ordinal()] = forbiddenForest;
        
               
        Scene roomOfRequirements = new Scene();
        start.setDescription("Anything you need at the time appears");
        start.setMapSymbol(" RR ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.roomOfRequirements.ordinal()] = roomOfRequirements;
        
        Scene headMastersOffice = new Scene();
        start.setDescription("Report to the headmaster for help or punishment");
        start.setMapSymbol(" HM ");
        start.setBlockedLocation(false);
        start.setTravelTime(240);
        scenes[SceneType.headMastersOffice.ordinal()] = headMastersOffice;


        
    }

    public enum SceneType{
        start,
        diagonAlley,
        leakyCauldron,
        gringotts,
        ollivanders,
        knockturnAlley,
        flourishAndBlotts,
        hogwartsExpress,
        hogwarts,
        greatHall,
        dormitory,
        potions,
        charms,
        quidditch,
        herbology,
        library,
        transfiguration,
        hagridsHut,
        forbiddenForest,
        roomOfRequirements,
        headMastersOffice;
        
    
    }    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public boolean getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(boolean blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.blockedLocation);
        hash = 67 * hash + Objects.hashCode(this.displaySymbol);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", travelTime=" + travelTime + ", blockedLocation=" + blockedLocation + ", displaySymbol=" + displaySymbol + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.blockedLocation, other.blockedLocation)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        return true;
    }
    
    
    
    
}

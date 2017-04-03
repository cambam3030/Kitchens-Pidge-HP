/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

/**
 *
 * @author Cami
 */

    public class LocationRoomOfRequirements extends ViewMenu{
    
    public LocationRoomOfRequirements(){
        super("Welcome to the Room of Requirements. This room is a well kept"
                + "\n secret of the castle. It provides whatever you might be needing"
                + "\n at the moment. Please make a selection. "
                + "\n"
                + "\n S - Place to Study"
                + "\n MS - Midnight Snack"
                + "\n P - Place to hide from Peeves"
                + "\n R - Return");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "S":
                console.println("Griffindor just won an intense quiditch match"
                        + "\n and you need a quiet place to study. The room is"
                        + "\n equipped with over stuffed arm chairs, work tables,"
                        + "\n and a roaring fire. Hunker down for a long study session!");
                break;
            case "MS":
                console.println("You are wandering the castle under your invisiblity"
                        + "\n cloak with after an adventure, and you are starving."
                        + "\n The room is full of everything that might satisfy"
                        + "\n your late night cravings.");
                break;
            case "P":
                console.println("Peeves caught you out of your dorm after cerfew."
                        + "\n He is chasing you through the halls and says loudly in"
                        + "\n his singsong voice, 'Wandering around at midnight,"
                        + "\n  Ickle Firsties? Tut, tut, tut. Naughty, naughty,"
                        + "\n  you'll get caughty.' You duck into the roo of Requiremnts"
                        + "\n to hide until he leaves.");
                break;
            case "R":
                return true;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }    
}


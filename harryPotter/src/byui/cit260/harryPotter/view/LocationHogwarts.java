/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

/**
 *
 * @author chriskitchens
 */
public class LocationHogwarts extends ViewMenu{
    
    public LocationHogwarts(){
        super("\n ------ Welcome to Hogwarts School of Witchcraft and Wizardry! -----"
                + "\n"
                + "\n You've found yourself and arguably the best wizarding school"
                + "\n in the world. What mysteries will you find within? Will you"
                + "\n choose to study magic to defend yourself and help others? Or"
                + "\n will you study the dark arts and learn to exact your will on"
                + "\n your enemies? Regardless, every wizard and witch must start"
                + "\n somewhere. Where would you like to go first?"
                + "\n"
                + "\n C - Charms"
                + "\n D - Dormitory"
                + "\n P - Potions"
                + "\n F - Forbidden Forest"
                + "\n G - Great Hall"
                + "\n H - Hagrid's Hut"
                + "\n M - Headmaster's Office"
                + "\n B - Herbology"
                + "\n L - Library"
                + "\n Q - Quidditch Pitch"
                + "\n R - Room of Requirement"
                + "\n T - Transfiguration"
                + "\n"
                + "\n E - Exit");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "C": // charms
                charms();
                break;
            case "D":
                dorms(); //dorms
                break;
            case "P": //potions
                potions();
                break;
            case "F": //forbidden forest
                forest();
                break;
            case "G": //great hall
                greatHall();
                break;
            case "H": //hagrid's hut
                hagrid();
                break;
            case "M": //headmaster's office
                headmaster();
                break;
            case "B": //herbology
                herbology();
                break;
            case "L": //library
                library();
                break;
            case "Q": //quidditch pitch
                quidditch();
                break;
            case "R": //room of requirement
                roomOfRequirement();
                break;
            case "T": // transfiguration
                transfiguration();
                break;
            case "E": //exit/return
                return true;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }

    private void charms() {
        LocationCharms charms = new LocationCharms();
        charms.display();
    }

    private void dorms() {
        LocationDormitory dorms = new LocationDormitory();
        dorms.display();
    }

    private void potions() {
        LocationDungeon potions = new LocationDungeon();
        potions.display();
    }

    private void forest() {
        LocationForbiddenForest forest = new LocationForbiddenForest();
        forest.display();
    }

    private void greatHall() {
        LocationGreatHall greatHall = new LocationGreatHall();
        greatHall.display();
    }

    private void hagrid() {
        LocationHagridsHut hut = new LocationHagridsHut();
        hut.display();
    }

    private void headmaster() {
        LocationHeadMastersOffice headmaster = new LocationHeadMastersOffice();
        headmaster.display();
    }

    private void herbology() {
        LocationHerbology herbology = new LocationHerbology();
        herbology.display();
    }

    private void library() {
        LocationLibrary library = new LocationLibrary();
        library.display();
    }

    private void quidditch() {
        LocationPitch pitch = new LocationPitch();
        pitch.display();
    }

    private void roomOfRequirement() {
        LocationRoomOfRequirements room = new LocationRoomOfRequirements();
        room.display();
    }

    private void transfiguration() {
        LocationTransfiguration transfiguration = new LocationTransfiguration();
        transfiguration.display();
    }
}

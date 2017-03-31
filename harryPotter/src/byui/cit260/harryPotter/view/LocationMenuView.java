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
public class LocationMenuView extends ViewMenu{
    
    // displays the LocationMenuView for moving throughout the game.
    public LocationMenuView() {
        super("\n"
                + "\n-------------------------------------"
                + "\n|  Location Menu                    |"
                + "\n-------------------------------------"
                + "\n S  - Start Here"
                + "\n DA - Diagon Alley"
                + "\n LC - The Leaky Cauldron"
                + "\n GB - Gringotts Bank"
                + "\n OL - Ollivander's Wand Shop"
                + "\n KA - Knockturn Alley"
                + "\n FB - Flourish and Blotts"
                + "\n HE - Hogwarts Express"
                + "\n *----Hogwarts Locations----*"
                + "\n H  - Hogwarts Entrance"
                + "\n HG - Great Hall"
                + "\n HD - Dormitory"
                + "\n HP - Potions"
                + "\n HC - Charms"
                + "\n HQ - Quidditch Pitch"
                + "\n HH - Herbology"
                + "\n HL - Library"
                + "\n HT - Transfiguration"
                + "\n HA - Hagrid's Hut"
                + "\n HF - Forbidden Forest"
                + "\n HR - Room of Requirements"
                + "\n HO - Headmaster's Office"
                + "\n"
                + "\n HELP - Help Menu"
                + "\n GAME - Game Menu"
                + "\n MAIN - Main Menu"
                + "\n"
                + "\n *----E - Exit Menu----*"
                + "\n ");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
            switch (choice) {
                case "S": //start at home
                    start();
                    break;
                case "DA": //diagon alley
                    diagonAlley();
                    break;
                case "LC": //leaky cauldron
                    leakyCauldron();
                    break;
                case "GB": //gringotts
                    gringotts();
                    break;
                case "OL": //ollivanders
                    ollivanders();
                    break;
                case "KA": //knockturn alley
                    knockturnAlley();
                    break;
                case "FB": //flourish and blotts
                    flourishAndBlotts();
                    break;
                case "HE": //hogwarts express
                    hogwartsExpress();
                    break;
                case "H" : // hogwarts entrance
                    hogwarts();
                    break;
                case "HG": //great hall
                    greatHall();
                    break;
                case "HD": //dorms
                    dormitory();
                    break;
                case "HP": //potions
                    dungeons();
                    break;
                case "HC": //charms
                    charms();
                    break;
                case "HQ": // quidditch pitch
                    quidditch();                 
                    break;
                case "HH": // herbology
                    herbology();
                    break;
                case "HL": //library
                    library();
                    break;
                case "HT": //transfiguration
                    transfiguration();
                    break;
                case "HA": //hagrid's hut
                    hagridsHut();
                    break;
                case "HF": //forbidden forest
                    forbiddenForest();
                    break;
                case "HR": //room of requirement
                    roomOfRequirements();
                    break;
                case "HO": //headmaster's office
                    headMastersOffice();
                    break;
                case "E": //exit menu
                    done = true;
                    return done;
                
                case "HELP": //help menu
                    displayHelpMenu();
                    break;
                case "GAME": //game menu
                    displayGameMenu();
                    break;
                case "MAIN": //main menu
                    displayMainMenu();
                    break;
                    
                default:
                    this.console.println("\n*** Invalid selection *** Try again ***");
                    break;
                    
            }
            return false;
    }

    private void leakyCauldron() {
        LocationLeakyCauldron leaky = new LocationLeakyCauldron();
        leaky.display();
    }

    private void gringotts() {
        LocationGringotts locationGringotts = new LocationGringotts();
        locationGringotts.display();
    }

    private void ollivanders() {
        LocationOllivanders olivanders = new LocationOllivanders();
        olivanders.display();
    }

    private void knockturnAlley() {
        LocationKnockturnAlley knock = new LocationKnockturnAlley();
        knock.display();
    }

    private void flourishAndBlotts() {
        LocationFlourishAndBlotts bookstore = new LocationFlourishAndBlotts();
        bookstore.display();
    }

    private void hogwartsExpress() {
        LocationHogwartsExpress train = new LocationHogwartsExpress();
        train.display();
    }

    private void greatHall() {
        LocationGreatHall greatHall = new LocationGreatHall();
        greatHall.display();
    }

    private void dormitory() {
        LocationDormitory locationDormitory = new LocationDormitory();
        locationDormitory.display();
    }
    private void charms() {
        LocationCharms locationCharms = new LocationCharms();
        locationCharms.display();
    }
    private void herbology() {
        LocationHerbology locationHerbology = new LocationHerbology();
        locationHerbology.display();
    }

    private void library() {
        LocationLibrary locationLibrary = new LocationLibrary();
        locationLibrary.display();
    }

    private void transfiguration() {
        LocationTransfiguration locationTransfiguration = new LocationTransfiguration();
        locationTransfiguration.display();
    }

    private void hagridsHut() {
        LocationHagridsHut locationHagridsHut = new LocationHagridsHut();
        locationHagridsHut.display();
    }

    private void forbiddenForest() {
        LocationForbiddenForest locationForbiddenForest = new LocationForbiddenForest();
        locationForbiddenForest.display();
    }

    private void roomOfRequirements() {
        LocationRoomOfRequirements locationRoomOfRequirements = new LocationRoomOfRequirements();
        locationRoomOfRequirements.display();
    }

    private void headMastersOffice() {
        LocationHeadMastersOffice locationHeadMastersOffice = new LocationHeadMastersOffice();
        locationHeadMastersOffice.display();
    }

    private void dungeons() {
        LocationDungeon locationDungeon = new LocationDungeon();
        locationDungeon.display();
    }

    private void quidditch() {
        LocationPitch locationPitch = new LocationPitch();
        locationPitch.display();
    }

    private void diagonAlley() {
        LocationDiagonAlley diagonAlley = new LocationDiagonAlley();
        diagonAlley.display();
    }

    private void hogwarts() {
        LocationHogwarts hogwarts = new LocationHogwarts();
        hogwarts.display();
    }

    private void start() {
        LocationStart start = new LocationStart();
        start.display();
    }
    
}

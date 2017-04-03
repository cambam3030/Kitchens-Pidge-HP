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

    public class LocationHagridsHut extends ViewMenu{
    
    public LocationHagridsHut(){
        super("You've earned a much needed break from classes and thought a trip"
                + "\n to Hagrid's was in order. "
                + "\n"
                + "\n C - Eat one of Hagrid's cakes"
                + "\n T - Eat some of Hagrid's toffy"
                + "\n F - Pet Fang"
                + "\n S - You notice something smells like its burning. Ask what it is "
                + "\n R - Return");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "C"://The cake breaks your teeth.
                console.println("\n You took a rather large bite of cake. Well,"
                        + "\n you tried to. A visit to Madame Pomfrey may be in order"
                        + "\n to fix your now cracked teeth. You hid the rest in of the "
                        + "\n cake in your napkin so as not to hurt Hagrid's feelings.");
                break;
            case "T"://Toffy glues your mouth shut
                console.println("\n You enjoyed a nice bit of Hagrid's toffy. Until"
                        + "\n it glued your mouth shut, that is. You signaled"
                        + "\n Hermione covertly and she used her wand under the"
                        + "\n table to help unglue your jaw.");
                break;
            case "F"://Fang
                console.println("\n Fang was delighted for some attention! You"
                        + "\n are now covered in thick dog druel as a result of"
                        + "\n his appriciation.");
                break;
            case "S"://you discover a dragon
                console.println("\n Hagrid tried to explain away the smell unsuccessfully."
                        + "\n You saw his eyes dart to under the bed and you decided"
                        + "\n to have a look. You jumped back quickly when you realized"
                        + "\n his bedding had caught fire. He was hidding a newly"
                        + "\n hatched dragon under his bed!");
                break;
            case "R":// return 
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }    
}

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

        public class LocationLibrary extends ViewMenu{
    
    public LocationLibrary(){
        super("Welcome to the Library. Here you can find just about any magical topic "
                + "\n you could desire. Some books are locked away in the restricted "
                + "\n section for your safety."
                + "\n"
                + "\n R Restricted Section"
                + "\n HW Homework"
                + "\n S Study with Ron"
                + "\n E Exit");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "R"://restricted section
                console.println("\n You use your invisibilty cloak to enter the "
                        + "\n restricted section. You have to cut your session short "
                        + "\n though, because Peeves is floating near by and he "
                        + "\n is on to you.");
            case "HW":
                console.println("\n You chose to get an early start on your homework. "
                        + "\n Now you have the weekend to enjoy a trip to Hogsmead.");
            case "S":
                console.println("You chose to study with Ron. He and Hermione just "
                        + "had a row, and he was getting pretty loud recounting "
                        + "it to you. Madam Pince banned you both from the library for  "
                        + "\nthe day. You will need to use the weekend to do homework.");
            case "E":
                return true;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }    
}


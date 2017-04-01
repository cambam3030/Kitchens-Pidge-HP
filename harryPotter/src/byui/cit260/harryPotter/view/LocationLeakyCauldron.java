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
public class LocationLeakyCauldron extends ViewMenu{
    
    public LocationLeakyCauldron() {
        super("\n Welcome to the Leaky Cauldron!"
                + "\n"
                + "\n You enter the bustling tavern to find it crowded but comfortable."
                + "\n Settle in, rest a while, and enjoy a nice mug of Butter Beer!"
                + "\n"
                + "\n L - Look around"
                + "\n D - Have a drink "
                + "\n E - Exit");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "L": //look around
                console.println("\n As you look around the tavern you spot a huddled figure"
                        + "\n at the bar wearing a purple turban. I wonder what he's up to.");
                break;
            case "D": // drink
                console.println("\n You order a Butter Beer and instantly take a large gulp."
                        + "\n The creamy caramel beverage is ice cold and so refreshing.");
                break;
            case "E": // exit
                return true;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }
}

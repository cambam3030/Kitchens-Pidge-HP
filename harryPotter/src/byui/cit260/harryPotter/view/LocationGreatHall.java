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
public class LocationGreatHall extends ViewMenu{
    
    public LocationGreatHall() {
        super("\n You enter the Great Hall and find it lined with tables filled with students."
                + "\n The first year feast has begun! You take your seat alongside other students"
                + "\n and begin piling food on your plate, starved from the trip."
                + "\n"
                + "\n E - stay and eat"
                + "\n L - leave the great hall");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "E": //eat
                console.println("\n You fill your plate again and again with the most delicious food"
                        + "\n repeatedly conjured before your eyes. You might be a little stuffed"
                        + "\n for class tomorrow.");
            case "L": //leave
                return true;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }
}

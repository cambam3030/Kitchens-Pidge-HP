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
    public class LocationForbiddenForest extends ViewMenu{
    
    public LocationForbiddenForest(){
        super("You have entered the Forbidden Forest. If you were wise, you'd "
                + "\n turn back now! You have a few options while in the forrest "
                + "\n"
                + "\n S Follow the trail of spiders "
                + "\n C Look for the Centaurs to ask for help "
                + "\n U Follow the silver trail of unicorn blood"
                + "\n T Turn back");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "S"://Follow the spiders
                console.println("\nEeek! You've just run into Argog and his eight "
                        + "\n legged family members! Your fast talking is not working "
                        + "\n but Mr. Weasley's car shows up just in time to save you!");
                break;
            case "C": // Look for the Centaurs
                console.println("\nYou have not been well received by the Centaurs. "
                        + "\n Band and Ronan have declared you a trespasser  and "
                        + "\n are closing in on you. Firenze intervenes right on "
                        + "\n time and gives you a ride back to safety. ");
                break;
            case "U": // look around
                console.println("\nYou were so intent on following the trail of "
                        + "\n silvery blood that you almost missed the hooded "
                        + "\n figure hunched over the body of the dead unicorn. "
                        + "\n You backed away slowly and he did not see you. ");
                break;    
            case "T":// Turn back             
                return true;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }    
}
    

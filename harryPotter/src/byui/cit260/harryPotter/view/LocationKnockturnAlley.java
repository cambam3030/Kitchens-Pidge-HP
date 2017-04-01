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
public class LocationKnockturnAlley extends ViewMenu{
    
    public LocationKnockturnAlley() {
        super(    "\n You've entered Knockturn Alley, home to all things related"
                + "\n to dark magic. Here you'll find items of wondrous power,"
                + "\n but also imaginable danger."
                + "\n"
                + "\n L - Look around"
                + "\n E - Exit");
    }

    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "L": // look around
                console.println("You see huddled figures along the dark and dreary alley."
                        + "\n Some reach out to you with narled hands and hungry eyes."
                        + "\n It's probably best to just leave.");
                break;
            case "E"://return
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }
}

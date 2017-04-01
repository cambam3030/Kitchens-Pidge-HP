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
public class LocationStart extends ViewMenu{
    
    public LocationStart() {
        super("\n You awake one morning to a knock at your door and see a letter has been left"
                + "\n on your doorstep. It's a yellowing parchment sealed with red wax and a"
                + "\n large stamp with the word Hogwarts imprinted within, addressed directly"
                + "\n to you. "
                + "\n"
                + "\n You open it quickly and find the message within inviting you to attend"
                + "\n Hogwarts School of Witchcraft and Wizardry! Apparently, you have an "
                + "\n inherent knack for magic! You must be a wizard!"
                + "\n"
                + "\n You'll need to head to Diagon Alley to pick up your supplies before"
                + "\n catching the Hogwarts Express train to Hogwarts!"
                + "\n\n Good luck!"
                + "\n"
                + "\n E - Exit");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "E": //exit
                return true;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }
}

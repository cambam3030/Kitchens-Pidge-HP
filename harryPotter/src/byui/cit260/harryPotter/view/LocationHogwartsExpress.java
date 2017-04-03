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
public class LocationHogwartsExpress extends ViewMenu{
    
    public LocationHogwartsExpress() {
        super("\n You've found yourself on the Hogwarts Express with a one-way ticket"
                + "\n to Hogwarts School of Witchcraft and Wizardry! Enjoy the ride!"
                + "\n"
                + "\n L - Look around"
                + "\n N - Take a nap"
                + "\n C - Have a Chocolate Frog"
                + "\n E - Exit the Hogwarts Express");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "L": //look around
                console.println("\n You see many other cabs along the train which contain passengers,"
                        + "\n most likely students like yourself.");
                break;
            case "N": // take a nap
                console.println("\n You awake abruptly and find you've arrived at Hogwarts. You race"
                        + "\n off the train, ready for what awaits you.");
                done = true;
                break;
            case "C": //have a chocolate frog
                console.println("\n You open your Chocolate Frog to find a card of Albus Dumbledore inside!"
                        + "\n The frog is also quite delicious.");
                break;
            case "E":
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }
    
}

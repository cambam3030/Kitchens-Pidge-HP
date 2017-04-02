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
    public class LocationHerbology extends ViewMenu{
    
    public LocationHerbology(){
        super("Welcome to Herbology. Today we are replanting baby Mandrakes. Be"
                + "\n sure to put your ear muffs on tightly."
                + "\n"
                + "\n N - Choose Neville as your partner"
                + "\n H - Choose Hermione as our partner"
                + "\n R - Choose Ron as your partner"
                + "\n E - Exit");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "N":
                console.println("Neville tripped while carring his mandrake pot"
                        + "\n over to your table and dropped it. Professor Sprout"
                        + "\n was keeping a close eye on Neville, so she was able"
                        + "\n to act quickly before the pot had a chance to shatter.");
                break;
            case "H":
                console.println("Hermione executed the assigment perfectly while you"
                        + "\n watched. You both received top marks for the class.");
                break;
            case "R":
                console.println("You and Ron were too busy talking and you failed"
                        + "\n to get your earmuffs on in time. Thankfully, the"
                        + "\n mandrakes are still young, but you both were knocked"
                        + "\n unconcious for the remaineder of the class and failed"
                        + "\n the assignment.");
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

 

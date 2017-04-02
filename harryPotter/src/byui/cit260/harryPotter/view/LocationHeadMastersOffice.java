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

        public class LocationHeadMastersOffice extends ViewMenu{
    
    public LocationHeadMastersOffice(){
        super("\n You have been called to the Headmasters office. There are so many"
                + "\n things to look at. Be careful with what you touch."
                + "\n"
                + "\n P - Pensive"
                + "\n F - Fawkes"
                + "\n HM - Head Master Portraits"
                + "\n S - Sorting Hat"
                + "\n - Exit");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "P":
                console.println("\n You leaned in a bit to close to the pensive"
                        + "\n and landed right in the middle of a court session"
                        + "\n for the Death Eaters. The Dementors are looming"
                        + "\n ominously next to the prisoner that is currently"
                        + "\n being interrogated. It appears to be Lucius Malfoy."
                        + "\n You are startled when Dumbledore places a hand on"
                        + "\n your shoulder and brings you back to the present.");
                break;
            case "F":
                console.println("\n Fawkes looks a bit peaked. He has lost most"
                        + "\n of his feathers. Feeling concerned, you take a step"
                        + "\n forward to have a closer look. Suddenly, he bursts"
                        + "\n into flames. You are startled until Fawkes is reborn"
                        + "\n from his ashes.");
                break;
            case "HM":
                console.println("\n You notice the walls are covered with portraits"
                        + "\n of former Headmasters. Each of them appear to be"
                        + "\n sleeping, but you catch one or two of them looking"
                        + "\n at you from the corner of our eye.");
                break;
            case "S":
                console.println("You see the old, tattered looking sorting hat"
                        + "\n sitting on the headmaster's desk. You decide"
                        + "\n to put it on. After some gentle mocking from the hat "
                        + "\n and answering your questions with a question, you finally"
                        + "\n determime that you do belong in Griffindor afterall.");
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
    


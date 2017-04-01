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
public class LocationFlourishAndBlotts extends ViewMenu{
    
    public LocationFlourishAndBlotts(){
        super(    "\n Welcome to Flourish and Blotts! Here you'll find all your"
                + "\n wizarding book needs. Feel free to have a look around the"
                + "\n shop. There are many books here and I'm sure you'll find"
                + "\n something that interests you. We also have the Hogwarts"
                + "\n first years' book list available if you need any guidance."
                + "\n"
                + "\n C - Check out the book list"
                + "\n L - Look around"
                + "\n E - Exit");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "C": // book list
                console.println("\n First Year students need the following:"
                        + "\n 1. Potions book"
                        + "\n 2. Charms book"
                        + "\n 3. Transfiguration book");
                break;
            case "L": // look around
                console.println("\nLooking around the shop you spot mountains of neatly stacked books."
                        + "\n How will you pick what to read first?!");
                break;
            case "E": // exit shop
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }    
}

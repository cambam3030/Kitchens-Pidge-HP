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
   public class LocationTransfiguration extends ViewMenu{
    
    public LocationTransfiguration(){
        super("\n Welcome to Transfiguration Class. Here you will learn to tranform "
                + "\n even the most mundane of objects. "
                + "\n"
                + "\n PC Turn a Hedgehog into a Pincushion"
                + "\n M Turn a Match into a Needle"
                + "\n T Turn a Teapot into a Tortoise"
                + "\n R Return ");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "PC":
                console.println("\n You paid close attention and completed the "
                        + "\n transfiguration perfectly. You pins are even "
                        + "\n color coded.");
            case "M":
                console.println("You were too busy talking to Ron. The shape of the "
                        + "\n needle is right, but you failed to turn it to metal.");
            case "T":
                console.println("You achieved a tortoise, but steam is issuing from "
                        + "\n its mouth and its making a faint whistling sound.");
            case "R":
                return true;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }    
}

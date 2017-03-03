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
public class ListItems extends ViewMenu {
    
    public ListItems() {
        super("\n The following items will be seen throughout the game:"
                + "\n 1. Wand"
                + "\n 2. Invisibility Cloak"
                + "\n 3. Time-turner"
                + "\n 4. Owl"
                + "\n 5. Potions"
                + "\n\t Polyjuice Potion"
                + "\n\t Felix Felices"
                + "\n 6. Ingredients"
                + "\n\t Mandrake Root"
                + "\n\t Bezoar"
                + "\n\t Dittany"
                + "\n\t Dragon's blood"
                + "\n 7. Broomstick"
                + "\n 8. Potions book"
                + "\n 9. Cauldron"
                + "\n 10.Library pass to restricted section"
                + "\n 11.Snitch"
                + "\n ** Press 'R' to return **");
}
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch (choice) {
            case "R": //return
                done = true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return done;
    }
}

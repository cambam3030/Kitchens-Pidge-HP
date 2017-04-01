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
public class LocationDiagonAlley extends ViewMenu{
    
    public LocationDiagonAlley() {
        super(    "\n -----------Welcome to Diagon Alley!------------"
                + "\n You will buy all your supplies for school here,"
                + "\n as well as any other items you may need!"
                + "\n Where would you like to go first?"
                + "\n"
                + "\n F - Flourish and Blotts (bookstore)"
                + "\n L - Leaky Cauldron (pub)"
                + "\n K - Knockturn Alley (dark arts supplies)"
                + "\n O - Ollivanders (wandshop)"
                + "\n "
                + "\n E - Exit");
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        boolean done = false;
        
        switch(choice) {
            case "F": //flourish and blotts
                flourishAndBlotts();
                break;
            case "L": //leaky cauldron
                leakyCauldron();
                break;
            case "K": //knockturn alley
                knockturnAlley();
                break;
            case "O": //ollivanders
                ollivanders();
                break;
            case "E": //return
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again ***");
                break;
        }
        return false;
    }

    private void flourishAndBlotts() {
        LocationFlourishAndBlotts flourish = new LocationFlourishAndBlotts();
        flourish.display();
    }

    private void leakyCauldron() {
        LocationLeakyCauldron leaky = new LocationLeakyCauldron();
        leaky.display();
    }

    private void knockturnAlley() {
        LocationKnockturnAlley knock = new LocationKnockturnAlley();
        knock.display();
    }

    private void ollivanders() {
        LocationOllivanders ollivanders = new LocationOllivanders();
        ollivanders.display();
    }
    
}

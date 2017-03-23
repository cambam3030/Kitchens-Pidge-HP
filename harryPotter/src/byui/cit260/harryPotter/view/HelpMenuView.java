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
public class HelpMenuView extends ViewMenu{
 
   
   /**
    * displays the start program view
    */

    public HelpMenuView() {
     super("\n"
               + "\n------------------------------------------"
               + "\n| Help Menu                              |"
               + "\n------------------------------------------"
               + "\nH - How to Play"
               + "\nM - Movement"
               + "\nW - Where am I?"
               + "\nI - List of items"
               + "\nR - Return"
               + "\n------------------------------------------");
    }

        
@Override   
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
        boolean done = false;
        
        switch (choice){
            case "H": //instructions on how to play and the goal of the game
                this.howToPlay();
                break;
            case "M": //how to move
                this.howToMovement();
                break;
            case "W":// display user's current location
                this.whereAmI();
                break;
            case "R"://return to main menu
                done = true;
                this.console.println("\n*** Returning ***");
                return done;
            case "I": // list of items
                listItems();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return done;
        
    }


    private void howToPlay() {
         this.console.println("\n*** The howToPlay() function was called**");
          
    }

    private void howToMovement() {
         this.console.println("\n*** The howToMovement() function was called**");
         
    }

    private void whereAmI() {
         this.console.println("\n*** The whereAmI() function was called**"); // return Player location variable
          
    }
    
    private void listItems() {
        ListItems listItems = new ListItems();
        listItems.display();
    }


    }

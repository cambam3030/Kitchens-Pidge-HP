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
               + "\nM - How to Move"
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
                this.howToMove();
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
         this.console.println("\n*** Navigate your way through the wizzarding "
                 + "world. Visit the Locations in order and complete the tasks "
                 + "required. Earn House Points along the way. When you have completed"
                 + "your tasks, report to the Headmaster at the end of the game to"
                 + "get your final score.  **");
          
    }

    private void howToMove() {
         this.console.println("\n*** From the Game Menu, select the T to bring up"
                 + "the menu for locations you can travel to in the game. Make a"
                 + "selection for the next location you would like to go to. The "
                 + "locations must be traveled in order and steps cannot be "
                 + "skipped. Good luck!**");
         
    }

    
    private void listItems() {
        ListItems listItems = new ListItems();
        listItems.display();
    }


    }

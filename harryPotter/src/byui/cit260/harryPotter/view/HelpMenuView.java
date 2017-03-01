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
public class HelpMenuView extends View{
 
   
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
                System.out.println("\n*** Returning ***");
                return done;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return done;
        
    }


    private void howToPlay() {
         System.out.println("\n*** The howToPlay() function was called**");
          
    }

    private void howToMovement() {
         System.out.println("\n*** The howToMovement() function was called**");
         
    }

    private void whereAmI() {
         System.out.println("\n*** The whereAmI() function was called**");
          
    }


    }

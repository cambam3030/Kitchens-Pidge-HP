/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import byui.cit260.harryPotter.control.GameControl;
import byui.cit260.harryPotter.model.Player;
import harrypotter.HarryPotter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author chriskitchens
 */
public class StartProgramView {
    
    private String promptMessage;
    protected final BufferedReader keyboard = HarryPotter.getInFile();
    protected final PrintWriter console = HarryPotter.getOutFile();
    
    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        // display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        
        this.console.println(
                "\n				     //\\\\\n" +
"				    //  \\\\\n" +
"			     / \\   //    \\\\\n" +
"     Harry Potter Text       | |  //      \\\\\n" +
"	Adventure	      \\ \\//        \\\\\n" +
"			       `//          \\\\\n" +
"			       //____________\\\\\n" +
"			      /||  _  _  _   ||\\\n" +
"		       	       || |_||_||_|  ||\n" +
"        		       ||      	     ||\n" +
"               /\\              ||            ||\n" +
"               ||         /\\   ||	     ||\n" +
"              /  \\       /--\\  ||____________||\n" +
"             /____\\      |--|__||	     ||\n" +
"             |    |   __/|  |  ||	     ||\n" +
"             |    |__/   |  |  ||	     ||\n" +
" /\\      ___/|    |      |  |  ||	     ||\n" +
"/--\\ ___/    |    |      |  |  ||	     ||\n" +
"|--|/        |    |      |  |  ||	     ||\\___\n" +
"|  |         |    |            ||	     ||    \\_____\n" +
"|  |         |    |\n" +
"|  |    \n"
              + "\n********************************************************"
              + "\n* This text-based game takes players throughout        *"
              + "\n* the world of Harry Potter. Users will discover       *"
              + "\n* they’re a wizard/witch, obtain school supplies       *"
              + "\n* of their choice, attend school and learn spells,     *"
              + "\n* and use these spells to defend and assist            *"
              + "\n* themselves as they explore the world. As players     *"
              + "\n* learn and explore, they are awarded “House Points”   *"
              + "\n* which are spent on mulligans and various items.      *"
              + "\n* The end of the game will be a “menu-disabled” duel   *"
              + "\n* where the user will win or lose. The game begins     *"
              + "\n* with the player discovering they’re a wizard and     *"
              + "\n* receiving a letter to Hogwarts. They then travel     *"
              + "\n* to Diagon Alley to obtain school supplies before     *"
              + "\n* arriving at the school. Once there, they answer a    *"
              + "\n* series of questions to be sorted into their House    *"
              + "\n* and begin their adventures of attending classes      *"
              + "\n* where skills and spells are obtained. All classes    *"
              + "\n* must be complete before the user takes their         *"
              + "\n* O.W.L.s and are allowed to advance to the final duel.*"
              + "\n********************************************************"
              );
    }

    public void displayStartProgramView() {
        boolean done = false; // set flag to not done
        
        
        do {
            //Prompt for and get the input value
            String playerName = this.getPlayerName();
            
            if (playerName.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
        
            //do requested action and display the next view
                done = this.doAction(playerName);
            
          
    }   while (!done);
    
}

    public String getPlayerName() {
        
        String value = ""; // value to be returned
        boolean valid = false; // initialized not valid
        
        try {
        while(!valid){ // loop while invalid value is entered
            this.console.println("\n"+ this.promptMessage);
        
            value = this.keyboard.readLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
        
            if(value.length()<1) { // value is blank
                ErrorView.display(this.getClass().getName(),"\nInvalid value: value cannot be blank");
                continue; 
            }
            break;
        }
        }
        catch(Exception e){
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
            
        }
      
        return value; // return value entered
    }

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            ErrorView.display(this.getClass().getName(),"\nInvalid player's name: "
                    + "the name must be greater than one character in length.");
            return false;
                    }
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccessful
            ErrorView.display(this.getClass().getName(),"\nError creating the player.");
            return false;
        }
        // display next view
        this.displayNextView(player);
        return true; // success
    }

    private void displayNextView(Player player) {
        //display a custome welcome messge
        this.console.println("\n======================================"
                           +"\n Welcome to the game " + player.getName()
                           +"\n We hope you have a lot of fun!"
                           +"\n======================================"
                           ); 
        //Create MainMenueView object
        MainMenuView mainMenuView = new MainMenuView();
        //Display the main menu view
         mainMenuView.display();
        
    }






}


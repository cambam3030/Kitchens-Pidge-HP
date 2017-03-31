/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.view;

import java.util.Scanner;

/**
 *
 * @author chriskitchens
 */
public abstract class ViewMenu extends View {
    protected String displayMessage;
    
    public ViewMenu() {
        
    }
    
    public ViewMenu(String message) {
        this.displayMessage = message;
    }
    
    
    public void display() {
        boolean done = false;
        do {
            // prompt for and get player input
            String userChoice = getInput(displayMessage);
            
            
                
            
            // do requested action and display next view
            done = doAction(userChoice);
        } while (!done); // exit view when done == true
    }
    
    public abstract boolean doAction(String prompt);
    
    public void displayMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
    public void displayGameMenu(){
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
    public void displayHelpMenu(){
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
   
    
}

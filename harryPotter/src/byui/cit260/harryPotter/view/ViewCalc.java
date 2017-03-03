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
public abstract class ViewCalc extends View {
    protected String displayMessage;
    
    public ViewCalc() {
        
    }
    
    public ViewCalc(String message) {
        this.displayMessage = message;
    }
    
    
    public abstract void display();
    
  
    
    public double getDoubleInput(String prompt) {
        String doubleValue = getInput(prompt);
        return Double.parseDouble(doubleValue);
    }
    
    public int getIntInput(String prompt) {
        String intValue = getInput(prompt);
        return Integer.parseInt(intValue);
    }
}
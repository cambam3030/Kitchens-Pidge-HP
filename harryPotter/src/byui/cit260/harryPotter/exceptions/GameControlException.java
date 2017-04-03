/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.harryPotter.exceptions;

import harrypotter.HarryPotter;
import java.io.PrintWriter;

/**
 *
 * @author chriskitchens
 */
public class GameControlException extends Exception{
    private static final PrintWriter errorFile = HarryPotter.getOutFile();
    private static final PrintWriter logFile = HarryPotter.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        errorFile.println(
        "-----------------------------------------------------------------"
        + "\n - ERROR - " + errorMessage
        +"\n---------------------------------------------------------------");
        //log error
        logFile.println(className + " - " + errorMessage);
        //logFile.flush();
    }

    public GameControlException() {
    }

    public GameControlException(String message) {
        super(message);
    }

    public GameControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameControlException(Throwable cause) {
        super(cause);
    }

    public GameControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}

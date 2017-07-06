/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import java.io.PrintWriter;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
public class ErrorView {
    private static final PrintWriter errorFile = NotSoLost.getOutFile();
    private static final PrintWriter logFile = NotSoLost.getLogFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println("---------------------------------------------------"
                        + "\n- ERROR - " + errorMessage
                        + "\n-------------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }
}

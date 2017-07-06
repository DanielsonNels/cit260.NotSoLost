/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notsolost;

import buyi.cit260.notSoLost.view.StartProgramView;
import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nels Danielson
 */
public class NotSoLost {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        NotSoLost.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        NotSoLost.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        NotSoLost.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        NotSoLost.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        NotSoLost.logFile = logFile;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            // open charcter stream files for end user input and output
            NotSoLost.inFile = new BufferedReader(new InputStreamReader(System.in));
            NotSoLost.outFile = new PrintWriter(System.out, true);
            StartProgramView startProgramView = new StartProgramView();
            
            // open log file
            String filePath = "log.txt";
            NotSoLost.logFile = new PrintWriter(filePath);

            //create StartProgramView and start the program        
            startProgramView.displayStartProgramView();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            //startProgramView.displayStartProgramView();
        } finally {
            try {
                if (NotSoLost.inFile != null)   
                    NotSoLost.inFile.close();
                
                if (NotSoLost.outFile != null)
                    NotSoLost.outFile.close();
                
                if (NotSoLost.logFile != null)
                    NotSoLost.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing Files");
                return;
            }
        }
    }
}

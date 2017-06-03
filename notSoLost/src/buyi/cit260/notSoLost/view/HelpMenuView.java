/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import java.util.Scanner;
import buyi.cit260.notSoLost.view.MainMenuView;

/**
 *
 * @author JSaenz
 */
public class HelpMenuView {
    
    private String menu;
    private String promptMessage = "Please make a selection:";
    
    public HelpMenuView(){
        System.out.println ("\n"
                          + "\n----------------------------------------------"
                          + "\n| Help Menu                                  |"
                          + "\n----------------------------------------------"
                          + "\nG - What is the goal of the game?"
                          + "\nH - How to move?"
                          + "\nT - How to build tools?"
                          + "\nF - How to fix the raft?"
                          + "\nI - How to collect inventory?"
                          + "\nM - Main menu"
                          + "\nQ - Quit"
                          + "\n----------------------------------------------");
    }
    
    public void displayHelpMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game

            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }
    
    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;                
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }
    
    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "G": // create and start a new game
                System.out.println("What is the goal of the game?"
                                   + "\nNextline");
                break;
            case "H": // get and start an existing game
                System.out.println("How to move ?"
                                   + "\nNextline");
                break;
            case "T": // display the help menu
                System.out.println("How to build tools?"
                                   + "\nNextline");
                break;
            case "F": // save the current game
                System.out.println("How to fix the raft?"
                                   + "\nNextline");
                break;
            case "I": // save the current game
                System.out.println("How to collect inventory?"
                                   + "\nNextline");
                break;
            case "M": // save the current game
                System.out.println("Should call the main menu");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        
        return false;
    }
    
}

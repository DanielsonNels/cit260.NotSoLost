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
    private String promptMessage = "Please make a help menu selection:";
    
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
                          + "\nQ - Quit"
                          + "\n----------------------------------------------");
    }
    
    public void displayHelpMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get actors name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) { // return to main menu
                MainMenuView mainMenu = new MainMenuView();
                mainMenu.displayMainMenuView();
            }

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
            case "G": // What is the goal of the game?
                System.out.println("\nWhat is the goal of the game?"
                                   + "\n"                        
                                   + "\nAfter your ship wrecked on this diserted "
                                   + "\nisland, your goal is to find enough"
                                   + "\nmaterials to fix your raft and make your"
                                   + "\nway back to civilization.");
                break;
            case "H": // How to move ?
                System.out.println("\nHow to move ?"
                                   + "\n"                        
                                   + "\nTo move to a different location on the"
                                   + "\nisland, use the map game menu option and"
                                   + "\nselect the desired location.  Be aware that"
                                   + "\nmoving from location to location requires"
                                   + "\nthat you have enough enrgy to complete your"
                                   + "\njourney.");
                break;
            case "T": // How to build tools?
                System.out.println("\nHow to build tools?"
                                   + "\n"                        
                                   + "\nExplore the different locations of the"
                                   + "\nisland and collect the required materials"
                                   + "\nto build the following tools:"
                                   + "\n  S - Spear" 
                                   + "\n  B - Bow (Health must be above 20%)" 
                                   + "\n  R - Rope" 
                                   + "\n  T - Trotline (Health must be above 20%)" 
                                   + "\n  C - Club / Hammer" 
                                   + "\n  S - Snare");
                break;
            case "F": // How to fix the raft?
                System.out.println("\nHow to fix the raft?"
                                   + "\n"
                                   + "\nNThis will be the most important part of the game. "
                                   + "\nTo be able to win the game you must build a type of raft "
                                   + "\nwith the materials found on the island. You can only work "
                                   + "\non the raft a little at a time when you find certain "
                                   + "\nresources to use. A percentage will be given for the amount "
                                   + "\nof work that has been completed on the raft.");
                break;
            case "I": // How to collect inventory?
                System.out.println("\nHow to collect inventory?"
                                   + "\n"
                                   + "\nExplore the island and collect inventory items by"
                                   + "\ncollecting as many items as your backpack will carry.");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        
        return false;
    }
    
}

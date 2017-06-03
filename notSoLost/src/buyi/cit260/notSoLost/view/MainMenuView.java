/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.GameControl;
import buyi.cit260.notSoLost.view.GameMenuView;
import java.util.Scanner;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
public class MainMenuView {
    
    private String menu;
    private String promptMessage = "Please make a main menu selection:";
    
    public MainMenuView(){
        menu = "\n"
            + "\n----------------------------------------------"
            + "\n| Main Menu                                  |"
            + "\n----------------------------------------------"
            + "\nN - Start new game"
            + "\nG - Get and start saved game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nQ - Quit"
            + "\n----------------------------------------------";
    }

    public void displayMainMenuView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get actors name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {// user wants to quit
                System.out.println("\n"
                                 + "\n----------------------------------------------"
                                 + "\n| Exiting Game                               |"
                                 + "\n----------------------------------------------"
                                 + "\nThank you for playing!"
                                 + "\n----------------------------------------------");
                return; // exit the game
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
            System.out.println(this.menu + "\n" + this.promptMessage);
            
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
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        
        return false;
    }

    private void startNewGame() {      
        // create a new game
        GameControl.createNewGame(NotSoLost.getActor()); 
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame fucntion called ***");
    }

    private void displayHelpMenu() {
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("*** saveGame fucntion called ***");
    }
    
}

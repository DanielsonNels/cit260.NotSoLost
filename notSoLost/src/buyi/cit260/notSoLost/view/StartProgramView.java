/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.GameControl;
import byui.cit260.notSoLost.model.Player;
import java.util.Scanner;

/**
 *
 * @author JSaenz
 */
public class StartProgramView {
    
    private String promptMessage;
    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                  "\n**************************************************"
                + "\n* Welcome to Fantasy Island!                     *"
                + "\n* In this game you find youself ship wrecked and *"
                + "\n* alone.                                         *"
                + "\n*                                                *"
                + "\n* Placeholder----------------------------------  *"
                + "\n**************************************************"
        );
    }

    public void displayStartProgramView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String playersName = this.getPlayersName(); 
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(playersName);
        } while (!done);
    }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;                
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String playersName) {
        // if the length of the playersName < 2 then
            // display "Invalid name: The name must be > 1 character"
            // return false
            
        // create Player with specified name
        // if unsuccessful then
            // display "Invalid name: The name is too short"
            // return false
            
        // display customized welcome message
        // display mainMenuView
        // return true
        
        if (playersName.length() < 2) {
            System.out.println("\n Invalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control fucntion
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;            
        }
        // display next view
        this.displayNextView(player);
        
        return true; // success !
    }

    private void displayNextView(Player player) {
        
        // display a custom welcome message
        System.out.println("\n=========================================="
                          + "\n Welcome to the game " + player.getName()
                          + "\n We hope you have a lot of fun!"
                          + "\n========================================="
                          );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }
}

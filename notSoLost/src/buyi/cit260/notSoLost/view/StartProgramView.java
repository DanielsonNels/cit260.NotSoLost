/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.GameControl;
import byui.cit260.notSoLost.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
public class StartProgramView {

    public final BufferedReader keyboard = NotSoLost.getInFile();
    protected final PrintWriter console = NotSoLost.getOutFile();

    private final String promptMessage;

    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n***************************************************"
                + "\nStuck on an Island is a role play game. Users will "
                + "\ntake on the role of a character that they choose a "
                + "\nname for. The basic objective of this role play    "
                + "\ngame is this: survive until rescuers can make their"
                + "\nway to you. Here is the basic story for it. The    "
                + "\nplayer's ship crashed into an island. In the       "
                + "\nprocess, they have lost all communication with the "
                + "\noutside world. They are left with a few supplies   "
                + "\nfrom the boat and goods that are found on the      "
                + "\nisland itself. As the game begins, players find    "
                + "\nthat the goal is for them to use these things      "
                + "\nwisely to be able to survive until help arrives.   "
                + "\nIn the case of this game, there will be a certain  "
                + "\nnumber of actions/turns that the player must take  "
                + "\nrather than a time limit to be able to win.        "
                + "\n***************************************************"
        );
    }

    public void displayStartProgramView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String playersName = this.getPlayersName();
            // do the requested action and display the next view
            done = this.doAction(playersName);
        } while (!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = null; // value to be returned
        boolean valid = false; // initialize to not valid

        try {
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
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }

        return value; // return the value entered
    }

    private boolean doAction(String playersName) {
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
        mainMenuView.display();
    }
}

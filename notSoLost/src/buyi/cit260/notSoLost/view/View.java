/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import notsolost.NotSoLost;

/**
 *
 * @author Nels
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    public final BufferedReader keyboard = NotSoLost.getInFile();
    protected final PrintWriter console = NotSoLost.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get actors name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(value);
        } while (!done);
    }

    @Override
    public String getInput() {
        boolean valid = false; // initialize to not valid
        String value = null; // value to be returned
        try {
            while (!valid) { // loop while an invalid value is entered
                System.out.println("\n" + this.displayMessage);

                value = keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                if (value.length() < 1) { // value is blank
                    System.out.println("\n*** You must enter a value *** ");
                    continue;
                }

                break; // end the loop
            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        return value; // return the value entered
    }

    @Override
    public String getPathInput() {
        boolean valid = false; // initialize to not valid
        String value = null; // value to be returned
        try {
            while (!valid) { // loop while an invalid value is entered
                value = keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                if (value.length() < 1) { // value is blank
                    System.out.println("\n*** You must enter a value *** ");
                    continue;
                }

                break; // end the loop
            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        return value; // return the value entered
    }

}

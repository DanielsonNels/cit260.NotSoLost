/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.PlayerControl;
import byui.cit260.notSoLost.exceptions.PlayerControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
class PackWeightCalculatorView {

    double currentPackWeight = 0;
    private final String promptMessage = "Please enter a quantity and weight of new item(s):";

    public final BufferedReader keyboard = NotSoLost.getInFile();
    protected final PrintWriter console = NotSoLost.getOutFile();

    public PackWeightCalculatorView() {
    }

    public void displayPackWeightCalculatorView() throws PlayerControlException {

        String value; // value to be returned
        boolean valid = false; // initialize to not valid

        int quantity = 0;
        double weight = 0.0;

        try {
            while (!valid) { // loop while an invalid value is entered
                System.out.println("\n" + promptMessage);

                value = keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                try {
                    quantity = Integer.parseInt(value);
                    valid = (quantity >= 1);
                } catch (NumberFormatException nf) {
                    valid = false;
                }

                if (!valid) {
                    System.out.println("\nInvalid quantity: value must be positive integer");
                    continue;
                }

                value = keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                try {
                    weight = Double.parseDouble(value);
                    valid = (weight > 0);
                } catch (NumberFormatException nf) {
                    valid = false;
                }

                if (!valid) {
                    System.out.println("\nInvalid weight: value must be positive");
                    continue;
                }

                // do the requested action and display the next view
                this.doAction(quantity, weight);
            }
        } catch (Exception e) {
            System.out.println("Error readin input: " + e.getMessage());
        }
    }

    private void doAction(int quantity, double weight) throws PlayerControlException {
        try {
            PlayerControl playerControl = new PlayerControl();
            currentPackWeight = playerControl.calcPackWeight(currentPackWeight, weight, quantity);
            System.out.println("\n your new pack weight is: " + currentPackWeight);
        } catch (PlayerControlException pce) {
            System.out.println("\n" + pce.getMessage());
        }
    }
}

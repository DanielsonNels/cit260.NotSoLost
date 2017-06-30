/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.PlayerControl;
import java.util.Scanner;

/**
 *
 * @author JSaenz
 */
class PackWeightCalculatorView {

    double currentPackWeight = 0;
    private String promptMessage = "Please enter a quantity and weight of new item(s):";

    public PackWeightCalculatorView() {
    }

    public void displayPackWeightCalculatorView() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        int quantity = 0;
        double weight = 0.0;
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + promptMessage);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            try {
                quantity = Integer.parseInt(value);
                valid = (quantity >= 1);
            }
            catch (NumberFormatException nf) { 
                valid = false;
            }
                        
            if (!valid) {
                System.out.println("\nInvalid quantity: value must be positive integer");
                continue;
            }

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            try {
                weight = Double.parseDouble(value);
                valid = (weight > 0);
            }
            catch (NumberFormatException nf) { 
                valid = false;
            }
                        
            if (!valid) {
                System.out.println("\nInvalid weight: value must be positive");
                continue;
            }    

            // do the requested action and display the next view
            this.doAction(quantity, weight);
        }
    }


    private void doAction(int quantity, double weight) {
        PlayerControl actorControl = new PlayerControl();
        currentPackWeight = actorControl.calcPackWeight(currentPackWeight, weight, quantity);
        if (currentPackWeight < 0) {
            System.out.println("\n Dude! You can't carry that much!");
        }
        else {
            System.out.println("\n your new pack weight is: " + currentPackWeight);
        }

    }
}

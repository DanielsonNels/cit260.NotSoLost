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
class HealthMenuView extends View{

    double currentEnergy = 10;

    public HealthMenuView() {
        super("\n"
                + "\n----------------------------------------------"
                + "\n| Health Menu                                  |"
                + "\n----------------------------------------------"
                + "\nD - Display current energy"
                + "\nS - Rest to restore energy"
                + "\nE - Eat to restore energy"
                + "\nQ - Quit to game menu"
                + "\n----------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert value to upper case

        switch (value) {
            case "D": // What is the goal of the game?
                this.currentEnergy();
                break;
            case "S": // What is the goal of the game?
                this.restEnergy();
                break;
            case "E": // What is the goal of the game?
                this.eatEnergy();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }

        return false;
    }

    private void currentEnergy() {

        System.out.println("\n*** displayWreckInventoryMenuView() function called ***");
    }

    private double restEnergy() {
        double restHours = 0;
        double timeOfDay = 0;
        Scanner input = new Scanner(System.in); // get infile for keyboard  
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\nPlease enter the amount of hours you would like to rest: ");
            restHours = input.nextDouble();

            if (restHours > 10 || restHours < 1) { // value is blank
                System.out.println("\nInvalid value: you cannot rest less than 1 hour or more than 10 hours");
                continue;
            }
            break; // end the loop
        }        

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\nPlease enter the time of day in military format e.g. 1300 for 1PM: ");
            timeOfDay = input.nextDouble();

            if (timeOfDay > 2400 || timeOfDay < 1) { // value is blank
                System.out.println("\nInvalid value: time of day cannot be less than 0001 or more than 2400");
                continue;
            }
            break; // end the loop
        }

        PlayerControl actorControl = new PlayerControl();
        currentEnergy = actorControl.calcEnergyRestGain(currentEnergy, restHours, timeOfDay);
        System.out.println("\n your new energy is: " + currentEnergy);

        return currentEnergy;
    }
    
    private void eatEnergy() {
        System.out.println("\n*** displayWreckInventoryMenuView() function called ***");
    }



}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.ActorControl;
import java.util.Scanner;

/**
 *
 * @author JSaenz
 */
class HealthMenuView {

    double currentEnergy = 10;
    private String menu;
    private String promptMessage = "Please make a health menu selection:";

    public HealthMenuView() {
        menu = "\n"
                + "\n----------------------------------------------"
                + "\n| Health Menu                                  |"
                + "\n----------------------------------------------"
                + "\nDE - Display current energy"
                + "\nRE - Rest to restore energy"
                + "\nEE - Eat to restore energy"
                + "\nR - Return to game menu"
                + "\n----------------------------------------------";
    }

    public void displayHealthMenuView() {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get actors name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("R")) // return to main menu
            {
                return;
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
            case "DE": // What is the goal of the game?
                this.currentEnergy();
                break;
            case "RE": // What is the goal of the game?
                this.restEnergy();
                break;
            case "EE": // What is the goal of the game?
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

        ActorControl actorControl = new ActorControl();
        currentEnergy = actorControl.calcEnergyRestGain(currentEnergy, restHours, timeOfDay);
        System.out.println(currentEnergy);

        return currentEnergy;
    }
    
    private void eatEnergy() {
        System.out.println("\n*** displayWreckInventoryMenuView() function called ***");
    }



}
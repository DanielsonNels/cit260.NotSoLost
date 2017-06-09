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
class BuildToolsMenuView {

    double currentHealth = 10;
    private String menu;
    private String promptMessage = "Please make a build tools menu selection:";

    public BuildToolsMenuView() {
        menu = "\n"
                + "\n----------------------------------------------"
                + "\n| Build Tools Menu                           |"
                + "\n----------------------------------------------"
                + "\nS - Spear"
                + "\nB - Bow (Health must be above 20%)"
                + "\nO - Rope"
                + "\nT - Trotline (Health must be above 20%)"
                + "\nC - Club/Hammer"
                + "\nN - Snare"
                + "\nR - Return to game menu"
                + "\n----------------------------------------------";
    }

    public void displayBuildToolsMenuView() {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get actors name
            String menuOption = ViewHelper.getMenuOption(menu, promptMessage);
            if (menuOption.toUpperCase().equals("R")) // return to main menu
            {
                return;
            }

            // do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }


    private boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "S": // Spear
                this.buildSpear();
                break;
            case "B": // Bow
                this.buildBow();
                break;
            case "O": // Rope
                this.buildRope();
                break;
            case "T": // Trotline
                this.buildTrotline();
                break;
            case "C": // Club
                this.buildClub();
                break;
            case "N": // Snare
                this.buildSnare();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }

        return false;
    }

    private void buildSpear() {

        System.out.println("\n*** buildSpear() function called ***");
    }

    private void buildBow() {

        System.out.println("\n*** buildBow() function called ***");
    }

    private void buildRope() {

        System.out.println("\n*** buildRope() function called ***");
    }

    private void buildTrotline() {

        System.out.println("\n*** buildTrotline() function called ***");
    }

    private void buildClub() {

        System.out.println("\n*** buildClub() function called ***");
    }

    private void buildSnare() {

        System.out.println("\n*** buildSnare() function called ***");
    }

}

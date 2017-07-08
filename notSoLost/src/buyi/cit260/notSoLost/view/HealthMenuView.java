/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.PlayerControl;
import byui.cit260.notSoLost.exceptions.PlayerControlException;
import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
class HealthMenuView extends View {

    public final BufferedReader keyboard = NotSoLost.getInFile();
    protected final PrintWriter console = NotSoLost.getOutFile();

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
            case "D": // Display current energy.
                this.currentEnergy();
                break;
            case "S": { // Rest to restore energy.
                try {
                    this.restEnergy();
                } catch (PlayerControlException ex) {
                    Logger.getLogger(HealthMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "E": // Eat to restore energy.
                this.eatEnergy();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }

        return false;
    }

    private void currentEnergy() {
        Game game = NotSoLost.getCurrentGame();
        Player player = game.getPlayer();
        double currentEnergy = player.getEnergyLevel();

        System.out.println("\n Your current energy is: " + currentEnergy);
    }

    private double restEnergy() throws PlayerControlException {
        double restHours = 0;
        double timeOfDay = 0;

        boolean valid = false; // initialize to not valid
        
        Game game = NotSoLost.getCurrentGame();
        Player player = game.getPlayer();
        double currentEnergy = player.getEnergyLevel();

        try {
            while (!valid) { // loop while an invalid value is entered
                try {

                    System.out.println("\nPlease enter the amount of hours you would like to rest: ");
                    restHours = Double.parseDouble(this.keyboard.readLine());
                    System.out.println("\nPlease enter the time of day in military format e.g. 1300 for 1PM: ");
                    timeOfDay = Double.parseDouble(this.keyboard.readLine());

                    
                    PlayerControl playerControl = new PlayerControl();
                    currentEnergy = playerControl.calcEnergyRestGain(currentEnergy, restHours, timeOfDay);
                    System.out.println("\n Your new energy is: " + currentEnergy);
                } catch (PlayerControlException pce) {
                    System.out.println("\n" + pce.getMessage());
                }
                break; // end the loop

            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        
        player.setEnergyLevel(currentEnergy);
        return currentEnergy;
    }

    private void eatEnergy() {
        System.out.println("\n*** displayWreckInventoryMenuView() function called ***");
    }
}

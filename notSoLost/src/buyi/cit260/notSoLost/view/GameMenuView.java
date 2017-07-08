/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor...
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.GameControl;
import buyi.cit260.notSoLost.control.MapControl;
import byui.cit260.notSoLost.exceptions.GameControlException;
import byui.cit260.notSoLost.exceptions.MapControlException;
import byui.cit260.notSoLost.exceptions.PlayerControlException;
import byui.cit260.notSoLost.model.Actor;
import java.awt.Point;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n----------------------------------------------"
                + "\n| Game Menu                                  |"
                + "\n----------------------------------------------"
                + "\nJ - Wreckage inventory menu"
                + "\nK - Inventory menu"
                + "\nD - Display tools"
                + "\nB - Build tools"
                + "\nW - Work on raft"
                + "\nC - Collect resource"
                + "\nX - Drop resource"
                + "\nP - Pack Weight Calculator"
                + "\nI - View inventory"
                + "\nR - View raft status"
                + "\nO - Health menu"
                + "\nE - Explore locations"
                + "\nM - Move to a location"
                + "\nL - Display Map"
                + "\nMR - Print Island Map Report"
                + "\nH - Help menu"
                + "\nQ - Quit to main menu"
                + "\n----------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert value to upper case

        switch (value) {
            case "J":
                this.wreckInventoryMenuView();
                break;
            case "K":
                this.islandInventoryMenuView();
                break;
            case "D":
                this.displayToolsView();
                break;
            case "B":
                this.buildToolsMenuView();
                break;
            case "W": // Work on Raft.
                this.workOnRaftMenuView();
                break;
            case "C":
                this.collectResourceMenuView();
                break;
            case "X":
                this.dropResouceMenuView();
                break;
            case "P": { // Pack weight calculator
                try {
                    this.packWeightCalculatorView();
                } catch (PlayerControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "I":
                this.viewInventoryMenuView();
                break;
            case "R": // View Raft status.
                this.viewRaftStatusView();
                break;
            case "O":
                this.healthMenuView();
                break;
            case "E":
                this.exploreLocationsMenuView();
                break;
            case "M":
                this.moveToLocationView();
                break;
            case "L":
                this.displayMapView();
                break;
            case "MR": { // Creates Map Report
                try {
                    this.printMapReport();
                } catch (GameControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }

        return false;
    }

    private void wreckInventoryMenuView() {
        // display the wreck inventory menu
        WreckInventoryMenuView wreckInventoryMenu = new WreckInventoryMenuView();
        wreckInventoryMenu.displayWreckInventoryMenuView();
    }

    private void islandInventoryMenuView() {
        // display the island inventory menu
        InventoryMenuView islandInventoryMenu = new InventoryMenuView();
        islandInventoryMenu.display();
    }

    private void displayToolsView() {
        // display tools
        DisplayToolsView displayTools = new DisplayToolsView();
        displayTools.displayToolsView();
    }

    private void buildToolsMenuView() {
        // display the build tools menu
        BuildToolsMenuView buildToolsMenu = new BuildToolsMenuView();
        buildToolsMenu.display();
    }

    private void workOnRaftMenuView() {
        // display the work on raft menu
        WorkOnRaftMenuView workOnRaftMenu = new WorkOnRaftMenuView();
        workOnRaftMenu.display();
    }

    private void collectResourceMenuView() {
        // display the collect resources menu
        CollectResourceMenuView collectResourceMenu = new CollectResourceMenuView();
        collectResourceMenu.display();
    }

    private void dropResouceMenuView() {
        // display the drop resource menu
        DropResourceMenuView dropResourceMenu = new DropResourceMenuView();
        dropResourceMenu.displayDropResourceMenuView();
    }

    private void packWeightCalculatorView() throws PlayerControlException {
        // display the pack weight calculator
        PackWeightCalculatorView packWeightCalculator = new PackWeightCalculatorView();
        packWeightCalculator.displayPackWeightCalculatorView();
    }

    private void viewInventoryMenuView() {
        // display the view inventory menu
        ViewInventoryMenuView viewInventoryMenu = new ViewInventoryMenuView();
        viewInventoryMenu.displayViewInventoryMenuView();
    }

    private void viewRaftStatusView() {
        // display raft status
        ViewRaftStatusView viewRaftStatus = new ViewRaftStatusView();
        viewRaftStatus.display();
    }

    private void healthMenuView() {
        // display the health menu
        HealthMenuView healthMenu = new HealthMenuView();
        healthMenu.display();
    }

    private void exploreLocationsMenuView() {
        // display the explore location menu
        ExploreLocationsMenuView exploreLocationsMenu = new ExploreLocationsMenuView();
        exploreLocationsMenu.displayExploreLocationsMenuView();
    }

    private void moveToLocationView() {
        // display the move to location menu
        MoveToLocationView moveToLocationMenu = new MoveToLocationView();
        moveToLocationMenu.display();
    }

    private void displayMapView() {
        // display current location
        DisplayMapView displayMap = new DisplayMapView();
        displayMap.displayMap();
    }

    private void printMapReport() throws GameControlException {
        // Prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                           + "is to be saved.");
        
        String filePath = this.getPathInput();
        
        DisplayMapView displayMap = new DisplayMapView();
        
        try {
            //save the game to the specified file
            GameControl.saveReport(displayMap, filePath);
        } catch (GameControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }

    }

    private void displayHelpMenu() {
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

}

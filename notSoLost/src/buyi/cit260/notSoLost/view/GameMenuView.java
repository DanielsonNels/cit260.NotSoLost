/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor...
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.GameControl;
import byui.cit260.notSoLost.exceptions.GameControlException;
import byui.cit260.notSoLost.exceptions.PlayerControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                + "\nK  - Inventory menu"
                + "\nD  - Display tools"
                + "\nB  - Build tools"
                + "\nW  - Work on raft"
                + "\nC  - Collect resource"
                + "\nX  - Drop resource"
                + "\nP  - Pack Weight Calculator"
                + "\nI  - View inventory"
                + "\nIR - Print Inventory Report"
                + "\nR  - View raft status"
                + "\nO  - Health menu"
                + "\nE  - Explore locations"
                + "\nM  - Move to a location"
                + "\nL  - Display Map"
                + "\nMR - Print Island Map Report"
                + "\nRR - Save Raft Report to file"
                + "\nH  - Help menu"
                + "\nQ  - Quit to main menu"
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
            case "IR":
                try {
                    this.printInventoryReport();
                } catch (GameControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
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
            case "RR": // Creates Raft Report
                this.printRaftReport();
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
        displayMap.display(this.console);
    }

    private void printMapReport() throws GameControlException {
        // Prompt for and get the name of the file to print the report
        String filePath = this.getInput("Enter the file path for file where the "
                           + "report is to be written.");
        
        DisplayMapView displayMap = new DisplayMapView();
        
        try {
            //save the report to the specified file
            GameControl.saveReport(displayMap, filePath);
            this.console.println("Success! You saved the report.");
        } catch (GameControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }
    private void printRaftReport() {
        // Prompt for and get the name of the file to print the report
        String filePath = this.getInput("Enter the file path for file where the "
                           + "report is to be written.");
        
        DisplayRaftView displayRaft = new DisplayRaftView();
        
        try {
            //save the report to the specified file
            GameControl.saveReport(displayRaft, filePath);
            this.console.println("Success! You saved the report.");
        } catch (GameControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }

    }

    private void printInventoryReport() throws GameControlException {
        // Prompt for and get the name of the file to print the report to
        String filePath = this.getInput("Enter the file path for file where the "
                           + "report is to be written.");
        
        DisplayInventoryView displayInventory = new DisplayInventoryView();
        
        try {
            // save the report to the specified file
            GameControl.saveReport(displayInventory, filePath);
            this.console.println("Success! You saved the report.");
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

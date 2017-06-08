/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import java.util.Scanner;

/**
 *
 * @author JSaenz
 */
public class GameMenuView {
    
    private String menu;
    private String promptMessage = "Please make a game menu selection:";
    
    public GameMenuView(){
        menu = "\n"
            + "\n----------------------------------------------"
            + "\n| Game Menu                                  |"
            + "\n----------------------------------------------"
            + "\nJ - Wreckage inventory menu"
            + "\nK - Island inventory menu"
            + "\nD - Display tools"
            + "\nB - Build tools"
            + "\nW - Work on raft"
            + "\nC - Collect resource"
            + "\nX - Drop resource"
            + "\nI - View inventory"
            + "\nR - View raft status"
            + "\nO - Observe health menu"
            + "\nE - Explore locations"
            + "\nM - Move to a location"
            + "\nL - Display current location"
            + "\nS - Save game"
            + "\nH - Help menu"
            + "\nR - Return to main menu"
            + "\n----------------------------------------------";
    }
    
    public void displayMenu(){
        boolean done = false; // set flag to not done
        do {
            // prompt for and get actors name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("R"))  // return to main menu
                return;

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
            case "J": // What is the goal of the game?
                this.wreckInventoryMenuView();
                break;
            case "K": // What is the goal of the game?
                this.islandInventoryMenuView();
                break;
            case "D": // What is the goal of the game?
                this.displayToolsView();
                break;
            case "B": // What is the goal of the game?
                this.buildToolsMenuView();
                break;
            case "W": // What is the goal of the game?
                this.workOnRaftMenuView();
                break;
            case "C": // What is the goal of the game?
                this.collectResourceMenuView();
                break;
            case "X": // What is the goal of the game?
                this.dropResouceMenuView();
                break;
            case "I": // What is the goal of the game?
                this.viewInventoryMenuView();
                break;
            case "R": // What is the goal of the game?
                this.viewRaftStatusView();
                break;
            case "O": // What is the goal of the game?
                this.healthMenuView();
                break;
            case "E": // What is the goal of the game?
                this.exploreLocationsMenuView();
                break;
            case "M": // What is the goal of the game?
                this.moveToLocationView();
                break;
            case "L": // What is the goal of the game?
                this.displayCurrentLocationView();
                break;
            case "S": // What is the goal of the game?
                this.saveGameView();
                break;
            case "H": // What is the goal of the game?
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
        IslandInventoryMenuView islandInventoryMenu = new IslandInventoryMenuView();
        islandInventoryMenu.displayIslandInventoryMenuView();
    }

    private void displayToolsView() {
        // display tools
        DisplayToolsView displayTools = new DisplayToolsView();
        displayTools.displayToolsView();
    }

    private void buildToolsMenuView() {
        // display the build tools menu
        BuildToolsMenuView buildToolsMenu = new BuildToolsMenuView();
        buildToolsMenu.displayBuildToolsMenuView();
    }

    private void workOnRaftMenuView() {
        // display the work on raft menu
        WorkOnRaftMenuView workOnRaftMenu = new WorkOnRaftMenuView();
        workOnRaftMenu.displayWorkOnRaftMenuView();
    }

    private void collectResourceMenuView() {
        // display the collect resources menu
        CollectResourceMenuView collectResourceMenu = new CollectResourceMenuView();
        collectResourceMenu.displayCollectResourceMenuView();
    }

    private void dropResouceMenuView() {
        // display the drop resource menu
        DropResourceMenuView dropResourceMenu = new DropResourceMenuView();
        dropResourceMenu.displayDropResourceMenuView();
    }

    private void viewInventoryMenuView() {
        // display the view inventory menu
        ViewInventoryMenuView viewInventoryMenu = new ViewInventoryMenuView();
        viewInventoryMenu.displayViewInventoryMenuView();
    }

    private void viewRaftStatusView() {
        // display raft status
        ViewRaftStatusView viewRaftStatus = new ViewRaftStatusView();
        viewRaftStatus.displayViewRaftStatusView();
    }

    private void healthMenuView() {
        // display the health menu
        HealthMenuView healthMenu = new HealthMenuView();
        healthMenu.displayHealthMenuView();
    }

    private void exploreLocationsMenuView() {
        // display the explore location menu
        ExploreLocationsMenuView exploreLocationsMenu = new ExploreLocationsMenuView();
        exploreLocationsMenu.displayExploreLocationsMenuView();
    }

    private void moveToLocationView() {
        // display the move to location menu
        MoveToLocationView moveToLocation = new MoveToLocationView();
        moveToLocation.displayMoveToLocationView();
    }

    private void displayCurrentLocationView() {
        // display current location
        DisplayCurrentLocationView displayCurrentLocation = new DisplayCurrentLocationView();
        displayCurrentLocation.displayCurrentLocationView();
    }

    private void saveGameView() {
        // Save game
        SaveGameView saveGame = new SaveGameView();
        saveGame.displaySaveGameView();
    }

    private void displayHelpMenu() {
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }
    
}

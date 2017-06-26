/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

/**
 *
 * @author JSaenz
 */
public class GameMenuView extends View{
    
    public GameMenuView(){
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
            + "\nL - DisplayMap"
            + "\nS - Save game"
            + "\nH - Help menu"
            + "\nQ - Quit to main menu"
            + "\n----------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert value to upper case
        
        switch (value) {
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
            case "P": // Pack weight calculator
                this.packWeightCalculatorView();
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
                this.displayMapView();
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

    private void packWeightCalculatorView() {
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
        viewRaftStatus.displayViewRaftStatusView();
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
        MoveToLocationView moveToLocation = new MoveToLocationView();
        moveToLocation.displayMoveToLocationView();
    }

    private void displayMapView() {
        // display current location
        DisplayMapView displayMap = new DisplayMapView();
        displayMap.displayMap();
    }

    private void saveGameView() {
        // Save game
        SaveGameView saveGame = new SaveGameView();
        saveGame.displaySaveGameView();
    }

    private void displayHelpMenu() {
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
}

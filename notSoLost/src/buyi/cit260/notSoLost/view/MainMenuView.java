/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.GameControl;
import byui.cit260.notSoLost.exceptions.GameControlException;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
public class MainMenuView extends View {

    public MainMenuView() {
            super("\n"
                + "\n----------------------------------------------"
                + "\n| Main Menu                                  |"
                + "\n----------------------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n----------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert value to upper case

        switch (value) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // get and start an existing game
                this.startSavedGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }

        return false;
    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(NotSoLost.getPlayer());

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startSavedGame() {
        // prompt for and get the name of the file the saved game is in
        this.console.println("\n\nEnter the file path for file where the game "
                           + "was saved.");
        
        String filePath = this.getPathInput();
        
        try {
            //start a saved game
            GameControl.getSavedGame(filePath);
        } catch (GameControlException ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
          // display the StartSavedGameView
        // StartSavedGameView startSavedGame = new StartSavedGameView();
        // startSavedGame.displaySavedGameView();
    }

    private void displayHelpMenu() {
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        // Prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                           + "is to be saved.");
        
        String filePath = this.getPathInput();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(NotSoLost.getCurrentGame(), filePath);
        } catch (GameControlException ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

          // display the StartSavedGameView
        // SaveGameView saveGame = new SaveGameView();
        // saveGame.displayCurrentGameView();
    }       

}

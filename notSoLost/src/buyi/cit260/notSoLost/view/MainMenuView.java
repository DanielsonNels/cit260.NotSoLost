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
public class MainMenuView {
    
    private String menu;
    
    public MainMenuView(){
        this.menu = "\n"
                  + "\n----------------------------------------------"
                + "\n| Main Menu                                  |"
                + "\n----------------------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n----------------------------------------------";
    }

    void displayMainMenuView() {
        System.out.println("\n*** displayMenu() function called ***");
    }
    
}

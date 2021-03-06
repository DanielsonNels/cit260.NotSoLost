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
public class HelpMenuView extends View{


    public HelpMenuView() {
        super("\n"
                + "\n----------------------------------------------"
                + "\n| Help Menu                                  |"
                + "\n----------------------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move?"
                + "\nT - How to build tools?"
                + "\nF - How to fix the raft?"
                + "\nI - How to collect inventory?"
                + "\nQ - Quit to Main menu"
                + "\n----------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert value to upper case

        switch (value) {
            case "G": // What is the goal of the game?
                ViewHelper.display("What is the goal of the game?",
                        "After finding yourself shipwrecked on this deserted island,"
                    + " your goal is to find enough materials to fix your raft and"
                    + " make your way back to civilization.");
                break;
                
            case "M": // How to move?
                ViewHelper.display("How to move?",
                        "To move to a different location on the island, use the map"
                    + " game menu option and select the desired location.  Be aware"
                    + " that moving from location to location requires"
                    + " moving from location to location requires that you have"
                    + " enough energy to complete your journey.");
                break;
            case "T": // How to build tools?
                ViewHelper.display("How to build tools?", new String[] {
                        "Explore the different locations of the island and collect"
                    + " the required materials to build the following tools:",
                      "  S - Spear", 
                      "  B - Bow (Health must be above 20%)",
                      "  R - Rope", 
                      "  T - Trotline (Health must be above 20%)",
                      "  C - Club / Hammer", 
                      "  S - Snare" });
                break;
                
            case "F": // How to fix the raft?
                ViewHelper.display("How to fix the raft?",
                        "This will be the most important part of the game. "
                    + "To be able to win the game you must build a type of raft"
                    + " with the materials found on the island. You can only work"
                    + " on the raft a little at a time when you find certain"
                    + " resources to use. A percentage will be given for the amount"
                    + " of work that has been completed on the raft.");
                break;
                
            case "I": // How to collect inventory?
                ViewHelper.display("How to collect inventory?",
                        "Explore the island and collect inventory items by"
                    + " collecting as many items as your backpack will carry.");
                break;
                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }

        return false;
    }

}

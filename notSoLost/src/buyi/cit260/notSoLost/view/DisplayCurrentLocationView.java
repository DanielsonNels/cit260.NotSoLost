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
public class DisplayCurrentLocationView extends View {
    
    public DisplayCurrentLocationView() {
        super("\n"
                + "\n----------------------------------------------"
                + "\n| Display Current Location Menu                                  |"
                + "\n----------------------------------------------"
                + "\nM - View Map"
                + "\nD - View Description"
                + "\nK - Map Key"
                + "\nQ - Quit to game menu"
                + "\n----------------------------------------------");
    }
    
    
    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert value to upper case

        switch (value) {
            case "M": // View Map
                this.displayMap();
                break;
            case "D": // View Description
                this.displayDescription();
                break;
            case "K": // View Map Key
                this.displayKey();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }

        return false;
    }

    public void displayMap() {
        System.out.println("\n*** displayMap() function called ***");
    }

    public void displayDescription() {
        System.out.println("\n*** displayDescription() function called ***");
    }
    
    public void displayKey() {
        System.out.println("\n"
            + "\n----------------------------------------------"
            + "\n| Map Key                                    |"
            + "\n----------------------------------------------"
            + "\nSand/Beach     .                              "
            + "\nWater          ~                              "
            + "\nTrees          |                              "
            + "\nMountains      /\\                             "
            + "\nShoreline      --                             "
            + "\n----------------------------------------------");

    }

}

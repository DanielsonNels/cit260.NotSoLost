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
public class CollectResourceMenuView extends View {

    public CollectResourceMenuView(){
        super("\n"
            + "\n----------------------------------------------"
            + "\n| Collect Resource Menu                      |"
            + "\n----------------------------------------------"
            + "\nW - Water                                     "
            + "\nF - Food                                      "
            + "\nT - Timber                                    "
            + "\nV - Vines                                     "
            + "\nQ - Quit to game menu                         "
            + "\n----------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert value to upper case
        
        switch (value) {
            case "W": // food item list
                this.collectWaterResource();
                break;
            case "F": // tool list
                this.collectFoodResource();
                break;
            case "T": // constuction supplies list
                this.collectTimberResource();
                break;  
            case "V": // constuction supplies list
                this.collectVinesResource();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        
        return false;
    }

    private void collectWaterResource() {
        System.out.println("\n*** collectWaterResource() function called ***");
    }

    private void collectFoodResource() {
        System.out.println("\n*** displayFoodInventoryMenuView() function called ***");
    }

    private void collectTimberResource() {
        System.out.println("\n*** collectFoodResource() function called ***");
    }

    private void collectVinesResource() {
        System.out.println("\n*** collectVinesResource() function called ***");
    }
    
}

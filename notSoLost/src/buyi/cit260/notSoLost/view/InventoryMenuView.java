/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor...
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.InventoryControl;
import byui.cit260.notSoLost.exceptions.InventoryControlException;

/**
 *
 * @author JSaenz
 */
public class InventoryMenuView extends View{

    public InventoryMenuView(){
        super("\n"
            + "\n----------------------------------------------"
            + "\n| Inventory                                  |"
            + "\n----------------------------------------------"
            + "\nF - Food Items                                "
            + "\nT - Tools                                     "
            + "\nA - Check Total Amount of Items               "
            + "\nW - Item Weight Stats                         "    
            + "\nQ - Quit to main menu                         "
            + "\n----------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert value to upper case
        
        switch (value) {
            case "F": // food item list
                this.foodInventoryMenuView();
                break;
            case "T": // tool list
                this.toolsInventoryMenuView();
                break;
            case "A": // run total item check
                this.calcTotalItems();
                break;
            case "W": // item weight
                this.calcItemWeight();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        
        return false;
    }


    private void foodInventoryMenuView() {
        // display the collect resources menu
        FoodInventoryMenuView foodInventoryMenu = new FoodInventoryMenuView();
        foodInventoryMenu.displayFoodInventoryMenuView();
    }

    private void toolsInventoryMenuView() {
        ToolsInventoryMenuView toolsInventoryMenu = new ToolsInventoryMenuView();
        toolsInventoryMenu.displayToolsInventoryMenuView();
    }

    private void calcTotalItems() {
        try {
            InventoryControl inventoryControl = new InventoryControl.calcTotalItems();
            double total = inventoryControl.calcTotalItems();
            System.out.println("\nTotal Items in Inventory: " + total);
        } 
        catch (InventoryControlException ice) {
            System.out.println(ice.getMessage());
        }
    }

    private void calcItemWeight() {
        try {
            InventoryControl inventoryControl = new InventoryControl.calcItemWeight();
            inventoryControl.calcItemWeight();
        }
        catch (InventoryControlException ice){
            System.out.println(ice.getMessage());
        }
    }
    
}

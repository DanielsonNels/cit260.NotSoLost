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
public class InventoryMenuView extends View{

    public InventoryMenuView(){
        super("\n"
            + "\n----------------------------------------------"
            + "\n| Inventory                                  |"
            + "\n----------------------------------------------"
            + "\nF - Food Items                                "
            + "\nT - Tools                                     "
            + "\nC - Construction Supplies                     "
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
            case "C": // constuction supplies list
                this.constructionInventoryMenuView();
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

    private void constructionInventoryMenuView() {
        ConstructionInventoryMenuView constructionInventoryMenu = new ConstructionInventoryMenuView();
        constructionInventoryMenu.displayConstructionInventoryMenuView();
    }
    
}
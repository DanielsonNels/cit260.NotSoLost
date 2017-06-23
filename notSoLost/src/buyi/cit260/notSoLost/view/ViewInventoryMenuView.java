/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.InventoryItem;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
class ViewInventoryMenuView {

    public void displayViewInventoryMenuView() {
        StringBuilder line;

        Game game = NotSoLost.getCurrentGame();
        InventoryItem[] inventory = game.getInventoryItem();

        System.out.println("\n        LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                     ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        System.out.println(line.toString());

        // for each inventory item
        for (InventoryItem item : inventory) {
            line = new StringBuilder("                                     ");
            line.insert(0, item.getDescription());
            line.insert(20, item.getRequiredAmount());
            line.insert(30, item.getQuantityInStock());
            
            // DISPLAY the line
            System.out.println(line.toString());           
        }

    }

}

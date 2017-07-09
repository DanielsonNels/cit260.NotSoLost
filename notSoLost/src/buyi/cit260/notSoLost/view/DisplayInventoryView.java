/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.InventoryItem;
import java.io.PrintWriter;
import notsolost.NotSoLost;

/**
 *
 * @author Nels
 */
public class DisplayInventoryView implements ReportInterface{
    
    
    @Override
    public void display(PrintWriter writer) {
        StringBuilder line;

        Game game = NotSoLost.getCurrentGame();
        InventoryItem[] inventory = game.getInventoryItem();

        writer.println("\n        LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                     ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        writer.println(line.toString());

        // for each inventory item
        for (InventoryItem item : inventory) {
            line = new StringBuilder("                                     ");
            line.insert(0, item.getDescription());
            line.insert(20, item.getRequiredAmount());
            line.insert(30, item.getQuantityInStock());
            
            // DISPLAY the line
            writer.println(line.toString());           
        }

    }

}

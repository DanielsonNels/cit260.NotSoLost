/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;


import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.Location;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
public class DisplayMapView {
    
     public void displayMap() {
        StringBuilder line;

        Game game = NotSoLost.getCurrentGame();
        Location[][] locations = game.getMap().getLocations();

        System.out.println("\n          ISLAND MAP");
        line = new StringBuilder("                                     ");
        line.insert(4, "1");
        line.insert(9, "2");
        line.insert(14, "3");
        line.insert(19, "4");
        line.insert(24, "5");
        System.out.println(line.toString());

        // for each map item
        int rowIndex = 0;
        for (Location[] row : locations) {
            System.out.println("----------------------------");
            rowIndex++;
            System.out.print(rowIndex + " ");
                for (Location col : row) {
                    System.out.print("|");
                    System.out.print(col.getRegularSceneType().getSymbol());
                }
                System.out.println("|");        
            // DISPLAY the line      
        }
        System.out.println("----------------------------");
    }

}

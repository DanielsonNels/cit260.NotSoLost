/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;


import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.Location;
import byui.cit260.notSoLost.model.Map;
import byui.cit260.notSoLost.model.RegularSceneType;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
public class DisplayMapView {
    
     public void displayMap() {
        StringBuilder line;

        Game game = NotSoLost.getCurrentGame();
        Location[][] location = game.getLocation();

        System.out.println("\n        ISLAND MAP");
        line = new StringBuilder("                                     ");
        line.insert(0, "1");
        line.insert(10, "2");
        line.insert(20, "3");
        line.insert(30, "4");
        line.insert(40, "5");
        System.out.println(line.toString());

        // for each map item
        for (Location[] row : location) {
            System.out.println("------------------------------------------");
            System.out.println("\n N");
                for (Location col : row) {
                    System.out.println("|");
                    location = locations[row][col];
                    System.out.println(RegularSceneType.getSymbol());
                }
                System.out.println("|");        
            // DISPLAY the line      
        }
        System.out.println("------------------------------------------");
    }

}

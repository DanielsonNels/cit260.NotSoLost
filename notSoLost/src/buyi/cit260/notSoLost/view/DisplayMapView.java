/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.Location;
import java.io.PrintWriter;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
public class DisplayMapView implements ReportInterface {

    @Override
    public void display(PrintWriter writer) {
        StringBuilder line;

        Game game = NotSoLost.getCurrentGame();
        Location[][] locations = game.getMap().getLocations();

        writer.println("\n          ISLAND MAP");
        line = new StringBuilder("                                     ");
        line.insert(4, "1");
        line.insert(9, "2");
        line.insert(14, "3");
        line.insert(19, "4");
        line.insert(24, "5");
        writer.println(line.toString());

        // for each map item
        int rowIndex = 0;
        for (Location[] row : locations) {
            writer.println("----------------------------");
            rowIndex++;
            writer.print(rowIndex + " ");
            for (Location col : row) {
                writer.print("|");
                writer.print(col.getRegularSceneType().getSymbol());
            }
            writer.println("|");
            // DISPLAY the line      
        }
        writer.println("----------------------------");
    }

}

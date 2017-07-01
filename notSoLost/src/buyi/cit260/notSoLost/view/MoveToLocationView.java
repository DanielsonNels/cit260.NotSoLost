/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.MapControl;
import byui.cit260.notSoLost.exceptions.MapControlException;
import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.Player;
import java.awt.Point;
import notsolost.NotSoLost;


/**
 *
 * @author JSaenz
 */
    public class MoveToLocationView extends View {
    
    private final static int NORTH = 0;
    private final static int SOUTH = 1;
    private final static int EAST  = 2;
    private final static int WEST  = 3;
    
    
    public MoveToLocationView() {
        super("\n"
            + "\n----------------------------------------------"
            + "\n|   Move Player Menu                          |"
            + "\n----------------------------------------------"
            + "\nN - Move Player North"
            + "\nS - Move Player South"
            + "\nE - Move Player East"
            + "\nW - Move Player West"
            + "\nQ - Quit to main menu"
            + "\n----------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert value to upper case
        
            switch (value) {
            case "N": //Move Player North
                setLocation(0,-1);
                break;
            case "S": //Move Player South
                setLocation(0,1);
                break;
            case "E": //Move Player East
                setLocation(1,0);
                break;
            case "W": //Move Player West
                setLocation(-1,0);
                break;
            default:
                System.out.println("\n*** Invalid move *** Try again");
            }
        
        return false;
        
        }

    private void setLocation(int x, int y) {
        Game game = NotSoLost.getCurrentGame();
        Player player = game.getPlayer();
        Point curCoord = player.getCoordinates();
        Point newCoord = curCoord;
        newCoord.x += x;
        newCoord.y += y;

        try {
            MapControl.movePlayerToLocation(player, newCoord);
        }
        catch (MapControlException mc) {
            System.out.println(mc.getMessage());
        }
    }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.control;

import byui.cit260.notSoLost.model.Player;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        NotSoLost.setPlayer(player); // save the player
        
        return player;
    }
    
}

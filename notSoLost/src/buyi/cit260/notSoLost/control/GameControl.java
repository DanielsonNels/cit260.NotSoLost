/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.control;

import byui.cit260.notSoLost.model.Actor;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
public class GameControl {
    
    public static void createNewGame(Actor actor) {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    public static Actor createActor(String name) {
        if (name == null) {
            return null;
        }
        
        Actor actor = new Actor();
        actor.setName(name);
        
        NotSoLost.setActor(actor); // save the actor
        
        return actor;
    }
    
}

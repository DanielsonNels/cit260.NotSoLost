/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notsolost;

import byui.cit260.notSoLost.model.Actor;

/**
 *
 * @author Nels Danielson
 */
public class NotSoLost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Actor actorOne = new Actor();
        
        actorOne.setName("Samuel");
        actorOne.setDescription("Hairy Beast");
        actorOne.setLocation(1);
        actorOne.setActionMode("Normal");
        actorOne.setEnergyLevel(100);
        
        String playerInfo = actorOne.toString();
        System.out.println(playerInfo);
        
    }
    
}

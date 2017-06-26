/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.control;

/**
 *
 * @author JSaenz
 */
public class RaftControl {

    public double calcTotalRaftItems() {
        int[] quantities = {40, 16, 6, 2, 1, 1}; //40' Rope, 16 Coconuts(for Pontoons),
        //6 floor planks, 2 mast beams, 1 sail, and 1 rudder. 
    
        int total = 0;
        
        for (int quantity : quantities) {
            total += quantity;
        }
        
        return total;
    }

    public static class calcTotalRaftItems extends RaftControl {

        public calcTotalRaftItems() {
        }
    }
    
}

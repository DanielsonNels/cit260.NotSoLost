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
public class InventoryControl {
    
    public double calcTotalItems() {
        int[] amounts = {12, 4, 6, 10, 9, 8, 7, 6, 3, 2};
    
        int total = 0;
        
        for (int i = 0; i < amounts.length; i++) {
            total += amounts[i];
        }
        
        return total;
    }

    public static class calcTotalItems extends InventoryControl {

        public calcTotalItems() {
        }
    }
}

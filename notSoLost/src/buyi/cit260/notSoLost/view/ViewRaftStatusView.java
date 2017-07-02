/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.RaftControl;
import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.Raft;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
public class ViewRaftStatusView extends View {

        public ViewRaftStatusView(){
        super("\n"
            + "\n----------------------------------------------"
            + "\n| - Raft Status                              |"
            + "\n----------------------------------------------"
            + "\nV - View Raft Progress                        "
            + "\nQ - Quit to main menu                         "
            + "\n----------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert value to upper case
        
        switch (value) {
            case "V": // food item list
                this.calcPercentRaftItems();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        
        return false;
    }
    
    private void calcPercentRaftItems() {
        Game game = NotSoLost.getCurrentGame();
        Raft raft = game.getRaft();
        double total = RaftControl.calcPercentRaftItems(raft);
        System.out.println("\nPercent of total items needed in Raft Inventory: " + total);
    }

}


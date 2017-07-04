/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.RaftControl;
import byui.cit260.notSoLost.exceptions.RaftControlException;
import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.Raft;
import java.util.logging.Level;
import java.util.logging.Logger;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
public class WorkOnRaftMenuView extends View {

    public WorkOnRaftMenuView(){
        super("\n"
            + "\n----------------------------------------------"
            + "\n| - Raft Inventory                            |"
            + "\n----------------------------------------------"
            + "\nV - View Raft Items                           "
            + "\nA - Add  Raft Items                           "
            + "\nQ - Quit to main menu                         "
            + "\n----------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert value to upper case
        
        switch (value) {
            case "V": { // View total Raft items.
                try {                 
                    this.calcTotalRaftItems();
                } catch (RaftControlException ex) {
                    Logger.getLogger(WorkOnRaftMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "A": { // Add items to Raft.
                try {
                    this.addRaftItems();
                } catch (RaftControlException ex) {
                    Logger.getLogger(WorkOnRaftMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }

        return false;
    }

    private void calcTotalRaftItems() throws RaftControlException {
        Game game = NotSoLost.getCurrentGame();
        Raft raft = game.getRaft();
        double total = RaftControl.calcTotalRaftItems(raft);
        System.out.println("\nQuantity of items Raft Inventory: " + total);

    }

    private void addRaftItems() throws RaftControlException {
        Game game = NotSoLost.getCurrentGame();
        Raft raft = game.getRaft();
        double total = RaftControl.addRaftItems(raft);
        System.out.println("\nAdding items Raft: " + total);

    }
    
}

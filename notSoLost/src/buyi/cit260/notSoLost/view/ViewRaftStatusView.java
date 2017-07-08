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
public class ViewRaftStatusView extends View {

        public ViewRaftStatusView(){
        super("\n"
            + "\n----------------------------------------------"
            + "\n| - Raft Status                              |"
            + "\n----------------------------------------------"
            + "\nV - View Raft Progress                        "
            + "\nD - Display Raft Items                        "    
            + "\nQ - Quit to main menu                         "
            + "\n----------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert value to upper case
        
        switch (value) {
            case "V": 
                try { // Raft progress
                    this.calcPercentRaftItems();
                } catch (RaftControlException ex) {
                    Logger.getLogger(ViewRaftStatusView.class.getName()).log(Level.SEVERE, null, ex);
                }
                   
            break;
            case "D": 
                try { // Raft item list
                    this.viewRaftItems();
                } catch (RaftControlException ex) {
                    Logger.getLogger(ViewRaftStatusView.class.getName()).log(Level.SEVERE, null, ex);
                }
                   
            break;
            default:
                console.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
    private void calcPercentRaftItems() throws RaftControlException {
        Game game = NotSoLost.getCurrentGame();
        Raft raft = game.getRaft();
        double total = RaftControl.calcPercentRaftItems(raft);
        console.println("\nPercent of total items needed in Raft Inventory: " + total);
    }

    private void viewRaftItems() throws RaftControlException {
        DisplayRaftView displayRaft = new DisplayRaftView();
        displayRaft.display(console);
    }

}


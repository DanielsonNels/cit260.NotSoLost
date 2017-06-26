/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.RaftControl;

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
            + "\nQ - Quit to main menu                         "
            + "\n----------------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // convert value to upper case
        
        switch (value) {
            case "V": // food item list
                this.calcTotalRaftItems();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        
        return false;
    }

    private void calcTotalRaftItems() {
        RaftControl raftControl = new RaftControl.calcTotalRaftItems();
        double total = raftControl.calcTotalRaftItems();
        System.out.println("\nQuantity of items Raft Inventory: " + total);

    }

    void workOnRaftMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

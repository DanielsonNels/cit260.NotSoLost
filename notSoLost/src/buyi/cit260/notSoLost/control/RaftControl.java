/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.control;

import byui.cit260.notSoLost.exceptions.RaftControlException;
import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.Raft;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
public class RaftControl {

    public void addRaftItems(int ropeAmount, int pontoonAmount, int floorAmount,
            int mastAmount, int sailAmount, int rudderAmount) throws RaftControlException {

        Game game = NotSoLost.getCurrentGame();
        Raft raft = game.getRaft();
        
        int curRopeAmount = raft.getRopeAmount();
        if (ropeAmount + curRopeAmount > Raft.MAX_ROPE) {
            throw new RaftControlException("You have added more than what is needed of the, " + 
            Raft.MAX_ROPE + " feet of rope.");
        }
            
        int curPontoonAmount = raft.getPontoonAmount();
        if (pontoonAmount + curPontoonAmount > Raft.MAX_PONTOON) {
            throw new RaftControlException("You have added more than what is needed of the, " + 
            Raft.MAX_PONTOON + " coconuts for pontoons.");
        }
            
        int curFloorAmount = raft.getFloorAmount();
        if (floorAmount + curFloorAmount > Raft.MAX_FLOOR) {
            throw new RaftControlException("You have added more than what is needed of the, " + 
            Raft.MAX_FLOOR + " boards of floor.");
        }
            
        int curMastAmount = raft.getMastAmount();
        if (mastAmount + curMastAmount > Raft.MAX_MAST) {
            throw new RaftControlException("You have added more than what is needed of the, " + 
            Raft.MAX_MAST + " posts of mast.");
        }
            
        int curSailAmount = raft.getSailAmount();
        if (sailAmount + curSailAmount > Raft.MAX_SAIL) {
            throw new RaftControlException("You have added more than what is needed of the, " + 
            Raft.MAX_SAIL + " sheet of sail.");
        }
            
        int curRudderAmount = raft.getRudderAmount();
        if (rudderAmount + curRudderAmount > Raft.MAX_RUDDER) {
            throw new RaftControlException("You have added more than what is needed of the, " + 
            Raft.MAX_RUDDER + " complete rudder.");
        }
            
        raft.setRopeAmount(ropeAmount + curRopeAmount);
        raft.setPontoonAmount(pontoonAmount + curPontoonAmount);
        raft.setFloorAmount(floorAmount + curFloorAmount);
        raft.setMastAmount(mastAmount + curMastAmount);
        raft.setSailAmount(sailAmount + curSailAmount);
        raft.setRudderAmount(rudderAmount + curRudderAmount);
            
    }
    
    public static double calcTotalRaftItems(Raft raft) {
        int curRopeAmount = 0;
        int curPontoonAmount = 0;
        int curFloorAmount = 0;
        int curMastAmount = 0;
        int curSailAmount = 0;
        int curRudderAmount = 0;
        int totalRaftItemCount = (curRopeAmount + curPontoonAmount + curFloorAmount + 
                curMastAmount + curSailAmount + curRudderAmount);
        return totalRaftItemCount;    }

    public static double calcPercentRaftItems(Raft raft) {
        int totalRaftItemCount = 0;
        int totalRaftComplete = 1;
        int percentRaftComplete = (totalRaftItemCount / totalRaftComplete);
        return percentRaftComplete;
    }
    
    public static double addRaftItems(Raft raft) {
        int ropeAmount = 10;
        int pontoonAmount = 2;
        int floorAmount = 1;
        int mastAmount = 1;
        int sailAmount = 1;
        int rudderAmount = 1;
        int total = (ropeAmount + pontoonAmount + floorAmount + mastAmount +
                sailAmount + rudderAmount);
        return total;
    }


}
  

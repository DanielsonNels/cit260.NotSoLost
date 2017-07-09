/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.Raft;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import notsolost.NotSoLost;

/**
 *
 * @author JNewland
 */
public class DisplayRaftView implements ReportInterface {

    @Override
    public void display(PrintWriter writer) {
        StringBuilder line;

        List<String> raftItemList = new ArrayList<String>();
        List<Integer> raftAmountList = new ArrayList<Integer>();

        Game game = NotSoLost.getCurrentGame();
        Raft raft = game.getRaft();
        
        raftItemList.add("Rope");
        raftAmountList.add(raft.getRopeAmount());
        raftItemList.add("Pontoon");
        raftAmountList.add(raft.getPontoonAmount());
        raftItemList.add("Floor");
        raftAmountList.add(raft.getFloorAmount());
        raftItemList.add("Mast");
        raftAmountList.add(raft.getMastAmount());
        raftItemList.add("Sail");
        raftAmountList.add(raft.getSailAmount());
        raftItemList.add("Rudder");
        raftAmountList.add(raft.getRudderAmount());
        
        writer.println(
                "----------------------------------------------\n"
              + "| - Raft Item List                           |\n"
              + "----------------------------------------------");        
        writer.println("ITEM\t\tAMOUNT");
        
            for (int i = 0; i < raftItemList.size(); i++) {
                writer.println(raftItemList.get(i) + "\t\t" + raftAmountList.get(i));
            }
        writer.println("----------------------------------------------");
        
    }
}

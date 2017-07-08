/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.Raft;
import java.io.PrintWriter;
import notsolost.NotSoLost;

/**
 *
 * @author JNewland
 */
public class DisplayRaftView implements ReportInterface {

    @Override
    public void display(PrintWriter writer) {
        StringBuilder line;

        Game game = NotSoLost.getCurrentGame();
        Raft raft = game.getRaft();
        writer.println(
                "----------------------------------------------\n"
              + "| - Raft Item List                           |\n"
              + "----------------------------------------------");        
        writer.println("ITEM\t\tAMOUNT");
        writer.println("Rope\t\t" + raft.getRopeAmount());
        writer.println("Pontoon\t\t" + raft.getPontoonAmount());
        writer.println("Floor\t\t" + raft.getFloorAmount());
        writer.println("Mast\t\t" + raft.getMastAmount());
        writer.println("Sail\t\t" + raft.getSailAmount());
        writer.println("Rudder\t\t" + raft.getRudderAmount());
        writer.println("----------------------------------------------");
        
    }
}

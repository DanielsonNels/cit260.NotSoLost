/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notsolost;

import buyi.cit260.notSoLost.view.StartProgramView;
import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.Actor;


/**
 *
 * @author Nels Danielson
 */
public class NotSoLost {
    
    private static Game currentGame = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        NotSoLost.currentGame = currentGame;
    }
    
    public static Actor getActor() {
        return actor;
    }

    public static void setActor(Actor actor) {
        NotSoLost.actor = actor;
    }

    private static Actor actor = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notsolost;

import byui.cit260.notSoLost.model.Actor;
import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.Raft;
import byui.cit260.notSoLost.model.Location;
import byui.cit260.notSoLost.model.Map;
import byui.cit260.notSoLost.model.InventoryItem;
import byui.cit260.notSoLost.model.ResourceScene;
import byui.cit260.notSoLost.model.RegularSceneType;
import byui.cit260.notSoLost.model.QuestionScene;
import byui.cit260.notSoLost.model.Question;

/**
 *
 * @author Nels Danielson
 */
public class NotSoLost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /********************************
         *      Test Actor Class
         *******************************/ 
        Actor actorOne = new Actor();
        
        actorOne.setName("Samuel");
        actorOne.setDescription("Large Man");
        actorOne.setLocation(1);
        actorOne.setActionMode("Normal");
        actorOne.setEnergyLevel(100);
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        
        /********************************
         *      Test Game Class
         *******************************/ 
        Game theGame = new Game();
        
        theGame.setScore(35);
        theGame.setTimeOfDay(8);
        theGame.setWeather("Sunny");
        
        String gameInfo = theGame.toString();
        System.out.println(gameInfo);
        
       
        /********************************
         *      Test Raft Class
         *******************************/ 
        Raft theRaft = new Raft();
        
        theRaft.setHasRope(true);
        theRaft.setHasPontoons(false);
        theRaft.setHasFloor(true);
        theRaft.setHasMast(false);
        theRaft.setHasSail(false);
        theRaft.setHasRudder(false);
        
        String raftInfo = theRaft.toString();
        System.out.println(theRaft);
        
        
        /********************************
         *      Test Location Class
         *******************************/
        Location actorLocation = new Location();
        
        actorLocation.setRow(1);
        actorLocation.setCol(1);
        actorLocation.setVisited(true);
        actorLocation.setAmountRemaining(24);
        
        String locationInfo = actorLocation.toString();
        System.out.println(locationInfo);
        
        
        /********************************
         *      Test Map Class
         *******************************/
        Map infoMap = new Map();
        
        infoMap.setDescription("This is where you washed up from wreck.");
        infoMap.setRowCount(5);
        infoMap.setColCount(5);
        infoMap.setCurrentRow(1);
        infoMap.setCurrentCol(1);
        
        String mapInfo = infoMap.toString();
        System.out.println(mapInfo);

        
        /********************************
         *      Test InventoryItem Class
         *******************************/
        InventoryItem wrench = new InventoryItem();

        wrench.setInventoryType("Tool");
        wrench.setQuantityInStock(1);
        wrench.setRequiredAmount(1);
        
        String tool_1 = wrench.toString();
        System.out.println(tool_1);
 

        /********************************
         *      Test ResourceScene Class
         *******************************/
         ResourceScene beach = new ResourceScene();
    
         beach.setAmount(5);
         
         String scene = beach.toString();
         System.out.println(scene);
         
         
        /********************************
         *      Test RegularSceneType Class
         *******************************/
        RegularSceneType Boss = new RegularSceneType();

        Boss.setDescription("Local Tribe Leader");
        Boss.setBlocked("Blocked");
        Boss.setSymbol("test");
        
        String type = Boss.toString();
        System.out.println(type);
        
        
        /********************************
         *      Test QuestionScene Class
         *******************************/
        QuestionScene BeachTown = new QuestionScene();

        BeachTown.setNoToAnswer("Okay, Let me know if you change your mind");
        BeachTown.setBonus("Thank you! here, take an extra coconut");
        
        String Scene = BeachTown.toString();
        System.out.println(Scene);
        
        /********************************
         *      Test Question Class
         *******************************/
        Question BuildFire = new Question();

        BuildFire.setQuestion("Would you like to help me build a fire?");
        BuildFire.setAnswer("Yes");
        
        String Question = BuildFire.toString();
        System.out.println(Question);
    }
}
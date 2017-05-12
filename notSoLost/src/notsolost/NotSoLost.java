/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notsolost;

import byui.cit260.notSoLost.model.Actor;
import byui.cit260.notSoLost.model.Location;
import byui.cit260.notSoLost.model.Map;
import byui.cit260.notSoLost.model.InventoryItem;
import byui.cit260.notSoLost.model.ResourceScene;

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
    }
}
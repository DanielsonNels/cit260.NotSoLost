/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.control;

import byui.cit260.notSoLost.model.Map;
import byui.cit260.notSoLost.model.RegularSceneType;

/**
 *
 * @author JSaenz
 */
public class MapControl {
    public static Map createMAP(){
        // create the map
        Map map = new Map(5,5);
        
        // create the scenes for the game
        RegularSceneType[] scenes = createScenes();
        
        // assign scenes to locations
        GameControl.assignRegularSceneTypeToLocations(map, scenes);
        
        return map;
    }
    public static Map moveActorsToStartingLocation(){
        System.out.println("\n*** moveActorsToStartingLocation() called ***");
        return null;
    }

    private static RegularSceneType[] createScenes() {
        System.out.println("\n*** createScenes() called ***");
        return null;
    }
            
}

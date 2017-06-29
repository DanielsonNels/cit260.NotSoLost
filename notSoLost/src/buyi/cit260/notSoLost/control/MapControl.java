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
       
        RegularSceneType[] regularSceneType = new RegularSceneType[Map.SceneType.values().length];
        
        RegularSceneType crashSiteScene = new RegularSceneType();
        crashSiteScene.setDescription("Test");
        crashSiteScene.setSymbol(" CS ");
        regularSceneType[Map.SceneType.crashSite.ordinal()] = crashSiteScene;
        
        RegularSceneType waterFallScene = new RegularSceneType();
        waterFallScene.setDescription(
                "Test");
        waterFallScene.setSymbol(" WF ");
        regularSceneType[Map.SceneType.waterFall.ordinal()] = waterFallScene;
        
        RegularSceneType beachScene = new RegularSceneType();
        beachScene.setDescription(
                "Test");
        beachScene.setSymbol(" B  ");
        regularSceneType[Map.SceneType.beach.ordinal()] = beachScene;
        
        RegularSceneType forestScene = new RegularSceneType();
        forestScene.setDescription(
                "Test");
        forestScene.setSymbol(" F  ");
        regularSceneType[Map.SceneType.forest.ordinal()] = forestScene;
        
        RegularSceneType caveScene = new RegularSceneType();
        caveScene.setDescription(
                "Test");
        caveScene.setSymbol(" C  ");
        regularSceneType[Map.SceneType.cave.ordinal()] = caveScene;
        
        RegularSceneType darkForestScene = new RegularSceneType();
        darkForestScene.setDescription(
                "Test");
        darkForestScene.setSymbol(" DF ");
        regularSceneType[Map.SceneType.darkForest.ordinal()] = darkForestScene;
        
        RegularSceneType volcanoScene = new RegularSceneType();
        volcanoScene.setDescription(
                "Test");
        volcanoScene.setSymbol(" V  ");
        regularSceneType[Map.SceneType.volcano.ordinal()] = volcanoScene;
        
        RegularSceneType mountainScene = new RegularSceneType();
        mountainScene.setDescription(
                "Test");
        mountainScene.setSymbol(" M  ");
        regularSceneType[Map.SceneType.mountain.ordinal()] = mountainScene;
        
        RegularSceneType raftSiteScene = new RegularSceneType();
        raftSiteScene.setDescription(
                "Test");
        raftSiteScene.setSymbol(" RS ");
        regularSceneType[Map.SceneType.raftSite.ordinal()] = raftSiteScene;
        
        RegularSceneType cliffScene = new RegularSceneType();
        cliffScene.setDescription(
                "Test");
        cliffScene.setSymbol(" CF ");
        regularSceneType[Map.SceneType.cliff.ordinal()] = cliffScene;
        
        RegularSceneType campSiteScene = new RegularSceneType();
        campSiteScene.setDescription(
                "Test");
        campSiteScene.setSymbol(" CP ");
        regularSceneType[Map.SceneType.campSite.ordinal()] = campSiteScene;        
   
        RegularSceneType pondScene = new RegularSceneType();
        pondScene.setDescription(
                "Test");
        pondScene.setSymbol(" P  ");
        regularSceneType[Map.SceneType.pond.ordinal()] = pondScene;
        
        return regularSceneType;
    }
    
            
}

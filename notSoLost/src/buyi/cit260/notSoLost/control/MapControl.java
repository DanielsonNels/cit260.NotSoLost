/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.control;

import byui.cit260.notSoLost.model.Location;
import byui.cit260.notSoLost.model.Map;
import byui.cit260.notSoLost.model.RegularSceneType;

/**
 *
 * @author JSaenz
 */
public class MapControl {

    public static Map createMAP() {
        // create the map
        Map map = new Map(5, 5);

        // create the scenes for the game
        RegularSceneType[] scenes = createScenes();

        // assign scenes to locations
        assignRegularSceneTypeToLocations(map, scenes);

        return map;
    }

    public static Map moveActorsToStartingLocation() {
        System.out.println("\n*** moveActorsToStartingLocation() called ***");
        return null;
    }

    private static RegularSceneType[] createScenes() {

        RegularSceneType[] regularSceneType = new RegularSceneType[SceneType.values().length];

        RegularSceneType crashSiteScene = new RegularSceneType();
        crashSiteScene.setDescription("Test");
        crashSiteScene.setSymbol(" CS ");
        regularSceneType[SceneType.crashSite.ordinal()] = crashSiteScene;

        RegularSceneType waterFallScene = new RegularSceneType();
        waterFallScene.setDescription("Test");
        waterFallScene.setSymbol(" WF ");
        regularSceneType[SceneType.waterFall.ordinal()] = waterFallScene;

        RegularSceneType beachScene = new RegularSceneType();
        beachScene.setDescription("Test");
        beachScene.setSymbol(" B  ");
        regularSceneType[SceneType.beach.ordinal()] = beachScene;

        RegularSceneType forestScene = new RegularSceneType();
        forestScene.setDescription("Test");
        forestScene.setSymbol(" F  ");
        regularSceneType[SceneType.forest.ordinal()] = forestScene;

        RegularSceneType caveScene = new RegularSceneType();
        caveScene.setDescription("Test");
        caveScene.setSymbol(" C  ");
        regularSceneType[SceneType.cave.ordinal()] = caveScene;

        RegularSceneType darkForestScene = new RegularSceneType();
        darkForestScene.setDescription("Test");
        darkForestScene.setSymbol(" DF ");
        regularSceneType[SceneType.darkForest.ordinal()] = darkForestScene;

        RegularSceneType volcanoScene = new RegularSceneType();
        volcanoScene.setDescription("Test");
        volcanoScene.setSymbol(" V  ");
        regularSceneType[SceneType.volcano.ordinal()] = volcanoScene;

        RegularSceneType mountainScene = new RegularSceneType();
        mountainScene.setDescription("Test");
        mountainScene.setSymbol(" M  ");
        regularSceneType[SceneType.mountain.ordinal()] = mountainScene;

        RegularSceneType raftSiteScene = new RegularSceneType();
        raftSiteScene.setDescription("Test");
        raftSiteScene.setSymbol(" RS ");
        regularSceneType[SceneType.raftSite.ordinal()] = raftSiteScene;

        RegularSceneType cliffScene = new RegularSceneType();
        cliffScene.setDescription("Test");
        cliffScene.setSymbol(" CF ");
        regularSceneType[SceneType.cliff.ordinal()] = cliffScene;

        RegularSceneType campSiteScene = new RegularSceneType();
        campSiteScene.setDescription("Test");
        campSiteScene.setSymbol(" CP ");
        regularSceneType[SceneType.campSite.ordinal()] = campSiteScene;

        RegularSceneType pondScene = new RegularSceneType();
        pondScene.setDescription("Test");
        pondScene.setSymbol(" P  ");
        regularSceneType[SceneType.pond.ordinal()] = pondScene;

        return regularSceneType;
    }
    
    public enum SceneType{
        crashSite,
        waterFall,
        beach,
        forest,
        cave,
        darkForest,
        volcano,
        mountain,
        raftSite,
        cliff,
        campSite,
        pond;
    }

    public static void assignRegularSceneTypeToLocations(Map map, RegularSceneType[] regularSceneType) {
        Location[][] locations = map.getLocations();

        // start point
        locations[0][0].setRegularSceneType(regularSceneType[SceneType.beach.ordinal()]);
        locations[1][0].setRegularSceneType(regularSceneType[SceneType.beach.ordinal()]);
        locations[2][0].setRegularSceneType(regularSceneType[SceneType.beach.ordinal()]);
        locations[3][0].setRegularSceneType(regularSceneType[SceneType.beach.ordinal()]);
        locations[4][0].setRegularSceneType(regularSceneType[SceneType.beach.ordinal()]);
        locations[0][1].setRegularSceneType(regularSceneType[SceneType.crashSite.ordinal()]);
        locations[1][1].setRegularSceneType(regularSceneType[SceneType.waterFall.ordinal()]);
        locations[2][1].setRegularSceneType(regularSceneType[SceneType.volcano.ordinal()]);
        locations[3][1].setRegularSceneType(regularSceneType[SceneType.mountain.ordinal()]);
        locations[4][1].setRegularSceneType(regularSceneType[SceneType.cliff.ordinal()]);
        locations[0][2].setRegularSceneType(regularSceneType[SceneType.campSite.ordinal()]);
        locations[1][2].setRegularSceneType(regularSceneType[SceneType.forest.ordinal()]);
        locations[2][2].setRegularSceneType(regularSceneType[SceneType.darkForest.ordinal()]);
        locations[3][2].setRegularSceneType(regularSceneType[SceneType.pond.ordinal()]);
        locations[4][2].setRegularSceneType(regularSceneType[SceneType.cliff.ordinal()]);
        locations[0][3].setRegularSceneType(regularSceneType[SceneType.raftSite.ordinal()]);
        locations[1][3].setRegularSceneType(regularSceneType[SceneType.forest.ordinal()]);
        locations[2][3].setRegularSceneType(regularSceneType[SceneType.forest.ordinal()]);
        locations[3][3].setRegularSceneType(regularSceneType[SceneType.mountain.ordinal()]);
        locations[4][3].setRegularSceneType(regularSceneType[SceneType.waterFall.ordinal()]);
        locations[0][4].setRegularSceneType(regularSceneType[SceneType.beach.ordinal()]);
        locations[1][4].setRegularSceneType(regularSceneType[SceneType.beach.ordinal()]);
        locations[2][4].setRegularSceneType(regularSceneType[SceneType.cave.ordinal()]);
        locations[3][4].setRegularSceneType(regularSceneType[SceneType.cliff.ordinal()]);
        locations[4][4].setRegularSceneType(regularSceneType[SceneType.cliff.ordinal()]);
    }

}

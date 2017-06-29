/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.control;

import byui.cit260.notSoLost.model.Actor;
import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.InventoryItem;
import byui.cit260.notSoLost.model.Location;
import byui.cit260.notSoLost.model.Map;
import byui.cit260.notSoLost.model.Player;
import byui.cit260.notSoLost.model.RegularSceneType;
import byui.cit260.notSoLost.model.SceneType;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
        Game game = new Game(); // create new game
        NotSoLost.setCurrentGame(game); // save in NotSoLost
        
        game.setPlayer(player);
        
        Map map = MapControl.createMAP();
        game.setMap(map);
        
        InventoryItem[] inventoryItem = GameControl.createinventoryItem();
        game.setInventoryItem(inventoryItem);
        
    }

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        NotSoLost.setPlayer(player); // save the player
        
        return player;
    }
    
    

    private static Actor[] createActor() {
        System.out.println("*** called createActor() in GameControl ***");
        return null;
    }    

    private static InventoryItem[] createinventoryItem() {
        InventoryItem[] inventory = new InventoryItem[10];
        
        // Food Items
        InventoryItem bananas = new InventoryItem ();
        bananas.setInventoryType("Food");
        bananas.setDescription("Bananas");
        bananas.setQuantityInStock(0);
        bananas.setRequiredAmount(0);
        inventory[Item.bananas.ordinal()] = bananas;
        
        InventoryItem berries = new InventoryItem ();
        berries.setInventoryType("Food");
        berries.setDescription("Berries");
        berries.setQuantityInStock(0);
        berries.setRequiredAmount(0);
        inventory[Item.berries.ordinal()] = berries;
        
        InventoryItem coconuts = new InventoryItem ();
        coconuts.setInventoryType("Food");
        coconuts.setDescription("Coconuts");
        coconuts.setQuantityInStock(0);
        coconuts.setRequiredAmount(0);
        inventory[Item.coconuts.ordinal()] = coconuts;
        
        InventoryItem mangos = new InventoryItem ();
        mangos.setInventoryType("Food");
        mangos.setDescription("Mangos");
        mangos.setQuantityInStock(0);
        mangos.setRequiredAmount(0);
        inventory[Item.mangos.ordinal()] = mangos;
        
        InventoryItem nuts = new InventoryItem ();
        nuts.setInventoryType("Food");
        nuts.setDescription("Nuts");
        nuts.setQuantityInStock(0);
        nuts.setRequiredAmount(0);
        inventory[Item.nuts.ordinal()] = nuts;
        
        // Tool Items
        InventoryItem knife = new InventoryItem ();
        knife.setInventoryType("Tools");
        knife.setDescription("knife");
        knife.setQuantityInStock(0);
        knife.setRequiredAmount(0);
        inventory[Item.knife.ordinal()] = knife;

        InventoryItem hammer = new InventoryItem ();
        hammer.setInventoryType("Tools");
        hammer.setDescription("Hammer");
        hammer.setQuantityInStock(0);
        hammer.setRequiredAmount(0);
        inventory[Item.hammer.ordinal()] = hammer;

        InventoryItem net = new InventoryItem ();
        net.setInventoryType("Tools");
        net.setDescription("Net");
        net.setQuantityInStock(0);
        net.setRequiredAmount(0);
        inventory[Item.net.ordinal()] = net;
        
        // Construction Supplies  
        InventoryItem rope = new InventoryItem ();
        rope.setInventoryType("Construction Supplies");
        rope.setDescription("Rope");
        rope.setQuantityInStock(0);
        rope.setRequiredAmount(0);
        inventory[Item.rope.ordinal()] = rope;

        InventoryItem wood = new InventoryItem ();
        wood.setInventoryType("Construction Supplies");
        wood.setDescription("Wood");
        wood.setQuantityInStock(0);
        wood.setRequiredAmount(0);
        inventory[Item.wood.ordinal()] = wood;
        
        return inventory;
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
    
    public enum Item {
        bananas,
        berries,
        coconuts,
        mangos,
        nuts, 
        knife,
        hammer,
        net,
        rope,
        wood;
    }
}

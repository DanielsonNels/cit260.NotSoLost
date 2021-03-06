/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.control;

import byui.cit260.notSoLost.exceptions.GameControlException;
import byui.cit260.notSoLost.model.Actor;
import byui.cit260.notSoLost.model.Game;
import byui.cit260.notSoLost.model.InventoryItem;
import byui.cit260.notSoLost.model.Map;
import byui.cit260.notSoLost.model.Player;
import buyi.cit260.notSoLost.view.ReportInterface;
import byui.cit260.notSoLost.model.Raft;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
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
        game.setRaft(new Raft());

        Map map = MapControl.createMAP();
        game.setMap(map);

        InventoryItem[] inventoryItem = GameControl.createInventoryItem();
        game.setInventoryItem(inventoryItem);

    }

    public static void saveGame(Game game, String filePath)
            throws GameControlException {

        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(game); //write the game object out to file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

    }

    public static void saveReport(ReportInterface report, String filePath)
            throws GameControlException {

        try (PrintWriter writer = new PrintWriter(filePath)) {
            report.display(writer);
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
    }

    public static void getSavedGame(String filePath)
            throws GameControlException {
        Game game = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject(); //read the game object from file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

        // close the output file
        NotSoLost.setCurrentGame(game); // save in NotSoLost
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

    private static InventoryItem[] createInventoryItem() {
        InventoryItem[] inventory = new InventoryItem[10];

        // Food Items
        InventoryItem bananas = new InventoryItem();
        bananas.setInventoryType("Food");
        bananas.setDescription("Bananas");
        bananas.setQuantityInStock(0);
        bananas.setRequiredAmount(0);
        inventory[Item.bananas.ordinal()] = bananas;

        InventoryItem berries = new InventoryItem();
        berries.setInventoryType("Food");
        berries.setDescription("Berries");
        berries.setQuantityInStock(0);
        berries.setRequiredAmount(0);
        inventory[Item.berries.ordinal()] = berries;

        InventoryItem coconuts = new InventoryItem();
        coconuts.setInventoryType("Food");
        coconuts.setDescription("Coconuts");
        coconuts.setQuantityInStock(0);
        coconuts.setRequiredAmount(0);
        inventory[Item.coconuts.ordinal()] = coconuts;

        InventoryItem mangos = new InventoryItem();
        mangos.setInventoryType("Food");
        mangos.setDescription("Mangos");
        mangos.setQuantityInStock(0);
        mangos.setRequiredAmount(0);
        inventory[Item.mangos.ordinal()] = mangos;

        InventoryItem nuts = new InventoryItem();
        nuts.setInventoryType("Food");
        nuts.setDescription("Nuts");
        nuts.setQuantityInStock(0);
        nuts.setRequiredAmount(0);
        inventory[Item.nuts.ordinal()] = nuts;

        // Tool Items
        InventoryItem knife = new InventoryItem();
        knife.setInventoryType("Tools");
        knife.setDescription("Knife");
        knife.setQuantityInStock(0);
        knife.setRequiredAmount(0);
        inventory[Item.knife.ordinal()] = knife;

        InventoryItem hammer = new InventoryItem();
        hammer.setInventoryType("Tools");
        hammer.setDescription("Hammer");
        hammer.setQuantityInStock(0);
        hammer.setRequiredAmount(0);
        inventory[Item.hammer.ordinal()] = hammer;

        InventoryItem net = new InventoryItem();
        net.setInventoryType("Tools");
        net.setDescription("Net");
        net.setQuantityInStock(0);
        net.setRequiredAmount(0);
        inventory[Item.net.ordinal()] = net;

        // Construction Supplies  
        InventoryItem rope = new InventoryItem();
        rope.setInventoryType("Construction Supplies");
        rope.setDescription("Rope");
        rope.setQuantityInStock(0);
        rope.setRequiredAmount(0);
        inventory[Item.rope.ordinal()] = rope;

        InventoryItem wood = new InventoryItem();
        wood.setInventoryType("Construction Supplies");
        wood.setDescription("Wood");
        wood.setQuantityInStock(0);
        wood.setRequiredAmount(0);
        inventory[Item.wood.ordinal()] = wood;

        return inventory;
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

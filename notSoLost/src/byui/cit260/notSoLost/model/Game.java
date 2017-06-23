/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.notSoLost.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Chris Newland
 */
public class Game implements Serializable {

    // class instance variables
    private Map map;
    private Player player;
    private Actor[] actor;    
    private InventoryItem[] inventoryItem; 

    public InventoryItem[] getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem[] inventoryItem) {
        this.inventoryItem = inventoryItem;
    } 

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game() {

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.map);
        hash = 67 * hash + Objects.hashCode(this.player);
        hash = 67 * hash + Arrays.deepHashCode(this.actor);
        hash = 67 * hash + Arrays.deepHashCode(this.inventoryItem);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "map=" + map + ", player=" + player + ", actor=" + actor + ", inventoryItem=" + inventoryItem + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Arrays.deepEquals(this.actor, other.actor)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventoryItem, other.inventoryItem)) {
            return false;
        }
        return true;
    }

}

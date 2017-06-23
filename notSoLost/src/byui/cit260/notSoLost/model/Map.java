/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.notSoLost.model;

import buyi.cit260.notSoLost.control.GameControl;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Nels
 */
public class Map implements Serializable{

    // Class Instance Variables
    private int rowCount;
    private int colCount;
    private Location[][] locations;
    
    // Default Constructor

    public Map() {
    }
    
    // Getters and Setters

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }    
 
    private static Map createMap(){
        Map map = new Map(5,5);
        RegularSceneType[] regularSceneType = createRegularSceneType();
        GameControl.assignRegularSceneTypeToLocations(map, regularSceneType);
        return map;
    }
    
    private Map(int i, int i0) {
        System.out.println("*** called Map() in GameControl ***");
    }
    
    private static RegularSceneType[] createRegularSceneType() {
        System.out.println("*** called createRegularSceneType() in GameControl ***");
        return null;
    }
    
    // Hashcode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.rowCount;
        hash = 13 * hash + this.colCount;
        hash = 13 * hash + Arrays.deepHashCode(this.locations);
        return hash;
    }

    // To String
    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCount=" + colCount + ", locations=" + locations + '}';
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.colCount != other.colCount) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }


    
}

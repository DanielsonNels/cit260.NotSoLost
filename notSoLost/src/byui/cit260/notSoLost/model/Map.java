/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.notSoLost.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Nels
 */
public class Map implements Serializable {

    // Class Instance Variables
    public int rowCount;
    public int colCount;
    public Location[][] locations;

    // Default Constructor
    public Map() {
    }

    public Map(int rowCount, int colCount) {
        if (rowCount < 1 || colCount < 1) {
            System.out.println("The number of rows and columns must be > Zero");
            return;
        }

        this.rowCount = rowCount;
        this.colCount = colCount;

        // create 2-D array for Location objects 
        this.locations = new Location[rowCount][colCount];

        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                // create and initialize new Location object instance
                Location location = new Location();
                location.setCol(col);
                location.setRow(row);

                // assign the Location object to the current position in array
                locations[row][col] = location;
            }

        }

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

    // Equals
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

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package byui.cit260.notSoLost.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Nels
 */
public class Location implements Serializable {

    // class instance variables
    private int row;
    private int col;
    private boolean visited;
    private RegularSceneType regularSceneType;
    private ArrayList<Actor> actors;

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }
    
    public RegularSceneType getRegularSceneType() {
        return regularSceneType;
    }

    public void setRegularSceneType(RegularSceneType regularSceneType) {
        this.regularSceneType = regularSceneType;
    }

    // Default Constructor
    public Location() {
    }

    // Getters and Setters
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    // Hashcode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.row;
        hash = 83 * hash + this.col;
        hash = 83 * hash + (this.visited ? 1 : 0);
        hash = 83 * hash + Objects.hashCode(this.regularSceneType);
        hash = 83 * hash + Objects.hashCode(this.actors);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", col=" + col + ", visited=" + visited + ", regularSceneType=" + regularSceneType + ", actors=" + actors + '}';
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.col != other.col) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.regularSceneType, other.regularSceneType)) {
            return false;
        }
        if (!Objects.equals(this.actors, other.actors)) {
            return false;
        }
        return true;
    }

}

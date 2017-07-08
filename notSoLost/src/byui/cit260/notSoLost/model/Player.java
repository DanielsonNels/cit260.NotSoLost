/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.notSoLost.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Nels Danielson
 */
public class Player implements Serializable{
    
    // class instance variables
    private String name;
    private String description;
    private Point coordinates;
    private String actionMode;
    private double energyLevel;

    
    // Default Constructor
    public Player() {
        coordinates = new Point(1,1);
        energyLevel = 1;
    }

    
    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public String getActionMode() {
        return actionMode;
    }

    public void setActionMode(String actionMode) {
        this.actionMode = actionMode;
    }

    public double getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(double energyLevel) {
        this.energyLevel = energyLevel;
    }

    // Hashcode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.coordinates);
        hash = 37 * hash + Objects.hashCode(this.actionMode);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.energyLevel) ^ (Double.doubleToLongBits(this.energyLevel) >>> 32));
        return hash;
    }
    
    // To String
    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", description=" + description + ", location=" + coordinates + ", actionMode=" + actionMode + ", energyLevel=" + energyLevel + '}';
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
        final Player other = (Player) obj;
        if (this.coordinates != other.coordinates) {
            return false;
        }
        if (Double.doubleToLongBits(this.energyLevel) != Double.doubleToLongBits(other.energyLevel)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.actionMode, other.actionMode)) {
            return false;
        }
        return true;
    }
}


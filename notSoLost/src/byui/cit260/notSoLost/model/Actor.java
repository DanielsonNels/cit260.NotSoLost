/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.notSoLost.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Nels
 */
public class Actor implements Serializable{
    
    // class instance variables
    private String name;
    private String description;
    private int location;
    private String actionMode;
    private double energyLevel;

    public Actor() {
    }

    
    
    
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

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + this.location;
        hash = 37 * hash + Objects.hashCode(this.actionMode);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.energyLevel) ^ (Double.doubleToLongBits(this.energyLevel) >>> 32));
        return hash;
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
        final Actor other = (Actor) obj;
        if (this.location != other.location) {
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

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", location=" + location + ", actionMode=" + actionMode + ", energyLevel=" + energyLevel + '}';
    }
    
    
}


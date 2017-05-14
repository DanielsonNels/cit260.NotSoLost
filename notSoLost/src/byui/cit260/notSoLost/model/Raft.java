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
 * @author Chris Newland
 */

public class Raft implements Serializable{

    // class instance variables
    private boolean hasRope;  
    private boolean hasPontoons;  
    private boolean hasFloor;  
    private boolean hasMast;  
    private boolean hasSail;  
    private boolean hasRudder;  

    public Raft() {
        this.hasRope = false;
        this.hasPontoons = false;
        this.hasFloor = false;
        this.hasMast = false;
        this.hasSail = false;
        this.hasRudder = false;
    }
    
    

    public boolean hasRope() {
        return hasRope;
    }

    public void setHasRope(boolean hasRope) {
        this.hasRope = hasRope;
    }

    public boolean hasPontoons() {
        return hasPontoons;
    }

    public void setHasPontoons(boolean hasPontoons) {
        this.hasPontoons = hasPontoons;
    }

    public boolean hasFloor() {
        return hasFloor;
    }

    public void setHasFloor(boolean hasFloor) {
        this.hasFloor = hasFloor;
    }

    public boolean hasMast() {
        return hasMast;
    }

    public void setHasMast(boolean hasMast) {
        this.hasMast = hasMast;
    }

    public boolean hasSail() {
        return hasSail;
    }

    public void setHasSail(boolean hasSail) {
        this.hasSail = hasSail;
    }

    public boolean hasRudder() {
        return hasRudder;
    }

    public void setHasRudder(boolean hasRudder) {
        this.hasRudder = hasRudder;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.hasRope ? 1 : 0);
        hash = 23 * hash + (this.hasPontoons ? 1 : 0);
        hash = 23 * hash + (this.hasFloor ? 1 : 0);
        hash = 23 * hash + (this.hasMast ? 1 : 0);
        hash = 23 * hash + (this.hasSail ? 1 : 0);
        hash = 23 * hash + (this.hasRudder ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Raft{" + "hasRope=" + hasRope + ", hasPontoons=" + hasPontoons + ", hasFloor=" + hasFloor + ", hasMast=" + hasMast + ", hasSail=" + hasSail + ", hasRudder=" + hasRudder + '}';
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
        final Raft other = (Raft) obj;
        if (this.hasRope != other.hasRope) {
            return false;
        }
        if (this.hasPontoons != other.hasPontoons) {
            return false;
        }
        if (this.hasFloor != other.hasFloor) {
            return false;
        }
        if (this.hasMast != other.hasMast) {
            return false;
        }
        if (this.hasSail != other.hasSail) {
            return false;
        }
        if (this.hasRudder != other.hasRudder) {
            return false;
        }
        return true;
    }
    
    public boolean isSeaworthy() {
        return this.hasRope && this.hasPontoons && this.hasFloor 
                && this.hasMast && this.hasSail && this.hasRudder;
    }
    
    
}

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

    private final static int MAX_ROPE = 40;
    private final static int MAX_PONTOON = 16;
    private final static int MAX_FLOOR = 6;
    private final static int MAX_MAST = 2;
    private final static int MAX_SAIL = 1; 
    private final static int MAX_RUDDER = 1;
    
   
    
    // class instance variables
    
    private boolean hasRope;
    private int ropeAmount;
    
    private boolean hasPontoons;  
    private int pontoonAmount;
    
    private boolean hasFloor;  
    private int floorAmount;
    
    private boolean hasMast;  
    private int mastAmount;
    
    private boolean hasSail;  
    private int sailAmount;
    
    private boolean hasRudder;  
    private int rudderAmount;

    public Raft() {
        
    }
    
    
    public int getRopeAmount(){
        return ropeAmount;
    }
    
    public void setRopeAmount(int amount){
        ropeAmount = amount;
    }

    public boolean hasRope() {
        return ropeAmount > 0;
    }
    
    public boolean hasEnoughRope(){
        return ropeAmount >= MAX_ROPE;
    }
   
    public int getPontoonAmount(){
        return pontoonAmount;
    }
    
    public void setPontoonAmount(int amount){
        pontoonAmount = amount;
    }

    public boolean hasPontoon() {
        return pontoonAmount > 0;
    }
    
    public boolean hasEnoughPontoons(){
        return pontoonAmount >= MAX_PONTOON;
    }

    public int getFloorAmount(){
        return floorAmount;
    }
    
    public void setFloorAmount(int amount){
        floorAmount = amount;
    }

    public boolean hasFloor() {
        return floorAmount > 0;
    }
    
    public boolean hasEnoughFloor(){
        return floorAmount >= MAX_FLOOR;
    }

    public int getMastAmount(){
        return mastAmount;
    }
    
    public void setMastAmount(int amount){
        mastAmount = amount;
    }

    public boolean hasMast() {
        return mastAmount > 0;
    }
    
    public boolean hasEnoughMast(){
        return mastAmount >= MAX_MAST;
    }

    public int getSailAmount(){
        return sailAmount;
    }
    
    public void setSailAmount(int amount){
        sailAmount = amount;
    }

    public boolean hasSail() {
        return sailAmount > 0;
    }
    
    public boolean hasEnoughSail(){
        return sailAmount >= MAX_SAIL;
    }

    public int getRudderAmount(){
        return rudderAmount;
    }
    
    public void setRudderAmount(int amount){
        rudderAmount = amount;
    }

    public boolean hasRudder() {
        return rudderAmount > 0;
    }
    
    public boolean hasEnoughRudder(){
        return rudderAmount >= MAX_RUDDER;
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
        return "Raft{" +  ", hasPontoons=" + hasPontoons + ","
                + " hasFloor=" + hasFloor + "," + " hasMast=" + hasMast + ","
                + " hasSail=" + hasSail + ", hasRudder=" + hasRudder + '}';
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
        return hasEnoughRope() && hasEnoughPontoons() && hasEnoughFloor() &&
               hasEnoughMast() && hasEnoughSail() && hasEnoughRudder();
    }
        //return this.hasRope && this.hasPontoons && this.hasFloor 
               //&& this.hasMast && this.hasSail && this.hasRudder;
}
    
    

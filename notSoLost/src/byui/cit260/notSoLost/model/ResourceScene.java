/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.notSoLost.model;

import java.io.Serializable;

/**
 *
 * @author Nels
 */
public class ResourceScene implements Serializable{

    // Class Instance Variables
    private int amount;

    // Default Constructor
    public ResourceScene() {
    }

    // Getter and Setter
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    // Hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.amount;
        return hash;
    }

    // To String
    @Override
    public String toString() {
        return "ResourceScene{" + "amount=" + amount + '}';
    }

    
    //Equals
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
        final ResourceScene other = (ResourceScene) obj;
        if (this.amount != other.amount) {
            return false;
        }
        return true;
    }
    
    
}

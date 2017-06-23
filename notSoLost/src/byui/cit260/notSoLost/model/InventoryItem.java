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
 * @author Nels
 */
public class InventoryItem implements Serializable{

    //Class Instance Variables
    private String inventoryType;
    private String description;
    private int quantityInStock;
    private int requiredAmount;    
    private ResourceScene[] resourceScene;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }   
    
    public ResourceScene[] getResourceScene() {
        return resourceScene;
    }

    public void setResourceScene(ResourceScene[] resourceScene) {
        this.resourceScene = resourceScene;
    }    
    
    // Default Constructor
    public InventoryItem() {
    }


    // Getters and Setters
    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }
    

    // Hashcode

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.inventoryType);
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + this.quantityInStock;
        hash = 83 * hash + this.requiredAmount;
        hash = 83 * hash + Arrays.deepHashCode(this.resourceScene);
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", description=" + description + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + ", resourceScene=" + resourceScene + '}';
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Arrays.deepEquals(this.resourceScene, other.resourceScene)) {
            return false;
        }
        return true;
    }

   
    
}

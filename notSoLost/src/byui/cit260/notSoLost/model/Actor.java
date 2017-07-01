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
public enum Actor implements Serializable{
    
    Monkey("test"),
    Cat("test2");
    
    // class instance variables
    private final String description;
    private Point coordinates;

    
    // Default Constructor
    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);        
    }
    
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }
    
}
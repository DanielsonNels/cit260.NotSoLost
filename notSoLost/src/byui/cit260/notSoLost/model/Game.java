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
public class Game implements Serializable {
    
    // class instance variables
    private int score;
    private int timeOfDay; // 24 Hour Clock
    private String weather;

    public Game() {
        
    }
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(int timeOfDay) {
        if (timeOfDay >=0 && timeOfDay <=23) {
            this.timeOfDay = timeOfDay;
        }
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.score;
        hash = 97 * hash + this.timeOfDay;
        hash = 97 * hash + Objects.hashCode(this.weather);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "score=" + score + ", timeOfDay=" + timeOfDay + ", weather=" + weather + '}';
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
        final Game other = (Game) obj;
        if (this.score != other.score) {
            return false;
        }
        if (this.timeOfDay != other.timeOfDay) {
            return false;
        }
        if (!Objects.equals(this.weather, other.weather)) {
            return false;
        }
        return true;
    }


    
    
    
}

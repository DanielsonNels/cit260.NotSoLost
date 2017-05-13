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
 * @author JSaenz
 */
public class QuestionScene implements Serializable{
    
    // class instance variables
    private String noToAnswer;
    private String bonus;

    public QuestionScene() {
    }
    
    public String getNoToAnswer() {
        return noToAnswer;
    }

    public void setNoToAnswer(String noToAnswer) {
        this.noToAnswer = noToAnswer;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.noToAnswer);
        hash = 29 * hash + Objects.hashCode(this.bonus);
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
        final QuestionScene other = (QuestionScene) obj;
        if (!Objects.equals(this.noToAnswer, other.noToAnswer)) {
            return false;
        }
        if (!Objects.equals(this.bonus, other.bonus)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QuestionScene{" + "noToAnswer=" + noToAnswer + ", bonus=" + bonus + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

/**
 *
 * @author Nels
 */
public interface ViewInterface {
    
    public void display();
    public String getInput();
    public String getInput(String message);
    public boolean doAction(String value);
    
}

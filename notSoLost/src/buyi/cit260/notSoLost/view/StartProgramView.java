/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import buyi.cit260.notSoLost.control.GameControl;
import byui.cit260.notSoLost.model.Actor;
import java.util.Scanner;

/**
 *
 * @author JSaenz
 */
public class StartProgramView {
    
    private String promptMessage;
    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                  "\n***************************************************"
                + "\nStuck on an Island is a role play game. Users will "
                + "\ntake on the role of a character that they choose a "
                + "\nname for. The basic objective of this role play    "
                + "\ngame is this: survive until rescuers can make their"
                + "\nway to you. Here is the basic story for it. The    "
                + "\nactor's ship crashed into an island. In the       "
                + "\nprocess, they have lost all communication with the "
                + "\noutside world. They are left with a few supplies   "
                + "\nfrom the boat and goods that are found on the      "
                + "\nisland itself. As the game begins, actors find    "
                + "\nthat the goal is for them to use these things      "
                + "\nwisely to be able to survive until help arrives.   "
                + "\nIn the case of this game, there will be a certain  "
                + "\nnumber of actions/turns that the actor must take  "
                + "\nrather than a time limit to be able to win.        "
                + "\n***************************************************"
        );
    }

    public void displayStartProgramView() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get actors name
            String actorsName = this.getActorsName(); 
            if (actorsName.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(actorsName);
        } while (!done);
    }

    private String getActorsName() {
        
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;                
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String actorsName) {
        // if the length of the actorsName < 2 then
            // display "Invalid name: The name must be > 1 character"
            // return false
            
        // create Actor with specified name
        // if unsuccessful then
            // display "Invalid name: The name is too short"
            // return false
            
        // display customized welcome message
        // display mainMenuView
        // return true
        
        if (actorsName.length() < 2) {
            System.out.println("\n Invalid actors name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        // call createActor() control fucntion
        Actor actor = GameControl.createActor(actorsName);
        
        if (actor == null) { // if unsuccessful
            System.out.println("\nError creating the actor.");
            return false;            
        }
        // display next view
        this.displayNextView(actor);
        
        return true; // success !
    }

    private void displayNextView(Actor actor) {
        
        // display a custom welcome message
        System.out.println("\n=========================================="
                          + "\n Welcome to the game " + actor.getName()
                          + "\n We hope you have a lot of fun!"
                          + "\n========================================="
                          );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.display();
    }
}

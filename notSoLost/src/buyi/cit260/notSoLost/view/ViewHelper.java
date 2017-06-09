/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import java.util.Scanner;

/**
 *
 * @author JNewland
 */
public class ViewHelper {
    
    private static final int WRAP = 60;
    
    public static void display (String title, String message) {
        
        display(title, new String[] { message });
        
    }

    public static void display (String title, String[] messages) {

        System.out.println("\n" + title + "\n");
        
        for (int m = 0; m < messages.length; m++) {
            StringBuilder sb = new StringBuilder(messages[m]);
            int i = 0;
            while (i + ViewHelper.WRAP < sb.length() && 
                (i = sb.lastIndexOf(" ", i + ViewHelper.WRAP)) != -1) {
                sb.replace(i, i + 1, "\n");
            }

            System.out.println(sb.toString());
        }
    }
    
    
    public static String getMenuOption(String menu, String promptMessage) {

        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println(menu + "\n" + promptMessage);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }

            break; // end the loop
        }

        return value; // return the value entered
    }

    
    
}

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
}

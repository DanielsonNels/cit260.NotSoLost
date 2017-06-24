/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.*;

/**
 *
 * @author JSaenz
 */
public class ViewItemWeightView {

    /*
    public ArrayList<TideLevel> addTideLevel( ) {
        ArrayList<TideLevel> levels = new ArrayList<>();
        
        return levels;
     */

    public void displayViewItemWeightView() {
        int[] weights = {10, 12, 5, 2, 9, 6, 7, 1, 8, 4, 3, 13};
        System.out.println(Arrays.toString(weights));

        int min, max;        
        min = max = weights[0];
        for(int i = 1; i < weights.length; i++){
            if(weights[i] < min) min = weights[i];
            if(weights[i] > max) max = weights[i];
        }
        System.out.println("Minimum value is " + min + " and maximum value is " + max);
        
        int sum = IntStream.of(weights).sum();
        System.out.println("Sum : " + sum);
        
        int average = sum / weights.length;
        System.out.println("Average : " + average);
        
        int lastNumber = weights[weights.length-1];
        System.out.println("Last number in array: " + lastNumber);
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a value to search in array 'ItemWeights': ");
        int value = reader.nextInt();        
        //int index = Arrays.asList(weights).indexOf(8);
        //System.out.println("Your search value of " + value + " is stored in index " + index);
        
        boolean contains = IntStream.of(weights).anyMatch(x -> x == value);
        if(contains == true){            
            System.out.println("Seach result for the value " + value + " was succesful"); 
        }
        else {
            System.out.println("Seach result for the value " + value + " was unsuccesful");
        }
         
    }

}

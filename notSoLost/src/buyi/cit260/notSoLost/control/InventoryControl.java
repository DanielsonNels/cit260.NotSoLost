/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor...
 */
package buyi.cit260.notSoLost.control;

import byui.cit260.notSoLost.exceptions.InventoryControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.stream.IntStream;
import notsolost.NotSoLost;

/**
 *
 * @author JSaenz
 */
public class InventoryControl {

    public final BufferedReader keyboard = NotSoLost.getInFile();
    protected final PrintWriter console = NotSoLost.getOutFile();

    public double calcTotalItems() throws InventoryControlException {
        int[] amounts = {6, 5, 1, 8, 0, 12, 4, 1, 4, 2};

        int total = 0;

        for (int amount : amounts) {
            total += amount;
        }

        return total;
    }

    public static class calcTotalItems extends InventoryControl {

        public calcTotalItems() {
        }
    }

    public void calcItemWeight() throws InventoryControlException {
        boolean contains = false;
        int[] weights = {10, 12, 5, 2, 9, 6, 7, 1, 8, 4, 3, 13};
        System.out.println(Arrays.toString(weights));

        int min, max;
        min = max = weights[0];
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] < min) {
                min = weights[i];
            }
            if (weights[i] > max) {
                max = weights[i];
            }
        }
        System.out.println("Minimum value is " + min + " and maximum value is " + max);

        int sum = IntStream.of(weights).sum();
        System.out.println("Sum : " + sum);

        int average = sum / weights.length;
        System.out.println("Average : " + average);

        int lastNumber = weights[weights.length - 1];
        System.out.println("Last number in array: " + lastNumber);

        try {
            while (!contains) {
                //Scanner reader = new Scanner(System.in);
                System.out.println("Enter a value to search in array 'ItemWeights': ");

                try {
                    int value = Integer.parseInt(keyboard.readLine());
                    contains = IntStream.of(weights).anyMatch(x -> x == value);

                    if (contains == true) {
                        System.out.println("Seach result for the value " + value + " was succesful");
                    } else {
                        System.out.println("\nA value of " + value + " wasn't found. Please try again.");
                    }
                } catch (InputMismatchException im) {
                    System.out.println("\nNot a valid number. Please try again");
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }

    public static class calcItemWeight extends InventoryControl {

        public calcItemWeight() {
        }
    }

}

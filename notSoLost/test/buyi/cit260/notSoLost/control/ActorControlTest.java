/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JSaenz
 */
public class ActorControlTest {
    
    public ActorControlTest() {
    }

    /**
     * Test of calcEnergyTravelCost method, of class ActorControl.
     */
    @Test
    public void testCalcEnergyTravelCost() {
        System.out.println("calcEnergyTravelCost");
        // test case #1
        double currentEnergy = 10;
        double distanceTraveled = 2;
        double packWeight = 45;
        ActorControl instance = new ActorControl();
        double expResult = -1;
        double result = instance.calcEnergyTravelCost(currentEnergy, distanceTraveled, packWeight);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        System.out.println("\tTest Case #1 Actual = " + result + " vs. expected = " + expResult);
        
        // test case #2
        currentEnergy = 10;
        distanceTraveled = 2;
        packWeight = -1;
        expResult = -1;
        result = instance.calcEnergyTravelCost(currentEnergy, distanceTraveled, packWeight);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        System.out.println("\tTest Case #2 Actual = " + result + " vs. expected = " + expResult);
        
        // test case #3
        currentEnergy = 15;
        distanceTraveled = -2;
        packWeight = 25;
        expResult = -1;
        result = instance.calcEnergyTravelCost(currentEnergy, distanceTraveled, packWeight);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        System.out.println("\tTest Case #3 Actual = " + result + " vs. expected = " + expResult);
        
        // test case #4
        currentEnergy = -1;
        distanceTraveled = 1;
        packWeight = 15;
        expResult = -1;
        result = instance.calcEnergyTravelCost(currentEnergy, distanceTraveled, packWeight);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        System.out.println("\tTest Case #4 Actual = " + result + " vs. expected = " + expResult);
    }
    
    /**
     * Test of calcEnergyRestGain method, of class ActorControl.
     */
    @Test
    public void testCalcEnergyRestGain() {
        System.out.println("calcEnergyRestGain");
        // test case #1 (Valid)
        double currentEnergy = 30;
        double timeOfDay = 4;
        double restHours = 2;
        ActorControl instance = new ActorControl();
        double expResult = 36;
        double result = instance.calcEnergyRestGain(currentEnergy, restHours, timeOfDay);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        System.out.println("\tTest Case #1 (Valid) Actual = " + result + " vs. expected = " + expResult);
        
        // test case #2 (Invalid)
        currentEnergy = 0;
        timeOfDay = 4;
        restHours = 2;
        expResult = -1;
        result = instance.calcEnergyRestGain(currentEnergy, restHours, timeOfDay);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        System.out.println("\tTest Case #2 (Invalid) Actual = " + result + " vs. expected = " + expResult);
        
        // test case #3 (Invalid)
        currentEnergy = 15;
        timeOfDay = 22;
        restHours = 0;
        expResult = -1;
        result = instance.calcEnergyRestGain(currentEnergy, restHours, timeOfDay);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        System.out.println("\tTest Case #3 (Invalid) Actual = " + result + " vs. expected = " + expResult);
        
        // test case #4 (Invalid)
        currentEnergy = 15;
        timeOfDay = 20;
        restHours = 11;        
        expResult = -1;
        result = instance.calcEnergyRestGain(currentEnergy, restHours, timeOfDay);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        System.out.println("\tTest Case #4 (Invalid) Actual = " + result + " vs. expected = " + expResult);  
        
        // test case #5 (Boundary)
        currentEnergy = 1;
        timeOfDay = 21;
        restHours = 1;        
        expResult = 4;
        result = instance.calcEnergyRestGain(currentEnergy, restHours, timeOfDay);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        System.out.println("\tTest Case #5 (Boundary) Actual = " + result + " vs. expected = " + expResult);
        
        // test case #6 (Boundary)
        currentEnergy = 1;
        timeOfDay = 3;
        restHours = 10;        
        expResult = 31;
        result = instance.calcEnergyRestGain(currentEnergy, restHours, timeOfDay);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        System.out.println("\tTest Case #6 (Boundary) Actual = " + result + " vs. expected = " + expResult);
    }    

    /**
     * Test of eat method, of class ActorControl.
     */
    @Test
    public void testCalcFoodEnergy() {
        System.out.println("calcFoodEnergy");
        
        // Test Case 1 (Valid)
        double currentEnergy = 30.0;
        double energyValue = 5.0;
        double numFood = 2.0;
        ActorControl instance = new ActorControl();
        double expResult = 40.0;
        double result = instance.calcFoodEnergy(currentEnergy, energyValue, numFood);
        assertEquals(expResult, result, 0.0);
        System.out.println("\tTest Case #1 (Valid) Actual = " + result + " vs. expected = " + expResult);
        
        // Test Case 2 (Invalid)
        currentEnergy = 0.0;
        energyValue = 1.0;
        numFood = 4.0;
        expResult = -1.0;
        result = instance.calcFoodEnergy(currentEnergy, energyValue, numFood);
        assertEquals(expResult, result, 0.0);
        System.out.println("\tTest Case #2 (Valid) Actual = " + result + " vs. expected = " + expResult);

        // Test Case 3 (Invalid)
        currentEnergy = 15.0;
        energyValue = 5.0;
        numFood = 0.0;
        expResult = -1.0;
        result = instance.calcFoodEnergy(currentEnergy, energyValue, numFood);
        assertEquals(expResult, result, 0.0);
        System.out.println("\tTest Case #3 (Invalid) Actual = " + result + " vs. expected = " + expResult);

        // Test Case 4 (Invalid)
        currentEnergy = 100.0;
        energyValue = 3.0;
        numFood = 1.0;
        expResult = -1.0;
        result = instance.calcFoodEnergy(currentEnergy, energyValue, numFood);
        assertEquals(expResult, result, 0.0);
        System.out.println("\tTest Case #4 (Invalid) Actual = " + result + " vs. expected = " + expResult);

        // Test Case 5 (Invalid)
        currentEnergy = 90.0;
        energyValue = 4.0;
        numFood = 4.0;
        expResult = -1.0;
        result = instance.calcFoodEnergy(currentEnergy, energyValue, numFood);
        assertEquals(expResult, result, 0.0);
        System.out.println("\tTest Case #5 (Invalid) Actual = " + result + " vs. expected = " + expResult);

        // Test Case 6 (Valid)
        currentEnergy = 1.0;
        energyValue = 1.0;
        numFood = 1.0;
        expResult = 2.0;
        result = instance.calcFoodEnergy(currentEnergy, energyValue, numFood);
        assertEquals(expResult, result, 0.0);
        System.out.println("\tTest Case #6 (Valid) Actual = " + result + " vs. expected = " + expResult);
        
        // Test Case 7 (Valid)
        currentEnergy = 1.0;
        energyValue = 1.0;
        numFood = 1.0;
        expResult = 2.0;
        result = instance.calcFoodEnergy(currentEnergy, energyValue, numFood);
        assertEquals(expResult, result, 0.0);
        System.out.println("\tTest Case #7 (Valid) Actual = " + result + " vs. expected = " + expResult);
    }

}

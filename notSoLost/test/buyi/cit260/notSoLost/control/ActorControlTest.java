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
    
}

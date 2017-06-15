/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.control;

/**
 *
 * @author JSaenz
 */
public class ActorControl {

    public double calcEnergyTravelCost (double currentEnergy, double distanceTraveled, double packWeight){

        if (packWeight > 40) {
            return -1;
        }

        if (packWeight < 0) {
            return -1;
        }

        if (distanceTraveled < 0) {
            return -1;
        }

        if (currentEnergy < 0) {
            return -1;
        }

        double energyPerHour = 2;
        double energyPerSpace = 5;
        double energyPerPound = .25;

        double newEnergyLevel = currentEnergy - ((distanceTraveled * (energyPerHour + energyPerSpace)) + (energyPerPound * packWeight));

        return newEnergyLevel;
    }
    
    public double calcEnergyRestGain (double currentEnergy, double restHours, double timeOfDay){
        
	if (currentEnergy <= 0) {
		return -1;
        }

        if (restHours <= 0) {
		return -1;
        }

        if (restHours > 10) {
		return -1;
        }
                
        double energyRestGainPerHour = 2;
        double restMultiplier = 0;
        
        if (timeOfDay <= 6 || timeOfDay >= 20) {
      		restMultiplier = 1.5;
        } else {
		restMultiplier = 1; 
        }
        
        double newEnergyLevel = currentEnergy + (energyRestGainPerHour * restMultiplier * restHours);                

        return newEnergyLevel;
    }

    
    /*********************************************
     *                  EAT
     * @param currentEnergy
     * @param energyValue
     * @param numFood
     * @return 
     *********************************************/
    public double calcFoodEnergy (double currentEnergy, double energyValue, double numFood){
    
        
        if (currentEnergy >= 100 || currentEnergy < 1){
                return -1;
        }
        
        if (energyValue <= 0){
                return -1;
        }
        
        if (numFood <= 0){
                return -1;
        }
        
        if ((currentEnergy + (energyValue * numFood)) > 100){
                return -1;
        }
        
        else {
                double newEnergyLevel = (currentEnergy + (energyValue * numFood));

                return newEnergyLevel;
        }
        
    }
    
       public double calcPackWeight(double currentWeight,
            double inventoryItemWeight, int inventoryItemQuantity) {

        if (currentWeight < 0) {
            return -1;
        }

        if (inventoryItemWeight < 1) {
            return -1;
        }

        if (inventoryItemQuantity < 1) {
            return -1;
        }

        double newPackWeight = currentWeight
                + (inventoryItemWeight * inventoryItemQuantity);

        if (newPackWeight > 40) {
            return -1;
        }

        return newPackWeight;
    }
}

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
    
}

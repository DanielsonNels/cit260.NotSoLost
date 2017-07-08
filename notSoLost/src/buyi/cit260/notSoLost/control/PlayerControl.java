/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.notSoLost.control;

import byui.cit260.notSoLost.exceptions.PlayerControlException;

/**
 *
 * @author JSaenz
 */
public class PlayerControl {

    private final static int MAX_PACKWEIGHT = 40;
    private final static int MIN_PACKWEIGHT = 0;
    private final static int MIN_ITEMWEIGHT = 1;
    private final static int MIN_ITEMQTY = 1;
    private final static int MIN_DISTANCE = 1;
    private final static int MAX_ENERGY = 100;
    private final static int MIN_ENERGY = 1;
    private final static int MIN_ENERGY_VALUE = 0;
    private final static int MIN_REST_HOURS = 1;
    private final static int MAX_REST_HOURS = 10;
    private final static int MIN_NUMFOOD = 1;
    private final static int MAX_TIMEOFDAY = 2400;
    private final static int MIN_TIMEOFDAY = 1;

    public double calcEnergyTravelCost(double currentEnergy, double distanceTraveled, double packWeight) throws PlayerControlException {

        if (packWeight > MAX_PACKWEIGHT) {
            throw new PlayerControlException("You cannot carry more than " + MAX_PACKWEIGHT + " pounds.  Please try again");
        }

        if (packWeight < MIN_PACKWEIGHT) {
            throw new PlayerControlException("Your pack weight cannot be less than " + MIN_PACKWEIGHT + " pounds.  Please try again");
        }

        if (distanceTraveled < MIN_DISTANCE) {
            throw new PlayerControlException("You cannot travel less than " + MIN_DISTANCE + " location on the map.  Please try again");
        }

        if (currentEnergy <= MIN_ENERGY) {
            throw new PlayerControlException("You cannot travel with less than " + MIN_ENERGY + " energy points");
        }

        double energyPerHour = 2;
        double energyPerSpace = 5;
        double energyPerPound = .25;

        double newEnergyLevel = currentEnergy - ((distanceTraveled * (energyPerHour + energyPerSpace)) + (energyPerPound * packWeight));

        return newEnergyLevel;
    }

    public double calcEnergyRestGain(double currentEnergy, double restHours, double timeOfDay) throws PlayerControlException {

        if (currentEnergy < MIN_ENERGY) {
            throw new PlayerControlException("You cannot rest with less than " + MIN_ENERGY + " energy points");
        }

        if (restHours < MIN_REST_HOURS || restHours > MAX_REST_HOURS) {
            throw new PlayerControlException("Invalid value: you cannot rest less than " + MIN_REST_HOURS + " or more than " + MAX_REST_HOURS + " hours");
        }

        if (timeOfDay < MIN_TIMEOFDAY || timeOfDay > MAX_TIMEOFDAY) {
            throw new PlayerControlException("Invalid value: time of day cannot be less than " + MIN_TIMEOFDAY + " or more than " + MAX_TIMEOFDAY);
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

    // Determine energy benefit of eating an amount of a type of food.
    public double calcFoodEnergy(double currentEnergy, double energyValue, double numFood) throws PlayerControlException {

        if (currentEnergy >= MAX_ENERGY || currentEnergy < MIN_ENERGY) {
            throw new PlayerControlException("You can only collect more energy by eating if your current energy is between " + MIN_ENERGY + " and " + MAX_ENERGY);
        }

        if (energyValue <= MIN_ENERGY_VALUE) {
            throw new PlayerControlException("The energy value entered cannot be less than " + MIN_ENERGY_VALUE);
        }

        if (numFood < MIN_NUMFOOD) {
            throw new PlayerControlException("You have to eat more than " + MIN_NUMFOOD + " food quantity");
        }

        if ((currentEnergy + (energyValue * numFood)) > MAX_ENERGY) {
            throw new PlayerControlException("You can only collect more energy by eating if your current energy is less than " + MAX_ENERGY);
        } else {
            double newEnergyLevel = (currentEnergy + (energyValue * numFood));

            return newEnergyLevel;
        }

    }

    public double calcPackWeight(double currentWeight, double inventoryItemWeight, int inventoryItemQuantity) throws PlayerControlException {

        if (currentWeight < MIN_PACKWEIGHT) {
            throw new PlayerControlException("The pack weight cannot be less than " + MIN_PACKWEIGHT);
        }

        if (inventoryItemWeight < MIN_ITEMWEIGHT) {
            throw new PlayerControlException("The item inventory weight cannot be less than " + MIN_ITEMWEIGHT);
        }

        if (inventoryItemQuantity < MIN_ITEMQTY) {
            throw new PlayerControlException("You can cannot have less than " + MIN_ITEMQTY + "items in your pack");
        }

        double newPackWeight = currentWeight + (inventoryItemWeight * inventoryItemQuantity);

        if (newPackWeight > MAX_PACKWEIGHT) {
            throw new PlayerControlException("You can cannot carry more than " + MAX_PACKWEIGHT);
        }

        return newPackWeight;
    }
}

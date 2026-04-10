package simplifyboolean.correct;

/**
 * boolean hasEnoughResources bundles similar aspects together and calls 2 separate methods
 * and relevant conditions have been moved here
 * 
 * Overall readability has improved and conditions are no longer confusing to understand and spotting a mistake 
 * is easier.
 * 
 * hull.holes == 0 changes to hull.isIntact() which is much better for readability
 */
public class SpaceShip {
    
    Crew crew;
    FuelTank fuelTank;
    Hull hull;
    Navigator navigator;
    OxygenTank oxygenTank;

    boolean willCrewSurvive() {
        boolean hasEnoughResources = hasEnoughFuel() && hasEnoughOxygen();

        return hull.isIntact() && hasEnoughResources;
    }

    private boolean hasEnoughOxygen() {
        return oxygenTank.lastsFor(crew.size) > navigator.timeToEarth();
    }

    private boolean hasEnoughFuel() {
        return fuelTank.fuel >= navigator.requiredFuelToEarth();
    }
}

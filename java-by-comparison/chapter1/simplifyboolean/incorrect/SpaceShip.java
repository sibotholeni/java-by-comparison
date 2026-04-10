package simplifyboolean.incorrect;

/**
 * Boolean expressions combining many conditions is hard to understand
 * and easy to get wrong
 */
class SpaceShip {

    Crew crew;
    FuelTank fuelTank;
    Hull hull;
    Navigator navigator;
    OxygenTank oxygenTank;

    boolean willCrewSurvice() {
        return hull.holes == 0 && 
            fuelTank.fuel >= navigator.requiredFuelToEarth() && 
            oxygenTank.lastsFor(crew.size) > navigator.timeToEarth();

    }
}
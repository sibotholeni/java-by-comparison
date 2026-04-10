package unnecessaryComparisons.incorrect;

public class Laboratory {
    
    Microscope microscope;

    Result analyze(Sample sample) {
        if (microscope.isInOrganic(sample) == true) {
            return Result.INORGANIC;
        } else {
            return analyzeOrganic(sample);
        }
    }

    private Result analyzeOrganic(Sample sample) {
        if (microscope.isHumanoid(sample) == false) {
            return Result.ELIEN;
        } else {
            return Result.HUMANOID;
        }
    }
}

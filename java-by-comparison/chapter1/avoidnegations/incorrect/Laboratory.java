package avoidnegations.incorrect;

// With both if conditions expressing negation you need to think about (if x does NOT apply) instead of just (if x does apply)
public class Laboratory {
    Microscope microscope;

    Result analyze(Sample sample) {
        if (microscope.isInorganic(sample)) { // expresses nagating condition
            return Result.INORGANIC;
        } else {
            return analyzeOrganic(sample);
        }
    }

    private Result analyzeOrganic(Sample sample) {
        if (!microscope.isHumanoid(sample)) {   // expresses nagating using !
            return Result.ALIEN;
        } else {
            return Result.HUMANOID;
        }
    }
}

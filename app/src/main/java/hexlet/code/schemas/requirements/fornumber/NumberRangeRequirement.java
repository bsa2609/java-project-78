package hexlet.code.schemas.requirements.fornumber;

import hexlet.code.schemas.requirements.Requirement;

public final class NumberRangeRequirement implements Requirement<Integer> {
    private final int minNumber;
    private final int maxNumber;

    public NumberRangeRequirement(int minNumberForNumber, int maxNumberForNumber) {
        this.minNumber = minNumberForNumber;
        this.maxNumber = maxNumberForNumber;
    }

    @Override
    public boolean check(Integer dataForCheck) {
        return dataForCheck != null && dataForCheck >= minNumber && dataForCheck <= maxNumber;
    }
}

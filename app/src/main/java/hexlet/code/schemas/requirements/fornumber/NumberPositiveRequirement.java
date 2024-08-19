package hexlet.code.schemas.requirements.fornumber;

import hexlet.code.schemas.requirements.Requirement;

public final class NumberPositiveRequirement implements Requirement<Integer> {
    @Override
    public boolean check(Integer dataForCheck) {
        return dataForCheck == null || dataForCheck > 0;
    }
}

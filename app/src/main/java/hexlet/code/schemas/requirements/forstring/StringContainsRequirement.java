package hexlet.code.schemas.requirements.forstring;

import hexlet.code.schemas.requirements.Requirement;

public final class StringContainsRequirement implements Requirement<String> {
    private final String subString;

    public StringContainsRequirement(String subString) {
        this.subString = subString;
    }

    @Override
    public boolean check(String dataForCheck) {
        return (dataForCheck != null && dataForCheck.contains(subString)) || subString.isBlank();
    }
}

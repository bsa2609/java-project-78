package hexlet.code.schemas;

import hexlet.code.schemas.requirements.Requirement;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseSchema<T> {
    private Map<String, Requirement<T>> requirements;

    public BaseSchema() {
        requirements = new HashMap<>();
    }

    /**
     * Adds a new validation requirement.
     * @param name - requirement name
     * @param requirement - validation requirement
     */
    public void addRequirement(String name, Requirement<T> requirement) {
        requirements.put(name, requirement);
    }

    /**
     * Checks the value for the validity of the scheme.
     * @param dataForValidation - data for validation
     * @return - true if data is valid, else false
     */
    public boolean isValid(Object dataForValidation) {
        return requirements.values().stream()
                .allMatch(requirement -> requirement.check(convertType(dataForValidation)));
    }

    public abstract T convertType(Object value);
}

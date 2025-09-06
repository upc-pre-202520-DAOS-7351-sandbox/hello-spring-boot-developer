package com.acme.helloplatform.generic.domain.model.entity;

import lombok.Builder;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/*
 * Represents a Developer entity in the Generic bounded context.
 *
 * @author Open-Source Application Development Team
 * @version 1.0.0
 */
@Getter
@Builder
public class Developer {
    private final UUID id = UUID.randomUUID();
    private final String firstName;
    private final String lastName;

    /**
     * Private constructor to enforce trimming of name fields.
     *
     * @param firstName the developer's first name
     * @param lastName  the developer's last name
     */
    public Developer(String firstName, String lastName) {
        this.firstName = StringUtils.trimToEmpty(firstName);
        this.lastName = StringUtils.trimToEmpty(lastName);
    }

    /**
     * Returns the full name by concatenating first and last names with a space.
     *
     * @return the full name as a string
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * Checks if either the first name or last name is blank (null, empty, or whitespace-only).
     *
     * @return true if any name is blank, false otherwise
     */
    public boolean isAnyNameBlank() {
        return StringUtils.isAnyBlank(firstName, lastName);
    }

    /**
     * Checks if either the trimmed first name or last name is empty.
     *
     * @return true if any trimmed name is empty, false otherwise
     */
    public boolean isAnyNameEmpty() {
        return StringUtils.isAnyEmpty(firstName, lastName);
    }
}

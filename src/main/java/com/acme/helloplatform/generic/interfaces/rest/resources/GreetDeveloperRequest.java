package com.acme.helloplatform.generic.interfaces.rest.resources;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * REST resource representing incoming Greet Developer request data.
 *
 * @param firstName the developer's first name
 * @param lastName  the developer's last name
 *
 * @author Open-Source Application Development Team
 * @version 1.0.0
 */
public record GreetDeveloperRequest(String firstName, String lastName) {
    /**
     * Constructs a new GreetDeveloperRequest instance with the given first and last names.
     *
     * @param firstName the developer's first name, which may be null or empty
     * @param lastName  the developer's last name, which may be null or empty
     */
    @JsonCreator
    public GreetDeveloperRequest(@JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

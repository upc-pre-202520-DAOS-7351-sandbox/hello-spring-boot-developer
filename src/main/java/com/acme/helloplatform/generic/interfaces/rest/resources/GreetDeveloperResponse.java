package com.acme.helloplatform.generic.interfaces.rest.resources;

import java.util.UUID;

/**
 * REST resource representing Greet Developer response data.
 *
 * @param id       the developer's unique identifier
 * @param fullName the developer's full name
 * @param message  the greeting message
 * @author Open-Source Application Development Team
 * @version 1.0.0
 */
public record GreetDeveloperResponse(UUID id, String fullName, String message) {
    /**
     * Constructs a new GreetDeveloperResponse instance with the given id, full name, and message.
     *
     * @param message the greeting message, which may be null or empty
     */
    public GreetDeveloperResponse(String message) {
        this(null, null, message);
    }
}
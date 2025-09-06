package com.acme.helloplatform.generic.interfaces.rest.assemblers;

import com.acme.helloplatform.generic.domain.model.entity.Developer;
import com.acme.helloplatform.generic.interfaces.rest.resources.GreetDeveloperResponse;
import org.apache.commons.lang3.ObjectUtils;

/**
 * Assembler class to convert a {@link Developer} entity into a {@link GreetDeveloperResponse} REST resource.
 * @author Open-Source Application Development Team
 * @version 1.0.0
 */
public class GreetDeveloperAssembler {
    /**
     * Converts a {@link Developer} entity into a {@link GreetDeveloperResponse} REST resource.
     * @param developer the {@link Developer} entity to convert containing the developer's id, and full name
     * @return the converted {@link GreetDeveloperResponse} REST resource, or a default response if the developer is null or blank
     */
    public static GreetDeveloperResponse toResourceFromEntity(Developer developer) {
        if (isDeveloperNullOrEmptyNamed(developer))
            return new GreetDeveloperResponse("Welcome Anonymous Spring Boot Developer");
        return new GreetDeveloperResponse(
                developer.getId(), developer.getFullName(),
                "Congrats " + developer.getFullName() + "! You are a Spring Boot Developer");
    }

    /**
     * Checks if the given {@link Developer} entity is null or has invalid names.
     * @param developer the {@link Developer} entity to check
     * @return true if the entity is null or has invalid names, false otherwise
     */
    private static boolean isDeveloperNullOrEmptyNamed(Developer developer) {
        return ObjectUtils.isEmpty(developer) || developer.isAnyNameEmpty() || developer.isAnyNameBlank();
    }
}

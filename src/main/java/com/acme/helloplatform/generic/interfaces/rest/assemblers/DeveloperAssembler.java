package com.acme.helloplatform.generic.interfaces.rest.assemblers;

import com.acme.helloplatform.generic.domain.model.entity.Developer;
import com.acme.helloplatform.generic.interfaces.rest.resources.GreetDeveloperRequest;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Assembler class to convert a {@link GreetDeveloperRequest} into a {@link Developer} entity.
 *
 * @author Open-Source Application Development Team
 * @version 1.0.0
 */
public class DeveloperAssembler {
    /**
     * Converts a {@link GreetDeveloperRequest} into a {@link Developer} entity.
     *
     * @param request the {@link GreetDeveloperRequest} to convert, containing the developer's first and last names
     * @return the converted {@link Developer} entity, or null if the request is null or blank
     */
    public static Developer toEntityFromRequest(GreetDeveloperRequest request) {
        if (ObjectUtils.isEmpty(request) || StringUtils.isAnyBlank(request.firstName(), request.lastName()))
            return null;
        return Developer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .build();
    }
}

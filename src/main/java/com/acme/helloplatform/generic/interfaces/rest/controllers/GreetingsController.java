package com.acme.helloplatform.generic.interfaces.rest.controllers;

import com.acme.helloplatform.generic.domain.model.entity.Developer;
import com.acme.helloplatform.generic.interfaces.rest.assemblers.DeveloperAssembler;
import com.acme.helloplatform.generic.interfaces.rest.assemblers.GreetDeveloperAssembler;
import com.acme.helloplatform.generic.interfaces.rest.resources.GreetDeveloperRequest;
import com.acme.helloplatform.generic.interfaces.rest.resources.GreetDeveloperResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.Objects;

/**
 * REST controller for handling greeting-related requests.
 * Provides endpoints for creating and retrieving greetings.
 * @author Open-Source Application Development Team
 * @version 1.0.0
 */
@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {
    /**
     * Greet a developer by their first and last names.
     * @param firstName the developer's first name, which may be null or empty
     * @param lastName  the developer's last name, which may be null or empty
     * @return the greeting response, or a default response if the developer is null or blank
     */
    @GetMapping
    public ResponseEntity<GreetDeveloperResponse> greetDeveloper(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {

        Developer developer = (Objects.isNull(firstName) || Objects.isNull(lastName)) ?
                null : Developer.builder().firstName(firstName).lastName(lastName).build();
        System.out.println("Greeting Developer: " + developer);
        GreetDeveloperResponse response = GreetDeveloperAssembler.toResourceFromEntity(developer);
        return ResponseEntity.ok(response);
    }

    /**
     * Handles a POST request to create a greeting for a developer based on the given request.
     * @param request the request containing the developer's first and last names
     * @return the created greeting response, or a default response if the request is null or blank
     */
    @PostMapping
    public ResponseEntity<GreetDeveloperResponse> createGreeting(
            @RequestBody GreetDeveloperRequest request) {

        Developer developer = DeveloperAssembler.toEntityFromRequest(request);
        GreetDeveloperResponse response = GreetDeveloperAssembler.toResourceFromEntity(developer);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
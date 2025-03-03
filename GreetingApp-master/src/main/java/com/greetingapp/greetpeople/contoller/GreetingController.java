package com.greetingapp.greetpeople.contoller;

import org.springframework.context.annotation.Bean;



import com.greetingapp.greetpeople.model.Greeting;
import com.greetingapp.greetpeople.service.GreetingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping
    public Greeting createGreeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        return greetingService.createGreeting(firstName, lastName);
    }
}



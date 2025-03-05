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
<<<<<<< HEAD:GreetingApp-master/src/main/java/com/greetingapp/greetpeople/contoller/GreetingController.java
=======


<<<<<<<< HEAD:GreetingApp-UC2/src/main/java/com/greetingapp/greetpeople/contoller/GreetingController.java
>>>>>>> UC2:GreetingApp-UC2/src/main/java/com/greetingapp/greetpeople/contoller/GreetingController.java
========
    @GetMapping("/{id}")
    public Optional<Greeting> getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }
    @PutMapping("/{id}")
    public Greeting updateGreeting(@PathVariable Long id, @RequestBody Greeting greeting) {
        return greetingService.updateGreeting(id, greeting);
    }


>>>>>>>> UC3:GreetingApp-UC3/src/main/java/com/greetingapp/greetpeople/contoller/GreetingController.java
}



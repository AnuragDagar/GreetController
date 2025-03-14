package com.greetingapp.greetpeople.model;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private String message;

    public Greeting() {}

    public Greeting(String message) {
        this.message = message;
    }

}

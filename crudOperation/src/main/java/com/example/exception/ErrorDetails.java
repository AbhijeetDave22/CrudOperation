package com.example.exception;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@NoArgsConstructor
@ToString
public class ErrorDetails {
    private String message;
    private String details;

    public ErrorDetails(String message, String details) {
        super();
        this.message = message;
        this.details = details;
    }

    // Getters and setters
}
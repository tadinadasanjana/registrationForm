package com.example.eventregistration;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RegistrationRequest(
        @NotBlank String name,
        @NotBlank @Email String email,
        @NotBlank String eventName
) {
}
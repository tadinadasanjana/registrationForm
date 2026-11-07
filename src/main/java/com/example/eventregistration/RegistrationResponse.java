package com.example.eventregistration;

import java.util.UUID;

public record RegistrationResponse(UUID id, String name, String email, String eventName) {
}
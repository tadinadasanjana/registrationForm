package com.example.eventregistration;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private final ConcurrentMap<UUID, RegistrationResponse> registrations = new ConcurrentHashMap<>();

    public RegistrationResponse register(RegistrationRequest request) {
        RegistrationResponse registration = new RegistrationResponse(
                UUID.randomUUID(),
                request.name().trim(),
                request.email().trim(),
                request.eventName().trim()
        );
        registrations.put(registration.id(), registration);
        return registration;
    }
}
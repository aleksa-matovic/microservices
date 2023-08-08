package com.matovic.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}

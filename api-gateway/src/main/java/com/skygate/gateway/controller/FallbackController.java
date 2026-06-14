package com.skygate.gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/flights")
    public ResponseEntity<Map<String, String>> flightsFallback() {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body(Map.of(
                        "status", "error",
                        "message", "Flight Service is currently unavailable. Please try again shortly.",
                        "code", "SERVICE_UNAVAILABLE"
                ));
    }

    @GetMapping("/bookings")
    public ResponseEntity<Map<String, String>> bookingsFallback() {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body(Map.of(
                        "status", "error",
                        "message", "Booking service is currently unavailable. Please try again shortly",
                        "code", "SERVICE_UNAVAILABLE"
                ));
    }

    @GetMapping("/passengers")
    public ResponseEntity<Map<String, String>> passengersFallback() {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body(Map.of(
                        "status", "error",
                        "message", "Passengers service is currently unavailable. Please try again shortly",
                        "code", "SERVICE_UNAVAILABLE"
                ));
    }

    @GetMapping("/payments")
    public ResponseEntity<Map<String, String>> paymentsFallback() {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body(Map.of(
                        "status", "error",
                        "message", "Payment service is currently unavailable. Please try again shortly",
                        "code", "SERVICE_UNAVAILABLE"
                ));
    }
}

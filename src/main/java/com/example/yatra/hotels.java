package com.example.yatra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotels {

    @GetMapping("/hotels")
    public String welcome() {
        return "Welcome to Hotel Booking";
    }
}

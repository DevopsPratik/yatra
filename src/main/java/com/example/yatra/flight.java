package com.example.yatra;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight{

    @GetMapping("/flight")
    public String welcome() {
        return "Welcome to Flight Booking: Air India";
    }
}

package com.foodapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class FoodController {

    @GetMapping("/api/health")
    public Map<String, String> health() {
        return Map.of(
            "status", "UP",
            "application", "food-app"
        );
    }

    @GetMapping("/api/foods")
    public Map<String, Object> foods() {
        return Map.of(
            "message", "Food API is working",
            "items", new String[]{"Biryani", "Pizza", "Burger"}
        );
    }
}

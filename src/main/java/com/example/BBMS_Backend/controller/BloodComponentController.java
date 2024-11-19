package com.example.BBMS_Backend.controller;

import com.example.BBMS_Backend.Entity.BloodComponent;
import com.example.BBMS_Backend.service.BloodComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/bloodcomponents")
public class BloodComponentController {
    @Autowired
    private BloodComponentService bloodComponentService;

    // Endpoint to fetch all blood component details
    @GetMapping("/all")
    public List<BloodComponent> getAllBloodComponents() {
        return bloodComponentService.getAllBloodComponents();
    }
}

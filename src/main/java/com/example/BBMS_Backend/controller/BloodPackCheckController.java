package com.example.BBMS_Backend.controller;

import com.example.BBMS_Backend.DTO.CheckdonorDTO;
import com.example.BBMS_Backend.Response.CheckdonorresponseDTO;
import com.example.BBMS_Backend.service.Checkdonorservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/check")
public class BloodPackCheckController {

    @Autowired
    private Checkdonorservice checkdonorservice;

    @PostMapping("/checkdonor")
    public ResponseEntity<?> checkDonor(@RequestBody CheckdonorDTO checkdonorDTO) {
        // Call service to perform the check and get donor details
        System.out.println(checkdonorDTO);
        CheckdonorresponseDTO response = checkdonorservice.check(checkdonorDTO);
        System.out.println(checkdonorDTO);
        return ResponseEntity.ok(response); // Return response with HTTP 200 status
    }
}

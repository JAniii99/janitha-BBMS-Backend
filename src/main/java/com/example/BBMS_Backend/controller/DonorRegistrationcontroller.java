package com.example.BBMS_Backend.controller;


import com.example.BBMS_Backend.DTO.DonorRegisterDTO;
import com.example.BBMS_Backend.service.DonorRegisterservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/donor")
public class DonorRegistrationcontroller {

    @Autowired
    private DonorRegisterservice donorRegisterservice;

    @PostMapping("/register")
    public DonorRegisterDTO registerdonor(@RequestBody DonorRegisterDTO donorRegisterDTO){
        return donorRegisterservice.registerdonor(donorRegisterDTO);
    }
}

package com.example.BBMS_Backend.service;

import com.example.BBMS_Backend.DTO.CheckdonorDTO;
import com.example.BBMS_Backend.Response.CheckdonorresponseDTO;

public interface Checkdonorservice {
    // Method to check donor details based on blood pack number
    CheckdonorresponseDTO check(CheckdonorDTO checkdonorDTO);
}

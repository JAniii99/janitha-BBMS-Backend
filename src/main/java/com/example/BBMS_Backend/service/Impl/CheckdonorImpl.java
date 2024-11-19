package com.example.BBMS_Backend.service.Impl;

import com.example.BBMS_Backend.DTO.CheckdonorDTO;
import com.example.BBMS_Backend.Entity.Donor;
import com.example.BBMS_Backend.Repo.CheckdonorRepo;
import com.example.BBMS_Backend.Response.CheckdonorresponseDTO;
import com.example.BBMS_Backend.service.Checkdonorservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckdonorImpl implements Checkdonorservice {

    @Autowired
    private CheckdonorRepo checkdonorRepo;

    @Override
    public CheckdonorresponseDTO check(CheckdonorDTO checkdonorDTO) {
        // Fetch donor by blood pack number
        System.out.println(checkdonorDTO);
        Donor donor = checkdonorRepo.findByBloodpackertnumber(checkdonorDTO.getBloodpackertnumber())
                .orElseThrow(() -> new RuntimeException("Donor not found for blood pack number: " + checkdonorDTO.getBloodpackertnumber()));

        System.out.println(donor);
        if (donor == null) {
            // Handle case when donor is not found
            throw new RuntimeException("Donor not found for blood pack number: " + checkdonorDTO.getBloodpackertnumber());
        }

        // Map donor details to response DTO and return
        return new CheckdonorresponseDTO(donor.getBloodpackertnumber(), donor.getDonorpname());
    }
}

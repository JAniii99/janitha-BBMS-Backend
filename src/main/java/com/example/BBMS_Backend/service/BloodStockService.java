package com.example.BBMS_Backend.service;

import com.example.BBMS_Backend.DTO.BloodstockDTO;
import com.example.BBMS_Backend.Response.Bloodstockresponse;

import java.util.List;

public interface BloodStockService {
    Bloodstockresponse getAllBloodStocks(String bloodgroup, String resus);
    // Fetch all available blood stocks
//    List<BloodstockDTO> getAllBloodStocks();

    // Fetch all available blood stocks
//    List<BloodstockDTO> getAllBloodStocks(BloodstockDTO bloodstockDTO);

    // Add new blood stock (Optional feature)
//    BloodstockDTO addBloodStock(BloodstockDTO bloodStockDTO);
}

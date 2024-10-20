package com.example.BBMS_Backend.controller;

import com.example.BBMS_Backend.DTO.BloodstockDTO;
import com.example.BBMS_Backend.Response.Bloodstockresponse;
import com.example.BBMS_Backend.service.BloodStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/api/v1/stock")
public class BloodStockController {

    @Autowired
    private BloodStockService bloodStockService;
    @PostMapping("/bloodstock")
    public ResponseEntity<?> getAvailableBloodStocks2(@RequestBody BloodstockDTO bloodstockDTO) {

        Bloodstockresponse bloodstockresponse =bloodStockService.getAllBloodStocks(bloodstockDTO.getBloodGroup() ,bloodstockDTO.getBloodResus());
        return ResponseEntity.ok(bloodstockresponse);
    }
}

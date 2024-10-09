package com.example.BBMS_Backend.service.Impl;

import com.example.BBMS_Backend.DTO.BloodstockDTO;
import com.example.BBMS_Backend.Entity.Bloodstock;
import com.example.BBMS_Backend.Repo.BloodStockRepository;
import com.example.BBMS_Backend.Response.Bloodstockresponse;
import com.example.BBMS_Backend.service.BloodStockService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class BloodStockImpl implements BloodStockService {

    @Autowired
    private BloodStockRepository bloodStockRepository;

    @Override
    public Bloodstockresponse getAllBloodStocks(String bloodgroup, String resus) {
        System.out.println(bloodgroup);
        System.out.println(resus);
        int quntity =bloodStockRepository.findBloodStock(bloodgroup,resus);
        System.out.println(quntity);
        return new Bloodstockresponse(bloodgroup,resus,quntity);
    }
}

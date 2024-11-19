package com.example.BBMS_Backend.service.Impl;

import com.example.BBMS_Backend.Entity.BloodComponent;
import com.example.BBMS_Backend.Repo.BloodComponentRepository;
import com.example.BBMS_Backend.service.BloodComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BloodComponentImpl implements BloodComponentService{
    @Autowired
    private BloodComponentRepository bloodComponentRepository;

    public List<BloodComponent> getAllBloodComponents() {
        return bloodComponentRepository.findAll();
    }
}

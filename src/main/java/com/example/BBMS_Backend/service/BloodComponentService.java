package com.example.BBMS_Backend.service;

import com.example.BBMS_Backend.Entity.BloodComponent;
import com.example.BBMS_Backend.service.Impl.BloodComponentImpl;

import java.util.List;

public interface BloodComponentService{
    List<BloodComponent> getAllBloodComponents();
}

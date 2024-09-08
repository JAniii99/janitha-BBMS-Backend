package com.example.BBMS_Backend.service.Impl;

import com.example.BBMS_Backend.DTO.DonorRegisterDTO;
import com.example.BBMS_Backend.Entity.DonorRegisterEntity;
import com.example.BBMS_Backend.Repo.DonorRegisterRepo;
import com.example.BBMS_Backend.service.DonorRegisterservice;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DonorRegisterImpl implements DonorRegisterservice {

    @Autowired
    private DonorRegisterRepo donorRegisterRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public DonorRegisterDTO registerdonor(DonorRegisterDTO donorRegisterDTO) {
        donorRegisterRepo.save(modelMapper.map(donorRegisterDTO, DonorRegisterEntity.class));
        return donorRegisterDTO;
    }
}

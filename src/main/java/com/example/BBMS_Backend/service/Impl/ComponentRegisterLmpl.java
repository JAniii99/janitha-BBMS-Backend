package com.example.BBMS_Backend.service.Impl;

import com.example.BBMS_Backend.DTO.BuffycoatRegisterDTO;
import com.example.BBMS_Backend.DTO.FfpComponenrRegisterDTO;
import com.example.BBMS_Backend.DTO.PlateletComponentRegisterDTO;
import com.example.BBMS_Backend.DTO.RccComponentRegisterDTO;
import com.example.BBMS_Backend.Entity.BloodComponent;
import com.example.BBMS_Backend.Repo.ComponentRegisterRepo;
import com.example.BBMS_Backend.service.ComponentRegisterservice;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ComponentRegisterLmpl implements ComponentRegisterservice {

    @Autowired
    private ComponentRegisterRepo componentRegisterRepo;

    @Autowired
    public ComponentRegisterLmpl(ComponentRegisterRepo componentRegisterRepo) {
        this.componentRegisterRepo = componentRegisterRepo;
    }

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public RccComponentRegisterDTO rccregister(RccComponentRegisterDTO rccComponentRegisterDTO) {
        componentRegisterRepo.save(modelMapper.map(rccComponentRegisterDTO, BloodComponent.class));
        return rccComponentRegisterDTO;
    }

    @Override
    public PlateletComponentRegisterDTO playeletregister(PlateletComponentRegisterDTO plateletComponentRegisterDTO) {
        BloodComponent existingComponent = componentRegisterRepo.findByBloodpackertnumber(plateletComponentRegisterDTO.getBloodpackertnumber());

        if (existingComponent != null) {
            existingComponent.setPlateletdateofmanufacture(plateletComponentRegisterDTO.getPlateletdateofmanufacture());
            existingComponent.setPlateletdateofexpire(plateletComponentRegisterDTO.getPlateletdateofexpire());
            existingComponent.setPlateletvolume(plateletComponentRegisterDTO.getPlateletvolume());

            componentRegisterRepo.save(existingComponent);
        }

        return plateletComponentRegisterDTO;
    }


@Override
    public FfpComponenrRegisterDTO ffpregister(FfpComponenrRegisterDTO ffpComponenrRegisterDTO) {
    BloodComponent existingComponent = componentRegisterRepo.findByBloodpackertnumber(ffpComponenrRegisterDTO.getBloodpackertnumber());

    if (existingComponent != null) {
        existingComponent.setFfpdateofmanufacture(ffpComponenrRegisterDTO.getFfpdateofmanufacture());
        existingComponent.setFfpdateofexpire(ffpComponenrRegisterDTO.getFfpdateofexpire());
        existingComponent.setFfpvolume(ffpComponenrRegisterDTO.getFfpvolume());

        componentRegisterRepo.save(existingComponent);
    }

    return ffpComponenrRegisterDTO;
    }

    @Override
    public BuffycoatRegisterDTO buffycoatregister(BuffycoatRegisterDTO buffycoatRegisterDTO) {
        BloodComponent existingComponent = componentRegisterRepo.findByBloodpackertnumber(buffycoatRegisterDTO.getBloodpackertnumber());

        if (existingComponent != null) {
            existingComponent.setBuffycoatdateofmanufacture(buffycoatRegisterDTO.getBuffycoatdateofmanufacture());
            existingComponent.setBuffycoatdateofexpire(buffycoatRegisterDTO.getBuffycoatdateofexpire());
            existingComponent.setBuffycoatvolume(buffycoatRegisterDTO.getBuffycoatvolume());

            componentRegisterRepo.save(existingComponent);
        }

        return buffycoatRegisterDTO;
    }
}

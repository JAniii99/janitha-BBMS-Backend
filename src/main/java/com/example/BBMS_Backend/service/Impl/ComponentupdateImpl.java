package com.example.BBMS_Backend.service.Impl;

import com.example.BBMS_Backend.DTO.BuffycoatupdateDTO;
import com.example.BBMS_Backend.DTO.FfpComponenrupdateDTO;
import com.example.BBMS_Backend.DTO.PlateletComponentupdateDTO;
import com.example.BBMS_Backend.DTO.RccComponentupdateDTO;
import com.example.BBMS_Backend.Entity.BloodComponent;
import com.example.BBMS_Backend.Repo.ComponentupdateRepo;
import com.example.BBMS_Backend.service.Componentupdateservice;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ComponentupdateImpl implements Componentupdateservice {

    private final ComponentupdateRepo componentupdateRepo;


    public ComponentupdateImpl(ComponentupdateRepo componentupdateRepo) {
        this.componentupdateRepo = componentupdateRepo;
    }


    @Override
    public RccComponentupdateDTO rccupdate(RccComponentupdateDTO rccComponentupdateDTO) {
        BloodComponent existingComponent = componentupdateRepo.findByBloodpackertnumber(rccComponentupdateDTO.getBloodpackertnumber());

        System.out.println(existingComponent);
        if (existingComponent != null) {
            existingComponent.setRccdateofmanufacture(rccComponentupdateDTO.getRccdateofmanufacture());
            existingComponent.setRccdateofexpire(rccComponentupdateDTO.getRccdateofexpire());
            existingComponent.setRccvolume(rccComponentupdateDTO.getRccvolume());

            componentupdateRepo.save(existingComponent);
        }else{
            rccComponentupdateDTO.setError("Component not found");
        }

        return rccComponentupdateDTO;
    }

    @Override
    public PlateletComponentupdateDTO playeletupdate(PlateletComponentupdateDTO plateletComponentupdateDTO) {
        BloodComponent existingComponent = componentupdateRepo.findByBloodpackertnumber(plateletComponentupdateDTO.getBloodpackertnumber());

        if (existingComponent != null) {
            existingComponent.setPlateletdateofmanufacture(plateletComponentupdateDTO.getPlateletdateofmanufacture());
            existingComponent.setPlateletdateofexpire(plateletComponentupdateDTO.getPlateletdateofexpire());
            existingComponent.setPlateletvolume(plateletComponentupdateDTO.getPlateletvolume());

            componentupdateRepo.save(existingComponent);
        }else{
            plateletComponentupdateDTO.setError("Component not found");
        }

        return plateletComponentupdateDTO;
    }

    @Override
    public FfpComponenrupdateDTO ffpupdate(FfpComponenrupdateDTO ffpComponenrupdateDTO) {
        BloodComponent existingComponent = componentupdateRepo.findByBloodpackertnumber(ffpComponenrupdateDTO.getBloodpackertnumber());

        if (existingComponent != null) {
            existingComponent.setFfpdateofmanufacture(ffpComponenrupdateDTO.getFfpdateofmanufacture());
            existingComponent.setFfpdateofexpire(ffpComponenrupdateDTO.getFfpdateofexpire());
            existingComponent.setFfpvolume(ffpComponenrupdateDTO.getFfpvolume());

            componentupdateRepo.save(existingComponent);
        }else{
            ffpComponenrupdateDTO.setError("Component not found");
        }
      return ffpComponenrupdateDTO;
    }

    @Override
    public BuffycoatupdateDTO buffycoatupdate(BuffycoatupdateDTO buffycoatupdateDTO) {
        BloodComponent existingComponent = componentupdateRepo.findByBloodpackertnumber(buffycoatupdateDTO.getBloodpackertnumber());

        if (existingComponent != null) {
            existingComponent.setBuffycoatdateofmanufacture(buffycoatupdateDTO.getBuffycoatdateofmanufacture());
            existingComponent.setBuffycoatdateofexpire(buffycoatupdateDTO.getBuffycoatdateofexpire());
            existingComponent.setBuffycoatvolume(buffycoatupdateDTO.getBuffycoatvolume());

            componentupdateRepo.save(existingComponent);
        }else{
            buffycoatupdateDTO.setError("Component not found");
        }

        return buffycoatupdateDTO;
    }
}

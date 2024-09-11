package com.example.BBMS_Backend.controller;

import com.example.BBMS_Backend.DTO.BuffycoatRegisterDTO;
import com.example.BBMS_Backend.DTO.FfpComponenrRegisterDTO;
import com.example.BBMS_Backend.DTO.PlateletComponentRegisterDTO;
import com.example.BBMS_Backend.DTO.RccComponentRegisterDTO;
import com.example.BBMS_Backend.service.ComponentRegisterservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/component")

public class ComponentRegistercontroller {

    @Autowired
    private ComponentRegisterservice componentRegisterservice;

    @Autowired
    public ComponentRegistercontroller(ComponentRegisterservice componentRegisterservice) {
        this.componentRegisterservice = componentRegisterservice;
    }

    @PostMapping("/rccreg")
    public RccComponentRegisterDTO Rccregister(@RequestBody RccComponentRegisterDTO rccComponentRegisterDTO){
        return componentRegisterservice.rccregister(rccComponentRegisterDTO);
    }

    @PutMapping("/plateletreg")
    public PlateletComponentRegisterDTO PLateletregister(@RequestBody PlateletComponentRegisterDTO plateletComponentRegisterDTO){
        return componentRegisterservice.playeletregister(plateletComponentRegisterDTO);
    }

    @PutMapping("/ffpreg")
    public FfpComponenrRegisterDTO Ffpregister(@RequestBody FfpComponenrRegisterDTO ffpComponenrRegisterDTO){
        return  componentRegisterservice.ffpregister(ffpComponenrRegisterDTO);
    }

    @PutMapping("/buffycoatreg")
    public BuffycoatRegisterDTO buffycoatregister(@RequestBody BuffycoatRegisterDTO buffycoatRegisterDTO){
        return componentRegisterservice.buffycoatregister(buffycoatRegisterDTO);
    }
}

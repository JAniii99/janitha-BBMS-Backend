package com.example.BBMS_Backend.controller;

import com.example.BBMS_Backend.DTO.*;
import com.example.BBMS_Backend.service.Componentupdateservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/api/v1/update")

public class Componentupdateregister {

    @Autowired
    private Componentupdateservice componentupdateservice;

    @Autowired
    public Componentupdateregister(Componentupdateservice componentupdateservice) {
        this.componentupdateservice = componentupdateservice;
    }

    @PutMapping("/rccupd")
    public RccComponentupdateDTO Rccupdate(@RequestBody RccComponentupdateDTO rccComponentupdateDTO){
        System.out.println(rccComponentupdateDTO);
        return componentupdateservice.rccupdate(rccComponentupdateDTO);
    }

    @PutMapping("/plateletupd")
    public PlateletComponentupdateDTO PLateletupdate(@RequestBody PlateletComponentupdateDTO plateletComponentupdateDTO){
        return componentupdateservice.playeletupdate(plateletComponentupdateDTO);
    }

    @PutMapping("/ffprupd")
    public FfpComponenrupdateDTO Ffpupdate(@RequestBody FfpComponenrupdateDTO ffpComponenrupdateDTO){
        return  componentupdateservice.ffpupdate(ffpComponenrupdateDTO);
    }

    @PutMapping("/buffycoatupd")
    public BuffycoatupdateDTO buffycoatupdate(@RequestBody BuffycoatupdateDTO buffycoatupdateDTO){
        return componentupdateservice.buffycoatupdate(buffycoatupdateDTO);
    }
}

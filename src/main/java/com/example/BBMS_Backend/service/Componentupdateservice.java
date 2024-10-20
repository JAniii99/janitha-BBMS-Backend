package com.example.BBMS_Backend.service;

import com.example.BBMS_Backend.DTO.BuffycoatupdateDTO;
import com.example.BBMS_Backend.DTO.FfpComponenrupdateDTO;
import com.example.BBMS_Backend.DTO.PlateletComponentupdateDTO;
import com.example.BBMS_Backend.DTO.RccComponentupdateDTO;

public interface Componentupdateservice {
    RccComponentupdateDTO rccupdate(RccComponentupdateDTO rccComponentupdateDTO);

    PlateletComponentupdateDTO playeletupdate(PlateletComponentupdateDTO plateletComponentupdateDTO);

    FfpComponenrupdateDTO ffpupdate(FfpComponenrupdateDTO ffpComponenrupdateDTO);

    BuffycoatupdateDTO buffycoatupdate(BuffycoatupdateDTO buffycoatupdateDTO);
}

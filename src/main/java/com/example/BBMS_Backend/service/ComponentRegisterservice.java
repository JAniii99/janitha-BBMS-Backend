package com.example.BBMS_Backend.service;

import com.example.BBMS_Backend.DTO.BuffycoatRegisterDTO;
import com.example.BBMS_Backend.DTO.FfpComponenrRegisterDTO;
import com.example.BBMS_Backend.DTO.PlateletComponentRegisterDTO;
import com.example.BBMS_Backend.DTO.RccComponentRegisterDTO;

public interface ComponentRegisterservice {
    RccComponentRegisterDTO rccregister(RccComponentRegisterDTO rccComponentRegisterDTO);

    PlateletComponentRegisterDTO playeletregister(PlateletComponentRegisterDTO plateletComponentRegisterDTO);

    FfpComponenrRegisterDTO ffpregister(FfpComponenrRegisterDTO ffpComponenrRegisterDTO);

    BuffycoatRegisterDTO buffycoatregister(BuffycoatRegisterDTO buffycoatRegisterDTO);
}

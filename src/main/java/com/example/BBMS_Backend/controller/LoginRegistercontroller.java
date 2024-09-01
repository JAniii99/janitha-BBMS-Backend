package com.example.BBMS_Backend.controller;
import com.example.BBMS_Backend.DTO.LoginDTO;
import com.example.BBMS_Backend.Response.LoginResponse;
import com.example.BBMS_Backend.config.Securityconfig;
import com.example.BBMS_Backend.service.LoginRegisterservice;
import com.example.BBMS_Backend.DTO.LoginRegisterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/register")
public class LoginRegistercontroller {

    @Autowired
    private LoginRegisterservice loginRegisterservice;

    @Autowired
    private Securityconfig securityconfig;

    @PostMapping("/save")
    public LoginRegisterDTO saveregister(@RequestBody LoginRegisterDTO loginRegisterDTO){
        return loginRegisterservice.registeremployee(loginRegisterDTO);
    }


    @PostMapping("/login")
    public ResponseEntity<?> loginemployee(@RequestBody LoginDTO loginDTO){
         LoginResponse loginResponse = loginRegisterservice.login(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}

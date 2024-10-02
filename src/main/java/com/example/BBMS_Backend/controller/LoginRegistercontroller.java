package com.example.BBMS_Backend.controller;
import com.example.BBMS_Backend.DTO.ChangePasswordDTO;
import com.example.BBMS_Backend.DTO.LoginDTO;
import com.example.BBMS_Backend.Response.LoginResponse;
import com.example.BBMS_Backend.config.Securityconfig;
import com.example.BBMS_Backend.service.LoginRegisterservice;
import com.example.BBMS_Backend.DTO.LoginRegisterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @PostMapping("/change-password")
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<?> changePassword(@RequestBody ChangePasswordDTO request) {
        loginRegisterservice.changePassword(request.getUsername(), request.getOldPassword(), request.getNewPassword());
        return ResponseEntity.ok("Password changed successfully");
    }
}

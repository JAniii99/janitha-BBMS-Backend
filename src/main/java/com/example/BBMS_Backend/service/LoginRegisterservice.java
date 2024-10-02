package com.example.BBMS_Backend.service;
//import com.example.BBMS_Backend.DTO.LoginDTO;
import com.example.BBMS_Backend.DTO.ChangePasswordDTO;
import com.example.BBMS_Backend.DTO.LoginDTO;
import com.example.BBMS_Backend.DTO.LoginRegisterDTO;
import com.example.BBMS_Backend.Response.LoginResponse;
//import com.example.BBMS_Backend.Response.LoginResponse;


public interface LoginRegisterservice {
     LoginRegisterDTO registeremployee(LoginRegisterDTO loginRegisterDTO);
     LoginResponse login(LoginDTO loginDTO);

     void changePassword(String username, String oldPassword, String newPassword);
}

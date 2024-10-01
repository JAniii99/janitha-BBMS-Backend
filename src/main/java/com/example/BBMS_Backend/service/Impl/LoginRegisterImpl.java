package com.example.BBMS_Backend.service.Impl;
import com.example.BBMS_Backend.DTO.LoginDTO;
import com.example.BBMS_Backend.Entity.User;
import com.example.BBMS_Backend.Response.LoginResponse;
import com.example.BBMS_Backend.service.LoginRegisterservice;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import com.example.BBMS_Backend.DTO.LoginRegisterDTO;
import com.example.BBMS_Backend.Repo.LoginRegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LoginRegisterImpl implements LoginRegisterservice {


    @Autowired
    private LoginRegisterRepo loginRegisterRepo;

    @Autowired
    private  ModelMapper modelMaper;

    @Autowired
    private PasswordEncoder passwordEncoder;



    @Override
    public LoginRegisterDTO registeremployee(LoginRegisterDTO registerDTO) {
        registerDTO.setPassword(passwordEncoder.encode(registerDTO.getPassword()));
        loginRegisterRepo.save(modelMaper.map(registerDTO, User.class));
        return registerDTO;
    }

    @Override
    public LoginResponse login(LoginDTO loginDTO) {
        User employee1 = loginRegisterRepo.findByUname(loginDTO.getUname());
        if (employee1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = employee1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            System.out.println(loginDTO);
            if (isPwdRight) {
                    return new LoginResponse("Login Success", true);
                } else {
                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Uname not exits", false);
        }
    }
}

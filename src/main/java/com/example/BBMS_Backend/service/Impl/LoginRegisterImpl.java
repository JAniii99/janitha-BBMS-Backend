package com.example.BBMS_Backend.service.Impl;
import com.example.BBMS_Backend.DTO.LoginDTO;
import com.example.BBMS_Backend.Entity.User;
import com.example.BBMS_Backend.Response.LoginResponse;
import com.example.BBMS_Backend.config.JwtUtil;
import com.example.BBMS_Backend.service.LoginRegisterservice;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import com.example.BBMS_Backend.DTO.LoginRegisterDTO;
import com.example.BBMS_Backend.Repo.LoginRegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
    @Autowired
    private JwtUtil jwtUtil;


    @Override
    public LoginRegisterDTO registeremployee(LoginRegisterDTO registerDTO) {
//        if(!isAdmin()){
//
//            throw new AccessDeniedException("Only admin users can register new employees");
//        }
        registerDTO.setPassword(passwordEncoder.encode(registerDTO.getPassword()));
        registerDTO.setRole("ROLE_EMPLOYEE");
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
            if (isPwdRight) {
                String token = jwtUtil.generateToken(employee1);
                return new LoginResponse("Login Success", true , token , employee1.getRole());
            } else {
                return new LoginResponse("password Not Match", false,null,null);
            }
        }else {
            return new LoginResponse("Uname not exits", false,null,null);
        }
    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {
        User user = loginRegisterRepo.findByUname(username);
        if (user == null || !passwordEncoder.matches(oldPassword, user.getPassword())) {
            throw new BadCredentialsException("Invalid username or Password");
        }
        user.setPassword(passwordEncoder.encode(newPassword));
        loginRegisterRepo.save(user);
    }


    private boolean isAdmin() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication != null && authentication.getAuthorities().stream()
                .anyMatch(a -> a.getAuthority().equals("ROLE_ADMIN"));
    }


}

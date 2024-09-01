package com.example.BBMS_Backend.DTO;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data

public class LoginRegisterDTO {
    private  int eid;
    private String fname;
    private  String uname;
    private  String  password;


}

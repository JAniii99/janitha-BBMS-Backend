package com.example.BBMS_Backend.Response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class LoginResponse {

     String message;
     Boolean status;
     String token;
     String role;
}

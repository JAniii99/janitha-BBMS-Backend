package com.example.BBMS_Backend.DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter

public class ChangePasswordDTO {
    private String username;
    private String oldPassword;
    private String newPassword;
}

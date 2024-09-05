package com.example.BBMS_Backend.DTO;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class DonorRegisterDTO {
    private String DonorF_name;
    private String DonorP_name;
    private String Donor_NIC;
    private String Donor_Age;
    private int Previous_transfusion_time;
    private String Address;
    private String Telephone;
    private LocalDateTime Date;
}

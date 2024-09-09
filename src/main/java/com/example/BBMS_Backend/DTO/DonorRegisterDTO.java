package com.example.BBMS_Backend.DTO;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class DonorRegisterDTO {
    private int donorid;
    private String bloodpackertnumber;
    private String donorfname;
    private String donorpname;
    private String donornic;
    private String donorage;
    private int previoustransfusiontime;
    private int donorweight;
    private String donorbloodgroup;
    private String address;
    private String telephone;
    private LocalDateTime date;
}

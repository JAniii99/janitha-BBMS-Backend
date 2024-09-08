package com.example.BBMS_Backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
@Data
@Table(name = "DonorDetails")
public class DonorRegisterEntity {
    @Id
    private int donorid;
    private String bloodpackertnumber;
    private String donorfname;
    private String donorpname;
    private String donornic;
    private String donorage;
    private int previoustransfusiontime;
    private int donorweight;
    private String address;
    private String telephone;
    private LocalDateTime date;
}

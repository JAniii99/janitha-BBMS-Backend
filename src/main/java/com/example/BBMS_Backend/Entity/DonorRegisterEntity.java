package com.example.BBMS_Backend.Entity;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "donor_seq")
    @SequenceGenerator(name = "donor_seq", sequenceName = "donor_sequence", allocationSize = 1)
    private int donorid;


    private String bloodpackertnumber;
    private String donorfname;
    private String donorpname;
    private String donornic;
    private String donorage;
    private int previoustransfusiontime;
    private int donorweight;
    private String address;
    private String donorbloodgroup;
    private String telephone;
    private LocalDateTime date;
}

package com.example.BBMS_Backend.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "DonorDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "donor_seq")
    @SequenceGenerator(name = "donor_seq", sequenceName = "donor_sequence", allocationSize = 1)
    private String donorid;

    private String bloodpackertnumber;

    private String donorfname;
    private String donorpname;
    private String donornic;
    private String donorage;
    private Integer previoustransfusiontime;
    private Integer donorweight;
    private String address;
    private String donorbloodgroup;
    private String telephone;
    private LocalDateTime date;

    @OneToOne(mappedBy = "donor") // One User manages multiple BloodComponents
    private BloodComponent bloodComponent;
}


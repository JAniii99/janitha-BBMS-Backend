package com.example.BBMS_Backend.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "donor_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "bloodComponent")
public class Donor {
    @Id
    private String bloodpackertnumber;
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "donor_seq")
   // @SequenceGenerator(name = "donor_seq", sequenceName = "donor_sequence", allocationSize = 1)
    //private String donorid;



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

    @OneToOne(mappedBy = "donor",fetch = FetchType.LAZY) // One User manages multiple BloodComponents
    @JsonIgnore
    private BloodComponent bloodComponent;
}


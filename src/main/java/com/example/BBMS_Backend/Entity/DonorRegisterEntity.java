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
    private String Donor_id;
    private String DonorF_name;
    private String DonorP_name;
    private String Donor_NIC;
    private String Donor_Age;
    private int Previous_transfusion_time;
    private String Address;
    private String Telephone;
    private LocalDateTime Date;
}

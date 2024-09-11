package com.example.BBMS_Backend.DTO;

import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter

public class PlateletComponentRegisterDTO {

    @Id
    private String bloodpackertnumber;
    private Date plateletdateofmanufacture;
    private Date plateletdateofexpire;
    private int plateletvolume;
}

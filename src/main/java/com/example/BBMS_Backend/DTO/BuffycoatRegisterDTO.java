package com.example.BBMS_Backend.DTO;

import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class BuffycoatRegisterDTO {

    @Id
    private String bloodpackertnumber;
    private Date buffycoatdateofmanufacture;
    private Date buffycoatdateofexpire;
    private int buffycoatvolume;
}

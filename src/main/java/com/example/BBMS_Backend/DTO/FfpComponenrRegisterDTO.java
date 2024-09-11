package com.example.BBMS_Backend.DTO;

import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data

public class FfpComponenrRegisterDTO {

    @Id
    private String bloodpackertnumber;
    private Date ffpdateofmanufacture;
    private Date ffpdateofexpire;
    private int ffpvolume;
}

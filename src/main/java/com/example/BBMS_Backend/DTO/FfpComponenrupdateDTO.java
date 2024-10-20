package com.example.BBMS_Backend.DTO;

import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class FfpComponenrupdateDTO {
    @Id
    private String bloodpackertnumber;
    private Date ffpdateofmanufacture;
    private Date ffpdateofexpire;
    private int ffpvolume;
    private String error;
}

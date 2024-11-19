package com.example.BBMS_Backend.DTO;

import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@ToString
public class RccComponentupdateDTO {

    @Id
    private String bloodpackertnumber;
    private int rccvolume;
    private Date rccdateofmanufacture;
    private Date rccdateofexpire;
    private String error;

}

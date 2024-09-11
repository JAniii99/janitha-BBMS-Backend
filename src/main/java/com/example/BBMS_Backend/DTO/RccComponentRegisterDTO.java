package com.example.BBMS_Backend.DTO;

import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data

public class RccComponentRegisterDTO {

    @Id
    private String bloodpackertnumber;
    private String bloodGroup;
    private String bloodResus;
    private String donorpname;  //autofill?
    private String packertserialnumber;
    private String packerttype;
    private int rccvolume;
    private int eid; //employeeid
    private String fname; //employeename
    private Date rccdateofmanufacture;
    private Date rccdateofexpire;


}

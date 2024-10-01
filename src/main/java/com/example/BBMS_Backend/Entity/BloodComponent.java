package com.example.BBMS_Backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;
import jdk.jfr.Enabled;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table(name = "Bloodcomponentdetails2")
public class BloodComponent {
    @Id
    private String bloodpackertnumber;
    private String bloodGroup;
    private String bloodResus;
    private String donorpname;
    private String packertserialnumber;
    private String packerttype;
    private int eid;
    private String fname;

    private Date rccdateofmanufacture;
    private Date rccdateofexpire;
    private int rccvolume;

    private Date plateletdateofmanufacture;
    private Date plateletdateofexpire;
    private int plateletvolume;

    private Date ffpdateofmanufacture;
    private Date ffpdateofexpire;
    private int ffpvolume;

    private Date buffycoatdateofmanufacture;
    private Date buffycoatdateofexpire;
    private int buffycoatvolume;

}

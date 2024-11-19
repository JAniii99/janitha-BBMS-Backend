package com.example.BBMS_Backend.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table(name = "Bloodcomponentdetails2")
@ToString(exclude = {"donor","employee"})
public class BloodComponent {
    @Id
    private String bloodpackertnumber;

    private String bloodGroup;
    private String bloodResus;
    private String donorpname; // Related to Donor's name
    private String packertserialnumber;
    private String packerttype;
    private Integer eid;
    private String fname;

    @ManyToOne (fetch = FetchType.LAZY)// Many BloodComponents can be managed by one Employee (User)
    @JoinColumn(name = "eid", referencedColumnName = "eid", insertable = false, updatable = false , nullable = false)
    @JsonIgnore
    private User employee;

    @OneToOne // One Donor provides one BloodComponent (assuming one-to-one mapping)
    @JoinColumn(name = "bloodpackertnumber", referencedColumnName = "bloodpackertnumber", insertable = false, updatable = false)
    private Donor donor;




    private Date rccdateofmanufacture;
    private Date rccdateofexpire;

    private Integer rccvolume;

    private Date plateletdateofmanufacture;
    private Date plateletdateofexpire;
    private Integer plateletvolume;

    private Date ffpdateofmanufacture;
    private Date ffpdateofexpire;
    private Integer ffpvolume;

    private Date buffycoatdateofmanufacture;
    private Date buffycoatdateofexpire;
    private Integer buffycoatvolume;
}

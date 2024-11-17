package com.example.BBMS_Backend.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Registeremployee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    @Id
    private Integer eid;

    private String fname;
    private String uname;
    private String password;
    private String role;

    @OneToMany(mappedBy = "employee") // One User manages multiple BloodComponents
    private List<BloodComponent> bloodComponents;
}

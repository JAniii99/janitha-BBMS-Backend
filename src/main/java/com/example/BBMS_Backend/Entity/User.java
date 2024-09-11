package com.example.BBMS_Backend.Entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Registeremployee")

public class User {
    @Id
    private  int eid;
    private String fname;
    private  String uname;
    private  String  password;

}

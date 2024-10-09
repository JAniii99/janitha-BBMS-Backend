package com.example.BBMS_Backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Getter
@Setter
@Table(name = "bloodstock")
public class Bloodstock {
    @Id
    private String bloodGroup;
    private String bloodResus;
    private int count;

}

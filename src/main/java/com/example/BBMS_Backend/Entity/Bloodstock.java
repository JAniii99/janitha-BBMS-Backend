package com.example.BBMS_Backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "bloodstock")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bloodstock {
    @Id
    private String bloodGroup;
    private String bloodResus;
    private Integer count;

    // No direct relationships inferred, as it is an aggregate entity for stock details.
}

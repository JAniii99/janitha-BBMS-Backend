package com.example.BBMS_Backend.Response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data

public class Bloodstockresponse {
    private String bloodGroup;
    private String bloodResus;
    private int count;
}

package com.example.hng;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class helloResponse {
    private String clientIp;
    private String location;
    private String greeting;
}

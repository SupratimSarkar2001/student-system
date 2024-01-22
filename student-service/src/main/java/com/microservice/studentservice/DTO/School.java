package com.microservice.studentservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class School {
    private Long schoolId;
    private String schoolName;
    private String schoolLocation;
}

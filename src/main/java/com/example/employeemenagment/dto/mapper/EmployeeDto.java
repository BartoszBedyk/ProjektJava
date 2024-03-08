package com.example.employeemenagment.dto.mapper;



import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto {
    private Long id;
    private String name;
    private String gender;
    private Date dateOfBirth;
    private String address;

}

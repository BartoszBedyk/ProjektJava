package com.example.employeemenagment.dto.mapper;

import com.example.employeemenagment.entity.EmployeeEntity;

public class EmployeeMapper {

     public static EmployeeDto toEmployeeDto(EmployeeEntity employeeEntity){
         EmployeeDto employeeDto = new EmployeeDto();



         return EmployeeDto.builder()
                 .id(employeeEntity.getId())
                 .name(employeeEntity.getName())
                 .address(employeeEntity.getAdress())
                 .dateOfBirth(employeeEntity.getDateOfBirth())
                 .gender(employeeEntity.getGender())
                 .build();
     }

     public static EmployeeEntity toEmployeeEntity(EmployeeDto employeeDto){
         EmployeeEntity employeeEntity = new EmployeeEntity();

         return EmployeeEntity.builder()
                 .id(employeeDto.getId())
                 .name(employeeDto.getName())
                 .adress(employeeDto.getAddress())
                 .dateOfBirth(employeeDto.getDateOfBirth())
                 .gender(employeeDto.getGender())
                 .build();
     }

}

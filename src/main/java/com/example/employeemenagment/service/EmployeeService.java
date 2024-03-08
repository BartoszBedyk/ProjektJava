package com.example.employeemenagment.service;

import com.example.employeemenagment.dto.mapper.EmployeeDto;
import com.example.employeemenagment.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployee();
    Optional<EmployeeEntity> findById(Long id);
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
     EmployeeEntity saveEmployee(EmployeeDto employeeDto);
    EmployeeDto updateEmployee(EmployeeDto employeeDto, Long id);


    //EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);

    void deleteEmployee(Long id);


}

package com.example.employeemenagment.service.impl;

import com.example.employeemenagment.dto.mapper.EmployeeDto;
import com.example.employeemenagment.dto.mapper.EmployeeMapper;
import com.example.employeemenagment.entity.EmployeeEntity;
import com.example.employeemenagment.repository.EmployeeRepository;
import com.example.employeemenagment.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto employeeDto, Long id) {
        Optional<EmployeeEntity> existingEntity = findById(id);
        if(existingEntity.isEmpty()){
            return null;
        }
        EmployeeEntity employeeEntity = EmployeeMapper.toEmployeeEntity(employeeDto);
        employeeEntity.setId(id);
        employeeRepository.save(employeeEntity);
        EmployeeDto tmpEntityDpo = EmployeeMapper.toEmployeeDto(employeeEntity);
        return tmpEntityDpo;
    }

//    @Override
//    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
//
//        return employeeRepository.save(employeeEntity);
//    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}

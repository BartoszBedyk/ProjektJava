package com.example.employeemenagment.controller;

import com.example.employeemenagment.dto.mapper.EmployeeDto;
import com.example.employeemenagment.dto.mapper.EmployeeMapper;
import com.example.employeemenagment.entity.EmployeeEntity;
import com.example.employeemenagment.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeEntity> findAllEmployee(){
        return  employeeService.findAllEmployee();
    }

    @GetMapping("/{id}")
    public Optional<EmployeeEntity> findEmployeeById(@PathVariable("id") Long id){
        return employeeService.findById(id);
    }

    @PostMapping
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.saveEmployee(employeeEntity);
    }



     @PostMapping("/map")
    public EmployeeEntity saveEmployee(@RequestBody EmployeeDto employeeDto){
        return employeeService.saveEmployee(EmployeeMapper.toEmployeeEntity(employeeDto));
    }




    @PutMapping("/map/{id}")
    public EmployeeDto updateEmployee(@RequestBody EmployeeDto employeeDto, @PathVariable("id") Long id){
        //employeeService.findById(employeeEntity.getId())


        return employeeService.updateEmployee(employeeDto,  id);

    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
    }
}

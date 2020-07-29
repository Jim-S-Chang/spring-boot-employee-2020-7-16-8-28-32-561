package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path = "/employees")
    public boolean addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping(path = "/employees")
    public List<Employee> getEmployees(@RequestParam(required = false, defaultValue = "-1") int page,
                             @RequestParam(required = false, defaultValue = "-1") int pageSize,
                             @RequestParam(required = false, defaultValue = "null") String gender) {
        if(page!=-1){
            return employeeService.getEmployeesByPage(page,pageSize);
        }else if(!gender.equals("null")){
            return employeeService.getEmployeesByGender(gender);
        }else {
            return employeeService.getAllEmployees();
        }
    }

    @GetMapping(path = "/employees/{id}")
    public Employee getSpecificEmployeeById(@PathVariable int id){
        return employeeService.getSpecificEmployeeById(id);
    }

    @PutMapping(path = "/employees/{id}")
    public boolean updateEmployeeById(@RequestBody Employee employee,@PathVariable int id){
        return employeeService.updateEmployeeById(employee,id);
    }

    @DeleteMapping(path = "/employees/{id}")
    public boolean deleteEmployeeById(@PathVariable int id){
        return employeeService.deleteEmployeeById(id);
    }
}

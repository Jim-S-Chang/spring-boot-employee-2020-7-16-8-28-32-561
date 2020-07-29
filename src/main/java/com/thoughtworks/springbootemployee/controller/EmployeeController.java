package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.dto.EmployeeDTO;
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
    public boolean addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.addEmployee(employeeDTO);
    }

    @GetMapping(path = "/employees")
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "/employees", params = "gender")
    public List<Employee> getEmployees(@RequestParam String gender) {
        return employeeService.getEmployeesByGender(gender);
    }

    @GetMapping(path = "/employees", params = "page, pageSize")
    public List<Employee> getEmployees(@RequestParam int page, int pageSize) {
        return employeeService.getEmployeesByPage(page, pageSize);
    }

    @GetMapping(path = "/employees/{id}")
    public Employee getSpecificEmployeeById(@PathVariable int id) {
        return employeeService.getSpecificEmployeeById(id);
    }

    @PutMapping(path = "/employees/{id}")
    public boolean updateEmployeeById(@RequestBody EmployeeDTO employeeDTO, @PathVariable int id) {
        return employeeService.updateEmployeeById(employeeDTO, id);
    }

    @DeleteMapping(path = "/employees/{id}")
    public boolean deleteEmployeeById(@PathVariable int id) {
        return employeeService.deleteEmployeeById(id);
    }
}

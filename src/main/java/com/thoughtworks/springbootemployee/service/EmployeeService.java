package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.dto.EmployeeDTO;
import com.thoughtworks.springbootemployee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    boolean addEmployee(EmployeeDTO employeeDTO);

    List<Employee> getEmployeesByPage(int page, int pageSize);

    List<Employee> getEmployeesByGender(String gender);

    Employee getSpecificEmployeeById(int id);

    boolean updateEmployeeById(EmployeeDTO employeeDTO, int id);

    boolean deleteEmployeeById(int id);

    List<Employee> getAllEmployees();
}

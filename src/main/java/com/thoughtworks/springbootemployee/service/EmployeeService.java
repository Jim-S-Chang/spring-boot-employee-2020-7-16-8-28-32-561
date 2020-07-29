package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.dto.EmployeeDTO;
import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    boolean addEmployee(EmployeeDTO employeeDTO);

    List<Employee> getEmployeesByGender(String gender);

    Employee getSpecificEmployeeById(int id);

    boolean updateEmployeeById(EmployeeDTO employeeDTO, int id);

    boolean deleteEmployeeById(int id);

    Page getAllEmployees(Pageable pageable);
}

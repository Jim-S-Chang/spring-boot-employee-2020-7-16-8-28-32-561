package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    boolean addEmployee(Employee employee);

    List<Employee> getEmployeesByPage(int page, int pageSize);

    List<Employee> getEmployeesByGender(String gender);

    Employee getSpecificEmployeeById(int id);

    boolean updateEmployeeById(Employee employee, int id);

    boolean deleteEmployeeById(int id);

    List<Employee> getAllEmployees();
}

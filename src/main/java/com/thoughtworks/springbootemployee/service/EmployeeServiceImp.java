package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public List<Employee> getEmployeesByPage(int page, int pageSize) {
        return null;
    }

    @Override
    public List<Employee> getEmployeesByGender(String gender) {
        return employeeRepository.findByGender(gender);
    }

    @Override
    public Employee getSpecificEmployeeById(int id) {
        return null;
    }

    @Override
    public boolean updateEmployeeById(Employee employee, int id) {
        return false;
    }

    @Override
    public boolean deleteEmployeeById(int id) {
        return false;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}

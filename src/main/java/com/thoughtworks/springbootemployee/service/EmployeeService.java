package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
    List<Employee> employees;

    public EmployeeService() {
        employees=new LinkedList<>();
    }

    public boolean addEmployee(Employee employee) {
        employees.add(employee);
        return employees.contains(employee);
    }

    public List getAllEmployees() {
        return employees;
    }

    public List getEmployeesByGender(String gender) {
        return employees.stream().filter(e -> e.getGender().equals(gender)).collect(Collectors.toList());
    }

    public List getEmployeesByPage(int page, int pageSize) {
        return employees.subList((page - 1) * pageSize, page * pageSize);
    }

    public Employee getSpecificEmployeeById(int id) {
        return employees.stream().filter(e->e.getId()==id).collect(Collectors.toList()).get(0);
    }

    public boolean updateEmployeeById(Employee employee,int id) {
        employees.removeIf(e->e.getId()==id);
        employees.add(employee);
        return employees.contains(employee);
    }

    public boolean deleteEmployeeById(int id) {
        return employees.removeIf(e->e.getId()==id);
    }
}

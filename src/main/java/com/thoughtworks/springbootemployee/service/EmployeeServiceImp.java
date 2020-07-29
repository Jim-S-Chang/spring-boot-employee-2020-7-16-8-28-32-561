package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.dto.EmployeeDTO;
import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.repository.CompanyRepository;
import com.thoughtworks.springbootemployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public boolean addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(employeeDTO.getAge(),employeeDTO.getGender(),employeeDTO.getName());
        Company company = companyRepository.findById(employeeDTO.getCompanyId());
        employee.setCompany(company);
        employeeRepository.save(employee);
        return true;
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
        return employeeRepository.findById(id);
    }

    @Override
    public boolean updateEmployeeById(EmployeeDTO employeeDTO, int id) {
        Employee employee = employeeRepository.findById(id);
        Company company = companyRepository.findById(employeeDTO.getCompanyId());
        employee.setCompany(company);
        employee.setAge(employeeDTO.getAge());
        employee.setGender(employeeDTO.getGender());
        employee.setName(employeeDTO.getName());
        employeeRepository.save(employee);
        return true;
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

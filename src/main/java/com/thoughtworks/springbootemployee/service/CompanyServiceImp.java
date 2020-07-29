package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyServiceImp implements CompanyService{
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company getCompanyById(int id) {
        return null;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public List<Company> getCompaniesInSpecificPage(int page, int pageSize) {
        return null;
    }

    @Override
    public boolean updateOneCompany(int id, Company company) {
        return false;
    }

    @Override
    public boolean deleteEmployeesInSpecificCompany(int id) {
        return false;
    }

    @Override
    public List<Employee> getAllEmployeesInSpecificCompany(int id) {
        return null;
    }

    @Override
    public boolean addCompany(Company company) {
        return false;
    }
}

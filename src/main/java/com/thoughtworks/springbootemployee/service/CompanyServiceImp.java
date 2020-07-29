package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImp implements CompanyService {

    private CompanyRepository companyRepository;

    public CompanyServiceImp(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company getCompanyById(int id) {
        return companyRepository.findById(id);
    }

    @Override
    public Page getAllCompanies(@PageableDefault Pageable pageable) {
        return companyRepository.findAll(pageable);
    }

    @Override
    public boolean updateOneCompany(int id, Company company) {
        company.setId(id);
        companyRepository.save(company);
        return true;
    }

    @Override
    public boolean deleteEmployeesInSpecificCompany(int id) {
        companyRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Employee> getAllEmployeesInSpecificCompany(int id) {
        return companyRepository.findById(id).getEmployees();
    }

    @Override
    public boolean addCompany(Company company) {
        companyRepository.save(company);
        return true;
    }
}

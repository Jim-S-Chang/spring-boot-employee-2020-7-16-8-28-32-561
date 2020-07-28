package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Company;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CompanyService {
    List<Company> companies;

    public CompanyService() {
        companies = new LinkedList<>();
    }

    public boolean addCompany(Company company) {
        companies.add(company);
        return companies.contains(company);
    }

    public Company getCompanyById(int id) {
        return companies.stream()
                .filter(e -> e.getId() == id)
                .collect(Collectors.toList())
                .get(0);
    }

    public List getAllCompanies() {
        return companies;
    }


    public List getCompaniesInSpecificPage(int page, int pageSize) {
        return companies.subList((page - 1) * pageSize, page * pageSize);
    }

    public boolean updateOneCompany(int id, Company company) {
        if (companies.removeIf(e->e.getId()==id)){
            companies.add(company);
        }
        return companies.contains(company);
    }

    public boolean deleteEmployeesInSpecificCompany(int id) {
        getCompanyById(id).getEmployees().clear();
        return getCompanyById(id).getEmployees().isEmpty();
    }

    public List getAllEmployeesInSpecificCompany(int id) {
        return getCompanyById(id).getEmployees();
    }
}

package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Company;

import java.util.LinkedList;
import java.util.List;

public class CompanyService {
    List<Company> companies;

    public CompanyService() {
        companies = new LinkedList<>();
    }

    public boolean addCompany(Company company) {
        companies.add(company);
        return companies.contains(company);
    }
}

package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {


    Company getCompanyById(int id);

    Page getAllCompanies(@PageableDefault Pageable pageable);

    boolean updateOneCompany(int id, Company company);

    boolean deleteEmployeesInSpecificCompany(int id);

    List<Employee> getAllEmployeesInSpecificCompany(int id);

    boolean addCompany(Company company);
}

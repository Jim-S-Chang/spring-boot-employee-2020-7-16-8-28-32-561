package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping(path = "/companies/{id}")
    public Company getSpecificCompany(@PathVariable int id) {

        return companyService.getCompanyById(id);
    }

    @PostMapping(path = "/companies")
    public boolean addCompany(@RequestBody Company company) {
        return companyService.addCompany(company);
    }

    @GetMapping(path = "/companies")
    public Page getCompaniesByPage(@PageableDefault() Pageable pageable,@RequestParam(defaultValue = "false") boolean unpaged) {
        if (unpaged){
            return companyService.getAllCompanies(Pageable.unpaged());
        }
        return companyService.getAllCompanies(pageable);
    }

    @PutMapping(path = "/companies/{id}")
    public boolean updateOneCompany(@PathVariable int id, @RequestBody() Company company){
        return companyService.updateOneCompany(id, company);
    }

    @DeleteMapping(path = "/companies/{id}")
    public boolean deleteEmployeesInSpecificCompany(@PathVariable int id) {
        return companyService.deleteEmployeesInSpecificCompany(id);
    }

    @GetMapping(path = "/companies/{id}/employees")
    public List<Employee> getAllEmployeesInSpecificCompany(@PathVariable int id) {
        return companyService.getAllEmployeesInSpecificCompany(id);
    }
}

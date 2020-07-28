package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.service.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {
    CompanyService companyService = new CompanyService();
    @GetMapping(path = "/companies/{id}")
    public Company getSpecificCompany(@PathVariable int id) {

        return companyService.getCompanyById(id);
    }

    @PostMapping(path = "/companies")
    public boolean addCompany(@RequestBody Company company) {
        return companyService.addCompany(company);
    }

//    @GetMapping(path = "/companies")
//    public List getAllCompanies() {
//        return companyService.getAllCompanies();
//    }

    @GetMapping(path = "/companies")
    public List<Company> getCompaniesByPage(
            @RequestParam(required = false, defaultValue = "-1") int page,
            @RequestParam(required = false, defaultValue = "5") int pageSize) {
        if (page == -1){
            return companyService.getAllCompanies();
        }
        return companyService.getCompaniesInSpecificPage(page, pageSize);
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
    public List getAllEmployeesInSpecificCompany(@PathVariable int id) {
        return companyService.getAllEmployeesInSpecificCompany(id);
    }
}

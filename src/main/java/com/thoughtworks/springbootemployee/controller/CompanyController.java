package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.service.CompanyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    CompanyService companyService = new CompanyService();
    @GetMapping(path = "/{userName}")
    public String getAll(@PathVariable String userName) {

        return "Hello:" + userName;
    }

    @PostMapping(path = "")
    public boolean addCompany(@RequestBody Company company) {
        return companyService.addCompany(company);
    }
}

package com.thoughtworks.springbootemployee;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.repository.CompanyRepository;
import com.thoughtworks.springbootemployee.service.CompanyService;
import com.thoughtworks.springbootemployee.service.CompanyServiceImp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class CompanyServiceTest {
    @InjectMocks
    private CompanyServiceImp companyServiceImp;

    @Mock
    private CompanyRepository companyRepository;

    @Test
    public void should_return_2_companies_when_get_companies_given_2_companies(){
        //given
        List<Company> givenCompanies = new ArrayList<>();
        givenCompanies.add(new Company());
        givenCompanies.add(new Company());

        Mockito.when(companyRepository.findAll()).thenReturn(givenCompanies);

        //when
        List<Company> result = companyServiceImp.getAllCompanies();

        //then
        Assertions.assertEquals(2,result.size());
    }
}

package com.thoughtworks.springbootemployee;

import com.thoughtworks.springbootemployee.repository.CompanyRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CompanyServiceTest {
    @InjectMocks
    private CompanyServiceImp companyServiceImp;

    @Mock
    private CompanyRepository companyRepository;

}

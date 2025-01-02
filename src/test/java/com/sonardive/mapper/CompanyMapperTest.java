package com.sonardive.mapper;

import com.sonardive.dto.CompanyDto;
import com.sonardive.entity.Company;
import com.sonardive.entity.Country;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CompanyMapperTest {

    @Autowired
    private CompanyMapper companyMapper;

    @Test
    public void testCompanyMapper() {

        Country country = new Country();
        country.setId(1);
        country.setIsoCode("US");

        Company company = new Company();
        company.setId(1);
        company.setName("Ahmed Company");
        company.setCountry(country);

        CompanyDto companyDto = companyMapper.toDto(company);

        assertEquals(1, companyDto.id());
        assertEquals("Ahmed Company", companyDto.name());
        assertEquals("name of US", companyDto.country().name());
    }

}

package com.sonardive.mapper;

import com.sonardive.dto.CountryDto;
import com.sonardive.entity.Country;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CountryMapperTest {

    @Autowired
    private CountryMapper countryMapper;

    @Test
    public void testCountryMapper() {

        Country country = new Country();
        country.setId(1);
        country.setIsoCode("US");

        CountryDto countryDto = countryMapper.toDto(country);

        assertEquals(1, countryDto.id());
        assertEquals("name of US", countryDto.name());
    }
}

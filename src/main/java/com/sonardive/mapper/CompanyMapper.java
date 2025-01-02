package com.sonardive.mapper;

import com.sonardive.dto.CompanyDto;
import com.sonardive.entity.Company;
import org.mapstruct.Mapper;

@Mapper(uses = CountryMapper.class)
public interface CompanyMapper {

    CompanyDto toDto(Company company);

}

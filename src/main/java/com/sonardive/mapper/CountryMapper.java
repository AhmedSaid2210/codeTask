package com.sonardive.mapper;

import com.sonardive.dto.CountryDto;
import com.sonardive.entity.Country;
import com.sonardive.service.CountryService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(imports = {CountryService.class})
public abstract class CountryMapper {

    @Autowired
    protected CountryService countryService ;

    @Mapping(target = "name", source = "isoCode", qualifiedByName = "mapName")
    public abstract CountryDto toDto(Country country);

    @Named("mapName")
    protected String mapName(String isoCode) {
        return countryService.getName(isoCode);
    }
}

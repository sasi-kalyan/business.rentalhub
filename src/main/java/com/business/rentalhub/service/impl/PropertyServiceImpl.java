package com.business.rentalhub.service.impl;

import com.business.rentalhub.converter.PropertyConverter;
import com.business.rentalhub.dto.PropertyDto;
import com.business.rentalhub.entity.Property;
import com.business.rentalhub.repository.PropertyRepository;
import com.business.rentalhub.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    public PropertyRepository propertyRepository;

    @Autowired
    public PropertyConverter propertyConverter;

    @Override
    public PropertyDto createProperty(PropertyDto propertyDto) {

        Property property = propertyConverter.convertPropertyDtoToEntity(propertyDto);
        propertyRepository.save(property);

        PropertyDto propertyDto1 = propertyConverter.convertPropertyEntityToDto(property);

        return propertyDto1;
    }
}

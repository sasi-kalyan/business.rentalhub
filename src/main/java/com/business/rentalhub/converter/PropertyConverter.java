package com.business.rentalhub.converter;

import com.business.rentalhub.dto.PropertyDto;
import com.business.rentalhub.entity.Property;
import org.springframework.stereotype.Component;

@Component
public class PropertyConverter {

    public Property convertPropertyDtoToEntity(PropertyDto propertyDto){

        Property property = new Property();
        property.setName(propertyDto.getName());
        property.setDescription(propertyDto.getDescription());
        property.setAddress(propertyDto.getAddress());
        property.setCity(propertyDto.getCity());
        property.setType(propertyDto.getType());

        return property;
    }

    public PropertyDto convertPropertyEntityToDto(Property property){

        PropertyDto propertyDto = new PropertyDto();
        propertyDto.setId(property.getId());
        propertyDto.setName(property.getName());
        propertyDto.setDescription(property.getDescription());
        propertyDto.setAddress(property.getAddress());
        propertyDto.setCity(property.getCity());
        propertyDto.setType(property.getType());

        return propertyDto;
    }
}

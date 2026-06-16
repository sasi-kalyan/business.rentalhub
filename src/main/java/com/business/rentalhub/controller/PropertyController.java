package com.business.rentalhub.controller;

import com.business.rentalhub.dto.PropertyDto;
import com.business.rentalhub.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/property")
public class PropertyController {

    @Autowired
    public PropertyService propertyService;

    @PostMapping("/create-property")
    public ResponseEntity<PropertyDto> createProperty(@RequestBody PropertyDto propertyDto){

        PropertyDto propertyDto1 = propertyService.createProperty(propertyDto);
        ResponseEntity<PropertyDto> responseEntity = new ResponseEntity<>(propertyDto1, HttpStatus.CREATED);
        return responseEntity;
    }
}

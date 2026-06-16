package com.business.rentalhub.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertyDto {

    private Long id;
    private String name;
    private String description;
    private String address;
    private String city;
    private String type;
}

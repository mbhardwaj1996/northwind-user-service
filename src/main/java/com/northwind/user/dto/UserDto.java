package com.northwind.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserDto {
    @NotBlank(message = "company name should not be null or empty")
    private String company_name;
    @NotBlank(message = "contact name should not be null or empty")
    private String contact_name;
    @NotBlank(message = "contact title should not be null or empty")
    private String contact_title;
    @NotBlank(message = "address should not be null or empty")
    private String address;
    @NotBlank(message = "city should not be null or empty")
    private String city;
    @NotBlank(message = "region should not be null or empty")
    private String region;
    @NotBlank(message = "postal code should not be null or empty")
    private String postal_code;
    @NotBlank(message = "country name should not be null or empty")
    private String country;
    @NotBlank(message = "phone should not be null or empty")
    private String phone;
    @NotNull(message = "fax no should not be null")
    private String fax;
}

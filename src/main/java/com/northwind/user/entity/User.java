package com.northwind.user.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user_details")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String companyName;

    private String contactName;

    private String contactTitle;

    private String address;

    private String city;

    private String region;

    private String postalCode;

    private String country;

    private String phone;

    private String fax;


}

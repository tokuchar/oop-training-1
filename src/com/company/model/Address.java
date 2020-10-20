package com.company.model;

import java.io.Serializable;

public class Address implements Serializable {
    AddressType addressType;
    String street;
    String houseNumber;
    String country;
    String city;

    public Address(AddressType addressType, String street, String houseNumber, String country, String city) {
        this.addressType = addressType;
        this.street = street;
        this.houseNumber = houseNumber;
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressType=" + addressType +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

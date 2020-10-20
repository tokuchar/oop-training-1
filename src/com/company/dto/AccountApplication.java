package com.company.dto;

import com.company.model.Address;
import com.company.model.Contact;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class AccountApplication {
    LocalDate agreementStartDate;
    UUID customerId;
    String name;
    String surname;
    Address address;
    List<Contact> contact;

    public AccountApplication(LocalDate agreementStartDate, UUID customerId, String name, String surname, Address address, List<Contact> contact) {
        this.agreementStartDate = agreementStartDate;
        this.customerId = customerId;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.contact = contact;
    }
}

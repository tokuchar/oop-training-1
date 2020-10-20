package com.company.model;

public class Contact {
    ContactType contactType;
    String value;

    public Contact(ContactType contactType, String value) {
        this.contactType = contactType;
        this.value = value;
    }
}

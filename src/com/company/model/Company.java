package com.company.model;

import java.util.List;

public class Company extends Customer implements CustomerProductUsage {
    String nip;
    String regon;
    Address address;
    List<Contact> contact;
    public List<Product> productList;

    public Company(String description, String nip) {
        super(description);
        this.nip = nip;
    }

    public Company(String nip) {
        this.nip = nip;
    }

    public Company() {
    }

    @Override
    public void addProduct(Product product) {
        System.out.println("company product remove processing..");
    }

    @Override
    public void removeProduct(String name) {

    }
}

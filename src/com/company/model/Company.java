package com.company.model;

import java.util.List;

public class Company implements CustomerProductUsage {
    String nip;
    String regon;
    Address address;
    List<Contact> contact;
    public List<Product> productList;

    @Override
    public void addProduct(Product product) {
        System.out.println("company product remove processing..");
    }

    @Override
    public void removeProduct(String name) {

    }
}

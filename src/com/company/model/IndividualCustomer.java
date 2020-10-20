package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class IndividualCustomer implements CustomerProductUsage {
    String name;
    String surname;
    Address address;
    List<Contact> contact;
    public List<Product> productList;

    public IndividualCustomer(String name,
                              String surname,
                              Address address,
                              List<Contact> contact) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.contact = contact;
        this.productList = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void removeProduct(String name) {
        for (Product product : new ArrayList<>(productList)) {
            if (name != null && name.equals(product.name)) {
                productList.remove(product);
            }
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                ", contact=" + contact +
                ", productList=" + productList.toString() +
                '}';
    }
}

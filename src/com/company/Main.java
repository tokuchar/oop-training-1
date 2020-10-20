package com.company;

import com.company.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("dfojo");

        Address mainAddress = new Address(
                AddressType.MAIN_ADDRESS,
                "Jana Pawła",
                "34/8",
                "Poland",
                "Wroclaw");

        List<Contact> contacts = new ArrayList<>();
        contacts.add(
                new Contact(
                        ContactType.EMAIL,
                        "monkey@gmial.com")
        );


        IndividualCustomer individualCustomer = new IndividualCustomer(
                "Jan",
                "Kowalski",
                mainAddress,
                contacts);

        CustomerProductUsage secondCustomer = new Company();
        Company company = new Company();
        Customer customer = company;

        individualCustomer.addBonus("fuel rabat");
        individualCustomer.hey("hey");

        System.out.println(individualCustomer.toString());
        System.out.println("product addition...");
        Product cycle = new Product("Merida", new Double(1000));
        individualCustomer.addProduct(cycle);

        individualCustomer.removeProduct("Merida");

        System.out.println("my products: ");
        for (Product product : individualCustomer.productList) {
            System.out.println(product.toString());
        }

    }
}

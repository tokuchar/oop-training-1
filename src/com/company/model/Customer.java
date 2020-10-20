package com.company.model;

import java.util.UUID;

public class Customer {
    protected String bonus;
    protected UUID customerId;
    protected String description;

    public void addBonus(String bonusName){
        this.bonus = bonusName;
    }

    public Customer(String description) {
        this.description = description;
        this.customerId = UUID.randomUUID();
    }

    public Customer() {
    }
}

package com.company.model;

import java.util.UUID;

public abstract class Customer {
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

    public final void hey(final String message){
        System.out.println(message);
    }

    public static void foo(){
        System.out.println("foo fo fo");
    }
}

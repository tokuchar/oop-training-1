package com.company.api;

import com.company.dto.AccountApplication;
import com.company.model.Customer;

import java.util.UUID;

public interface CustomerApiInterface {
    void createCustomerAccount(AccountApplication accountApplication);

    Customer getCustomer(String peselOrNip);
}

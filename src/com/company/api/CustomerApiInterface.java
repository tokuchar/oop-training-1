package com.company.api;

import com.company.dto.AccountApplication;
import com.company.model.IndividualCustomer;

public interface CustomerApiInterface {
    void createCustomerAccount(AccountApplication accountApplication);

    IndividualCustomer getCustomer(String pesel);
}

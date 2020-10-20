package com.company.api;

import com.company.dto.AccountApplication;
import com.company.model.IndividualCustomer;

public class CustomerApi implements CustomerApiInterface {
    @Override
    public void createCustomerAccount(AccountApplication accountApplication) {
        //TODO to implementation in future :)
    }

    @Override
    public IndividualCustomer getCustomer(String pesel) {
        return null;
    }

}

package com.eastbytes.accounts.service;

import com.eastbytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    Boolean updateAccount(CustomerDto customerDto);

    Boolean deleteAccount(String mobileNumber);
}

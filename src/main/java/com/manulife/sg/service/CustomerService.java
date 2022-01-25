package com.manulife.sg.service;

import com.manulife.sg.service.domain.Customer;

public interface CustomerService {

  Customer getCustomerById(String customerId);
}

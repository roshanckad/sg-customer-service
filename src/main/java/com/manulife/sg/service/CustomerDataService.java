package com.manulife.sg.service;

import com.manulife.sg.service.domain.Customer;

public interface CustomerDataService {
  Customer getCustomerById(String customerId);
}

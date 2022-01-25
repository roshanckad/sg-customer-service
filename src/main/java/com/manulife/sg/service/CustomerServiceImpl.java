package com.manulife.sg.service;

import com.manulife.sg.service.domain.Customer;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

  private final CustomerDataService customerDataService;

  public Customer getCustomerById(@NonNull String customerId) {
    return customerDataService.getCustomerById(customerId);
  }
}

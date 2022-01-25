package com.manulife.sg.service;

import com.manulife.sg.repository.CustomerRepository;
import com.manulife.sg.repository.entity.CustomerEntity;
import com.manulife.sg.service.domain.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerDataServiceImpl implements CustomerDataService {

  private final CustomerRepository customerRepository;

  @Override
  public Customer getCustomerById(String customerId) {
    CustomerEntity customerEntity = customerRepository.findById(Long.valueOf(customerId))
      .orElse(CustomerEntity.builder().build());
    return Customer.builder()
      .id(String.valueOf(customerEntity.getId()))
      .name(customerEntity.getName())
      .build();
  }
}

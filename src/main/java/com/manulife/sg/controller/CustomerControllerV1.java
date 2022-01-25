package com.manulife.sg.controller;

import com.manulife.sg.controller.dto.CustomerDto;
import com.manulife.sg.service.CustomerService;
import com.manulife.sg.service.domain.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1")
@RequiredArgsConstructor
public class CustomerControllerV1 {

  private final CustomerService customerService;

  @GetMapping(name = "/customers/{customers_id}")
  public CustomerDto getCustomerById(@PathVariable String customersId) {
    Customer customer = customerService.getCustomerById(customersId);
    return CustomerDto.builder()
      .name(customer.getName())
      .dateOfBirth(customer.getDateOfBirth())
      .build();
  }

}

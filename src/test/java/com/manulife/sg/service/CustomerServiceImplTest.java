package com.manulife.sg.service;

import com.manulife.sg.service.domain.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("CustomerServiceImpl")
class CustomerServiceImplTest {

  @Mock
  CustomerDataService mockCustomerDataService;

  CustomerServiceImpl customerService;

  @BeforeEach
  void setup() {
    customerService = new CustomerServiceImpl(mockCustomerDataService);
  }

  @Nested
  @DisplayName("Test cases for getCustomerById method")
  class GetCustomerById {

    @Test
    @DisplayName("Given valid null, when getCustomer, then throw NullPointerException")
    void givenNull_whenGetCustomer_ThenThrowNullPointerException() {
      //Given
      String customerId = null;

      //When, Then
      Assertions.assertThrows(NullPointerException.class, () -> customerService.getCustomerById(customerId));
    }

    @Test
    @DisplayName("Given valid CustomerId, when getCustomer, then return Customer")
    void givenValidCustomerId_whenGetCustomer_ThenReturnCustomer() {
      //Given
      String customerId = "00001";

      //When
      Mockito.when(mockCustomerDataService.getCustomerById(customerId)).thenReturn(Customer.builder().build());
      Customer customer = customerService.getCustomerById(customerId);

      //Then
      Assertions.assertNotNull(customer);
    }
  }

}

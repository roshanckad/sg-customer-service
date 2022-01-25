package com.manulife.sg.service.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Customer {
  private String id;
  private String name;
  private String gender;
  private String dateOfBirth;
}

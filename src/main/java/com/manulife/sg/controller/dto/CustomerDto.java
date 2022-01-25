package com.manulife.sg.controller.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CustomerDto {

  private String id;
  private String name;
  private String gender;
  private String dateOfBirth;
}

package com.manulife.sg.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CUSTOMER")
public class CustomerEntity {

  @Id
  Long id;
  String name;
  String gender;
  @Column(name = "DOB")
  String dateOfBirth;
}

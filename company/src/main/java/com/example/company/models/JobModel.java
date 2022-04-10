package com.example.company.models;

import javax.persistence.*;

@Entity
@Table(name = "Job")
public class JobModel {
  @Id
  @Column(unique = true, nullable = false)
  private Integer id;
  @Column(unique = true, nullable = false)
  private String name;
  @Column(unique = true, nullable = false)
  private Double salary;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }
}

package com.example.company.models;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class EmployeeModel {

  @Id
  @Column(unique = true, nullable = false)
  private Integer id;
  @Column(name = "gender_id")
  private Integer genderId;
  @Column(name = "job_id")
  private Integer jobId;
  @Column(unique = true, nullable = false)
  private String name;
  @Column(unique = true, nullable = false)
  private String lastName;
  @Column(nullable = false)
  private Date birthDate;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getGenderId() {
    return genderId;
  }

  public void setGenderId(Integer genderId) {
    this.genderId = genderId;
  }

  public Integer getJobId() {
    return jobId;
  }

  public void setJobId(Integer jobId) {
    this.jobId = jobId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

}

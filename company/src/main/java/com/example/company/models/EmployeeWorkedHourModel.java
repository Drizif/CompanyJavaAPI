package com.example.company.models;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Employee_worked_hours")
public class EmployeeWorkedHourModel {
  @Id
  @Column(unique = true, nullable = false)
  private Integer id;
  @Column(name = "employee_id")
  private Integer employeeId;
  @Column(name = "worked_hours")
  private Integer workedHours;
  private Date workedDate;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }

  public Integer getWorkedHours() {
    return workedHours;
  }

  public void setWorkedHours(Integer workedHours) {
    this.workedHours = workedHours;
  }

  public Date getWorkedDate() {
    return workedDate;
  }

  public void setWorkedDate(Date workedDate) {
    this.workedDate = workedDate;
  }
}

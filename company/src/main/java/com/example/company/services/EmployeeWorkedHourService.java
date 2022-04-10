package com.example.company.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.company.models.EmployeeWorkedHourModel;
import com.example.company.repositories.EmployeeWorkedHourRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeWorkedHourService {
  @Autowired
  EmployeeWorkedHourRepository employeeWorkedHoursRepository;

  public ArrayList<EmployeeWorkedHourModel> getAllEmployeeWorkedHours() {
    return (ArrayList<EmployeeWorkedHourModel>) employeeWorkedHoursRepository.findAll();
  }

  public Optional<EmployeeWorkedHourModel> getEmployeeWorkedHourById(Integer id) {
    try {
      return employeeWorkedHoursRepository.findById(id);
    } catch (Exception e) {
      return Optional.empty();
    }
  }

  public EmployeeWorkedHourModel createEmployeeWorkedHour(EmployeeWorkedHourModel employeeWorkedHour) {
    return employeeWorkedHoursRepository.save(employeeWorkedHour);
  }

  public boolean deleteEmployeeWorkedHour(Integer id) {
    try {
      employeeWorkedHoursRepository.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

}

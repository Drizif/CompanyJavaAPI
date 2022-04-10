package com.example.company.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.company.models.EmployeeModel;
import com.example.company.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  @Autowired
  EmployeeRepository employeeRepository;

  public ArrayList<EmployeeModel> getAllEmployees() {
    return (ArrayList<EmployeeModel>) employeeRepository.findAll();
  }

  public Optional<EmployeeModel> getEmployeeById(Integer id) {
    try {
      return employeeRepository.findById(id);
    } catch (Exception e) {
      return Optional.empty();
    }
  }

  public EmployeeModel createEmployee(EmployeeModel employee) {
    return employeeRepository.save(employee);
  }

  public boolean deleteEmployee(Integer id) {
    try {
      employeeRepository.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

}

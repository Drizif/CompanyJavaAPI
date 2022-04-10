package com.example.company.repositories;

import java.util.Optional;

import com.example.company.models.EmployeeModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeModel, Integer> {
  public abstract Optional<EmployeeModel> findById(Integer id);

}

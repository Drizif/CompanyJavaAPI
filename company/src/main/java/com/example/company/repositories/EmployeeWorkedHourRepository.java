package com.example.company.repositories;

import java.util.Optional;

import com.example.company.models.EmployeeWorkedHourModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeWorkedHourRepository extends CrudRepository<EmployeeWorkedHourModel, Integer> {
  public abstract Optional<EmployeeWorkedHourModel> findById(Integer id);
}

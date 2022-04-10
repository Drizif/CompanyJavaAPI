package com.example.company.repositories;

import java.util.Optional;

import com.example.company.models.JobModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends CrudRepository<JobModel, Integer> {
  public abstract Optional<JobModel> findById(Integer id);
}

package com.example.company.repositories;

import java.util.Optional;

import com.example.company.models.GenderModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends CrudRepository<GenderModel, Integer> {
  public abstract Optional<GenderModel> findById(Integer id);
  
}

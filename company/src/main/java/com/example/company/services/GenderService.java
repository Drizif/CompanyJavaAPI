package com.example.company.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.company.models.GenderModel;
import com.example.company.repositories.GenderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenderService {
  @Autowired
  GenderRepository genderRepository;

  public ArrayList<GenderModel> getAllGenders() {
    return (ArrayList<GenderModel>) genderRepository.findAll();
  }

  public Optional<GenderModel> getGenderById(Integer id) {
    return genderRepository.findById(id);
  }

  public GenderModel createGender(GenderModel gender){
    return genderRepository.save(gender);
  }

  public boolean deleteGender(Integer id){
    try {
      genderRepository.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }

  }

}

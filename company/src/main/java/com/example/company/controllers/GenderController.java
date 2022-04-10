package com.example.company.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.company.models.ResponseModel;
import com.example.company.models.GenderModel;
import com.example.company.services.GenderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gender")
public class GenderController {
  @Autowired
  GenderService genderService;

  @GetMapping()
  public ResponseModel<?> getAllGenders() {
    try {
      ArrayList<GenderModel> data = genderService.getAllGenders();

      ResponseModel response = new ResponseModel<ArrayList<GenderModel>>();
      response.setStatus(true);
      response.setMessage("Success");
      response.setData(data);

      return response;
    } catch (Exception e) {
      ResponseModel response = new ResponseModel<ArrayList<GenderModel>>();
      response.setStatus(false);
      response.setMessage("" + e);
      response.setData(null);

      return response;
    }
  }

  @GetMapping("/{id}")
  public ResponseModel<?> getGenderById(@PathVariable("id") Integer id) {
    try {
      Optional<GenderModel> data = genderService.getGenderById(id);

      ResponseModel response = new ResponseModel<GenderModel>();
      response.setStatus(true);
      response.setMessage("Success");
      response.setData(data);

      return response;
    } catch (Exception e) {
      ResponseModel response = new ResponseModel<GenderModel>();
      response.setStatus(false);
      response.setMessage("" + e);
      response.setData(null);

      return response;
    }
  }

  @PostMapping()
  public ResponseModel<?> createGender(@RequestBody GenderModel genderModel) {
    try {
      GenderModel data = genderService.createGender(genderModel);

      ResponseModel response = new ResponseModel<GenderModel>();
      response.setStatus(true);
      response.setMessage("Success");
      response.setData(data);

      return response;
    } catch (Exception e) {
      ResponseModel response = new ResponseModel<GenderModel>();
      response.setStatus(false);
      response.setMessage("" + e);
      response.setData(null);

      return response;
    }
  }

  @DeleteMapping(path = "/{id}")
  public ResponseModel<?> deleteGender(@PathVariable("id") Integer id) {
    try {
      genderService.deleteGender(id);

      ResponseModel response = new ResponseModel<GenderModel>();
      response.setStatus(true);
      response.setMessage("Success");
      response.setData(null);

      return response;
    } catch (Exception e) {
      ResponseModel response = new ResponseModel<GenderModel>();
      response.setStatus(false);
      response.setMessage("" + e);
      response.setData(null);

      return response;
    }
  }

}

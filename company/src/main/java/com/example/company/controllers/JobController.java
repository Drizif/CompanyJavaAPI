package com.example.company.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.company.models.JobModel;
import com.example.company.models.ResponseModel;
import com.example.company.services.JobService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class JobController {
  @Autowired
  private JobService jobService;

  @GetMapping()
  public ResponseModel<?> getAllJobs() {
    try {
      ArrayList<JobModel> data = jobService.getAllJobs();

      ResponseModel response = new ResponseModel<ArrayList<JobModel>>();
      response.setStatus(true);
      response.setMessage("Success");
      response.setData(data);

      return response;
    } catch (Exception e) {
      ResponseModel response = new ResponseModel<ArrayList<JobModel>>();
      response.setStatus(false);
      response.setMessage("" + e);
      response.setData(null);

      return response;
    }
  }

  @GetMapping("/{id}")
  public ResponseModel<?> getJobById(@PathVariable("id") Integer id) {
    try {
      Optional<JobModel> data = jobService.getJobById(id);

      ResponseModel response = new ResponseModel<JobModel>();
      response.setStatus(true);
      response.setMessage("Success");
      response.setData(data);

      return response;
    } catch (Exception e) {
      ResponseModel response = new ResponseModel<JobModel>();
      response.setStatus(false);
      response.setMessage("" + e);
      response.setData(null);

      return response;
    }
  }

  @PostMapping()
  public ResponseModel<?> createJob(@RequestBody JobModel job) {
    try {
      JobModel data = jobService.createJob(job);

      ResponseModel response = new ResponseModel<JobModel>();
      response.setStatus(true);
      response.setMessage("Success");
      response.setData(data);

      return response;
    } catch (Exception e) {
      ResponseModel response = new ResponseModel<JobModel>();
      response.setStatus(false);
      response.setMessage("" + e);
      response.setData(null);

      return response;
    }
  }

  @DeleteMapping(path = "/{id}")
  public ResponseModel<?> deleteJob(@PathVariable("id") Integer id) {
    boolean status = this.jobService.deleteJob(id);

    ResponseModel response = new ResponseModel<JobModel>();
    response.setStatus(status ? true : false);
    response.setMessage(status ? "Success" : "User not found");
    response.setData(null);

    return response;
  }

}

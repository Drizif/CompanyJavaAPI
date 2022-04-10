package com.example.company.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.company.models.JobModel;
import com.example.company.repositories.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
  @Autowired
  JobRepository jobRepository;

  public ArrayList<JobModel> getAllJobs() {
    return (ArrayList<JobModel>) jobRepository.findAll();
  }

  public Optional<JobModel> getJobById(Integer id) {
    try {
      return jobRepository.findById(id);
    } catch (Exception e) {
      return Optional.empty();
    }
  }

  public JobModel createJob(JobModel job) {
    return jobRepository.save(job);
  }

  public boolean deleteJob(Integer id) {
    try {
      jobRepository.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}

package com.example.demos.repository;

import com.example.demos.domain.Job;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<Job,String> {
}

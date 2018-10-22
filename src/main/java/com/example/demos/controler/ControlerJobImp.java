package com.example.demos.controler;

import com.example.demos.domain.Job;
import com.example.demos.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControlerJobImp implements ControlerJob {

    @Autowired
    JobRepository rep;


    @Override
    @GetMapping(path = "/job/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Job getJob(@PathVariable("id") String name) {
        return this.rep.findById(name).get();
    }

    @Override
    @PutMapping(path = "/job", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Job setJob(@RequestBody Job job) {
        return this.rep.save(job);
    }
}

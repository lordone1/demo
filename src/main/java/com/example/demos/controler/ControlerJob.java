package com.example.demos.controler;

import com.example.demos.domain.Job;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;



public interface ControlerJob {


    public Job getJob(@PathVariable("id") String name);

    public  Job  setJob(Job job);

}

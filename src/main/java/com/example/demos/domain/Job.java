package com.example.demos.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Job")
@Setter
@Getter
public class Job {
    @Id
    private String name;
    private String salary;
}

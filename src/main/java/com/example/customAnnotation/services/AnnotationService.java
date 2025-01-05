package com.example.customAnnotation.services;

import com.example.customAnnotation.annotations.LogExecutionTime;
import org.springframework.stereotype.Service;

@Service
public class AnnotationService {

    @LogExecutionTime
    public String performTask() throws InterruptedException {
        Thread.sleep(2000); // Simulate a time-consuming task
        return "Task Completed";
    }
}

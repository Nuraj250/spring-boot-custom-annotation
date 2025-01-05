package com.example.customAnnotation.controllers;

import com.example.customAnnotation.services.AnnotationService;
import org.springframework.web.bind.annotation.GetMapping;

public class AnnotationController {

    private final AnnotationService annotationService;

    public AnnotationController(AnnotationService annotationService) {
        this.annotationService = annotationService;
    }

    @GetMapping("/test")
    public String testLogExecutionTime() throws InterruptedException {
        return annotationService.performTask();
    }
}

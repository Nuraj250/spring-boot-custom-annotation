package com.example.customAnnotation;

import com.example.customAnnotation.services.AnnotationService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CustomAnnotationApplicationTests {

	@Test
	void performTask() throws InterruptedException {
		AnnotationService annotationService = new AnnotationService();
		String result = annotationService.performTask();
		assertEquals("Task Completed", result);
	}

}

# Spring Boot Custom Annotation 

This repository demonstrates how to create and use a custom annotation in a Spring Boot application. The custom annotation `@LogExecutionTime` is used to measure and log the execution time of methods, leveraging Spring's Aspect-Oriented Programming (AOP) capabilities. 
  
## Features
- Define custom annotations for reusable logic.
- Implement an aspect for method execution time logging.
- Example integration with a Spring Boot service and REST controller.

## Use Case
The `@LogExecutionTime` annotation can be applied to any method, and it will automatically log the execution time of that method without modifying its business logic.

## Key Components
1. **Custom Annotation**
   - Annotation: `@LogExecutionTime`
   - Scope: Method-level.

2. **Aspect**
   - Logs the execution time of annotated methods using Spring AOP.

3. **Example Application**
   - A sample service and REST controller demonstrate the usage of the custom annotation.

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/spring-boot-custom-annotation.git

package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.service.EmployeeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmployeeApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeApplication.class);
    private static EmployeeService employeeService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EmployeeApplication.class, args);
        employeeService = context.getBean(EmployeeService.class);

        testAddEmployee();
    }

    private static void testAddEmployee() {
        LOGGER.info("Start");
        Employee emp = new Employee(1, "Thiru", 50000);
        employeeService.addEmployee(emp);
        LOGGER.debug("Added Employee: {}", emp);
        LOGGER.info("End");
    }
}

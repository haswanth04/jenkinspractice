package com.klef.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TaskManagerApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
		System.out.println("project is running!");
		}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TaskManagerApplication.class);
    }

}

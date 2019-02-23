package com.tdorosz.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author Tomek
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplicationBuilder(Main.class).build();
        springApplication.run(args);
    }
}

package com.travis.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        System.out.print("Hello");
        SpringApplication.run(TestApplication.class, args);
    }
}

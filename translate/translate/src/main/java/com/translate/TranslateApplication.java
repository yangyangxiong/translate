package com.translate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class TranslateApplication {
    public static void main(String[] args) {
        SpringApplication.run(TranslateApplication.class, args);
    }
}
package com.grt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;


//This annotation tells that it is the entry point of the application

@EnableJpaRepositories(basePackages = "com.grt.repos")
@SpringBootApplication
@Component
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}

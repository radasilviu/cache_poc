package com.computacenter.cachepoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.computacenter.cachepoc.repository")
public class CachePocApplication {

    public static void main(String[] args) {
        SpringApplication.run(CachePocApplication.class, args);
    }

}

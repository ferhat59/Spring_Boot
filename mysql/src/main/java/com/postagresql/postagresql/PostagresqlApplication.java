package com.postagresql.postagresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PostagresqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostagresqlApplication.class, args);
    }

}

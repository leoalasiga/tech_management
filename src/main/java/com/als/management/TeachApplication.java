package com.als.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class TeachApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeachApplication.class, args);
    }

}

package com.galaxyt.ceti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.galaxyt.ceti")
public class CetiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CetiApplication.class, args);
    }

}

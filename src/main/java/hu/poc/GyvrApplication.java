package hu.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GyvrApplication {

    public static void main(String[] args) {
        SpringApplication.run(GyvrApplication.class, args);
    }
}

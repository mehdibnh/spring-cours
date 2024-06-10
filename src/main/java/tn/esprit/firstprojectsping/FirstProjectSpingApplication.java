package tn.esprit.firstprojectsping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FirstProjectSpingApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstProjectSpingApplication.class, args);
    }

}

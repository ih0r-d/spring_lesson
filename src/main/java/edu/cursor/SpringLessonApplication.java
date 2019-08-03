package edu.cursor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class SpringLessonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLessonApplication.class, args);
    }

}

//@Bean
//@Component
//@Repository
//@Service
//@Controller

//@Configuration

package com.rcom.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student john = new Student("John", "john@gmail.com", LocalDate.of(2000, Month.JANUARY, 5));
            Student alex = new Student("Alex", "alex@yahoo.com", LocalDate.of(2004, Month.JANUARY, 5));
            repository.saveAll(
              List.of(john, alex)
            );
        };
    }
}

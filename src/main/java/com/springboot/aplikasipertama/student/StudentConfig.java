package com.springboot.aplikasipertama.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig
{
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args -> {
            Student anggra = new Student(
                    "Anggra Alhera Nasmita Utomo",
                    "anggraalheranasmitautomo@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER, 27)
            );

            Student bintang = new Student(
                    "Bintang Raya Maulana",
                    "bintangrayamaulana@gmail.com",
                    LocalDate.of(2008, Month.MAY, 05)
            );

            repository.saveAll(
                    List.of(anggra,bintang)
            );
        };
    }
}

package com.bsafe.bsafe.report;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class ReportConfig {
    @Bean
    CommandLineRunner commandLineRunner(ReportRepository repository){
        return args -> {

        };

    }
}

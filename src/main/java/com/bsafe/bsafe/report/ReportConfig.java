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
            Report report1 = new Report("Ziad", "Malik",
                    "Hello", LocalDate.now());
            Report report2 = new Report("Ziad", "Malik",
                    "Hello", LocalDate.now());
            Report report3 = new Report("Ziad", "Malik",
                    "Hello", LocalDate.now());
            repository.saveAll(
                    List.of(report1, report2, report3)
            );
        };

    }
}

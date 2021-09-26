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
            Report report1 = new Report("TEST", "Reporting Abuse at my Home");
            Report report2 = new Report("TEST", "Reporting Suspicious Activity at Neighbors House");
            Report report3 = new Report("TEST", "Abuse between Couple at work Noticed");
            repository.saveAll(
                    List.of(report1, report2, report3)
            );
        };

    }
}

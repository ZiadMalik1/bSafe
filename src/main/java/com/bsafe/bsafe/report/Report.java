package com.bsafe.bsafe.report;


import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table
public class Report {
    @Id
    @SequenceGenerator(
            name = "report_sequence",
            sequenceName = "report_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "report_sequence"
    )
    private Long id;
    private String name;
    private String description;
    private String location;
    private LocalDate timeStamp;
    public Report() {
    }

    public Report(Long id, String name, String description, String location, LocalDate timeStamp) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.location = location;
        this.timeStamp = timeStamp;
    }

    public Report(String name, String description, String location, LocalDate timeStamp) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.timeStamp = timeStamp;
    }

    public Long getId() {return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}

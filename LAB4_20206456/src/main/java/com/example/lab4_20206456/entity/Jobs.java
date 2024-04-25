package com.example.lab4_20206456.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="jobs")
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="job_id", nullable = false)
    private Integer idjob;

    @Getter @Setter @Column(name="job_title", nullable = false, length = 35)
    private int jobtitle;

    @Getter @Setter @Column(name="min_salary", nullable = false)
    private Integer minsalary;

    @Getter @Setter @Column(name="max_salary", nullable = false)
    private Integer maxsalary;
}

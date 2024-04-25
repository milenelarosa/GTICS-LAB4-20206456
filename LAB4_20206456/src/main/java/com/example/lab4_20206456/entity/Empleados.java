package com.example.lab4_20206456.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employees")
public class Empleados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="employee_id", nullable = false)
    private Integer idempleado;

    @Getter @Setter @Column(name="first_name", nullable = false, length = 20)
    private String nombreempleado;

    @Getter @Setter @Column(name="last_name", nullable = false, length = 20)
    private String apellidoempelado;

    @Getter @Setter @Column(name="email", nullable = false, length = 20)
    private String email;

    @Getter @Setter @Column(name="password", nullable = false, length = 20)
    private String password;

    @Getter @Setter @Column(name="salary", nullable = false)
    private Double salary;

    @ManyToOne
    @JoinColumn(name="manger_id")
    private Empleados manager;

    @ManyToOne
    @JoinColumn(name="job_id")
    private Jobs jobs;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Departments departments;

    public Empleados getManager() {
        return manager;
    }

    public void setManager(Empleados manager) {
        this.manager = manager;
    }

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }
}

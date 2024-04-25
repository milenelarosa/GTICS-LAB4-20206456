package com.example.lab4_20206456.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="job_history")
public class Historial {

    @EmbeddedId
    private JobHistory id;

    @MapsId("jobhistoryid")
    @Getter @Setter @Column(name="job_history", nullable = false)
    private Integer idjobhistory;

    @MapsId("employeeid")
    @ManyToOne
    @JoinColumn(name="employee_id")
    private Empleados empleados;

}

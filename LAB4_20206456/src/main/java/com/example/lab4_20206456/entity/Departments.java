package com.example.lab4_20206456.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="departments")
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="department_id", nullable = false)
    private Integer iddepartment;

    @Getter @Setter @Column(name="department_name", nullable = false, length = 20)
    private String departmentname;

    @ManyToOne
    @JoinColumn(name="manager_id")
    private Empleados empleados;

    @ManyToOne
    @JoinColumn(name="location_id")
    private Locations locations;

    public Empleados getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }

    public Locations getLocations() {
        return locations;
    }

    public void setLocations(Locations locations) {
        this.locations = locations;
    }
}

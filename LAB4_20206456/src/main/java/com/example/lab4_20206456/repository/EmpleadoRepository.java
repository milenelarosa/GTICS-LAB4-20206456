package com.example.lab4_20206456.repository;

import com.example.lab4_20206456.entity.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleados,Integer> {

    @Query(nativeQuery = true, value = "SELECT e.*, j.job_title, d.department_name, l.city FROM hr.employees e, hr.departments d, hr.jobs j, hr.locations l\n" +
            "WHERE e.department_id = d.department_id and e.job_id = j.job_id and d.location_id = l.location_id;\n")
    List<Empleados> listarEmpleados();
}

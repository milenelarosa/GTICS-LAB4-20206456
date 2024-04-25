package com.example.lab4_20206456.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class JobHistory implements Serializable {

    @Column(name = "job_history_id", nullable = false)
    private Integer jobhistoryid;

    @Column(name = "employee_id", nullable = false)
    private Integer employeeid;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime fechadeinicio;

    public Integer getJobhistoryid() {
        return jobhistoryid;
    }

    public void setJobhistoryid(Integer jobhistoryid) {
        this.jobhistoryid = jobhistoryid;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public LocalDateTime getFechadeinicio() {
        return fechadeinicio;
    }

    public void setFechadeinicio(LocalDateTime fechadeinicio) {
        this.fechadeinicio = fechadeinicio;
    }
}

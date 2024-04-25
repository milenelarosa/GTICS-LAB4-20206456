package com.example.lab4_20206456.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="regions")
public class Regions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="region_id", nullable = false)
    private Integer idregion;

    @Getter @Setter @Column(name="region_name", nullable = false, length = 20)
    private String nameregion;
}

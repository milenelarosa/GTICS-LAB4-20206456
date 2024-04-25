package com.example.lab4_20206456.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="countries")
public class Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="country_id", nullable = false)
    private Integer idcountry;

    @Getter @Setter @Column(name="country_name", nullable = false, length = 20)
    private String namecountry;

    @ManyToOne
    @JoinColumn(name="region_id")
    private Regions regions;

    public Regions getRegions() {
        return regions;
    }

    public void setRegions(Regions regions) {
        this.regions = regions;
    }
}

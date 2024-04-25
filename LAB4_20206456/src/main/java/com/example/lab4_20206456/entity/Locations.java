package com.example.lab4_20206456.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="locations")
public class Locations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="location_id", nullable = false)
    private Integer idlocation;

    @Getter @Setter @Column(name="street_address", nullable = false, length = 20)
    private String streetaddres;

    @Getter @Setter @Column(name="postal_code", nullable = false, length = 20)
    private String postalcode;

    @Getter @Setter @Column(name="city", nullable = false, length = 20)
    private String city;

    @Getter @Setter @Column(name="state_province", nullable = false, length = 20)
    private String stateprovince;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Countries countries;

    public Countries getCountries() {
        return countries;
    }

    public void setCountries(Countries countries) {
        this.countries = countries;
    }
}

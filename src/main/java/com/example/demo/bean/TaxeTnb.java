package com.example.demo.bean;

import jakarta.persistence.*;


@Entity
public class TaxeTnb {
    @Id
    private Long id;
    private int annee;
    @ManyToOne
    Terrain terrain;
    @ManyToOne
    Redevable redevable;
    @ManyToOne
    TauxTaxeTnb tauxTaxeTnb;
    private double montantBase;

}

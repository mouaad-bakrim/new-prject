package com.example.demo.bean;
import jakarta.persistence.ManyToOne;

public class TauxTaxeTnb {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public com.example.demo.bean.CategorieTerrain getCategorieTerrain() {
        return CategorieTerrain;
    }

    public void setCategorieTerrain(com.example.demo.bean.CategorieTerrain categorieTerrain) {
        CategorieTerrain = categorieTerrain;
    }

    public double getMontantMetreCarre() {
        return montantMetreCarre;
    }

    public void setMontantMetreCarre(double montantMetreCarre) {
        this.montantMetreCarre = montantMetreCarre;
    }

    private Long id;
        private CategorieTerrain  CategorieTerrain ;
        private double montantMetreCarre;
    }



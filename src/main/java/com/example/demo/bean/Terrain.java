package com.example.demo.bean;

import jakarta.persistence.*;

@Entity
public class Terrain {
    @Id     @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double surface;
    private String ref;
    @ManyToOne
    private Redevable redevable;

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }


    public String getRef() {
        return null;
    }
}

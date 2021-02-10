package com.example.codeclan.breadtracker.models;

import com.example.codeclan.breadtracker.helpers.Region;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bakeries")
public class Bakery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Region region;

    @OneToMany(mappedBy = "bakery") // One Bakery can have many breads
    @JsonIgnoreProperties("bakery")  // prevent recursion back from bakery object
    private List<Bread> breads;

    // Default constructor - to be used by Spring
    public Bakery() {
    }

    public Bakery(String name, Region region) {
        this.name = name;
        this.region = region;

        this.breads = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public List<Bread> getBreads() {
        return breads;
    }

    public void setBreads(List<Bread> breads) {
        this.breads = breads;
    }
}

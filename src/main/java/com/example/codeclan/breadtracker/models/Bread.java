package com.example.codeclan.breadtracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="breads")
public class Bread {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private int year;

    @ManyToOne // Many breads can belong to one bakery
    @JoinColumn(name = "bakery_id", nullable = false)
    // We want to avoid recursion when accessing data, therefore
    // Spring should ignore this variable in Bakery object
    @JsonIgnoreProperties({"breads"})
    private Bakery bakery;


    // Default constructor for Spring to use
    public Bread( ) {
    }

    public Bread(String name, int age, int year, Bakery bakery) {
        this.name = name;
        this.bakery = bakery;
        this.year = year;
        this.age = age;
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

    public Bakery getBakery() {
        return bakery;
    }

    public void setBakery(Bakery bakery) {
        this.bakery = bakery;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

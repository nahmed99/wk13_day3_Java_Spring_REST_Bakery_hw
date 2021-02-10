package com.example.codeclan.breadtracker.repositories;

import com.example.codeclan.breadtracker.helpers.Region;
import com.example.codeclan.breadtracker.models.Bakery;
import com.example.codeclan.breadtracker.models.Bread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BreadRepository extends JpaRepository<Bread, Long> {

    List<Bread> findByYear(int year);

    List<Bread> findByAgeAndBakeryName(int age, String bakeryName);

}

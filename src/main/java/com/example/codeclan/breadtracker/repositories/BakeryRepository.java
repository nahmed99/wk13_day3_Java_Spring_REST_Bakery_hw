package com.example.codeclan.breadtracker.repositories;

import com.example.codeclan.breadtracker.helpers.Region;
import com.example.codeclan.breadtracker.models.Bakery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BakeryRepository extends JpaRepository<Bakery, Long> {

    // Get all Bbakeries in a given region
    // List<Bakery> findByRegionIgnoreCase(Region region);
    List<Bakery> findByRegion(Region region);
}

package com.example.codeclan.breadtracker.repositories;

import com.example.codeclan.breadtracker.helpers.Region;
import com.example.codeclan.breadtracker.models.Bakery;
import com.example.codeclan.breadtracker.models.Bread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BakeryRepository extends JpaRepository<Bakery, Long> {

    // Get all Bbakeries in a given region
    // List<Bakery> findByRegionIgnoreCase(Region region);

    // If I used the type as String instead of Region below, then I
    // wouldn't have had to convert the incoming string (from http)
    // to enum (in BakeryController - getAllBakeries())...could have
    // just capitalised the 'word' and passed to this function. But(!)
    // more importantly, I could have passed on 'IgnoreCase' functionality
    // to Spring (sql). Not sure which is more resource expensive.
    List<Bakery> findByRegion(Region region);

}

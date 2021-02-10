package com.example.codeclan.breadtracker.controllers;

import com.example.codeclan.breadtracker.helpers.Region;
import com.example.codeclan.breadtracker.models.Bakery;
import com.example.codeclan.breadtracker.repositories.BakeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BakeryController {

    @Autowired
    BakeryRepository bakeryRepository;

    /**
     *  REST GET all, and Get Bakeries for a particular region
     *
     * GET /bakeries                        null            - findAll
     * GET /bakeries?region=region_name     region_name     - findByRegion
     */

    @GetMapping(value = "/bakeries")
    public ResponseEntity<List<Bakery>> getAllBakeries(
            @RequestParam(name="region", required = false) String regionName
    ) {

        if (regionName != null) {
            // If region name has been passed in...

            //List<Bakery> allBakeries = bakeryRepository.findByRegionIgnoreCase(Region.valueOf(cappedRegion));

            // Convert whole string to lower case...
            String cappedRegion = regionName.toLowerCase();
            // and then capitalise the first letter of the string:
            cappedRegion = cappedRegion.substring(0, 1).toUpperCase() + cappedRegion.substring(1);

            List<Bakery> allBakeries = bakeryRepository.findByRegion(Region.valueOf(cappedRegion));
            return new ResponseEntity<>(allBakeries, HttpStatus.OK);
        }

        // GET ALL bakeries
        List<Bakery> allBakeries = bakeryRepository.findAll();
        return new ResponseEntity<>(allBakeries, HttpStatus.OK);
    }

    // REST GET by Id
    @GetMapping(value = "/bakeries/{id}")
    public ResponseEntity<Optional<Bakery>> getBakery(@PathVariable Long id) {
        return new ResponseEntity<>(bakeryRepository.findById(id), HttpStatus.OK);
    }

}

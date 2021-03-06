package com.example.codeclan.breadtracker.controllers;

import com.example.codeclan.breadtracker.models.Bread;
import com.example.codeclan.breadtracker.repositories.BreadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BreadController {

    @Autowired
    BreadRepository breadRepository;


    // REST GET all breads
    // GET ALL Breads for a particular year
    // GET All breads of a particular age AND from a specific bakery (breads/?age=num&bakery=bakery_name)
    @GetMapping(value = "/breads")
    public ResponseEntity<List<Bread>> getAllBreads(
            @RequestParam(name="year", required = false) Integer year,
            @RequestParam(name="age", required = false) Integer age,
            @RequestParam(name="bakery", required = false) String bakeryName
    ) {

        if ( year != null ) {
            List<Bread> allBreads = breadRepository.findByYear(year);
            return new ResponseEntity<>(allBreads, HttpStatus.OK);
        }

        // E.g, http://localhost:8080/breads/?age=1&bakery=Talisker
        if ( age != null && bakeryName != null ) {
            List<Bread> allBreads = breadRepository.findByAgeAndBakeryName(age, bakeryName);
            return new ResponseEntity<>(allBreads, HttpStatus.OK);
        }

        List<Bread> allBreads = breadRepository.findAll();
        return new ResponseEntity<>(allBreads, HttpStatus.OK);
    }

}

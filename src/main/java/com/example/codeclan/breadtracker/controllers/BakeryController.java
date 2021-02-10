package com.example.codeclan.breadtracker.controllers;

import com.example.codeclan.breadtracker.models.Bakery;
import com.example.codeclan.breadtracker.repositories.BakeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BakeryController {

    @Autowired
    BakeryRepository bakeryRepository;

    // REST GET all
    @GetMapping(value = "/bakeries")
    public ResponseEntity<List<Bakery>> getAllBakeries() {
        List<Bakery> allBakeries = bakeryRepository.findAll();
        return new ResponseEntity<>(allBakeries, HttpStatus.OK);
    }

}

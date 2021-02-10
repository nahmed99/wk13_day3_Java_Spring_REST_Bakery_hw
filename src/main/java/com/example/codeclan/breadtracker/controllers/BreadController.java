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
    @GetMapping(value = "/breads")
    public ResponseEntity<List<Bread>> getAllBreads(
            @RequestParam(name="year", required = false) Integer year
    ) {

        if( year != null ) {
            List<Bread> allBreads = breadRepository.findByYear(year);
            return new ResponseEntity<>(allBreads, HttpStatus.OK);
        }

        List<Bread> allBreads = breadRepository.findAll();
        return new ResponseEntity<>(allBreads, HttpStatus.OK);
    }



}

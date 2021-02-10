package com.example.codeclan.breadtracker.repositories;

import com.example.codeclan.breadtracker.models.Bakery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BakeryRepository extends JpaRepository<Bakery, Long> {
}

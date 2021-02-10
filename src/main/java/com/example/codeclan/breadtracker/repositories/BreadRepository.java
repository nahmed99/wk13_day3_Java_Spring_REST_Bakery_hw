package com.example.codeclan.breadtracker.repositories;

import com.example.codeclan.breadtracker.models.Bread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreadRepository extends JpaRepository<Bread, Long> {
}

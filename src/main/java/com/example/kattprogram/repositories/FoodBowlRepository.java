package com.example.kattprogram.repositories;

import com.example.kattprogram.entities.FoodBowl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodBowlRepository extends JpaRepository<FoodBowl, String> {
}

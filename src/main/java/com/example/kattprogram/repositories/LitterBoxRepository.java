package com.example.kattprogram.repositories;

import com.example.kattprogram.entities.LitterBox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LitterBoxRepository extends JpaRepository<LitterBox, String> {
}

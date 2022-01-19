package com.example.kattprogram.repositories;

import com.example.kattprogram.entities.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends JpaRepository<Human, String> {
}

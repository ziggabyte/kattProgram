package com.example.kattprogram;

import com.example.kattprogram.entities.Cat;
import com.example.kattprogram.entities.FoodBowl;
import com.example.kattprogram.entities.Human;
import com.example.kattprogram.repositories.CatRepository;
import com.example.kattprogram.repositories.FoodBowlRepository;
import com.example.kattprogram.repositories.HumanRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CatService {
    CatRepository catRepository;
    HumanRepository humanRepository;
    FoodBowlRepository foodBowlRepository;

    public Cat createCat(String catName, String humanName) {
        Cat cat = new Cat(catName);
        cat = addHumanToCat(cat, humanName);
        cat = addFoodBowlToCat(cat, FoodType.FISH);
        return catRepository.save(cat);
    }

    private Cat addFoodBowlToCat(Cat cat, FoodType foodType) {
        FoodBowl foodBowl = new FoodBowl(foodType, cat);
        cat.setFoodBowl(foodBowl);
        return cat;
    }

    private Cat addHumanToCat(Cat cat, String humanName) {
        Human human = new Human(humanName, new ArrayList<>(List.of(cat)));
        cat.setHuman(human);
        return cat;
    }

    public List<Cat> all() {
        return catRepository.findAll();
    }
}

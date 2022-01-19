package com.example.kattprogram.entities;

import com.example.kattprogram.FoodType;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class FoodBowl {
    @Id
    private String id;

    @Column
    @Enumerated(EnumType.STRING)
    private FoodType foodType;

    @OneToOne(mappedBy = "foodBowl", cascade = CascadeType.ALL)
    private Cat cat;

    public FoodBowl(FoodType foodType, Cat cat) {
        this.id = UUID.randomUUID().toString();
        this.foodType = foodType;
        this.cat = cat;
    }

    public FoodBowl() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

}

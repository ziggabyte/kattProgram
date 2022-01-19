package com.example.kattprogram.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Cat {
    @Id private String id;

    @Column
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "foodbowl_id")
    private FoodBowl foodBowl;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "human_id")
    private Human human;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "cat_litterbox",
            joinColumns = @JoinColumn(name = "cat_id"),
            inverseJoinColumns = @JoinColumn(name = "litterbox_id"))
    private List<LitterBox> litterBoxes;

    public Cat(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.litterBoxes = new ArrayList<>();
    }

    protected Cat() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FoodBowl getFoodBowl() {
        return foodBowl;
    }

    public void setFoodBowl(FoodBowl foodBowl) {
        this.foodBowl = foodBowl;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public List<LitterBox> getLitterBoxes() {
        return litterBoxes;
    }

    public void setLitterBoxes(List<LitterBox> litterBoxes) {
        this.litterBoxes = litterBoxes;
    }
}

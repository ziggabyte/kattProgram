package com.example.kattprogram.entities;

import com.example.kattprogram.entities.Cat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
public class Human {
    @Id
    private String id;

    @Column
    private String name;

    @OneToMany(mappedBy = "human")
    private List<Cat> cats;

    public Human() {
    }

    public Human(String name, List<Cat> cats) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.cats = cats;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cat) {
        this.cats = cat;
    }
}

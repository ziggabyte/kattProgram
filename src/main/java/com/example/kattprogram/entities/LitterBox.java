package com.example.kattprogram.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.UUID;

@Entity
public class LitterBox {
    @Id
    private String id;

    @Column
    private Boolean needsCleaning;

    @ManyToMany(mappedBy = "litterBoxes")
    private List<Cat> cats;

    public LitterBox(Boolean needsCleaning, List<Cat> cats) {
        this.id = UUID.randomUUID().toString();
        this.needsCleaning = needsCleaning;
        this.cats = cats;
    }

    public LitterBox() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getNeedsCleaning() {
        return needsCleaning;
    }

    public void setNeedsCleaning(Boolean needsCleaning) {
        this.needsCleaning = needsCleaning;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }
}

package com.example.sneakers.model;


import com.sun.javafx.beans.IDProperty;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.awt.*;

@Entity
public class Sneaker {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String brandName;
private String designName;
private String edition;
private String color;

public Sneaker(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getDesignName() {
        return designName;
    }

    public void setDesignName(String designName) {
        this.designName = designName;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sneaker{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", designName='" + designName + '\'' +
                ", edition='" + edition + '\'' +
                ", color=" + color +
                '}';
    }
}

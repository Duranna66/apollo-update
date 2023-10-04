package com.example.apollotabacco.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import javax.swing.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @NotEmpty
    private String name;
//    private ImageIcon photo;
@NotNull
@NotEmpty
    private int price;
    private String manufacturer;
    private String  description;
    @NotNull
    @NotEmpty
    private String type;
    private long likes;
//    private List<String> tags;

    public Product(Long id, String name, int price, String manufacturer, String description, String type, long likes) {
        this.id = id;
//        this.photo = photo;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
        this.type = type;
        this.likes = likes;
    }

    public Product() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public ImageIcon getPhoto() {
//        return photo;
//    }

//    public void setPhoto(ImageIcon photo) {
//        this.photo = photo;
//    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

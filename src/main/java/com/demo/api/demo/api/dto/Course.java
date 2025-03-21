package com.demo.api.demo.api.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Course {

    private int id;
    private String name;
    private double price;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

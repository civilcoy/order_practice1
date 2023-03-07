package com.example.order_practice.entity;

import com.example.order_practice.dto.FoodDto;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long price;
    private String description;

    public Food(FoodDto foodDto) {
        this.name = foodDto.getName();
        this.price = foodDto.getPrice();
        this.description = foodDto.getDescription();
    }

    public void updateFood(FoodDto foodDto) {
        this.name = foodDto.getName();
        this.price = foodDto.getPrice();
        this.description = foodDto.getDescription();
    }
}

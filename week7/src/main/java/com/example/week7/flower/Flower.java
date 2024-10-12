package com.example.week7.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Flower {

    private FlowerType type;
    private double sepalLength;
    private FlowerColor color;
    private double price;

    public String getColor(){
        return color.getCode();
    }

    public Flower(Flower flower){
        this.color = flower.color;
        this.type = flower.type;
        
    }

}

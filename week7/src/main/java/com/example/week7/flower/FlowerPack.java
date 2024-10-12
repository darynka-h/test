package com.example.week7.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class FlowerPack {
    private Flower flower;
    private int count;

    public FlowerPack(Flower flower, int count){
        this.flower = new Flower(flower);
        this.count = count;
    }
}

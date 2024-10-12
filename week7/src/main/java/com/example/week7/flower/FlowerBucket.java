package com.example.week7.flower;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


@Getter
@Setter
// @NoArgsConstructor
// @AllArgsConstructor

class FlowerBucket {
    // private int pack;
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
       flowerPacks = new ArrayList<>();
    }

    public void addPack(){
        
    }

}
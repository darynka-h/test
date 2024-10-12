package com.example.week7.flower;

import lombok.Getter;

@Getter

public enum FlowerColor {
   RED("#FF0000"), WHITE(""), YELLOW("");

   String code;

   FlowerColor(String code){
    this.code = code;
   }
}

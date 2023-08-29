package com.example.morden.morden_java_in_action.chapter2;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Apple {

    int weight;
    String color;

    Boolean getWeight(Apple apple) {
        return apple.getWeight() > 150;
    }

    Boolean getColor(Apple apple) {
        return color.equals(apple.getColor());
    }
}

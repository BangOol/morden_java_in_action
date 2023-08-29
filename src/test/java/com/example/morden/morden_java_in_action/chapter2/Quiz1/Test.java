package com.example.morden.morden_java_in_action.chapter2.Quiz1;

import com.example.morden.morden_java_in_action.chapter2.Apple;
import com.example.morden.morden_java_in_action.chapter2.PrediacateHeavyApple;
import com.example.morden.morden_java_in_action.chapter2.PredicateApple;
import com.example.morden.morden_java_in_action.chapter2.PredicateGreenColorApple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Quiz2 {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));

        List<Apple> heavyApples = test2(inventory, new PrediacateHeavyApple());
        List<Apple> greenApples = test2(inventory, new PredicateGreenColorApple());

    }

    public static List<Apple> test2(List<Apple> inventory, PredicateApple p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}

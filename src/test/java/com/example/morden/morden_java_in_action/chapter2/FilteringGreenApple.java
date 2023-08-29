package com.example.morden.morden_java_in_action.chapter2;

import com.example.morden.morden_java_in_action.chapter2.Apple;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FilteringGreenApple {

    @Test
    List<Apple> filterGrennApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }
}

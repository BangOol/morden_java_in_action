package com.example.morden.morden_java_in_action.chapter2.Quiz1;

import com.example.morden.morden_java_in_action.chapter2.Apple;
import com.example.morden.morden_java_in_action.chapter2.PredicateApple;
import org.junit.jupiter.api.Test;

import java.util.List;

class Quiz1 {
    @Test
    void prettyPrintApple(List<Apple> inventory, PredicateApple p){
        for(Apple apple : inventory) {
            String output = p.test(apple) ? "heavy" : "light";
            System.out.println(output);
        }
    }

    @Test
    void getGreenColorApple(List<Apple> inventory, PredicateApple p){
        for(Apple apple : inventory) {
            String output = p.test(apple) ? "green" : "not green";
            System.out.println(output);
        }
    }

}

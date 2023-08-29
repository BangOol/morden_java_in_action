package com.example.morden.morden_java_in_action.chapter2.Quiz2;

import com.example.morden.morden_java_in_action.chapter2.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Test {

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for(T e : list) {
            if(p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public static void test2 () {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"));
        List<Apple> redApples = filter(inventory, (Apple apple) -> "red".equals(apple.getColor()));
    }

}

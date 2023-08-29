package com.example.morden.morden_java_in_action.chapter2.comparator;

import com.example.morden.morden_java_in_action.chapter2.Apple;
import com.example.morden.morden_java_in_action.chapter2.Quiz2.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public void test() {
        List<Apple> inventory = Arrays.asList(new Apple(80, "green"));
    }
}

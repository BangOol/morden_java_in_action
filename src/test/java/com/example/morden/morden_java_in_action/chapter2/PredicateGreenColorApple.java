package com.example.morden.morden_java_in_action.chapter2;

public class PredicateGreenColorApple implements PredicateApple{
    @Override
    public Boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }
}

package com.example.morden.morden_java_in_action.chapter2;

public class PrediacateHeavyApple implements PredicateApple{
    @Override
    public Boolean test(Apple apple) {
        return 150 < apple.getWeight();
    }

}

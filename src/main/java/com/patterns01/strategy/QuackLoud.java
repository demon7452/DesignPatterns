package com.patterns01.strategy;

public class QuackLoud implements QuackInterface {

    @Override
    public void quack() {
        System.out.println("I can quack loudly!!");
    }

}

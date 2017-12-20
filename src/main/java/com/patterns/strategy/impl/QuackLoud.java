package com.patterns.strategy.impl;

import com.patterns.strategy.api.QuackInterface;

public class QuackLoud implements QuackInterface {

    @Override
    public void quack() {
        System.out.println("I can quack loudly!!");
    }

}

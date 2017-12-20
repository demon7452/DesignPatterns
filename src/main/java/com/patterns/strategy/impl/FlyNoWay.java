package com.patterns.strategy.impl;

import com.patterns.strategy.api.FlyInterface;

public class FlyNoWay implements FlyInterface {

    @Override
    public void fly() {
        System.out.println("I can not fly!");
    }

}

package com.patterns.strategy.impl;

import com.patterns.strategy.api.FlyInterface;

public class FlyWithWings implements FlyInterface {

    @Override
    public void fly() {
        System.out.println("I can fly with wings,hahaha");
    }

}

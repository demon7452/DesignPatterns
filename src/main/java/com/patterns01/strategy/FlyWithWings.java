package com.patterns01.strategy;

public class FlyWithWings implements FlyInterface {

    @Override
    public void fly() {
        System.out.println("I can fly with wings,hahaha");
    }

}

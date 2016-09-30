package com.patterns01.strategy;

public class FlyNoWay implements FlyInterface {

    @Override
    public void fly() {
        System.out.println("I can not fly!");
    }

}

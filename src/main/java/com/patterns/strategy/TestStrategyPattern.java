package com.patterns.strategy;

import com.patterns.strategy.impl.FlyNoWay;
import com.patterns.strategy.impl.FlyWithWings;
import com.patterns.strategy.impl.QuackMute;

public class TestStrategyPattern {

    public static void main(String[] args) {
        Duck mallarDuck = new MallardDuck(new FlyWithWings(),new QuackMute());
        mallarDuck.display();
        mallarDuck.swim();
        mallarDuck.performFly();
        mallarDuck.performQuack();
        mallarDuck.setFlyInterface(new FlyNoWay());
        mallarDuck.performFly();
    }
}

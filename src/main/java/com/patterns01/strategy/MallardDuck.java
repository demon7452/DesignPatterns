package com.patterns01.strategy;

public class MallardDuck extends Duck {
    
    public MallardDuck(FlyInterface fly,QuackInterface quack){
        super(fly,quack);
    }
    
    @Override
    public void display() {
        System.out.println("I am a mallard duck(绿头鸭)");
    }

}

package com.patterns.strategy;

import com.patterns.strategy.api.FlyInterface;
import com.patterns.strategy.api.QuackInterface;

public class MallardDuck extends Duck {
    /**
     * 该构造函数保证每个鸭子实例类必须为接口对象赋予实例对象
     * 保证父类调用接口方法时不会出现空指针异常
     * Creates a new instance of MallardDuck.
     * @param fly
     * @param quack
     */
    public MallardDuck(FlyInterface fly, QuackInterface quack){
        super(fly,quack);
    }
    
    @Override
    public void display() {
        System.out.println("I am a mallard duck(绿头鸭)");
    }

}

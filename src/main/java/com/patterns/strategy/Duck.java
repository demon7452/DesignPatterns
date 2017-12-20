package com.patterns.strategy;

import com.patterns.strategy.api.FlyInterface;
import com.patterns.strategy.api.QuackInterface;

/**
 * 
 * Function: supper class duck
 * 鸭子的超类
 *
 * @author   admin
 * @Date	 2016年9月30日		下午4:48:05
 *
 * @see
 */
public abstract class Duck {
    private FlyInterface flyInterface;
    
    private QuackInterface quackInterface;
    
    public Duck(){
    }
    
    public Duck(FlyInterface flyInterface,QuackInterface quackInterface){
        this.flyInterface = flyInterface;
        this.quackInterface = quackInterface;
    }
    /**
     * abstract method display
     *
     */
    public abstract void display();

    public void swim(){
        System.out.println("all ducks float,even decoys!!");
    }
    
    public void performFly(){
        flyInterface.fly();
    }
    
    public void performQuack(){
        quackInterface.quack();
    }

    public FlyInterface getFlyInterface() {
        return flyInterface;
    }


    public void setFlyInterface(FlyInterface flyInterface) {
        this.flyInterface = flyInterface;
    }

    public QuackInterface getQuackInterface() {
        return quackInterface;
    }

    public void setQuackInterface(QuackInterface quackInterface) {
        this.quackInterface = quackInterface;
    }

}

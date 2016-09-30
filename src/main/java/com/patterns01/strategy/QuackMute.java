package com.patterns01.strategy;

public class QuackMute implements QuackInterface {

    @Override
    public void quack() {
        System.out.println("I am a mute(哑巴),I can not quack loudly!!");
    }

}

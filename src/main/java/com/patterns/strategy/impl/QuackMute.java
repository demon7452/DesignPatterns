package com.patterns.strategy.impl;

import com.patterns.strategy.api.QuackInterface;

public class QuackMute implements QuackInterface {

    @Override
    public void quack() {
        System.out.println("I am a mute(哑巴),I can not quack loudly!!");
    }

}

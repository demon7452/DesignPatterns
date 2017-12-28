package com.patterns.observer.api;

/**
 * Description:
 * Created by lixiong on 2017/12/20.
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}

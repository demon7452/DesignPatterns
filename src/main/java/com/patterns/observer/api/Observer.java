package com.patterns.observer.api;

/**
 * Description:
 * Created by lixiong on 2017/12/20.
 */
public interface Observer<T> {

    void update(T t);
}

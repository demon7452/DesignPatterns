package com.patterns.observer.impl;

import com.alibaba.fastjson.JSON;

import java.util.Observable;
import java.util.Observer;

/**
 * Description:
 * Created by lixiong on 2017/12/27.
 */
public class PersonObserver implements Observer {

    public void update(Observable o, Object arg) {
        if(o instanceof PersonSubject){
            PersonSubject personSubject = (PersonSubject)o;

            System.out.println("Person:" + JSON.toJSONString(personSubject.getPerson()));
        }

        if(null != arg){
            System.out.println("Object:" + JSON.toJSONString(arg));
        }

    }
}

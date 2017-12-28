package com.patterns.observer.impl;

import com.patterns.observer.dto.Person;

import java.util.Observable;

/**
 * Description:
 * Created by lixiong on 2017/12/27.
 */
public class PersonSubject extends Observable {
    private Person person;

    public PersonSubject() {
    }

    public void personChanged(Person person){
        this.person = person;
        setChanged();
        notifyObservers();
    }

    public void personChanged(Person person, Object object){
        this.person = person;
        setChanged();
        notifyObservers(object);
    }

    public Person getPerson() {
        return person;
    }
}

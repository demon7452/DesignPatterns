package com.patterns.observer;

import com.patterns.observer.dto.Person;
import com.patterns.observer.dto.WeatherData;
import com.patterns.observer.impl.CurrentConditionDisplay;
import com.patterns.observer.impl.PersonObserver;
import com.patterns.observer.impl.PersonSubject;
import com.patterns.observer.impl.WeatherDataSubject;

/**
 * Description:
 * Created by lixiong on 2017/12/20.
 */
public class TestObserver {

    public static void main(String[] args) {

        //first test case
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherDataSubject);

        weatherDataSubject.registerObserver(currentConditionDisplay);

        weatherDataSubject.setMeasurements(new WeatherData(1,2,3));

        // second test case
        PersonSubject personSubject = new PersonSubject();

        PersonObserver personObserver = new PersonObserver();

        personSubject.addObserver(personObserver);

        personSubject.personChanged(new Person("one" , 1));
        personSubject.personChanged(new Person("two" , 2));
        personSubject.personChanged(new Person("third", 3), "test push");

    }
}

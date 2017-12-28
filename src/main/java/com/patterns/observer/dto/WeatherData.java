package com.patterns.observer.dto;

/**
 * Description:
 * Created by lixiong on 2017/12/20.
 */
public class WeatherData {

    private int temperature;

    private int humidity;

    private int pressure;

    public WeatherData() {
    }

    public WeatherData(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}

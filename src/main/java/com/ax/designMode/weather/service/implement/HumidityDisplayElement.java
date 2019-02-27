package com.ax.designMode.weather.service.implement;

import com.ax.designMode.weather.service.IDisplayElement;
import com.ax.designMode.weather.web.WeatherDataController;

import java.util.Observable;
import java.util.Observer;

public class HumidityDisplayElement implements Observer, IDisplayElement {

    private float humidity;

    @Override
    public void display() {
        System.out.println("humidity ：" + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherDataController wdc = null;
        if(o instanceof WeatherDataController) {
            wdc = (WeatherDataController) o;
        }
        humidity = wdc.getHumidity();
        display();
    }
}

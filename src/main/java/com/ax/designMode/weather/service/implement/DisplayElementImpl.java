package com.ax.designMode.weather.service.implement;

import com.ax.designMode.weather.service.IDisplayElement;
import com.ax.designMode.weather.web.WeatherDataController;

import java.util.Observable;
import java.util.Observer;

/**
 * 展示板的代码
 */
public class DisplayElementImpl implements IDisplayElement, Observer {

    private float temperature;

    public void display() {
        System.out.println("temperature : " + temperature);
    }

    public void update(Observable o, Object arg) {
        WeatherDataController wdc = null;
        if (o instanceof WeatherDataController) {
            wdc = (WeatherDataController) o;
        }
        temperature = wdc.getTemperature();
        display();
    }


}

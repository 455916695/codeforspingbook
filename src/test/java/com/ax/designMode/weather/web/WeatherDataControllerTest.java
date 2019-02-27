package com.ax.designMode.weather.web;

import com.ax.designMode.weather.service.implement.DisplayElementImpl;
import com.ax.designMode.weather.service.implement.HumidityDisplayElement;
import org.junit.Test;

import java.util.Observer;

public class WeatherDataControllerTest {

    @Test
    public void test() {

        WeatherDataController wdc = new WeatherDataController();

        wdc.setMeasurements(4.0f,0.0f ,0.0f);

        Observer observer = new DisplayElementImpl();
        Observer observer2 = new HumidityDisplayElement();

        wdc.addObserver(observer);
        wdc.addObserver(observer2);

        wdc.setMeasurements(4.0f,500f ,0.0f);
    }

}

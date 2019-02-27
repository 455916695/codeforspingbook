package com.ax.designMode.weather.web;

import java.util.Observable;

/**
 *  主题接口，当其数据发生变化时，就发出通知
 *
 * */
public class WeatherDataController extends Observable { //主题接口
    //成员变量
    private float temperature;  //温度
    private float humidity;     //湿度
    private float pressure;     //气压

    // 测量发生变化时，更新数据
    public void setMeasurements(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChange();
    }

    private void measurementChange() {
        setChanged();
        notifyObservers();   //让监听者自己去拉取数据， 也可以考虑让 主题 推送 数据给监听者（但这种方式有待商榷，是否合理）
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}

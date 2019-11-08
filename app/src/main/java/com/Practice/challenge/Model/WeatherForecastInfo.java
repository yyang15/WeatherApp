package com.Practice.challenge.Model;

public class WeatherForecastInfo {
    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    int temp;
    public WeatherForecastInfo(int t){
        this.temp = t;
    }

}

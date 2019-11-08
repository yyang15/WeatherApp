package com.Practice.challenge.Model;

import java.util.List;

public class CurrentWeatherInfo {
    Clouds clouds;
    List<Weather> weathers;
    Main main;
    Wind wind;
    Coord coord;
    String cityName;


    public CurrentWeatherInfo(Clouds clouds, List<Weather> weathers, Main main, Wind wind, Coord coord, String cityName) {
        this.clouds = clouds;
        this.weathers = weathers;
        this.main = main;
        this.wind = wind;
        this.coord = coord;
        this.cityName = cityName;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public List<Weather> getWeathers() {
        return weathers;
    }

    public void setWeathers(List<Weather> weathers) {
        this.weathers = weathers;
    }


    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }
}

package com.twitter.challenge.Model;

public class WeatherInfo {
    Clouds clouds;
    Weather weather;
    Rain rain;
    Wind wind;
    Coord coord;
    String cityName;



    public WeatherInfo(Clouds clouds, Weather weather, Rain rain, Wind wind, Coord coord, String cityName) {
        this.clouds = clouds;
        this.weather = weather;
        this.rain = rain;
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

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
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
}

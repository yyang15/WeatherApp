package com.Practice.challenge.Utils;

public class HttpClientUtil {

    public static String buildCurrentWeatherRequestQuery(String baseURL, String city, String api_key){
        return baseURL + "weather?q=" + city + "&units=metric&mode=json&appid=" + api_key;
    }
}

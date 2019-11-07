package com.Practice.challenge;

import com.android.volley.toolbox.JsonObjectRequest;

public class WeatherInfoApi {

    private final static String TAG = "WeatherInfoApi";
    public static int sendWeatherRequest(HttpClient client, JsonObjectRequest request){
        client.sendResquest(request);
        return 0;
    }




}

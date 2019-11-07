package com.Practice.challenge;

import android.util.Log;

import com.Practice.challenge.Model.CurrentWeatherInfo;
import com.Practice.challenge.Utils.HttpClientUtil;
import com.Practice.challenge.Utils.WeatherInfoUtil;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

public class HttpClientHelper {

    private final static String baseUrl = "https://api.openweathermap.org/data/2.5/";
    private final static String API_KEY = "64f7dbd5a9b577f25d17aa922f4f16ab";
    private final static String TAG = "HttpClientHelper";

    public static JsonObjectRequest buildCurrentRequest(String city){
        String URL = HttpClientUtil.buildCurrentWeatherRequestQuery(baseUrl, city, API_KEY);

        JsonObjectRequest objectRequest = new JsonObjectRequest(
                Request.Method.GET,
                URL,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            Log.i("response", response.getJSONObject("coord").toString());
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        CurrentWeatherInfo info = WeatherInfoUtil.toWeatherInfo(response);
                        Log.i(TAG, info.getMain().getTemp() + "");
                        EventBus.getDefault().post(info);
                        // render ui.
                    }
                },
                new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error){
                        Log.e("response fail", error.toString());
                    }
                }
        );
        return objectRequest;
    }
/*
    public static JsonObjectRequest buildForecastRequest(String city, int cnt){
        String URL =  baseUrl + url;

        JsonObjectRequest objectRequest = new JsonObjectRequest(
                Request.Method.GET,
                URL,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i("response", response.toString());
                        CurrentWeatherInfo info = WeatherInfoUtil.toWeatherInfo(response);
                        EventBus.getDefault().post(info);
                        // render ui.
                    }
                },
                new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error){
                        Log.e("response fail", error.toString());
                    }
                }
        );
        return objectRequest;
    }

 */
}

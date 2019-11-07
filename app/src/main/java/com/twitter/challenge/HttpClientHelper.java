package com.twitter.challenge;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twitter.challenge.Model.Weather;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class HttpClientHelper {

    private final static String baseUrl = "https://twitter-code-challenge.s3.amazonaws.com/";
    public static JsonObjectRequest buildRequest(String url){
        String URL =  baseUrl + url;
        final ObjectMapper objectMapper = new ObjectMapper();
        JsonObjectRequest objectRequest = new JsonObjectRequest(
                Request.Method.GET,
                URL,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            Log.i("response success", response.getJSONObject("weather").toString());
                            Weather weather = objectMapper.readValue(response.getJSONObject("weather").toString(), Weather.class);
                            Log.i("response success", weather.getTemp() + "");

                        } catch (JSONException e) {
                            e.printStackTrace();
                        } catch (JsonParseException e) {
                            e.printStackTrace();
                        } catch (JsonMappingException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                },
                new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error){
                        Log.i("response fail", error.toString());
                    }
                }
        );
        return objectRequest;
    }
}

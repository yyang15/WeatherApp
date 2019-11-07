package com.twitter.challenge;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twitter.challenge.Model.Weather;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class HttpClient {

    RequestQueue requestQueue;


    public HttpClient(Context context){
        this.requestQueue = Volley.newRequestQueue(context);
    }

    public void sendResquest(Request request){
        requestQueue.add(request);
    }




}

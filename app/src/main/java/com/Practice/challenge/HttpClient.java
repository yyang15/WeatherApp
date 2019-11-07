package com.Practice.challenge;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class HttpClient {

    private static RequestQueue requestQueue = null;
    private static HttpClient client = null;

    private HttpClient(Context context){
        this.requestQueue = Volley.newRequestQueue(context);
    }

    public static HttpClient getInstance(Context context){
        if(client == null){
            client = new HttpClient(context);
        }
        return client;
    }

    public void sendResquest(Request request){
        requestQueue.add(request);
    }


}

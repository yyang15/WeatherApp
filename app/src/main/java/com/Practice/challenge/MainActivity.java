package com.Practice.challenge;

import android.app.Activity;
import android.os.Bundle;

import android.widget.TextView;

import com.Practice.challenge.Model.CurrentWeatherInfo;
import com.android.volley.toolbox.JsonObjectRequest;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;


public class MainActivity extends Activity {
    TextView temperatureView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EventBus.getDefault().register(this);

        temperatureView = (TextView) findViewById(R.id.temperature);
        temperatureView.setText(getString(R.string.temperature, 34f, TemperatureConverter.celsiusToFahrenheit(34)));

        HttpClient client = HttpClient.getInstance(this);

        JsonObjectRequest jsonObjectRequest = HttpClientHelper.buildCurrentRequest("Fremont");

        WeatherInfoApi.sendWeatherRequest(client, jsonObjectRequest);


    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(CurrentWeatherInfo info) {
        temperatureView.setText(getString(R.string.temperature, info.getMain().getTemp(), TemperatureConverter.celsiusToFahrenheit(34)));

    }

}

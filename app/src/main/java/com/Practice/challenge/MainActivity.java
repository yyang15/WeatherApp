package com.Practice.challenge;

import android.app.Activity;
import android.os.Bundle;

import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.Practice.challenge.Model.CurrentWeatherInfo;
import com.Practice.challenge.Model.WeatherForecastInfo;
import com.android.volley.toolbox.JsonObjectRequest;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;


public class MainActivity extends Activity implements View.OnClickListener {
    TextView temperatureView;
    Button forecast;
    LinearLayout forecastLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EventBus.getDefault().register(this);

        temperatureView = (TextView) findViewById(R.id.temperature);
        temperatureView.setText(getString(R.string.temperature, 34f, TemperatureConverter.celsiusToFahrenheit(34)));

        forecast = (Button) findViewById(R.id.forecast);
        forecast.setOnClickListener(this);

        forecastLayout = (LinearLayout) findViewById(R.id.forecastView);


        HttpClient client = HttpClient.getInstance(this);

        JsonObjectRequest jsonObjectRequest = HttpClientHelper.buildCurrentRequest("Fremont");

        WeatherInfoApi.sendWeatherRequest(client, jsonObjectRequest);


    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(CurrentWeatherInfo info) {
        temperatureView.setText(getString(R.string.temperature, info.getMain().getTemp(), TemperatureConverter.celsiusToFahrenheit(34)));

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEvent(WeatherForecastInfo info) {
        Log.i("HttpClientHelper", "null");
//        temperatureView.setText(getString(R.string.temperature, 34, TemperatureConverter.celsiusToFahrenheit(34)));

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.forecast:
                weatherForecast();
                forecastLayout.setVisibility(View.VISIBLE);
                break;

        }
    }

    private void weatherForecast(){
        HttpClient client = HttpClient.getInstance(this);
        JsonObjectRequest jsonObjectRequest = HttpClientHelper.buildForecastRequest("Fremont", 5);
        WeatherInfoApi.sendWeatherRequest(client, jsonObjectRequest);
    }
}

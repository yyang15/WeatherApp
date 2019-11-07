package com.Practice.challenge.Utils;

import com.Practice.challenge.Model.Clouds;
import com.Practice.challenge.Model.Coord;
import com.Practice.challenge.Model.CurrentWeatherInfo;
import com.Practice.challenge.Model.Main;
import com.Practice.challenge.Model.Rain;
import com.Practice.challenge.Model.Weather;
import com.Practice.challenge.Model.Wind;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeatherInfoUtil {
    final static ObjectMapper objectMapper = new ObjectMapper();

    public static CurrentWeatherInfo toWeatherInfo(JSONObject jsonObject) {
        try {
            JSONArray weatherJsonArray = jsonObject.getJSONArray("weather");
            List<Weather> weatherList = new ArrayList<>();
            for (int i = 0; i < weatherJsonArray.length(); i++) {
                Weather weather = objectMapper.readValue(weatherJsonArray.get(i).toString(), Weather.class);
                weatherList.add(weather);
            }

            JSONObject windJson = jsonObject.getJSONObject("wind");
            Wind wind = objectMapper.readValue(windJson.toString(), Wind.class);

            JSONObject coordJson = jsonObject.getJSONObject("coord");
            Coord coord = objectMapper.readValue(coordJson.toString(), Coord.class);

            JSONObject cloudsJson = jsonObject.getJSONObject("clouds");
            Clouds clouds = objectMapper.readValue(cloudsJson.toString(), Clouds.class);

            JSONObject mainJson = jsonObject.getJSONObject("main");
            Main main = objectMapper.readValue(mainJson.toString(), Main.class);

            String cityName = jsonObject.get("name").toString();

            CurrentWeatherInfo weatherInfo = new CurrentWeatherInfo(clouds, weatherList, main, wind, coord, cityName);

            return weatherInfo;


        } catch (JSONException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

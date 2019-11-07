package com.Practice.challenge.Model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "humidity",
        "temp_max",
        "temp_min",
        "temp",
        "pressure"
})
public class Main {
    @JsonProperty
    int humidity;
    @JsonProperty
    float temp_max;
    @JsonProperty
    float temp_min;
    @JsonProperty
    float temp;
    @JsonProperty
    float pressure;


    @JsonProperty("humidity")
    public int getHumidity() {
        return humidity;
    }
    @JsonProperty("humidity")
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    @JsonProperty("temp_max")
    public float getTemp_max() {
        return temp_max;
    }
    @JsonProperty("temp_max")
    public void setTemp_max(float temp_max) {
        this.temp_max = temp_max;
    }
    @JsonProperty("temp_min")
    public float getTemp_min() {
        return temp_min;
    }
    @JsonProperty("temp_min")
    public void setTemp_min(float temp_min) {
        this.temp_min = temp_min;
    }
    @JsonProperty("temp")
    public float getTemp() {
        return temp;
    }
    @JsonProperty("temp")
    public void setTemp(float temp) {
        this.temp = temp;
    }
    @JsonProperty("pressure")
    public float getPressure() {
        return pressure;
    }
    @JsonProperty("pressure")
    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}

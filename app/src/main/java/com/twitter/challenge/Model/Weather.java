package com.twitter.challenge.Model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "temp",
        "pressure",
        "humidity"
})

public class Weather {


    @JsonProperty
    int humidity;
    @JsonProperty
    float temp;
    @JsonProperty
    int pressure;

    @JsonProperty("temp")
    public float getTemp() {
        return temp;
    }
    @JsonProperty("temp")
    public void setTemp(float temp) {
        this.temp = temp;
    }
    @JsonProperty("pressure")
    public int getPressure() {
        return pressure;
    }
    @JsonProperty("pressure")
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    @JsonProperty("humidity")
    public int getHumidity() {
        return humidity;
    }
    @JsonProperty("humidity")
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }


}

package com.Practice.challenge.Model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "speed",
        "deg"
})
public class Wind {
    @JsonProperty
    float speed;
    @JsonProperty
    int deg;

    @JsonProperty("speed")
    public float getSpeed() {
        return speed;
    }

    @JsonProperty("speed")
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @JsonProperty("deg")
    public int getDeg() {
        return deg;
    }

    @JsonProperty("deg")
    public void setDeg(int deg) {
        this.deg = deg;
    }
}

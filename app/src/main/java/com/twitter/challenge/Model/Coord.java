package com.twitter.challenge.Model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lon",
        "lat"
})
public class Coord {
    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    @JsonProperty
    float lon;
    @JsonProperty
    public float getLat() {
        return lat;
    }
    @JsonProperty
    public void setLat(float lat) {
        this.lat = lat;
    }

    @JsonProperty
    float lat;
}

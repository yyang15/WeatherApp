package com.Practice.challenge.Model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lon",
        "lat"
})
public class Coord {

    @JsonProperty
    float lon;
    @JsonProperty
    float lat;

    @JsonProperty("lon")
    public float getLon() {
        return lon;
    }
    @JsonProperty("lon")
    public void setLon(float lon) {
        this.lon = lon;
    }

    @JsonProperty("lat")
    public float getLat() {
        return lat;
    }
    @JsonProperty("lat")
    public void setLat(float lat) {
        this.lat = lat;
    }



}

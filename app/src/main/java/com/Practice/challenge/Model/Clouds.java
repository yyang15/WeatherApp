package com.Practice.challenge.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "all"
})
public class Clouds {
    @JsonProperty("all")
    public int getAll() {
        return all;
    }
    @JsonProperty("all")
    public void setAll(int all) {
        this.all = all;
    }

    @JsonProperty
    int all;

}


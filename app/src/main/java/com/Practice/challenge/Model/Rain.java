package com.Practice.challenge.Model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "3h"
})
public class Rain {
    @JsonProperty("3h")
    public int get_3h() {
        return _3h;
    }
    @JsonProperty("3h")
    public void set_3h(int _3h) {
        this._3h = _3h;
    }

    @JsonProperty
    int _3h;



}

package com.Practice.challenge.Model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "main",
        "icon",
        "description"
})

public class Weather {


    @JsonProperty
    int id;
    @JsonProperty
    String main;
    @JsonProperty
    String icon;
    @JsonProperty
    String description;

    @JsonProperty("main")
    public String getMain() {
        return main;
    }
    @JsonProperty("main")
    public void setMain(String main) {
        this.main = main;
    }
    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }
    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }
    @JsonProperty("id")
    public int getId() {
        return id;
    }
    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }


}

package com.merion.weather.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter //@ToString
public class Location {
    private Double lat;
    private Double lon;
    private String name;
    private String region;
    private String country;
    @SerializedName("tz_id")
    private String tzId;
    @SerializedName("localtime_epoch")
    private Long localtimeEpoch;
    private String localtime;

}

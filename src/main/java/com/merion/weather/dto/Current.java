package com.merion.weather.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter //@ToString
public class Current {
    @SerializedName("last_updated")
    private String lastUpdated;
    @SerializedName("last_updated_epoch")
    private Long lastUpdatedEepoch;
    @SerializedName("temp_c")
    private Double tempC;
    @SerializedName("temp_f")
    private Double tempF;
    @SerializedName("condition")
    private Condition condition;
    @SerializedName("feelslike_c")
    private Double feelslikeC;
    @SerializedName("feelslike_f")
    private Double feelslikeF;
    @SerializedName("wind_mph")
    private Double windMph;
    @SerializedName("wind_kph")
    private Double wind_Kph;
    @SerializedName("wind_degree")
    private Double /* Integer */ windDegree;
    @SerializedName("wind_dir")
    private String windDir;
    @SerializedName("pressure_mb")
    private Double pressureMb;
    @SerializedName("pressure_in")
    private Double pressureIn;
    @SerializedName("precip_mm")
    private Double precipMm;
    @SerializedName("precip_in")
    private Double precipIn;
    private Double /* Integer */ humidity;
    private Double /* Integer */ cloud;
    @SerializedName("is_day")
    private Integer isDay;
    private Double uv;
    @SerializedName("gust_mph")
    private Double gustMph;
    @SerializedName("gust_kph")
    private Double gustKph;
    @SerializedName("vis_km")
    private Double /* Integer */ visKm;
    @SerializedName("vis_miles")
    private Double /* Integer */ visMiles;
    @SerializedName("air_quality")
    private AirQuality airQuality;
}

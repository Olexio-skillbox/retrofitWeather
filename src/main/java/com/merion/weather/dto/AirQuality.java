package com.merion.weather.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
// @ToString
public class AirQuality {
    private Double co;
    private Double o3;
    private Double no2;
    private Double so2;
    private Double pm2_5;
    private Double pm10;
    @SerializedName("us-epa-index")
    private Double /* Integer */ usEpaIndex;
    @SerializedName("gb-defra-index")
    private Double /* Integer */ gbDefraIndex;
}

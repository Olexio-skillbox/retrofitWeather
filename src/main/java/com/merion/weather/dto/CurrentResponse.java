package com.merion.weather.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CurrentResponse {
    private Location location;
    private Current current;

}

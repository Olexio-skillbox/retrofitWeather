package com.merion.weather;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherService {
    public static final String BASE_URL = "https://api.weatherapi.com";
    public static final String MY_API_KEY = "d785dbc38ccc4706a8d124354240602";
    private static WeatherAPI api;
    private static WeatherAPI init() {
        Gson gson = new GsonBuilder().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        WeatherAPI api =retrofit.create(WeatherAPI.class);
        return api;
    }
    public static WeatherAPI instance() {
        if (api == null) {
            api = init();
        }
        return api;
    }
}

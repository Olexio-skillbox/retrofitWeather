package com.merion.weather;

import com.merion.weather.dto.CurrentResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface WeatherAPI {
    @GET("/v1/current.json")
    // Call<List<PostResponse>> posts(@Query("id") Integer id);
    Call<CurrentResponse> current(@Query("key") String key, @Query("q") String query);
}

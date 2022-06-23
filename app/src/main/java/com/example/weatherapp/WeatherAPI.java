package com.example.weatherapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherAPI {
    //make necessary queries
    //            lat=51.5287352&lon=-0.3817841&
    @GET("weather?appid={yourkey}&units=metric")
    Call<OpenWeatherMap>getWeatherWithLocation(@Query("lat")double lat, @Query("lon")double lon );

    @GET("weather?appid={yourkey}&units=metric")
    Call<OpenWeatherMap>getWeatherWithCityName(@Query("q")String name);
}

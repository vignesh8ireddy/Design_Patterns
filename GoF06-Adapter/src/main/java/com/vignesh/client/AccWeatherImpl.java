package com.vignesh.client;

import com.vignesh.adapter.WeatherAdapter;

public class AccWeatherImpl implements IAccWeather {
    @Override
    public float showTemperature(String stateName) {
        WeatherAdapter weatherAdapter = new WeatherAdapter();
        return weatherAdapter.fetchTemperature(stateName);
    }
}

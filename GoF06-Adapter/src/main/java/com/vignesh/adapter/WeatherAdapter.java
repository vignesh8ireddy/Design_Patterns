package com.vignesh.adapter;

import com.vignesh.server.IWeatherReport;
import com.vignesh.server.WeatherReportImpl;

public class WeatherAdapter {

    public float fetchTemperature(String cityName) {
        String cityCode;
        if(cityName.equalsIgnoreCase("KS")) {
            cityCode = "20";
        }
        else if(cityName.equalsIgnoreCase("AS")) {
            cityCode = "02";
        }
        else if(cityName.equalsIgnoreCase("TX")) {
            cityCode = "06";
        }
        else throw new IllegalArgumentException("State Records Not Found");
        IWeatherReport weatherReport = new WeatherReportImpl();
        return weatherReport.getTemperature(cityCode);
    }

}

package com.vignesh.server;

import java.util.Random;

public class WeatherReportImpl implements IWeatherReport {

    @Override
    public float getTemperature(String stateCode) {
        if(stateCode.equals("20")) { // KS
            return new Random().nextFloat(35.0f,80.0f);
        }
        else if(stateCode.equals("02")) { //AS
            return new Random().nextFloat(-15.0f,35.0f);
        }
        else if(stateCode.equals("06")) { //TX
            return new Random().nextFloat(40.0f,90.0f);
        }
        else throw new IllegalArgumentException("Invalid State");
    }
}

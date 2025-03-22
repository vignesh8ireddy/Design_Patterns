package com.vignesh.test;

import com.vignesh.client.AccWeatherImpl;
import com.vignesh.client.IAccWeather;

public class AdapterPatternTest {
    public static void main(String[] args) {
        IAccWeather accWeather = new AccWeatherImpl();
        System.out.println("KS Temperature:: "+accWeather.showTemperature("KS"));
        System.out.println("TX Temperature:: "+accWeather.showTemperature("Tx"));
        System.out.println("AS Temperature:: "+accWeather.showTemperature("as"));
    }
}

/*
Output::

KS Temperature:: 67.89397
TX Temperature:: 83.974846
AS Temperature:: 3.9572544
 */
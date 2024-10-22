package com.pingwit.part_33.homework.task_2;

import org.json.JSONArray;
import org.json.JSONObject;

public class WeatherAnalyzer {
    public static double calculateAverageDayTemperature(JSONObject day) {
        JSONObject temperature = day.getJSONObject("temperature");
        double morningTemp = temperature.getDouble("morning");
        double dayTemp = temperature.getDouble("day");
        double eveningTemp = temperature.getDouble("evening");
        double nightTemp = temperature.getDouble("night");
        return (morningTemp + dayTemp + eveningTemp + nightTemp) / 4.0;
    }

    public static void findWarmestPeriod(JSONArray forecast, int days, double minAvgTemp) {
        double maxAverageTemp = Double.MIN_VALUE;
        int bestStartIndex = -1;

        for (int i = 0; i <= forecast.length() - days; i++) {
            double sumTemp = 0;

            for (int j = i; j < i + days; j++) {
                JSONObject day = forecast.getJSONObject(j);
                sumTemp += calculateAverageDayTemperature(day);
            }

            double avgTempForPeriod = sumTemp / days;

            if (avgTempForPeriod > maxAverageTemp && avgTempForPeriod > minAvgTemp) {
                maxAverageTemp = avgTempForPeriod;
                bestStartIndex = i;
            }
        }

        if (bestStartIndex != -1) {
            System.out.println("The warm period begins on day " + (bestStartIndex + 1) +
                    " with an average temperature of " + maxAverageTemp);
        } else {
            System.out.println("Could not find a period with a temperature higher than " + minAvgTemp);
        }
    }
}
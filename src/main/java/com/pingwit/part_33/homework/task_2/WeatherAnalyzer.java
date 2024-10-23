package com.pingwit.part_33.homework.task_2;

import org.json.JSONArray;
import org.json.JSONObject;

public class WeatherAnalyzer {
    public static double calculateAverageDayTemperature(JSONObject day) { // этот метод сделай приватным и не статическим
        JSONObject temperature = day.getJSONObject("temperature");
        double morningTemp = temperature.getDouble("morning");
        double dayTemp = temperature.getDouble("day");
        double eveningTemp = temperature.getDouble("evening");
        double nightTemp = temperature.getDouble("night");
        return (morningTemp + dayTemp + eveningTemp + nightTemp) / 4.0;
    }

    public static void findWarmestPeriod(JSONArray forecast, int days, double minAvgTemp) { // пока это не так заметно, но лучше не использовать static в методах. Со временем ты поймешь где static подойдет, но это не тот случай
        /*
        идея хорошая, но что если таких периодов будет несколько?
        Например с 1-8, 12-20 число? Я хочу знать все, чтобы подобрать наиболее удобный по датам.

        Для этого возможно придется качать json с погодой к себе в проект и поиграться с данными в json.
        Или с температурой на входе, чтобы четко было несколько периодов

        Найденный период предлагаю хранить в мапе и достаточно будет одного прохода по всем дням месяца
         */
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
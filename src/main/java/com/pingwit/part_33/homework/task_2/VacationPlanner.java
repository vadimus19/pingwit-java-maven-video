package com.pingwit.part_33.homework.task_2;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class VacationPlanner {
    public static String readJSONFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    private static double calculateAverageDayTemperature(JSONObject day) {
        double morningTemp = day.getDouble("morningTemp");
        double dayTemp = day.getDouble("dayTemp");
        double eveningTemp = day.getDouble("eveningTemp");
        double nightTemp = day.getDouble("nightTemp");
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
            System.out.println("The warm period begins on the day " + (bestStartIndex + 1) +
                    " average temperature " + maxAverageTemp);
        } else {
            System.out.println("Could not find a period with a temperature higher " + minAvgTemp);
        }
    }
}

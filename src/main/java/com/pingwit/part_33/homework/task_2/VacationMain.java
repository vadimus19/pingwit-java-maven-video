package com.pingwit.part_33.homework.task_2;

import org.json.JSONArray;

import java.io.IOException;

import static com.pingwit.part_33.homework.task_2.VacationPlanner.findWarmestPeriod;
import static com.pingwit.part_33.homework.task_2.VacationPlanner.readJSONFile;

public class VacationMain {
    public static void main(String[] args) {
        try {
            String jsonString = readJSONFile("src/main/java/com/pingwit/part_33/homework/task_2/Wather.forecast.json");
            JSONArray forecast = new JSONArray(jsonString);

            int requestedDays = 14;
            double minAvgTemp = 20;

            findWarmestPeriod(forecast, requestedDays, minAvgTemp);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

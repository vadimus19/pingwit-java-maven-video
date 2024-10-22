package com.pingwit.part_33.homework.task_2;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class VacationPlannerMain {
    public static void main(String[] args) throws IOException {
        String url = "https://raw.githubusercontent.com/RezviyBelorus/pingwit-java-maven-video/main/src/main/java/com/pingwit/part_33/homework/task_2/forecast.json";
        String jsonContent = WeatherFetcher.fetchJSONFromURL(url);
        JSONObject jsonObject = new JSONObject(jsonContent);
        JSONArray forecast = jsonObject.getJSONArray("forecast");
        WeatherAnalyzer.findWarmestPeriod(forecast, 7, 20.0);
    }
}

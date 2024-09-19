package com.pingwit.part_29.read.homework.task_1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AtmMain {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // com.fasterxml.jackson.databind.DeserializationFeature. - есть редкие случаи, когда придется использовать полное название пакеты. В твоем кейсе это должен быть обычный импорт
        mapper.configure(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        InputStream atmFS = ClassLoader.getSystemResourceAsStream("part_29/homework/task_1/atms.json");
        List<Atm> atms = mapper.readValue(atmFS, new TypeReference<>() {
        });

        for (Atm atm : atms) {
            System.out.println(atm);
        }
    }
}



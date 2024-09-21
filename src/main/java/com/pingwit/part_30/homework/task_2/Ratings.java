package com.pingwit.part_30.homework.task_2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty; // лишний импорт

public record Ratings(
        Double kp,
        Double imdb
) {
}

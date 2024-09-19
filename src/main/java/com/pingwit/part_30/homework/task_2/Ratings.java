package com.pingwit.part_30.homework.task_2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public record Ratings(
        Double kp,
        Double imdb
) {
}

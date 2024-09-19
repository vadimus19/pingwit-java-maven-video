package com.pingwit.part_30.homework.task_2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public record Genre(

        String item
) {
    @JsonCreator
    public Genre(String item) {
        this.item = item;
    }

    @JsonValue
    public String getItem() {
        return item;
    }
}


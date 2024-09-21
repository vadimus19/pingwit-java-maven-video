package com.pingwit.part_30.homework.task_2.point_1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Title { // Мы данные фильма парсим, может будет правильнее назвать класс Film?
    private Long id;
//    @JsonProperty("h2") - добавь эту аннотацию, чтобы парсер понял какой xml тег на какое поле мачить
    private String h2; // неважно какая структура документа, который ты парсишь, поля необходимо называть соот-но информации, которую они хранят, в твоем случае это filmName.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getH2() {
        return h2;
    }

    public void setH2(String h2) {
        this.h2 = h2;
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", h2='" + h2 + '\'' +
                '}';
    }
}


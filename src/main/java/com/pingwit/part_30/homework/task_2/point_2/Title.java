package com.pingwit.part_30.homework.task_2.point_2;

import java.util.Objects;

public class Title {
    private  Long id;
    private  String h2;

    public Title() {

    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Title title = (Title) o;
        return Objects.equals(id, title.id) && Objects.equals(h2, title.h2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, h2);
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", h2='" + h2 + '\'' +
                '}';
    }
}


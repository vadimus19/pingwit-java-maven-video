package com.pingwit.part_30.homework.task_2.point_1;

public class Title {
    private Long id;
    private String h2;

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


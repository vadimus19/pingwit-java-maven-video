package com.pingwit.part_30.homework.task_2.point_1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/*
мне нравится идея с jsoup парсером, можешь ее дальше развивать, чтобы распарсить всю информацию о фильме
 */
public class MovieJsoupMain {
    public static void main(String[] args) throws IOException {

        InputStream resource = ClassLoader.getSystemResourceAsStream("part_30/homework/task_2/KinoGo.biz.html");

        Document document = Jsoup.parse(resource, "UTF-8", "");

        List<Title> titles = new ArrayList<>();

        Elements h2Elements = document.select("h2");

        for (Element h2Element : h2Elements) {
            Title title = new Title();

            if (h2Element.hasAttr("id")) { // у тега h2 технически может быть аттрибут id, но конкретно в твоем случае он отсутствует, этот if можно удалять
                title.setId(Long.valueOf(h2Element.attr("id")));
            }

            title.setH2(h2Element.text());

            titles.add(title);
        }

        titles.forEach(System.out::println);
    }
}

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

        List<Film> films = new ArrayList<>();

        Elements filmElements = document.select(".shortstory");

        for (Element elements : filmElements) {
            Film film = new Film();

            film.setMovieName(elements.text());
            film.getDescription(elements.text());
            film.getDescription(elements.text());// дубликат строки 31

            /* у тебя elements.text() возвращает полное описание фильма с жанром и т.д.
            и эта вся информация попадает в movieName, а description и другие поля остаются null (посмотри через debug)
            Надо или подшаманить парсер или ты можешь распарсить строку, которую получил из elements.text()
             */
            films.add(film);
        }

        films.forEach(System.out::println);
    }
}

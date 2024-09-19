package com.pingwit.part_30.homework.task_2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class KinoGoMovieMain {
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        InputStream resource = ClassLoader.getSystemResourceAsStream("part_30/homework/task_2/kino.xml");

       List<Movie> movies = xmlMapper.readValue(resource, new TypeReference<>() {
       });
        {

        }
        movies.forEach(System.out::println);
    }

}


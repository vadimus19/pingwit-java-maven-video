package com.pingwit.part_30.homework.task_2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

 record Movie(
         String title,

         List<Genre> genre,

         String premiere,

         String quality,

         Ratings ratings ,

         String description
) {
}

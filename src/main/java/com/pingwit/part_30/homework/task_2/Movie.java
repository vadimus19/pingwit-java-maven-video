package com.pingwit.part_30.homework.task_2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

 record Movie(
         String title,
// лишняя строка, удали
         List<Genre> genre,
// лишняя строка, удали
         String premiere,
// лишняя строка, удали
         String quality,
// лишняя строка, удали
         Ratings ratings ,
// лишняя строка, удали
         String description
) {
}

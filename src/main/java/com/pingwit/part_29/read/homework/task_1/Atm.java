package com.pingwit.part_29.read.homework.task_1;

// поля класса должны оставаться в стиле java. Чтобы данные парсились нормально, есть альтернативные механизмы, они были на видео
record Atm(
        Integer id,
        String area,
        String city_type, // cityType
        String city,
        String address_type, // addressType
        String address,
        String house,
        String work_time, // work_time -> workTime
        String cash_in // cashIn
// лишняя строка, удали
) {
}

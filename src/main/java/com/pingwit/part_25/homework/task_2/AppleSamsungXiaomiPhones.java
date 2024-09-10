package com.pingwit.part_25.homework.task_2;

import java.util.List;
import java.util.stream.Collectors;

public class AppleSamsungXiaomiPhones {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Nokia", "xs"),
                new Phone("Siemens", "s"),
                new Phone("Apple", "x"),
                new Phone("Samsung", "s24"),
                new Phone("Xiaomi", "m"),
                new Phone("Nokia", "l")
        );
        List<String> preferredPhone = phones.stream() // preferredPhone -> preferredPhones -> 's'
                .filter(phone -> phone.producer().equals("Apple") || // из условия задачи: "и оставить только те, которые входят в список..." -> подумай пока сам как можно улучшить твой код внутри filter()
                        phone.producer().equals("Samsung") ||
                        phone.producer().equals("Xiaomi"))
                .map(Phone::producer)
                .collect(Collectors.toList());
        preferredPhone.forEach(System.out::println); // 23 строка дубликат, зачем она тебе?
//      preferredPhone.forEach(System.out::println) ---  красивей печатает
        System.out.println(preferredPhone);
    }
}

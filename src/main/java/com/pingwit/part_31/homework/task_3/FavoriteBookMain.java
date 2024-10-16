package com.pingwit.part_31.homework.task_3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FavoriteBookMain {
    public static void main(String[] args) {

        List<Book> books = List.of(
                new Book(1, "Harry Potter", 1998),
                new Book(2, "1984", 1949),
                new Book(3, "Mist", 1994),
                new Book(4, "Lord of the Rings", 1988),
                new Book(5, "Game of Thrones", 1999)
        );

        List<Student> students = List.of(
                new Student("Gosha", List.of(findBookById(books, 1), findBookById(books, 2))),
                new Student("Egorka", List.of(findBookById(books, 3), findBookById(books, 2))),
                new Student("Elena", List.of(findBookById(books, 3), findBookById(books, 4))),
                new Student("Oleh", List.of(findBookById(books, 1), findBookById(books, 5))),
                new Student("Tom", List.of(findBookById(books, 5), findBookById(books, 2)))
        );

        Map<Book, Long> bookCount = students.stream()
                .flatMap(student -> student.favoriteBooks().stream())
                .collect(Collectors.groupingBy(book -> book, Collectors.counting())); // book -> book замени на Function.identity(), по сути делает тоже самое, просто будет приятнее выглядеть

        System.out.println("\nTop book:");
        List<Map.Entry<Book, Long>> topBooks = bookCount.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())) // entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()) -> Map.Entry.comparingByValue()
                .limit(3)
                .toList();

        for (Map.Entry<Book, Long> entry : topBooks) {
            System.out.println(entry.getKey().title() + " (" + entry.getKey().year() + ") — " + entry.getValue());
        }
    }

    private static Book findBookById(List<Book> books, int id) {
        return books.stream()
                .filter(book -> book.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}

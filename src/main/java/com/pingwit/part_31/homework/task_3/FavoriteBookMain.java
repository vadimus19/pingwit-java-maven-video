package com.pingwit.part_31.homework.task_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        Map<Book, Integer> bookCount = new HashMap<>();
        for (Student student : students) {
            for (Book book : student.favoriteBok()) {
                bookCount.put(book, bookCount.getOrDefault(book, 0) + 1);
            }
        }

        System.out.println("\nTop book:");
        List<Map.Entry<Book, Integer>> topBooks = bookCount.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .limit(3)
                .toList();

        for (Map.Entry<Book, Integer> entry : topBooks) {
            System.out.println(entry.getKey().title() + " (" + entry.getKey().year()+")" );
        }
    }

    private static Book findBookById(List<Book> books, int id) {
        for (Book book : books) {
            if (book.id().equals(id)) {
                return book;
            }
        }
        return null;
    }
}
package com.frodo.service;

import com.frodo.domain.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    public List<Book> getAllBooks() {
        Book book1 = new Book("lord of the rings");
        Book book2 = new Book("hobbit");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        return books;
    }
}

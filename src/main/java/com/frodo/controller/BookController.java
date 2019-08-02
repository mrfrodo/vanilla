package com.frodo.controller;

import com.frodo.domain.Book;
import com.frodo.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "books")
public class BookController {

    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    BookService bookService;

    @GetMapping(value = "")
    List<Book> getAllProducts() {
        logger.info("__getAllBooks");
        return bookService.getAllBooks();
    }
}

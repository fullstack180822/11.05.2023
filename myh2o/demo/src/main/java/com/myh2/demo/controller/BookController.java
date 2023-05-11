package com.myh2.demo.controller;

import com.myh2.demo.model.Book;
import com.myh2.demo.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    // or:
    //     @Autowired
    //    private BookRepository bookRepository;

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public Iterable<Book> findall() {
        return bookRepository.findAll();
    }

}

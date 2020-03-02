package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping(value = "book/create")
    public void create(@RequestBody Book book) {
        bookService.create(book);
    }

    @GetMapping(value = "book/{id}")
    public void get(@PathVariable int id) {
        bookService.findBookById(id);
    }

    @PutMapping(value = "book/{id}")
    public void update(@PathVariable int id) {
        bookService.update(id);
    }

    @DeleteMapping(value = "book/{id}")
    public void delete(@PathVariable int id) {
        bookService.delete(id);
    }
}

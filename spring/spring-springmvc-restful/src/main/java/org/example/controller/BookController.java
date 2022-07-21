package org.example.controller;

import org.example.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book) {
        return "book save: " + book;
    }

    @DeleteMapping(value = "{id}")
    public String delete(@PathVariable Integer id) {
        return "book delete: " + id;
    }

    @PutMapping
    public String update(@RequestBody Book book) {
        return "book update: " + book;
    }

    @GetMapping(value = "{id}")
    public Book getById(@PathVariable Integer id) {
        Book book1 = new Book();
        book1.setId(1);
        book1.setName("java");
        return book1;
    }

    @GetMapping
    public List<Book> getAll() {
        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book();
        book1.setId(1);
        book1.setName("java");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setId(2);
        book2.setName("javascript");
        bookList.add(book2);

        return bookList;
    }

}

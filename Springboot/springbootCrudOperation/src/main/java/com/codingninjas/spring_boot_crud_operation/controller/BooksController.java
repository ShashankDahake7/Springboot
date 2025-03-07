package com.codingninjas.spring_boot_crud_operation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.codingninjas.spring_boot_crud_operation.model.Books;
import com.codingninjas.spring_boot_crud_operation.service.BooksService;
@RestController
public class BooksController {
    @Autowired
    BooksService booksService;
    @GetMapping("/books")
    public List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }
    @GetMapping("/book/{bookid}")
    public Books getBooks(@PathVariable int bookid) {
        return booksService.getBooksById(bookid);
    }
    @PostMapping("/books")
    public int saveBook(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books.getBookid();
    }
    @PutMapping("/books")
    public Books update(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books;
    }
    @DeleteMapping("/book/{bookid}")
    public void deleteBook(@PathVariable int bookid) {
        booksService.delete(bookid);
    }
}
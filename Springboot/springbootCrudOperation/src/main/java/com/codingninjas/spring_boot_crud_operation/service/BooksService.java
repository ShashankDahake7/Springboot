package com.codingninjas.spring_boot_crud_operation.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codingninjas.spring_boot_crud_operation.model.Books;
import com.codingninjas.spring_boot_crud_operation.repository.BooksRepository;
@Service
public class BooksService {
    @Autowired
    BooksRepository booksRepository;
    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<>();
        booksRepository.findAll().forEach(books::add);
        return books;
    }
    public Books getBooksById(int id) {
        return booksRepository.findById(id).get();
    }
    public void saveOrUpdate(Books books) {
        booksRepository.save(books);
    }
    public void delete(int id) {
        booksRepository.deleteById(id);
    }
}
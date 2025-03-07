package com.codingninjas.spring_boot_crud_operation.repository;

import org.springframework.data.repository.CrudRepository;
import com.codingninjas.spring_boot_crud_operation.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer> {}
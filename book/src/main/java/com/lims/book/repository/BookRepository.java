package com.lims.book.repository;

import org.springframework.data.repository.CrudRepository;

import com.lims.book.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}

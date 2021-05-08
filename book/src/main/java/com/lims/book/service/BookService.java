package com.lims.book.service;

import java.util.List;
import java.util.Optional;

import com.lims.book.model.Book;

public interface BookService {
	Book saveBook(Book book);
	List<Book> getAllBook();
	Optional<Book> getById(long id);
}

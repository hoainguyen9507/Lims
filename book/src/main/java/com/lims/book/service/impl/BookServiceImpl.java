package com.lims.book.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lims.book.model.Book;
import com.lims.book.repository.BookRepository;
import com.lims.book.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book saveBook(Book book) {
		return this.bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		return (List<Book>) this.bookRepository.findAll();
	}

	@Override
	public Optional<Book> getById(long id) {
		return this.bookRepository.findById(id);
	}
 
}

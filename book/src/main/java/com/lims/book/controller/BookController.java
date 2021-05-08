package com.lims.book.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.lims.book.model.Book;
import com.lims.book.service.BookService;

@RestController
@RequestMapping("api/book")
public class BookController {
	@Autowired
	private BookService bookService;

	@PostMapping(value = "/save/{id}")
	public Book saveBook(@PathVariable("id") long id, @RequestParam String data)
			throws JsonParseException, JsonMappingException {
		String i2 = Integer.toString(1);
		Book book = new Book(i2, "book".concat(i2), new Date(), "author".concat(i2), "description".concat(i2),
				"publisher".concat(i2), "image".concat(i2), Short.parseShort(i2));
		return this.bookService.saveBook(book);
	}

	@GetMapping("/get")
	public List<Book> getAllBook() {
		return this.bookService.getAllBook();
	}
	
	@GetMapping("/get/{id}")
	public Optional<Book> getBookById(@PathVariable("id") long id) {
		return this.bookService.getById(id);
	}
}

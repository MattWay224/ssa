package com.m.app.service;

import com.m.app.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public interface bookService {
	@GetMapping("")
	public List<Book> findAllBooks();
}

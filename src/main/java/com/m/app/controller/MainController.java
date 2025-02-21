package com.m.app.controller;

import com.m.app.model.Book;
import com.m.app.service.bookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@AllArgsConstructor
public class MainController {
	private final bookService bookService;

	@GetMapping("")
	public List<Book> findAllBooks() {
		return bookService.findAllBooks();
	}
}

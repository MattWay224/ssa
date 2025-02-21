package com.m.app.controller;

import com.m.app.model.Book;
import com.m.app.service.bookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

	@PostMapping("save_book")
	public Book saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}

	@GetMapping("/{id}")
	public Book findBookById(@PathVariable int id) {
		return bookService.findById(id);
	}

	@PutMapping("update_book")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}

	@DeleteMapping("delete_book/{id}")
	public int deleteBookById(@PathVariable int id) {
		bookService.deleteById(id);
		return 200;
	}
}

package com.m.app.impl;

import com.m.app.model.Book;
import com.m.app.service.bookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryBookService implements bookService {
	@Override
	public List<Book> findAllBooks() {
		return List.of(
				Book.builder()
						.name("Back to the Future")
						.authors(new String[]{
								"Bob Gale",
								"George Gipe"
						})
						.build(),
				Book.builder()
						.name("Clean code: A Handbook of Agile Software Craftsmanship")
						.authors(new String[]{
								"Robert Martin",
						})
						.build(),
				Book.builder()
						.name("1984")
						.authors(new String[]{
								"George Orwell",
						})
						.build()
		);
	}
}

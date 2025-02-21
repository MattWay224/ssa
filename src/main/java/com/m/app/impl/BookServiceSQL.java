package com.m.app.impl;

import com.m.app.model.Book;
import com.m.app.rep.BookRepo;
import com.m.app.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class BookServiceSQL implements BookService {
	private final BookRepo repo;
	@Override
	public List<Book> findAllBooks() {
		return repo.findAll();
	}

	@Override
	public Book saveBook(Book book) {
		return repo.save(book);
	}

	@Override
	public Book findById(int id) {
		return repo.findById(id);
	}

	@Override
	public Book updateBook(Book book) {
		return repo.save(book);
	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
	}
}

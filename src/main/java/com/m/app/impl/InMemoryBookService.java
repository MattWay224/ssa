package com.m.app.impl;

import com.m.app.model.Book;
import com.m.app.rep.BookDao;
import com.m.app.service.bookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryBookService implements bookService {
	private final BookDao rep;


	@Override
	public List<Book> findAllBooks() {
		return rep.findAllBooks();
	}

	@Override
	public Book saveBook(Book book) {
		return rep.saveBook(book);
	}

	@Override
	public Book findById(int id) {
		return rep.findById(id);
	}

	@Override
	public Book updateBook(Book book) {
		return rep.updateBook(book);
	}

	@Override
	public void deleteById(int id) {
		rep.deleteById(id);
	}
}

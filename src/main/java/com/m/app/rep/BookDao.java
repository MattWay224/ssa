package com.m.app.rep;

import com.m.app.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class BookDao {
	private final List<Book> BOOKS = new ArrayList<>();

	public List<Book> findAllBooks() {
		return BOOKS;
	}

	public Book saveBook(Book book) {
		BOOKS.add(book);
		return null;
	}

	public Book findById(int id) {
		return BOOKS.stream()
				.filter(element -> element.getId() == id)
				.findFirst()
				.orElse(null);
	}

	public Book updateBook(Book book) {
		var bookIndex = IntStream.range(0, BOOKS.size())
				.filter(index -> BOOKS.get(index).getId() == book.getId())
				.findFirst()
				.orElse(-1);
		if (bookIndex > -1) {
			BOOKS.set(bookIndex, book);
			return book;
		}
		return null;
	}

	public void deleteById(int id) {
		var book = findById(id);
		if (book != null) {
			BOOKS.remove(book);
		}
	}
}

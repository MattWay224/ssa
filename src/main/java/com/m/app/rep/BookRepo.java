package com.m.app.rep;

import com.m.app.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
	void deleteById(int id);
	Book findById(int id);
}

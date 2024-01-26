package com.alejandroem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alejandroem.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByTitle(String title);

	Book save(Book book);

	List<Book> findByAuthor(String author);

	void delete(Book book);
}